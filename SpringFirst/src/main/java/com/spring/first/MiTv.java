package com.spring.first;

import com.spring.first.Speaker;

public class MiTv {
	private Speaker speaker;
	
	public MiTv() {
		System.out.println("MiTv 기본 생성자");
	}
	public MiTv(Speaker speaker) {
		System.out.println("MiTv speaker생성자");
		this.speaker = speaker;
	}
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
}
