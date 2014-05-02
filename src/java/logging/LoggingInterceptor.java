/*
 * Copyright (c) 2014 by Alexander Nowak
 * To be used only with permission.
 */

package logging;

import java.util.logging.Logger;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 *
 * @author Alexander Nowak
 */
@Interceptor
@Loggable
public class LoggingInterceptor {
    @Inject
    private Logger logger;
    
    @AroundInvoke
    public Object logMethod(InvocationContext ic) throws Exception {
	logger.entering(ic.getTarget().getClass().getName(),ic.getMethod().getName());
	try {
	    return ic.proceed();
	} finally {
	    logger.exiting(ic.getTarget().getClass().getName(), ic.getMethod().getName());
	}
    }
    
}
