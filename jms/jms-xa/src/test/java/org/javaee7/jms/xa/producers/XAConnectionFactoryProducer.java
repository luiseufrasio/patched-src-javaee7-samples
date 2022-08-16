package org.javaee7.jms.xa.producers;

import jakarta.annotation.Resource;
import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Produces;
import jakarta.jms.ConnectionFactory;

@Dependent
public class XAConnectionFactoryProducer {

    @Produces
    @Resource(lookup = "java:app/jms/xaConnectionFactory")
    private ConnectionFactory connectionFactory;
}
