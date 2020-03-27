package com.bit.dao;

import java.util.ArrayList;
//com.bit.dao에 있는 클래스, 메소드들을 타겟으로 함.
//반환값 형태별, 매개변수 형태별로도 설정할 수 있음.
public class GoodsDao {
	public int insertGoods(String item, int price) {
		System.out.println("상품을 등록하였습니다.");
		return 1;
	}
	public ArrayList<String> list(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("포도");
		list.add("오렌지");
		System.out.println(list.get(100));	//의도적으로 예외 발생시킴
		return list;
	}
}
