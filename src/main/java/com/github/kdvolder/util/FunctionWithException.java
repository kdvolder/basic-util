package com.github.kdvolder.util;

@FunctionalInterface
public interface FunctionWithException<A,R> {
	R apply(A a) throws Exception; 
}
