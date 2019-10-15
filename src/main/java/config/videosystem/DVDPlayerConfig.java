package config.videosystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import kr.co.itcen.springcontainer.videosystem.DVDPlayer;
import kr.co.itcen.springcontainer.videosystem.DigitalVideoDisc;

//Container내에서 Bean생성 순서를 크게 고려할 필요없다
//Bean을 생성하겠다고 명시해주면 해당 Bean이 주입된다.
@Configuration
@Import({DVDConfig.class})
public class DVDPlayerConfig {
	
	@Autowired
	@Qualifier("joker")
	DigitalVideoDisc dvd;
	
	@Bean
	public DVDPlayer digiterPlayer() {
		return new DVDPlayer(dvd);
	}
}
