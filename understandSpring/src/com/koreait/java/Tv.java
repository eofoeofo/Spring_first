package com.koreait.java;

public abstract class Tv {
	private Speaker speaker;
	private String brand;
	private int inch;
	private int maxChannel;
	private int maxVolume;
	private int currentChannel;
	private int currentVolume;
	
	public Tv(Speaker speaker, String brand, int inch, int maxChannel, int maxVolume) {
		this.speaker = speaker;
		this.brand = brand;
		this.inch = inch;
		this.maxChannel = maxChannel;
		this.maxVolume = maxVolume;
		this.currentChannel = 1;
	}
	public int getCurrentChannel() {
		return currentChannel;
	}
	public void setCurrentChannel(int currentChannel) {
		this.currentChannel = currentChannel;
	}
	public int getCurrentVolume() {
		return currentVolume;
	}
	public void setCurrentVolume(int currentVolume) {
		this.currentVolume = currentVolume;
	}
	public int getInch() {
		return inch;
	}
	public int getMaxChannel() {
		return maxChannel;
	}
	public int getMaxVolume() {
		return maxVolume;
	}
	public String getBrand() {
		return brand;
	}
	public void channelUp() {
		if(currentChannel == maxChannel) {
			currentChannel = 1;
		} else {
			currentChannel++;
		}
	}
	public void channelDown() {
		if(currentChannel == 1) {
			currentChannel = maxChannel;
		} else {
			currentChannel--;
		}
	}
	public void volumeUp() {
		if(currentVolume < maxVolume) {
			currentVolume++;
			speaker.volumeUp();
		}
		System.out.printf("%s - speaker : %d\n",brand,currentVolume);
	}
	public void volumeDown() {
		if(currentVolume > 0) {
			currentVolume--;
			speaker.volumeDown();
		}
		System.out.printf("%s - speaker : %d\n",brand,currentVolume);
	}
	@Override
	public String toString() {
		return String.format("%s, %d인치 %d채널, %d볼륨", 
			this.brand,getInch(),getMaxChannel(),getMaxVolume());
	}
}