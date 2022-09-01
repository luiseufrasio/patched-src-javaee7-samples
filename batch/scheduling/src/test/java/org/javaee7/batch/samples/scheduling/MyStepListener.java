package org.javaee7.batch.samples.scheduling;

import java.util.concurrent.CountDownLatch;

import jakarta.batch.api.listener.AbstractStepListener;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Named;

@Named
@Dependent
public class MyStepListener extends AbstractStepListener {
    
    public static CountDownLatch countDownLatch = new CountDownLatch(3);

    @Override
    public void beforeStep() throws Exception {
    }

    @Override
    public void afterStep() throws Exception {
        countDownLatch.countDown();
    }
}
