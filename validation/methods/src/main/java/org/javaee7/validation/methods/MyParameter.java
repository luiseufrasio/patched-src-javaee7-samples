package org.javaee7.validation.methods;

import jakarta.enterprise.context.Dependent;
import jakarta.validation.constraints.NotNull;

@Dependent
public class MyParameter {

    @NotNull
    public String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
