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

		m[MemberManager.ctn] = new Member(id, pw, name, age, gender, email);
		// �Է� ���� ������ MemberŬ������ �Ű����� �ִ� �����ڸ� ����� ��ü ���� �� �迭�� ����

		MemberManager.ctn++;
		// �ε����� ȸ���� ������Ŵ

		System.out.println("�Է��� �Ϸ�Ǿ����ϴ�. ���� �޴��� ���ư��ϴ�.");
		// "�Է��� �Ϸ�Ǿ����ϴ�. ���� �޴��� ���ư��ϴ�." ��� �� ���θ޴��� ���ư�
		return;
	}

	public void searchId() {
		System.out.print("�˻��� ���̵� �Է��ϼ��� : ");
		String id = sc.next();
		// "�˻��� ���̵� �Է��ϼ��� : " ��� �� Ű����� ���̵� �Է� ����

		for (int i = 0; i < MemberManager.ctn; i++) {
			// ȸ�� ���� ����� �迭�� 0������ idx������ �Է¹��� ���̵�� ��ü �迭�� ���̵� �񱳸� �ݺ�
			if (id.equals(m[i].getUserId())) {
				printOne(m[i]);
				// ��ġ�ϴ� �ε����� ã�Ƽ� �ش��ϴ� �迭�� �ε��� ��ü ���� ���
				// ��,printOne()����Ͽ� ���
			} else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
				return;
				// ��ġ�ϴ� ȸ���� ���� ��� ��� �� �������� ���ư�.
			}
		}
	}

	public void searchName() {

		System.out.print("�˻��� �̸��� �Է��ϼ��� : ");
		String name = sc.next();
		// ���̵� ã��� ����
		// �̸��� �Է��Ͽ� �̸��� ���Ͽ� �˻��� ȸ�� ���� ���

		for (int i = 0; i < MemberManager.ctn; i++) {
			// ȸ�� ���� ����� �迭�� 0������ idx������ �Է¹��� ���̵�� ��ü �迭�� ���̵� �񱳸� �ݺ�
			if (name.equals(m[i].getUserName())) {
				printOne(m[i]);
				// ��ġ�ϴ� �ε����� ã�Ƽ� �ش��ϴ� �迭�� �ε��� ��ü ���� ���
				// ��,printOne()����Ͽ� ���
			} else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
				return;
				// ��ġ�ϴ� ȸ���� ���� ��� ��� �� �������� ���ư�.
			}
		}
	}

	public void searchEmail() {

		System.out.print("�˻��� �̸����� �Է��ϼ��� : ");
		String email = sc.next();
		// �̸��Ϸ� �˻��Ͽ� ���� �޼ҵ�� ������ ������� �ۼ�

		for (int i = 0; i < MemberManager.ctn; i++) {
			// ȸ�� ���� ����� �迭�� 0������ idx������ �Է¹��� ���̵�� ��ü �迭�� ���̵� �񱳸� �ݺ�
			if (email.equals(m[i].getEmail())) {
				printOne(m[i]);
				// ��ġ�ϴ� �ε����� ã�Ƽ� �ش��ϴ� �迭�� �ε��� ��ü ���� ���
				// ��,printOne()����Ͽ� ���
			} else {
				System.out.println("�˻��� ȸ�� ������ �������� �ʽ��ϴ�.");
				return;
				// ��ġ�ϴ� ȸ���� ���� ��� ��� �� �������� ���ư�.
			}
		}
	}

	public void updatePwd() {
		System.out.print("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String id = sc.next();
		// "������ ȸ���� ���̵� �Է��ϼ��� : " ��� �� Ű����� ���̵� �Է� ����

		for (int i = 0; i < MemberManager.ctn; i++) {
			if (id.equals(m[i].getUserId())) {
				// search��İ� �����ϰ� �˻��Ͽ� �ش� �ε��� ã�� ��
				System.out.print("������ ��й�ȣ�� �Է��ϼ��� : ");
				m[i].setUserPwd(sc.next());
				// ������ ��й�ȣ�� �Է� ����
				// �ش� �迭 �ε��� ��ü�� setter�� �̿��Ͽ� ��й�ȣ ����
				System.out.println("�н����� ������ �Ϸ�Ǿ����ϴ� ");
				return;
				// "�н����� ������ �Ϸ�Ǿ����ϴ� ��� �� ���θ޴��� ���ư�.
			} else {
				System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
				return;
				// �����Ϸ��� ȸ���� ���� ��� "������ ȸ���� �������� �ʽ��ϴ�." ��� �� ���� �޴��� ���ư�.
			}

		}

	}

	public void updateName() {
		System.out.print("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String id = sc.next();
		// ��й�ȣ ����� ������ (������ ������ ������ �̸��� �Է¹޾� setter�� �����Ѵ�.)

		for (int i = 0; i < MemberManager.ctn; i++) {
			if (id.equals(m[i].getUserId())) {
				// search��İ� �����ϰ� �˻��Ͽ� �ش� �ε��� ã�� ��
				System.out.print("������ �̸��� �Է��ϼ��� : ");
				m[i].setUserName(sc.next());
				// �ش� �迭 �ε��� ��ü�� setter�� �̿��Ͽ� ��й�ȣ ����
				System.out.println("�н����� ������ �Ϸ�Ǿ����ϴ� ");
				return;
				// "�н����� ������ �Ϸ�Ǿ����ϴ� ��� �� ���θ޴��� ���ư�.
			} else {
				System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
				return;
				// �����Ϸ��� ȸ���� ���� ��� "������ ȸ���� �������� �ʽ��ϴ�." ��� �� ���� �޴��� ���ư�.
			}

		}
	}

	public void updateEmail() {
		System.out.print("������ ȸ���� ���̵� �Է��ϼ��� : ");
		String id = sc.next();
		// ��й�ȣ ����� ������ (������ ������ ������ �̸��� �ּҸ� �Է¹޾� setter�� �����Ѵ�.)

		for (int i = 0; i < MemberManager.ctn; i++) {
			if (id.equals(m[i].getUserId())) {
				// search��İ� �����ϰ� �˻��Ͽ� �ش� �ε��� ã�� ��
				System.out.print("������ �̸����� �Է��ϼ��� : ");
				m[i].setEmail(sc.next());
				// �ش� �迭 �ε��� ��ü�� setter�� �̿��Ͽ� ��й�ȣ ����
				System.out.println("�н����� ������ �Ϸ�Ǿ����ϴ� ");
				return;
				// "�н����� ������ �Ϸ�Ǿ����ϴ� ��� �� ���θ޴��� ���ư�.
			} else {
				System.out.println("������ ȸ���� �������� �ʽ��ϴ�.");
				return;
				// �����Ϸ��� ȸ���� ���� ��� "������ ȸ���� �������� �ʽ��ϴ�." ��� �� ���� �޴��� ���ư�.
			}

		}
	}

	public void deleteOne() {
		System.out.println("Ż���� ȸ���� ���̵� �Է��ϼ��� : ");
		String id = sc.next();
		int button = 0;
		// "Ż���� ȸ���� ���̵� �Է��ϼ��� : " ��� �� ���̵� �Է� ����
		for (int i = 0; i < MemberManager.ctn; i++) {
			if (id.equals(m[i].getUserId())) {
				button = 1;
			}
			// ���̵�� Ż���� ȸ���� �ε����� ã�� ��
			if (button != 0 && i < MemberManager.ctn - 1) {
				m[i] = m[i + 1];
				// ���� �ε��� ��ü(�ε���+1)�� ������ ��ĭ�� ������ �̵���Ŵ
			}
		}
		if (button == 0)
			System.out.println("������ ȸ�� ������ �������� �ʽ��ϴ�.");
		// Ż���� ȸ���� ���� ��� "������ ȸ�� ������ �������� �ʽ��ϴ�." ���
		else
			MemberManager.ctn -= 1;
		// ������ ���������� �� ��� ctn�� 1 ���ҽ�Ŵ

	}

	public void deleteAll() {
		for (int i = 0; i < MemberManager.ctn; i++) {
			m[i].setAge(0);
			m[i].setEmail(null);
			m[i].setUserId(null);
			m[i].setGender('\u0000');
			m[i].setUserName(null);
			m[i].setUserPwd(null);
		}
		// 0~ctn������ ��� �ε����� ��� setter�� �̿��Ͽ� �ʱⰪ���� �����ϰ�
		MemberManager.ctn = 0;
		// ctn ���� �ٽ� 0���� �����Ŵ

	}

	public void printOne(Member m) {
		System.out.println("id : " + m.getUserId());
		System.out.println("pw : " + m.getUserPwd());
		System.out.println("�̸� : " + m.getUserName());
		System.out.println("���� : " + m.getAge());
		System.out.println("���� : " + m.getGender());
		System.out.println("�̸��� : " + m.getEmail());
	}

	public void printAllMember() {
		for (int i = 0; i < MemberManager.ctn; i++) {
			System.out.println("id : " + m[i].getUserId());
			System.out.println("pw : " + m[i].getUserPwd());
			System.out.println("�̸� : " + m[i].getUserName());
			System.out.println("���� : " + m[i].getAge());
			System.out.println("���� : " + m[i].getGender());
			System.out.println("�̸��� : " + m[i].getEmail());
			
		}
		//�ݺ����� �̿��Ͽ� ctn������ ��� �ε����� ��ü ������ getter�� ���� ��½�Ű�� �޼ҵ�

	}

}
