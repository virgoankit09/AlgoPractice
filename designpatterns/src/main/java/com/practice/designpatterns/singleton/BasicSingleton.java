package com.practice.designpatterns.singleton;

import java.io.Serializable;

public class BasicSingleton implements Serializable{

	private BasicSingleton() {
	}
	
	private static final BasicSingleton INSTANCE = new BasicSingleton();
	
	public BasicSingleton getInstance() {
		return INSTANCE;
	}
	
}

class InnerStaticSingleton {
	
	private InnerStaticSingleton() {}
	
	private static class Impl {
		private static final InnerStaticSingleton INSTANCE = new InnerStaticSingleton();
	}
	
	public InnerStaticSingleton getInstance() {
		return Impl.INSTANCE;
	}
	
}