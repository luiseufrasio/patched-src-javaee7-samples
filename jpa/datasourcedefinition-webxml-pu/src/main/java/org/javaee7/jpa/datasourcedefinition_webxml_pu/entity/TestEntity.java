package org.javaee7.jpa.datasourcedefinition_webxml_pu.entity;

import jakarta.persistence.*;

/**
 * A very simple JPA entity that will be used for testing
 * 
 * @author Arjan Tijms
 *
 */
@Entity
public class TestEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    @Column
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
