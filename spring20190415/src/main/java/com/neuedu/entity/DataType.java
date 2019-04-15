package com.neuedu.entity;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class DataType {
    /*数组*/
    private String[] array;

    /*集合注入*/

    private List<String> lists;

    /*map注入*/

    private Map<String,String> map;

    /*properties*/

    private Properties properties;

    private  String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public List<String> getLists() {
        return lists;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
