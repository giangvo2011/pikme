package com.pikme.common.logging;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.ThrowsAdvice;

/**
 * AOP
 * Log4
 * @author Trinh.hien
 */

public class LoggingInterceptor 
        implements MethodBeforeAdvice, AfterReturningAdvice, ThrowsAdvice {

    private Log logger = null;
    
    /**
     * contructor
     */
    public LoggingInterceptor(){}
    
    /* (non-Javadoc)
     * @see org.springframework.aop.MethodBeforeAdvice#before(java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
     */
    public void before(Method method, Object[] objects, Object target)
                                                            throws Throwable {
        
        this.logger = LogFactory.getLog(target.getClass());
        this.logger.info("c " + method.getName() + " ===================================================");
        
        
        if (objects != null) {
            for (int i = 0; i < objects.length; i++) {
                Object arg = objects[i];
                if (arg != null) {
                    this.logger.info("arg : " + arg.getClass().getName() + " : " + arg.toString());
                }
            }
        }
    }

    /* (non-Javadoc)
     * @see org.springframework.aop.AfterReturningAdvice#afterReturning(java.lang.Object, java.lang.reflect.Method, java.lang.Object[], java.lang.Object)
     */
    public void afterReturning(Object object, Method method, Object[] objects, Object target)
                                                            throws Throwable {
        
        this.logger = LogFactory.getLog(target.getClass());
        this.logger.info("Ending method: " + method.getName() + " ---------------------------------------------------");
    }
    
    /**
     * throw
     * @param method
     * @param args
     * @param target
     * @param ex
     */
    public void afterThrowing(Method method, Object[] args, Object target, Throwable ex) {
        
        this.logger = LogFactory.getLog(target.getClass());
        this.logger.error("Exception in method: " + method.getName() + " Exception is: " + ex.getMessage());
    }
}

