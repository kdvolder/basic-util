package com.github.kdvolder.util;

@FunctionalInterface
public interface ConsumerWithException<T> {
	
	void accept(T it) throws Exception;

}
