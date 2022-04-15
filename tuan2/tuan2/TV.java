package tuan2;

public class TV {
	private int channel;
	private int volumeLevel;
	private boolean on;

	public TV() {

	}

	public void turnOn() {
		on = true;
		System.out.println("TV on!");
	}

	public void turnOff() {
		on = false;
		System.out.println("TV off!");
	}

	public boolean getOn() {
		return this.on;
	}

	public void setChannel(int newChannel) {

		if (1 <= newChannel && newChannel <= 120) {
			this.channel = newChannel;
			System.out.println("day la channel: " + this.channel);
		} else {
			System.out.println("false");
		}

	}

	public void setVolume(int newVolumeLevel) {
		if (1 <= newVolumeLevel && newVolumeLevel <= 7) {
			this.volumeLevel = newVolumeLevel;
			System.out.println("VolumeLevel hien tai = " + this.volumeLevel);
		} else {
			System.out.println("false");
		}
	}

	public void channelUp() {
		this.channel += 1;
		System.out.println("day la channel: " + this.channel);
	}

	public void channelDown() {
		this.channel -= 1;
		System.out.println("day la channel: " + this.channel);
	}

	public void volumeUp() {
		this.volumeLevel += 1;
		System.out.println("VolumeLevel hien tai = " + this.volumeLevel);
	}

	public void volumeDown() {
		this.volumeLevel -= 1;
		System.out.println("VolumeLevel hien tai = " + this.volumeLevel);
	}
}
