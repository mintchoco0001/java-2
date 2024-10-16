package d0409;

public class Musicvo {
	private String title;
	private String singer;
	private int playTime;
	private String path;

	public Musicvo(String title, String singer, int playTime, String path) {
		this.title = title;
		this.singer = singer;
		this.playTime = playTime;
		this.path = path;
	}

	public String getTitle() {
		return title;
	}

	public String getSinger() {
		return singer;
	}

	public int getPlayTime() {
		return playTime;
	}

	public String getPath() {
		return path;
	}

	public String getEvery() {
		return title + "" + singer + "" + playTime + "" + path;
	}

}
