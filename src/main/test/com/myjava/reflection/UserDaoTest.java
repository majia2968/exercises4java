package com.myjava.reflection;

import static org.junit.Assert.*;

import java.lang.reflect.Proxy;

import com.myjava.aop.LogInterceptor;

import org.junit.Test;

public class UserDaoTest {
	
	@Test
	public void testProxy() {
		UserDao userService = new UserDaoImpl();
		LogInterceptor li = new LogInterceptor();
		li.setTarget(userService);
		User user = new User();
		UserDao userDaoProxy = (UserDao)Proxy.newProxyInstance(userService.getClass().getClassLoader(), new Class[]{UserDao.class}, li);
		userDaoProxy.save(user);
	}

}
