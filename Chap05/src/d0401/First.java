package d0401;

import java.util.Iterator;
import java.util.Scanner;

public class First {

	public static void main(String[] args) {
//		�Է� �ޱ�
//		�����-������-��ǻ��
//		�Է� >�����
//		�Է� �޴°�>��ǻ��
//		��Ű�� ���>������
//		
//		1��������(Scanner)
//		Scanner sc = new Scanner(System.in);
//		������ ������ �ּ�  =    ���� ������ ����
//		
//		2.�Է¸��
//		sc.next
//		���� �ּ� .(�� �ִ�) ���, ����

//		���� 
//		> ���� �����ϰ� ������ ���
//		
//		����(�ڷ����� ����)
//		���(�ڷ����� ������ ����)
//		int a= 10;
//		�ڷ���
//		System.out.println(a);
//		�����
//		System.out.println(int a);
//		���������� �Ұ���
//		
//		1. �������� ���� ���� ��밡��?
//		= �Ұ���. �����Ҷ��� ��뺸�� ���� �ۼ�
//		
//		2. �Ȱ��� �̸����� 2���̻� ��������?
//		= �Ұ���.

//		������ 
//		> ������ ��� ������
//		
//		�������� �ڷ���
//		
//		true/false(boolean)
//		>��, ��
//		
//		����(int, double)
//		>���
//		
//		�������
//		���Կ���, ��������, ���׿���
//		
//		���ǹ�
//		
//		>������(����)�� ���� �ٸ� ����� �����ϱ� ���� ����Ѵ�

//		�ݺ���
//		
//		>Ư�� ������ ���� �� ������ ����� �ݺ�
//		
//		�ݺ��� ����(��� ��) ����
//		��𼭺��� ������ �ݺ� ����
//		
//		30���� ���� �޼��Ҷ�����(�����ڰ� ��� �ݺ����� �𸦶�)
//		>while
//		int i= 0;
//		while(i=<=100) {
//		����1,
//		����2,
//		����3
//		i+=10;
//		}
//		10�� �ֹ��Ҷ�(�����ڰ� ��� �ݺ����� �˶�)
//		>for
//		for(int i =0; i<=10; i++) {
//			
//		}
//		1. ��������
		Scanner sc= new Scanner(System.in);

		String id1 = "person1";
		String id2 = "person2";
		String id3 = "person3";
//		2.�Է¹ޱ� (�����̸�.next)
		String id4 = sc.nextLine();

//		id=sc.nextline();�Ұ���
		
		
		if(id1 .equals(id4)) {
			System.out.println("�ߺ��Դϴ�");
		}else if(id2 .equals(id4)) {
			System.out.println("�ߺ��Դϴ�");
		}
		else if(id3 .equals(id4)) {
			System.out.println("�ߺ��Դϴ�");
		}
		else {
			System.out.println("��� �����մϴ�.");
		}
		
	}

}
