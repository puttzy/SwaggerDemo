package com.csg.putt.demo.swagger.responses;

/**
 * Created by Dan on 4/23/2015.
 */

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

public class Responses {
    public static ResponseEntity ok() {
        return new ResponseEntity(HttpStatus.OK);
    }

    public static ResponseEntity notFound() {
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    public static <T> ResponseEntity<T> ok(T model) {
        return new ResponseEntity<T>(model, HttpStatus.OK);
    }

    /**
     * Created by Dan on 3/16/2015.
     */
    @EnableSwagger2
    public static class NotFoundException extends Exception{

        String suggestion;

        public String getSuggestion() {
            return suggestion;
        }

        public void setSuggestion(String suggestion) {
            this.suggestion = suggestion;
        }
    }
}