package kr.co.itcen.springcontainer.soundsystem;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import config.soundsystem.SoundSystemConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SoundSystemConfig.class})
public class SoundSystemJavaConfigTest {
	
	@Rule
	public SystemOutRule systemOutRule = new SystemOutRule();
	
	@Autowired
	@Qualifier("highSchoolRapper2Final")
	private CompactDisc cd;
	
	@Autowired
	private CDPlayer cdPlayer;
	
	@Test
	public void testCDNull() {
		assertNotNull(cd);
	}
	
	@Test
	public void testCDPlayerNull() {
		assertNotNull(cdPlayer);
	}
	
	@Test
	public void testPlay() {
		cdPlayer.play();
		assertNotEquals("Playing 봉봉 by 김하은", systemOutRule.getLog());
	}
}
