package org.javaee7.batch.chunk.exception;

import jakarta.batch.api.chunk.listener.RetryProcessListener;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Named;

/**
 * @author Roberto Cortez
 */
@Named
@Dependent
public class MyRetryProcessorListener implements RetryProcessListener {
    @Override
    public void onRetryProcessException(Object item, Exception ex) throws Exception {
        System.out.println("MyRetryProcessorListener.onRetryProcessException");
    }
}
