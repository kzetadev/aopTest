package com.bit.dao;

import java.util.ArrayList;

import com.bit.exam01.ProfilingAdvice;

//여러 메소드들(매개변수, 리턴값이 각각 다름)을 타겟으로 함
public class MemberDao {
	//Advice 미 설정 시
//	private ProfilingAdvice advice = new ProfilingAdvice();
	public int insertMember(String name, int age) {
//		advice.pro();	//일일이 설정해야 함
		System.out.println("회원을 등록하였습니다.");
//		advice.pro();
		return 1;
	}
	public void updateMember() {
		System.out.println("회원을 수정하였습니다.");
	}
	public ArrayList<String> listMember(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("이순신");
		list.add("유관순");
		list.add("김유신");
		return list;
	}
}
