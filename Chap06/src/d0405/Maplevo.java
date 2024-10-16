package d0405;

public class Maplevo {
	// vo (사용자 자료형)
	// 1. 각 자료형에 저장하고 싶은 데이터 변수
	private String nick;
	private int str;
	private int dex;
	private int luck;
	private int intel;
	private String surver;

	// 2. 생성자 매소드 제작법
	public Maplevo(String nick, int str, int dex, int luck, int intel, String surver) {
		// 리턴타입 명시 안함
		// 이름도 클래스 이름과 동일함
		this.nick = nick;
		this.str = str;
		this.dex = dex;
		this.luck = luck;
		this.intel = intel;
		this.surver = surver;
		// 오늘쪽은 메소드 영역 this뒤는 필드영역
		// = 메소드 영역의 값을 필드영역에 저장하겠다
		
	}

//	3. 값을 리턴하는 메소드가 필요함
	public String getNick() {
		return nick;
	}

	public int getStr() {
		return str;
	}

	public int getDex() {
		return dex;
	}
	public int getLuck() {
		return luck;
	}
	public int getIntel() {
		return intel;
	}
	public String getSurver() {
		return surver;
	}public String getEvry() {
		return nick+" "+str+" "+dex+" "+luck+" "+intel+" "+surver;
	}
	

}
