package org.javaee7.jpa.aggregate_function_in_select.entity;

import static jakarta.persistence.GenerationType.AUTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

/**
 * A very simple JPA entity that will be used for testing
 * 
 * @author Arjan Tijms
 *
 */
@Entity
public class TestEntity {

    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private String value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
