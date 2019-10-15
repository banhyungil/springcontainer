package kr.co.itcen.springcontainer.user;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.user.UserConfig01;



//Test는 병렬로 이루어짐
//순서를 지키기위해선 메서드를 알파벳순으로 하면된다
//허나 좋은 방법이 아니기 때문에 병렬로 해도 되게 짜야한다.

//해당 Test를 Container로 넣어준다
@RunWith(SpringJUnit4ClassRunner.class)
//Container에 설정을 주입한다.
@ContextConfiguration(classes = UserConfig01.class)
public class UserTest {
	
	@Autowired
	private User user;
	
	private Friend friend;
	
	@Test
	public void testMethod() {
		assert(user != null);
		assertNotNull(user);
	}
	
	@Test
	public void testFriendNull() {
		assertNotNull(friend);
	}
	
	@Test
	public void testFriendDooly() {
		friend = new Friend("둘리");
		assertNotEquals(friend.getName(), "둘리");
	}
	
}
