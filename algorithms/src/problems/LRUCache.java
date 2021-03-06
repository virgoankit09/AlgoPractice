package problems;

import java.util.HashMap;

public class LRUCache {
	
	private static HashMap<Integer, Node> entries = new HashMap<>();
	
	private int capacity = 2;
	private Node head;
	private Node tail;
	private int currentSize=0;
	
	public LRUCache(int capacity) {
		this.capacity = capacity;
	}
	
	public void put(Integer key, Integer value) {
		
		//check if the cache is empty
		if(entries.size() == 0) {
			//yes: creating new node and setting it as head and tail. also, netting previous and next to null
			Node newNode = new Node(key, value);
			newNode.previous = newNode.next = null;
			entries.put(key, newNode);
			head = tail = newNode;
		} else {
			
			Node node = entries.get(key);
			//no: check whether the key is already present in the cache or not
			if(node == null) {
				
				//if size of cache has reached the limit. delete the tail node
				if(!(currentSize < capacity)) {
					removeLast(tail);
				} 
				//after deleting the tail node, add the head node
				Node newNode = new Node(key, value);
				entries.put(key,newNode);
				newNode.next = head;
				head.previous = newNode;
				head = newNode;
				
			} else {
				//if the key already exists in the cache, the value would be updated and the node would be rearranged to top of the cache
				
				//previous and next are arranged to remove the node from in between
				node.value = value;
				node.next.previous = node.previous; 
				node.previous.next = node.next;
				
				//the node is het to the head
				node.previous = null;
				node.next = head.next;
				head = node;
			}
		}
		currentSize++;
	}
	
	public Integer get(Integer key) throws Exception {
		
		Node node = entries.get(key);
		if(node == null) throw new Exception("Not Found Exception");
		
		if(node == tail) {
			tail = node.previous;
		}
		
		node.next.previous = node.previous; 
		node.previous.next = node.next;
		
		//the node is het to the head
		node.previous = null;
		node.next = head.next;
		head = node;
		
		return node.value;
	}
	
	public void removeLast(Node node) {
			entries.remove(node.key);
			this.tail = node.previous;
			node = null;
	}
	
	public static void printAll() {
		System.out.println("-------------------");
		for(Node node : entries.values()) {
			System.out.println(node.value);
		}
		System.out.println("-------------------");
	}
	
	public static void main(String[] args) throws Exception {
		
		LRUCache lruCache = new LRUCache(2);
		
		lruCache.put(2, 2);
		printAll();
		
		
		lruCache.put(4, 4);
		printAll();
		
		lruCache.put(3, 3);
		printAll();
		
		lruCache.put(6, 6);
		printAll();
		
		lruCache.get(3);
		
		lruCache.put(7, 7);
		printAll();
		
	}
	
}


class Node {
	Integer key;
	Integer value;
	Node previous;
	Node next;
	
	Node(Integer key, Integer value) {
		this.key = key;
		this.value = value;
	}
}