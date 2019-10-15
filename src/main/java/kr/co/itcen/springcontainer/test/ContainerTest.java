package kr.co.itcen.springcontainer.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import kr.co.itcen.springcontainer.user.Friend;
import kr.co.itcen.springcontainer.user.User;

public class ContainerTest {
	
	public static void main(String[] args) {
		testApplicationContext();
	}
	
	public static void testApplicationContext() {
		ApplicationContext appCtxt = new ClassPathXmlApplicationContext("classpath:config/user/applicationContext01.xml");
		
		User user1 = appCtxt.getBean("user100",User.class);
		User user2 = appCtxt.getBean("user2",User.class);
		User user3 = appCtxt.getBean("user3",User.class);
		Friend friend1 = appCtxt.getBean("friend1", Friend.class);
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user3);
		System.out.println(friend1);
	}
}
