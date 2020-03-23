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

		m[MemberManager.ctn] = new Member(id, pw, name, age, gender, email);
		// 입력 받은 정보를 Member클래스의 매개변수 있는 생성자를 사용해 객체 생성 후 배열에 저장

		MemberManager.ctn++;
		// 인덱스와 회원수 증가시킴

		System.out.println("입력이 완료되었습니다. 메인 메뉴로 돌아갑니다.");
		// "입력이 완료되었습니다. 메인 메뉴로 돌아갑니다." 출력 후 메인메뉴로 돌아감
		return;
	}

	public void searchMemberMenu() {
		System.out.print("검색할 아이디를 입력하세요 : ");
		String id = sc.next();
		// "검색할 아이디를 입력하세요 : " 출력 후 키보드로 아이디 입력 받음

		for (int i = 0; i < MemberManager.ctn; i++) {
			// 회원 정보 저장용 배열의 0번부터 idx값까지 입력받은 아이디와 객체 배열의 아이디를 비교를 반복
			if (id.equals(m[i].getUserId())) {
				printOne(m[i]);
				// 일치하는 인덱스값 찾아서 해당하는 배열의 인덱스 객체 정보 출력
				// 단,printOne()사용하여 출력
			} else {
				System.out.println("\"검색한 회원 정보가 존재하지 않습니다.\"");
				return;
				// 일치하는 회원이 없는 경우 출력 후 메인으로 돌아감.
			}
		}
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

	public void printOne(Member m) {
		System.out.println("id : " + m.getUserId());
		System.out.println("pw : " + m.getUserPwd());
		System.out.println("이름 : " + m.getUserName());
		System.out.println("나이 : " + m.getAge());
		System.out.println("성별 : " + m.getGender());
		System.out.println("이메일 : " + m.getEmail());
	}
}
