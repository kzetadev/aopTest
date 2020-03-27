package com.bit.exam01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
//공통관심사항
public class ProfilingAdvice {
	
	public void afterThrowing(JoinPoint joinPoint, Throwable e) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "비정상 종료됨.");
		System.out.println("예외 발생");
		System.out.println(e);
		System.out.println("=============");
	}
	//예외가 발생하는 advice만 실행
//	public void afterThrowing(JoinPoint joinPoint) {
//		String methodName = joinPoint.getSignature().toShortString();
//		System.out.println(methodName + "비정상 종료됨.");
//	}
//	public void afterReturning(JoinPoint joinPoint) {
//		String methodName = joinPoint.getSignature().toShortString();
//		System.out.println(methodName + "정상 완료됨.");
//	}
	public void afterReturning(JoinPoint joinPoint, Object ret) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "정상 완료됨.");
		System.out.println("반환값");
		System.out.println("=========");
		System.out.println(ret);
		System.out.println("=========");
		
	}
	public void after(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "실행 후");
	}
	public void before(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "실행 전");
	}
//	public void before() {
//		System.out.println("타겟이 되는 메소드 실행 전");
//	}
	//around advice는 반드시 JoinPoint를 가져야함.
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
