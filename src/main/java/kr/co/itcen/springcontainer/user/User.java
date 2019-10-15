package kr.co.itcen.springcontainer.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("user100")
public class User {
	private Long no;
	private String name;
	private Friend friend;
	
	public Friend getFriend() {
		return friend;
	}

	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	public User() {
		no = 1L;
		name = "반현길";
	}
	
	public User(Long no, String name) {
		this.no = no;
		this.name = name;
	}
	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + ", friend=" + friend + "]";
	}
	
	
}
