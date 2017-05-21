/**
 * 
 */
package com.example.javase8;

import com.example.javase8.interfaces.SimpleInterface;

/**
 * @author Hp
 *
 */
public class UseSimpleInterface {
	public static void main(String[] args) {
		SimpleInterface obj = () -> System.out.println("Say something");
		obj.doSomething();
	}
}
