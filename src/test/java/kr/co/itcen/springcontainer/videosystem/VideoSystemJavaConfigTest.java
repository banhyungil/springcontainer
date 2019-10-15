package kr.co.itcen.springcontainer.videosystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.videosystem.DVDPlayerConfig;

/**
 * 
 * Explicit(명시적) Configuration - Java Config
 * @Bean
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DVDPlayerConfig.class})
public class VideoSystemJavaConfigTest {
	
	@Rule
	public SystemOutRule systemOutRule = new SystemOutRule();
	
	@Autowired
	@Qualifier("joker")
	DigitalVideoDisc digitalVideoDisc;
	
	@Autowired
	DVDPlayer dvdPlayer;
	
	@Test
	public void testDigitalVideoDiscNull(){
		assertNotNull(digitalVideoDisc);
	}
	
	@Test
	public void testPlayerNull() {
		assertNotNull(dvdPlayer);
	}
	
	@Test
	public void testPlay() {
		dvdPlayer.play();
		assertEquals("Playing Movie MARVEL's Avengers", systemOutRule.getLog().replace("\r\n", ""));
	}
}
