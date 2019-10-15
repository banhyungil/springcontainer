package kr.co.itcen.springcontainer.soundsystem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


//해당 Test를 Container로 넣어준다
@RunWith(SpringJUnit4ClassRunner.class)
//Container에 설정을 주입한다.
@ContextConfiguration(locations= {"classpath:config/soundsystem/SoundSystemConfig.xml"})
public class SoundSytemXmlConfigTest {
	
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
	
	@Ignore
	@Test
	public void testCDPlayer() {
		assertNotNull(cdPlayer);
	}
	
	public void testPlay() {
		cdPlayer.play();
		//위에서 출력한 내용이 getLog를 통해 String으로 나온다
		assertEquals("Playing 봉봉 by 김하은", systemOutRule.getLog());
	}
}
