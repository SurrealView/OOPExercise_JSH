package member.view;

import java.util.Scanner;

import member.controller.MemberManager;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberManager mm = new MemberManager();

	public MemberMenu() {

	}

	public void mainMenu() {

		while (true) {
			System.out.println("========== ȸ�� ���� �޴� ==========");
			System.out.println("1. �ű� ȸ�� ���");
			System.out.println("2. ȸ�� ���� �˻�");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ���� ���");
			System.out.println("9. ����");
			System.out.println("====================================");
			System.out.println("�޴� ��ȣ�� �Է��ϼ��� :");
			int button = sc.nextInt();
			switch (button) {
			case 1:
				mm.insertMember();
				break;
			case 2:
				mm.searchMemberMenu();
				break;
			case 3:
				mm.updateMemberMenu();
				break;
			case 4:
				mm.deleteMemberMenu();
				break;
			case 5:
				mm.printAllMember();
				break;
			case 9:
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
			}
		}

	}
}
