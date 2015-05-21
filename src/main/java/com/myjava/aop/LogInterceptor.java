package com.myjava.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogInterceptor implements InvocationHandler {
	
	private Object target;
	
	public Object getTarget() {
		return target;
	}

	public void setTarget(Object target) {
		this.target = target;
	}

	public void beforeMethod() {
		System.out.println("log ....");
	}

	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		beforeMethod();
		method.invoke(target, args);
		return null;
	}
}
