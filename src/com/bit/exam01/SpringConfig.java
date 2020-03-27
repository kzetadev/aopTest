package com.bit.exam01;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.bit.dao.GoodsDao;
import com.bit.dao.MemberDao;
//어노테이션 기반 advice 사용 클래스
@Configuration
@EnableAspectJAutoProxy	//xml을 쓰지않고 어노테이션으로 Advice를 설정하기 위해 사용하는 어노테이션
public class SpringConfig {
//	@Bean MemberDao mDao() {
//		return new MemberDao();
//	}
//	@Bean GoodsDao gDao() {
//		return new GoodsDao();
//	}
	public ProfilingAdviceAspect advice() {
		return new ProfilingAdviceAspect();
	}
	@Bean 
	public MemberDao mDao() {
		return new MemberDao();
	}
	@Bean 
	public GoodsDao gDao() {
		return new GoodsDao();
	}
	
}
