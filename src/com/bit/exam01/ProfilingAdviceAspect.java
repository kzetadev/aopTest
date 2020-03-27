package com.bit.exam01;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ProfilingAdviceAspect {
								//com.bit.dao..* --> 모든 메소드
	@Pointcut("execution(public * com.bit.dao..*(..))")
	private void daoMethod() {
		
	}
	@Around("daoMethod()")
	public Object pro(ProceedingJoinPoint joinPoint) {
		Object re = null;
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "시작");
		long start = System.currentTimeMillis();
		try {
			re = joinPoint.proceed();	//타겟이 되는 메소드 호출. 실행전, 후 일처리의 기준이 됨.
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		System.out.println(methodName + "종료");
		long finish = System.currentTimeMillis();
		System.out.println("걸린시간:"+(finish - start));
		return re;
	}
	
}
