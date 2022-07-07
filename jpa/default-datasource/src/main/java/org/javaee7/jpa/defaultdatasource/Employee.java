package org.javaee7.jpa.defaultdatasource;


import java.io.Serializable;

import jakarta.persistence.*;

/**
 * @author Arun Gupta
 */
@Entity
@Table(name = "EMPLOYEE_SCHEMA_DEFAULT_DATASOURCE")
@NamedQueries(
    @NamedQuery(
        name = "Employee.findAll",
        query = "SELECT e FROM Employee e") )

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TEST_SEQUENCE_GENERATOR")
    @SequenceGenerator(name = "TEST_SEQUENCE_GENERATOR",
            sequenceName = "TEST_SEQ")
    @Column
    private int id;

    @Column(length = 40)
    private String name;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
