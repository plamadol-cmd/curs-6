package c5;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
public class MyAspect {
    @Pointcut("execution(* run*(..))")
    private void anyRunMethod(){}

    @Before(value="anyRunMethod()", argNames = "joinPoint")
    public void beforeCall(JoinPoint joinPoint){
        System.out.println("Method Name :" + joinPoint.getSignature().toShortString() +
                "| Args => " + Arrays.asList(joinPoint.getArgs()));
    }



}
