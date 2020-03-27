package com.bit.exam01;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class ProfilingAdviceAspect {
								//com.bit.dao..* --> ��� �޼ҵ�
	@Pointcut("execution(public * com.bit.dao..*(..))")
	private void daoMethod() {
		
	}
	@Around("daoMethod()")
	public Object pro(ProceedingJoinPoint joinPoint) {
		Object re = null;
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "����");
		long start = System.currentTimeMillis();
		try {
			re = joinPoint.proceed();	//Ÿ���� �Ǵ� �޼ҵ� ȣ��. ������, �� ��ó���� ������ ��.
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		System.out.println(methodName + "����");
		long finish = System.currentTimeMillis();
		System.out.println("�ɸ��ð�:"+(finish - start));
		return re;
	}
	
}
