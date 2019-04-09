package com.neuedu.junit;

import java.util.ArrayList;
import java.util.List;

public class DataController {
    public List getAll(){
        List l=new ArrayList();
        l.add(12);
        l.add(23);
        return l;
    }

    public int delete(int id){
        return id;
    }
}

