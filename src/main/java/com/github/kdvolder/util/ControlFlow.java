package com.github.kdvolder.util;

import java.util.concurrent.Callable;

public class ControlFlow {

	/**
	 * Execute a 'body' repeatedly until either it returns normally (i.e. 
	 * without raising an Exception) or the maximum number of tries has
	 * been used up.
	 * 
	 * @param tries Maximum number of tries
	 * @param body The code to execute
	 * @return The result of the last execution if it returned normally
	 * @throws Exception raised by the last execution, if it raised an exception.
	 */
	public static <T> T retry(int tries, Callable<T> body) throws Exception {
		Assert.isLegalArgument("tries", tries, tries>0);
		Exception e = null;
		T r = null;
		while (tries>0) {
			tries--;
			try {
				body.call();
			} catch (Exception _e) {
				e = _e;
			}
		}
		if (e!=null) {
			throw e;
		}
		return r;
	}
	
}
