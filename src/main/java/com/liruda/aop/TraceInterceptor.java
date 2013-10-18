package com.liruda.aop;

/**
 * Created with IntelliJ IDEA.
 * User: liruda
 * Date: 10/17/13
 * Time: 4:44 PM
 * To change this template use File | Settings | File Templates.
 */
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.springframework.aop.interceptor.CustomizableTraceInterceptor;

/**
 * Extends {@link CustomizableTraceInterceptor} to provide custom logging levels
 */
public class TraceInterceptor extends CustomizableTraceInterceptor {

    private static final long serialVersionUID = 287162720460370957L;
    protected static Logger logger4J = Logger.getLogger("aop");

    @Override
    protected void writeToLog(Log logger, String message, Throwable ex) {
        if (ex != null) {
            logger4J.debug(message, ex);
        } else {
            logger4J.debug(message);
        }
    }

    @Override
    protected boolean isInterceptorEnabled(MethodInvocation invocation, Log logger) {
        return true;
    }
}
