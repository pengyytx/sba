package com.dharma.api.sba.bean;

public class KeyValuePair implements Comparable<KeyValuePair> {
    String id;
    Long value;

    public KeyValuePair(String id, Long value) {
        this.id = id;
        this.value = value;
    }

    public String getKey() {
        return id;
    }

    public void setKey(String key) {
        this.id = id;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Star: " + id + "，count: " + value + ';';
    }

    @Override
    public int compareTo(KeyValuePair o) {
        if(this.value<o.value){
            return 1;
        }else if(this.value>o.value){
            return -1;
        }else{
            return 0;
        }
    }
}
