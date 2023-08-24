package ch07;

class MyTv2 {
	private boolean isPoweron;
	private int channel;
	private int volume;
	private int prevChannel;	// 이전 채널 저장할 멤버변수
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	
	public boolean isPoweron() {
		return isPoweron;
	}
	public void setPoweron(boolean isPoweron) {
		this.isPoweron = isPoweron;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		if(channel < MIN_CHANNEL || channel > MAX_CHANNEL)	// 유효성 검증
			return;
		
		prevChannel = this.channel;
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME)	// 유효성 검증
			return;
		
		this.volume = volume;
	}
	
	public void gotoPrevChannel() {
		setChannel(prevChannel);	// 현재 채널을 이전 채널로 변경한다.
	}
}

public class Exercise7_5 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH : " + t.getChannel());
		t.setChannel(20);
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH : " + t.getChannel());
	}

}
