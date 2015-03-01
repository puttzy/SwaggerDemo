package com.csg.putt.demo.azure.obj;

import com.mangofactory.swagger.plugin.EnableSwagger;

/**
 * Created by dputt on 2/13/15.
 */

@EnableSwagger
public class MyObj {
    int id;

    public MyObj(int id){
        this.id=id;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
    this.id = id;
    }
}
