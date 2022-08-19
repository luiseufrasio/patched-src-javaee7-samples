package org.javaee7.batch.samples.scheduling;

import static jakarta.batch.runtime.BatchStatus.COMPLETED;

import jakarta.batch.api.AbstractBatchlet;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Named;

/**
 * @author Roberto Cortez
 */
@Named
@Dependent
public class MyBatchlet extends AbstractBatchlet {
    
    @Override
    public String process() {
        System.out.println("Running inside a batchlet");

        return COMPLETED.toString();
    }
}
