package kr.co.itcen.springcontainer.videosystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class DVDPlayer {
	@Autowired
	private DigitalVideoDisc digitalVideoDisc;
	
	public DVDPlayer() {
		
	}
	public DVDPlayer(DigitalVideoDisc digitalVideoDisc) {
		this.digitalVideoDisc = digitalVideoDisc;
	}
	
	public DigitalVideoDisc getDigitalVideoDisc() {
		return digitalVideoDisc;
	}

	public void setDigitalVideoDisc(DigitalVideoDisc digitalVideoDisc) {
		this.digitalVideoDisc = digitalVideoDisc;
	}
	
	public void play() {
		digitalVideoDisc.play();
	}
}
