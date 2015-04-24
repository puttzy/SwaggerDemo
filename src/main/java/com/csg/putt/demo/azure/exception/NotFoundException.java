package com.csg.putt.demo.azure.exception;

import com.mangofactory.swagger.plugin.EnableSwagger;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by Dan on 3/16/2015.
 */
@EnableSwagger2
public class NotFoundException extends Exception{

    String suggestion;

    public String getSuggestion() {
        return suggestion;
    }

    public void setSuggestion(String suggestion) {
        this.suggestion = suggestion;
    }
}
