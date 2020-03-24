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

	public void searchId() {
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
				System.out.println("검색한 회원 정보가 존재하지 않습니다.");
				return;
				// 일치하는 회원이 없는 경우 출력 후 메인으로 돌아감.
			}
		}
	}

	public void searchName() {

		System.out.print("검색할 이름을 입력하세요 : ");
		String name = sc.next();
		// 아이디 찾기와 동일
		// 이름을 입력하여 이름을 비교하여 검색된 회원 정보 출력

		for (int i = 0; i < MemberManager.ctn; i++) {
			// 회원 정보 저장용 배열의 0번부터 idx값까지 입력받은 아이디와 객체 배열의 아이디를 비교를 반복
			if (name.equals(m[i].getUserName())) {
				printOne(m[i]);
				// 일치하는 인덱스값 찾아서 해당하는 배열의 인덱스 객체 정보 출력
				// 단,printOne()사용하여 출력
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다.");
				return;
				// 일치하는 회원이 없는 경우 출력 후 메인으로 돌아감.
			}
		}
	}

	public void searchEmail() {

		System.out.print("검색할 이메일을 입력하세요 : ");
		String email = sc.next();
		// 이메일로 검색하여 위의 메소드와 동일한 방식으로 작성

		for (int i = 0; i < MemberManager.ctn; i++) {
			// 회원 정보 저장용 배열의 0번부터 idx값까지 입력받은 아이디와 객체 배열의 아이디를 비교를 반복
			if (email.equals(m[i].getEmail())) {
				printOne(m[i]);
				// 일치하는 인덱스값 찾아서 해당하는 배열의 인덱스 객체 정보 출력
				// 단,printOne()사용하여 출력
			} else {
				System.out.println("검색한 회원 정보가 존재하지 않습니다.");
				return;
				// 일치하는 회원이 없는 경우 출력 후 메인으로 돌아감.
			}
		}
	}

	public void updatePwd() {
		System.out.print("수정할 회원의 아이디를 입력하세요 : ");
		String id = sc.next();
		// "수정할 회원의 아이디를 입력하세요 : " 출력 후 키보드로 아이디 입력 받음

		for (int i = 0; i < MemberManager.ctn; i++) {
			if (id.equals(m[i].getUserId())) {
				// search방식과 동일하게 검색하여 해당 인덱스 찾은 후
				System.out.print("변경할 비밀번호를 입력하세요 : ");
				m[i].setUserPwd(sc.next());
				// 변경할 비밀번호를 입력 받음
				// 해당 배열 인덱스 객체의 setter를 이용하여 비밀번호 변경
				System.out.println("패스워드 수정이 완료되었습니다 ");
				return;
				// "패스워드 수정이 완료되었습니다 출력 후 메인메뉴로 돌아감.
			} else {
				System.out.println("수정할 회원이 존재하지 않습니다.");
				return;
				// 수정하려는 회원이 없는 경우 "수정할 회원이 존재하지 않습니다." 출력 후 메인 메뉴로 돌아감.
			}

		}

	}

	public void updateName() {
		System.out.print("수정할 회원의 아이디를 입력하세요 : ");
		String id = sc.next();
		// 비밀번호 변경과 동일함 (수정할 정보는 변경할 이름을 입력받아 setter로 변경한다.)

		for (int i = 0; i < MemberManager.ctn; i++) {
			if (id.equals(m[i].getUserId())) {
				// search방식과 동일하게 검색하여 해당 인덱스 찾은 후
				System.out.print("변경할 이름을 입력하세요 : ");
				m[i].setUserName(sc.next());
				// 해당 배열 인덱스 객체의 setter를 이용하여 비밀번호 변경
				System.out.println("패스워드 수정이 완료되었습니다 ");
				return;
				// "패스워드 수정이 완료되었습니다 출력 후 메인메뉴로 돌아감.
			} else {
				System.out.println("수정할 회원이 존재하지 않습니다.");
				return;
				// 수정하려는 회원이 없는 경우 "수정할 회원이 존재하지 않습니다." 출력 후 메인 메뉴로 돌아감.
			}

		}
	}

	public void updateEmail() {
		System.out.print("수정할 회원의 아이디를 입력하세요 : ");
		String id = sc.next();
		// 비밀번호 변경과 동일함 (수정할 정보는 변경할 이메일 주소를 입력받아 setter로 변경한다.)

		for (int i = 0; i < MemberManager.ctn; i++) {
			if (id.equals(m[i].getUserId())) {
				// search방식과 동일하게 검색하여 해당 인덱스 찾은 후
				System.out.print("변경할 이메일을 입력하세요 : ");
				m[i].setEmail(sc.next());
				// 해당 배열 인덱스 객체의 setter를 이용하여 비밀번호 변경
				System.out.println("패스워드 수정이 완료되었습니다 ");
				return;
				// "패스워드 수정이 완료되었습니다 출력 후 메인메뉴로 돌아감.
			} else {
				System.out.println("수정할 회원이 존재하지 않습니다.");
				return;
				// 수정하려는 회원이 없는 경우 "수정할 회원이 존재하지 않습니다." 출력 후 메인 메뉴로 돌아감.
			}

		}
	}

	public void deleteOne() {
		System.out.println("탈퇴할 회원의 아이디를 입력하세요 : ");
		String id = sc.next();
		int button = 0;
		// "탈퇴할 회원의 아이디를 입력하세요 : " 출력 후 아이디 입력 받음
		for (int i = 0; i < MemberManager.ctn; i++) {
			if (id.equals(m[i].getUserId())) {
				button = 1;
			}
			// 아이디로 탈퇴할 회원의 인덱스를 찾은 후
			if (button != 0 && i < MemberManager.ctn - 1) {
				m[i] = m[i + 1];
				// 다음 인덱스 객체(인덱스+1)의 정보를 한칸씩 앞으로 이동시킴
			}
		}
		if (button == 0)
			System.out.println("삭제할 회원 정보가 존재하지 않습니다.");
		// 탈퇴할 회원이 없는 경우 "삭제할 회원 정보가 존재하지 않습니다." 출력
		else
			MemberManager.ctn -= 1;
		// 삭제가 성공적으로 된 경우 ctn을 1 감소시킴

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
		// 0~ctn까지의 모든 인덱스의 모든 setter를 이용하여 초기값으로 변경하고
		MemberManager.ctn = 0;
		// ctn 값을 다시 0으로 변경시킴

	}

	public void printOne(Member m) {
		System.out.println("id : " + m.getUserId());
		System.out.println("pw : " + m.getUserPwd());
		System.out.println("이름 : " + m.getUserName());
		System.out.println("나이 : " + m.getAge());
		System.out.println("성별 : " + m.getGender());
		System.out.println("이메일 : " + m.getEmail());
	}

	public void printAllMember() {
		for (int i = 0; i < MemberManager.ctn; i++) {
			System.out.println("id : " + m[i].getUserId());
			System.out.println("pw : " + m[i].getUserPwd());
			System.out.println("이름 : " + m[i].getUserName());
			System.out.println("나이 : " + m[i].getAge());
			System.out.println("성별 : " + m[i].getGender());
			System.out.println("이메일 : " + m[i].getEmail());
			
		}
		//반복문을 이용하여 ctn까지의 모든 인덱스의 객체 정보를 getter를 통해 출력시키는 메소드

	}

}
