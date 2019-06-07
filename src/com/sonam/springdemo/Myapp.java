package com.sonam.springdemo;

public class Myapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coach c= new baseBallCoach();
		Coach c1=new hockeyCoach();
		System.out.println(c.getDailyWorkout());	
		System.out.println(c1.getDailyWorkout());
	}

}
