package com.myjava.reflection;

import static org.junit.Assert.*;

import java.lang.reflect.Proxy;

import com.myjava.aop.LogInterceptor;
import com.myjava.reflection.UserService;

import org.junit.Test;

public class UserServiceTest {
	
	@Test
	public void testProxy() {
		UserService userService = new UserServiceImpl();
		LogInterceptor li = new LogInterceptor();
		li.setTarget(userService);
		
		UserService userServiceProxy = (UserService)Proxy.newProxyInstance(userService.getClass().getClassLoader(), new Class[]{UserService.class}, li);
		userServiceProxy.save();
	}

}
