package config.videosystem;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import kr.co.itcen.springcontainer.videosystem.Avengers;
import kr.co.itcen.springcontainer.videosystem.BlankDisc;
import kr.co.itcen.springcontainer.videosystem.DigitalVideoDisc;

@Configuration
public class DVDConfig {
	
	@Bean
	public DigitalVideoDisc avengers() {
		return new Avengers();
	}
	
	@Bean("joker")
	public BlankDisc blankDisc() {
		BlankDisc blankDisc = new BlankDisc();
		blankDisc.setTitle("joker");
		blankDisc.setStudio("DC");
		blankDisc.setActors(Arrays.asList("호아킨 피닉스", "재지 비츠", "로버트 드 니로"));
		return blankDisc;
	}
}
