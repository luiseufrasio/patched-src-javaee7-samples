package org.javaee7.jpa.datasourcedefinition_annotation_pu.config;

import jakarta.annotation.sql.DataSourceDefinition;
import jakarta.ejb.Stateless;

@DataSourceDefinition(
    name = "java:app/MyApp/MyDS",
    className = "org.h2.jdbcx.JdbcDataSource",
    url = "jdbc:h2:mem:test;NON_KEYWORDS=VALUE")
@Stateless
public class DataSourceDefinitionConfig {
}
