package com.example.java8;

import java.util.Set;
import java.util.StringJoiner;
import java.util.TreeSet;

public class StringJoinerClass {

	public static void main(String[] args) {
		
		StringJoiner sj =new StringJoiner(",","{","}");
		sj.setEmptyValue("No stooges yet");
		System.out.println(sj);
		sj.add("Moe");
		sj.add("Larry");
		sj.add("Curly");
		System.out.println(sj);
		
		StringJoiner sj2 = new StringJoiner(",");
		sj2.add("Shemp");
		sj.merge(sj2);
		System.out.println(sj);
		Set<String> set = new TreeSet<>();
		set.add("California");
		set.add("Oregon");
		set.add("Washington");
		
		StringJoiner sj3 = new StringJoiner(" and ");
		set.forEach(s->sj3.add(s));
			System.out.println(sj3);
		}
		
}
