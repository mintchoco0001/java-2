package d0409;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//���ǻ���!! ũ���� �̸� ArrayList�� �ȉ�!!!
		
		ArrayList<String> names = new ArrayList<String>();//String Ÿ���� �����ϴ� ArrayList Ÿ��
		//Generic Ÿ�� �⺻��X, ������O
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		//int(�⺻��),Integer(������, Wrapper Ŭ����)
		//float => Float, double =>Double
		
		//1. ������ �߰��ϱ� - add �ѹ��� �Ѱ��� ���尡��
		names.add("������");
		names.add("ī����");
		names.add("����");
		names.add("�����");
		
		//2.������ ���� �˾Ƴ��� = �迭 .length(�ʵ�), ArrayList.size() (�޼ҵ�)
		System.out.println(names.size());
		//3.n��° ������ �˾Ƴ���
		System.out.println(names.get(1));
		//4.n��° ������ �����ϱ�
		System.out.println(names.remove(1));
		System.out.println(names.get(1));
		//5.��ü���
		for(int i=0; i<names.size();i++) {
			System.out.println(names.get(i));
		}
	}

}
