package member.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {

	private static Member[] m = new Member[10];
	private static int ctn = 0; // ȸ�� �� üũ�� ����
	private Scanner sc = new Scanner(System.in); // Ű����� ���� �Է� �޴� ��

	public MemberManager() {

	}

	public void insertMember() {
		System.out.print("���̵� �Է� : ");
		String id = sc.next();
		System.out.print("�н����� �Է� : ");
		String pw = sc.next();
		System.out.print("�̸� �Է� : ");
		String name = sc.next();
		System.out.print("���� �Է� : ");
		int age = sc.nextInt();
		System.out.print("���� �Է� : ");
		char gender = sc.next().charAt(0);
		System.out.print("�̸��� �Է� :");
		String email = sc.next();		
		// Ű����� ���̵�, �н�����, �̸�, ����, ����, �̸��� �Է�
		
		m[MemberManager.ctn] = new Member(id,pw,name,age,gender,email);
		// �Է� ���� ������ MemberŬ������ �Ű����� �ִ� �����ڸ� ����� ��ü ���� �� �迭�� ����
		
		MemberManager.ctn++;
		// �ε����� ȸ���� ������Ŵ
		
		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. ���� �޴��� ���ư��ϴ�.");
		// "�Է��� �Ϸ�Ǿ����ϴ�. ���� �޴��� ���ư��ϴ�." ��� �� ���θ޴��� ���ư�
		return;
	}

	public void searchMemberMenu() {
		// TODO Auto-generated method stub

	}

	public void updateMemberMenu() {
		// TODO Auto-generated method stub

	}

	public void deleteMemberMenu() {
		// TODO Auto-generated method stub

	}

	public void printAllMember() {
		// TODO Auto-generated method stub

	}

	public void searchId() {
		// TODO Auto-generated method stub

	}

	public void searchName() {
		// TODO Auto-generated method stub

	}

	public void searchEmail() {
		// TODO Auto-generated method stub

	}

	public void updatePwd() {
		// TODO Auto-generated method stub

	}

	public void updateName() {
		// TODO Auto-generated method stub

	}

	public void updateEmail() {
		// TODO Auto-generated method stub

	}

	public void deleteOne() {
		// TODO Auto-generated method stub

	}

	public void deleteAll() {
		// TODO Auto-generated method stub

	}

}
