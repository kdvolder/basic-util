package com.github.kdvolder.util;

@FunctionalInterface
public interface RunnableWithException {
	void run() throws Exception;
}
