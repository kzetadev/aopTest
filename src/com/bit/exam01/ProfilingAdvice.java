package com.bit.exam01;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
//������ɻ���
public class ProfilingAdvice {
	
	public void afterThrowing(JoinPoint joinPoint, Throwable e) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "������ �����.");
		System.out.println("���� �߻�");
		System.out.println(e);
		System.out.println("=============");
	}
	//���ܰ� �߻��ϴ� advice�� ����
//	public void afterThrowing(JoinPoint joinPoint) {
//		String methodName = joinPoint.getSignature().toShortString();
//		System.out.println(methodName + "������ �����.");
//	}
//	public void afterReturning(JoinPoint joinPoint) {
//		String methodName = joinPoint.getSignature().toShortString();
//		System.out.println(methodName + "���� �Ϸ��.");
//	}
	public void afterReturning(JoinPoint joinPoint, Object ret) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "���� �Ϸ��.");
		System.out.println("��ȯ��");
		System.out.println("=========");
		System.out.println(ret);
		System.out.println("=========");
		
	}
	public void after(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "���� ��");
	}
	public void before(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().toShortString();
		System.out.println(methodName + "���� ��");
	}
//	public void before() {
//		System.out.println("Ÿ���� �Ǵ� �޼ҵ� ���� ��");
//	}
	//around advice�� �ݵ�� JoinPoint�� ��������.
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
