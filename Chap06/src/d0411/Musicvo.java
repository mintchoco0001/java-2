package d0411;

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

	@Override
	public String toString() {
		return "[title=" + title + ", singer=" + singer + ", play time=" + playTime + ", path=" + path + "]";
	}

}