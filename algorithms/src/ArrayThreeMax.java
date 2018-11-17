import java.util.List;

public class ArrayThreeMax {
	
	static int findThirdLastNumberWithThreeMax(List<Integer>  numbers) {
		
		int length = numbers.size();
		
		int  i = length - 3;
		int number = 0;
		for(; i >= 0 ; i --) {
			
			number = numbers.get(i-1);
			int counter = 0;
			for(int j=i ; j < length; j++) {
				
				if(numbers.get(j) > number) {
					counter++;
				}
				
			}
			
			if(counter == 3) {
				break;
			}
		}
		
		return number;
	}

	public static void main(String[] args) {
		System.out.println(findThirdLastNumberWithThreeMax(List.of(6,4,2,3,8,7,23,4,6,5,8,3,4,52)));
	}
	
}
