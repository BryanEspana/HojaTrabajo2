/**
 * Hoja de Trabajo #2 - Bryan España - 21550
 * Evaluar Expresiones PostFix
 */
package com.uvg.main;

public interface IStack<T> {

	void push(T value);
	
	T pull();
	
	T peek();
	
	int count();
	
	boolean isEmpty();
}
