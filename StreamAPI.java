package com.operative.java8;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamAPI {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(12);
		al.add(23);
		al.add(23);
		al.add(30);
		al.add(12);
		
//		ArrayList<Integer> resal = new ArrayList<Integer>(al.stream().map(x -> x*x).collect(Collectors.toList()));
//		System.out.println(al);
//		System.out.println(resal);
//		
		ArrayList<String> Sal = new ArrayList<String>();
		Sal.add("samiran");
		Sal.add("kalpesh");
		Sal.add("abhishek");
		Sal.add("hritik");
		Sal.add("aditya");
		
//		ArrayList<String> resSal = new ArrayList<String>(Sal.stream().map(x -> x.toUpperCase()).collect(Collectors.toList()));
//		System.out.println(Sal);
//		System.out.println(resSal);
//		
//		ArrayList<String> ForEachal = new ArrayList<>(resSal.stream().forEach(x)->{ForEachal.add(x.toLowerCase());};
//
//		ArrayList<String> ForEachal = new ArrayList<>();
//		resSal.stream().forEach((x)->ForEachal.add(x.toLowerCase()));
//		System.out.println(ForEachal);
//		
//		int alsum = al.stream().reduce(0, (ans,i)->ans+i);
//		System.out.println(alsum);
//		int resalsum = resal.stream().reduce(0, (ans,i)->ans+i);
//		System.out.println(resalsum);
		
//		ArrayList<Integer> Evenal = new ArrayList<>(al.stream().filter(x -> x%2==0).collect(Collectors.toList()));
//		System.out.println(Evenal);
//		int sum = al.stream().filter(x -> x % 2 == 0).reduce(0, (sum1,i) -> sum1+i);
//		System.out.println(sum);
//		
//		ArrayList<String> Greaterthanal = new ArrayList<>(Sal.stream().filter(x -> x.length()>6).collect(Collectors.toList()));
//		System.out.println(Greaterthanal);
		
//		int max = al.stream().max((i,j)->i>j ? 1:-1).get();
//		int min = al.stream().min((i,j)->i>j ? 1:-1).get();
//		System.out.println(max + " " + min);
		
	}

}



