/**
 * 
 */
package com.uvg.main;

/**
 * @author Bryan España - 21550
 *
 */
public interface IStack<T> {

	void push(T value);
	
	T pull();
	
	T peek();
	
	int count();
	
	boolean isEmpty();
}
