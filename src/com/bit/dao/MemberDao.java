package com.bit.dao;

import java.util.ArrayList;

import com.bit.exam01.ProfilingAdvice;

//���� �޼ҵ��(�Ű�����, ���ϰ��� ���� �ٸ�)�� Ÿ������ ��
public class MemberDao {
	//Advice �� ���� ��
//	private ProfilingAdvice advice = new ProfilingAdvice();
	public int insertMember(String name, int age) {
//		advice.pro();	//������ �����ؾ� ��
		System.out.println("ȸ���� ����Ͽ����ϴ�.");
//		advice.pro();
		return 1;
	}
	public void updateMember() {
		System.out.println("ȸ���� �����Ͽ����ϴ�.");
	}
	public ArrayList<String> listMember(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("�̼���");
		list.add("������");
		list.add("������");
		return list;
	}
}
