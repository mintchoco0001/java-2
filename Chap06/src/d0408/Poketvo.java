package d0408;

public class Poketvo {

	private String name;
	private String type;
	private String where;
	private int mp;
	private int lv;

	public Poketvo(String name, String type, String where, int mp, int lv) {

		this.name = name;
		this.type = type;
		this.where = where;
		this.mp = mp;
		this.lv = 1;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getWhere() {
		return where;
	}

	public int mp() {
		return mp;
	}

	public int lv() {
		return lv;
	}

	public String getEvery() {
		return "이름:"+name + " 속성:" + type + " 사는곳:" + where + " 마나:" + mp + " 레벨:" + lv;
	}

}
