package com.csg.putt.demo.azure.restcontrollers;

import com.csg.putt.demo.azure.obj.MyObj;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dputt on 2/13/15.
 */

@RequestMapping("/mine")
@Api(value = "My Example Controller", description = "My Example Controller")
@RestController
@EnableSwagger
public class MyController {


    @ApiOperation(value = "Used to delete an observation."
            , notes = "The endpoint for deleting an observation. "
            , httpMethod = "POST")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Something exceptional happend!  Be afraid") }
    )
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<MyObj> deleteObservation()   {
            MyObj so =  new MyObj(12);

        return new ResponseEntity<MyObj>(so, HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
