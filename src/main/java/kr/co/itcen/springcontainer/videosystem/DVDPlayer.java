package kr.co.itcen.springcontainer.videosystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class DVDPlayer {
	
	private DigitalVideoDisc dvd;
	
	public DVDPlayer() {
		
	}
	
	public DVDPlayer(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}
	
	public DigitalVideoDisc getDigitalVideoDisc() {
		return dvd;
	}

	public void setDigitalVideoDisc(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}
	
	public void play() {
		dvd.play();
	}
}
