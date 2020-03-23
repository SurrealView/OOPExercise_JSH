package member.controller;

import java.util.Scanner;

import member.model.vo.Member;

public class MemberManager {

	private static Member[] m = new Member[10];
	private static int ctn = 0; // 회원 수 체크용 변수
	private Scanner sc = new Scanner(System.in); // 키보드로 정보 입력 받는 용

	public MemberManager() {

	}

	public void insertMember() {
		System.out.print("아이디 입력 : ");
		String id = sc.next();
		System.out.print("패스워드 입력 : ");
		String pw = sc.next();
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		System.out.print("성별 입력 : ");
		char gender = sc.next().charAt(0);
		System.out.print("이메일 입력 :");
		String email = sc.next();		
		// 키보드로 아이디, 패스워드, 이름, 나이, 성별, 이메일 입력
		
		m[MemberManager.ctn] = new Member(id,pw,name,age,gender,email);
		// 입력 받은 정보를 Member클래스의 매개변수 있는 생성자를 사용해 객체 생성 후 배열에 저장
		
		MemberManager.ctn++;
		// 인덱스와 회원수 증가시킴
		
		System.out.println("입력이 완료되었습니다. 메인 메뉴로 돌아갑니다.");
		// "입력이 완료되었습니다. 메인 메뉴로 돌아갑니다." 출력 후 메인메뉴로 돌아감
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
