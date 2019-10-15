package kr.co.itcen.springcontainer.soundsystem;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {
	
	@Autowired
	@Qualifier("highSchoolRapper2Final")
	private CompactDisc cd;
	
	
	public CDPlayer(CompactDisc cd) {
		this.cd = cd;
	}
	public void play() {
		cd.play();
	}
}
