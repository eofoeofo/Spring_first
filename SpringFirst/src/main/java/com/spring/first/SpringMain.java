package com.spring.first;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"classpath:META-INF/spring.xml");
		MiTv tv1 = ctx.getBean("mitv",MiTv.class); 
		// (bean id , return 타입) return을 안적으려면 형변환 해주면 ㅇㅋ
		System.out.println("tv1 : " + tv1);
		tv1.volumeUp();
	}
}