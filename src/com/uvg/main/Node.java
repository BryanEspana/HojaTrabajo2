/**
 * Hoja de Trabajo #2 - Bryan España - 21550
 * Evaluar Expresiones PostFix
 */
package com.uvg.main;

public class Node<T> {
	
	private T Value;
	Node<T> next;
	
	public Node() {
		next = null;
	}
	
	public Node(T Value) {
		this.Value = Value;
		next = null;
	}
	
	public T getValue() {
		return Value;
	}
	
	public void setValue(T value) {
		Value = value;
	}
	
	public Node<T> getNext() {
		return next;
	}
	
	public void setNext(Node<T> next) {
		this.next = next;
	}

}
