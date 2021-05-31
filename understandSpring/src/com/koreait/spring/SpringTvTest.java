package com.koreait.spring;

import com.koreait.java.AppleSpeaker;
import com.koreait.java.LGTv;
import com.koreait.java.SamSungTv;
import com.koreait.java.SonySpeaker;
import com.koreait.java.Speaker;
import com.koreait.java.Tv;

public class SpringTvTest {
	public static void main(String[] args) { // args: 프로그램 시작할 때 외부에서 값을 넣어줄 수 있는 유일한 곳
		Speaker s1 = SpeakerFactory.choiceSpeaker(args[0]);
		Speaker s2 = SpeakerFactory.choiceSpeaker(args[1]);
		
		Tv lgtv = new LGTv(s1);
		Tv samtv = new SamSungTv(s2);
		
		System.out.println(lgtv);
		System.out.println(samtv);
		System.out.println(lgtv.toString());
		System.out.println(samtv.toString());
		System.out.println("LG TV, "+ lgtv.getInch()+"인치 "+lgtv.getMaxChannel()+"채널 "+lgtv.getMaxVolume()+"볼륨 ");
		System.out.println("SAMSUNG TV, "+ samtv.getInch()+"인치 "+samtv.getMaxChannel()+"채널 "+samtv.getMaxVolume()+"볼륨 ");
		
		for(int i=0; i<50; i++) {
			lgtv.volumeUp();
			samtv.volumeUp();
		}
	}
}
