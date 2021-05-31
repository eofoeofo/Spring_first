package com.koreait.java;

public class TvTest {

	public static void main(String[] args) {
		Tv lgtv = new LGTv(new AppleSpeaker(40));
		Tv samtv = new SamSungTv(new SonySpeaker(30));
		
		System.out.println(lgtv);
		System.out.println(samtv);
		System.out.println(lgtv.toString());
		System.out.println(samtv.toString());
		System.out.println("LG TV, "+ lgtv.getInch()+"인치 "+lgtv.getMaxChannel()+"채널 "+lgtv.getMaxVolume()+"볼륨 ");
		System.out.println("SAMSUNG TV, "+ samtv.getInch()+"인치 "+samtv.getMaxChannel()+"채널 "+samtv.getMaxVolume()+"볼륨 ");
		for(int i=0; i<50; i++) {
			lgtv.volumeUp();
		}
	}
}