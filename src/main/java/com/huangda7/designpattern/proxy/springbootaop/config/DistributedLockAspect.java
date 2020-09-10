package com.huangda7.designpattern.proxy.springbootaop.config;

import lombok.RequiredArgsConstructor;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Profile;
import org.springframework.core.DefaultParameterNameDiscoverer;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Aspect
@Component
@Profile("!unit-test & !int-test")
public class DistributedLockAspect {

//    private final RedissonClient redissonClient;

    private DefaultParameterNameDiscoverer discoverer = new DefaultParameterNameDiscoverer();

    private ExpressionParser parser = new SpelExpressionParser();

    @Pointcut("@annotation(com.huangda7.designpattern.proxy.springbootaop.config.DistributedLock)")
    public void DistributedLockAspect() {
    }

    @Before("@annotation(com.huangda7.designpattern.proxy.springbootaop.config.DistributedLock)")
    public void test() {
        System.out.println("test");
    }

    @Around("DistributedLockAspect()")
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around method1");
        pjp.proceed();
        System.out.println("around method2");
        return null;
//        Method method = ((MethodSignature) pjp.getSignature()).getMethod();
//        DistributedLock annotation = method.getAnnotation(DistributedLock.class);
//        String lockName = annotation.lockName();
//        String[] params = discoverer.getParameterNames(method);
//        if (null != params) {
//            Object[] arguments = pjp.getArgs();
//            EvaluationContext context = new StandardEvaluationContext();
//            for (int len = 0; len < params.length; len++) {
//                context.setVariable(params[len], arguments[len]);
//            }
//            Expression expression = parser.parseExpression(annotation.lockName());
//            lockName = expression.getValue(context, String.class);
//        }
//        String finalLockName = "DIST_LOCK:" + lockName;
//        return lock(pjp, method, finalLockName);
    }
//
//    public Object lock(ProceedingJoinPoint pjp, Method method, final String lockName) {
//        DistributedLock annotation = method.getAnnotation(DistributedLock.class);
//        boolean fairLock = annotation.fairLock();
//        return lock(pjp, lockName, fairLock);
//    }

//    public Object lock(ProceedingJoinPoint pjp, final String lockName, boolean fairLock) {
//        RLock lock = getLock(lockName, fairLock);
//        try {
//            lock.lock();
//            return proceed(pjp);
//        } finally {
//            if (lock.isHeldByCurrentThread()) {
//                lock.unlock();
//            }
//        }
//    }
//
//    public Object proceed(ProceedingJoinPoint pjp) {
//        try {
//            return pjp.proceed();
//        } catch (Throwable e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public RLock getLock(String lockName, boolean fairLock) {
//        RLock lock;
//        if (fairLock) {
//            lock = redissonClient.getFairLock(lockName);
//        } else {
//            lock = redissonClient.getLock(lockName);
//        }
//        return lock;
//    }

}
