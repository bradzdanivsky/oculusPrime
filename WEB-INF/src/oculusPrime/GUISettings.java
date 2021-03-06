package oculusPrime;

import java.util.Properties;

public enum GUISettings {

	/** these settings must be available in basic configuration */
	skipsetup, speedslow, speedmed, nudgedelay, fullrotationdelay,
	docktarget, vidctroffset, vlow, vmed, vhigh, vfull, vcustom, vset, maxclicknudgedelay, 
	clicknudgemomentummult, maxclickcam, muteonrovmove, 
	videoscale, volume, loginnotify, reboot, pushtotalk; 
	
	/** get basic settings */
	public static Properties createDeaults() {
		Properties config = new Properties();
		config.setProperty(skipsetup.name() , "no");
		config.setProperty(speedslow.name() , "50");
		config.setProperty(speedmed.name() , "130");
		config.setProperty(docktarget.name() , "1.194_0.23209_0.17985_0.22649_129_116_80_67_-0.045455");
		config.setProperty(vidctroffset.name() , "-46");
		config.setProperty(vlow.name() , "320_240_4_85");
		config.setProperty(vmed.name() , "320_240_8_95");
		config.setProperty(vhigh.name() , "640_480_8_85");
		config.setProperty(vfull.name() , "640_480_8_95");
		config.setProperty(vcustom.name() , "1024_768_8_85");
		config.setProperty(vset.name() , "vmed");
		config.setProperty(pushtotalk.name() , "true");
		config.setProperty(maxclicknudgedelay.name() , "180");
		config.setProperty(nudgedelay.name() , "80");
		config.setProperty(clicknudgemomentummult.name() , "0.1");
		config.setProperty(maxclickcam.name() , "30");
		config.setProperty(volume.name() , "20");
		config.setProperty(muteonrovmove.name() , "true"); 
		config.setProperty(videoscale.name() , "100");
		config.setProperty(loginnotify.name() , "false");
		config.setProperty(reboot.name() , "false");
		config.setProperty(pushtotalk.name() , "false");
		config.setProperty(fullrotationdelay.name(), "2000");
		
		return config;
	}
	
	public static String getDefault(GUISettings factory) {
		Properties defaults = createDeaults();
		return defaults.getProperty(factory.name() );	
	}
	
}
