package com.test.apple;

import java.util.ArrayList;
import java.util.List;

public class Apple {

	
	private String color;
	private int weight;
	
	private List<Apple> appleInventory = new ArrayList<Apple>();
		
	public Apple() {
		Apple a = new Apple("Green",100);
		Apple b = new Apple("Blue",160);
		Apple c = new Apple("Red", 200);
		appleInventory.add(a);
		appleInventory.add(b);
		appleInventory.add(c);
	}
	public Apple(String color,int weight) {
		this.color=color;
		this.weight = weight;
	}
	public static void main(String[] args) {
		Apple apple = new Apple();
//		apple.filterGreenAppleOnly();
//		apple.filterHeavyAppleOnly();
		
		//Java 8
		
//		apple.filterApple(Apple::isGreenApple);
//		apple.filterApple(Apple::isHeavyApple);
		
		//OR
		apple.filterApple((Apple a) -> "Green".equalsIgnoreCase(a.getColor()));
		apple.filterApple((Apple a) -> a.getWeight() > 140);
//		apple.filterApple((Apple a) -> a.getWeight() > 140 || "Green".equalsIgnoreCase(a.getColor()));
		
//		apple.filterApple((Apple a) -> a.getWeight() > 190);
		
	}

	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		StringBuffer s= new StringBuffer();
		s.append("Color:"+color);
		s.append("Weight:"+weight);
		return s.toString();
	}
	
	
	//Before Java 8
	private void filterGreenAppleOnly() {
		for(Apple a: appleInventory) {
			if("Green".equalsIgnoreCase(a.getColor())) {
				System.out.println("Green apple:" + a.getWeight());
			}
		}
		
	}
	
	private void filterHeavyAppleOnly() {
		for(Apple a: appleInventory) {
			if(a.getWeight() > 150) {
				System.out.println(" apple:" + a.getWeight() +": color:"+ a.getColor());
			}
		}
		
	}
	
	//AFter Java 8
	
	private static boolean  isGreenApple(Apple apple) {
		return "Green".equalsIgnoreCase(apple.getColor());
	}
	
	private static boolean isHeavyApple(Apple apple) {
		return apple.getWeight() > 150;
	}
	

	
	public void filterApple(ApplePredicate<Apple> p) {
		for (Apple apple : appleInventory) {
			if(p.test(apple)) {
				System.out.println(apple);
			}
		}
	}
	
	
}
