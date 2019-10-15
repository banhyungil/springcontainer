package kr.co.itcen.springcontainer.videosystem;

import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:config/videosystem/VideoSystemConfig.xml"})
public class VideoSystemXmlConfigTest {
	@Rule
	public SystemOutRule systemOutRule = new SystemOutRule();
	
	@Autowired
	Ironman ironmanDVD;
	
	@Autowired
	@Qualifier("joker")
	BlankDisc blankDVDJoker;
	
	@Autowired
	@Qualifier("joker")
	DigitalVideoDisc dvd;
	
	@Autowired
	@Qualifier("dvdPlayer1")
	DVDPlayer dvdP1;
	
	@Autowired
	@Qualifier("dvdPlayer2")
	DVDPlayer dvdP2;
	
	@Autowired
	@Qualifier("dvdPlayer3")
	DVDPlayer dvdP3;
	
	@Autowired
	@Qualifier("pBlankDisk")
	BlankDisc pBlankDisk;
	
	@Test
	public void testAvengersDiscNull() {
		assertNotNull(ironmanDVD);
	}
	
	@Test
	public void testBlankDiscNull() {
		assertNotNull(blankDVDJoker);
	}
	
	@Test
	public void testDigitalVideoDisc() {
		assertNotNull(dvd);
	}
	
	@Test
	public void testDVDPlayer1Null() {
		assertNotNull(dvdP1);
	}
	
	@Test
	public void testDVDP1Play() {
		dvdP1.play();
		systemOutRule.getLog().replace("\r\n", "").replace("\n", "");
	}
	
	@Test
	public void testDVDP2Play() {
		dvdP2.play();
		systemOutRule.getLog().replace("\r\n","").replace("\n", "");
	}
	
	@Test
	public void testDVDP3Play() {
		dvdP3.play();
		systemOutRule.getLog().replace("\r\n","").replace("\n", "");
	}
	
	@Test
	public void testPBlankDisk() {
		pBlankDisk.play();
		System.out.println(pBlankDisk.getActors().toString());
	}
}
