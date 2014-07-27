/**
* Author: Bob Chen
*/

package com.jcommerce.gwt.client.service;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Condition implements IsSerializable {
    public static int EQUALS = 0;
    public static int CONTAINS = 1;
    public static int LIKE = 2;
    public static int GREATERTHAN = 3;
    public static int LESSTHAN = 4;
    public static int ISNULL = 5;
    public static int ISNOTNULL = 6;
    
    private String field;
    private Long value;
    int operator;

    public Condition() {
    }
    
    public Condition(String field, int op, Long value) {
        this.field = field;
        this.operator = op;
        this.value = value;
    }
    
    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public int getOperator() {
        return operator;
    }

    public void setOperator(int operator) {
        this.operator = operator;
    }
}
