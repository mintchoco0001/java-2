package d0405;

public class Maplevo {
	// vo (����� �ڷ���)
	// 1. �� �ڷ����� �����ϰ� ���� ������ ����
	private String nick;
	private int str;
	private int dex;
	private int luck;
	private int intel;
	private String surver;

	// 2. ������ �żҵ� ���۹�
	public Maplevo(String nick, int str, int dex, int luck, int intel, String surver) {
		// ����Ÿ�� ��� ����
		// �̸��� Ŭ���� �̸��� ������
		this.nick = nick;
		this.str = str;
		this.dex = dex;
		this.luck = luck;
		this.intel = intel;
		this.surver = surver;
		// �������� �޼ҵ� ���� this�ڴ� �ʵ念��
		// = �޼ҵ� ������ ���� �ʵ念���� �����ϰڴ�
		
	}

//	3. ���� �����ϴ� �޼ҵ尡 �ʿ���
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
