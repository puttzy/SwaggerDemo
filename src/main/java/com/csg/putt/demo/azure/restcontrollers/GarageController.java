package com.csg.putt.demo.azure.restcontrollers;

import com.csg.putt.demo.azure.obj.Car;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.wordnik.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dputt on 2/13/15.
 */

@RequestMapping("/garage")
@Api(value = "", description = "Controller for Garage")
@RestController
@EnableSwagger
public class GarageController {


    @ApiOperation(value = "Used to remove a car from a garage."
            , notes = "The endpoint for deleting a car. "
            , httpMethod = "DELETE")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 500, message = "Something exceptional happend!  Be afraid") }
    )
    @RequestMapping(value = "/{garageId}/{carId}", method = RequestMethod.DELETE)
    public @ResponseBody ResponseEntity deleteObservation(
            @PathVariable(value = "garageId") String garageId
            , @PathVariable(value = "carId") String carId
    )   {
            // Delete Car
        return new ResponseEntity( HttpStatus.OK);
    }


    @ApiOperation(value = "Used to add a car to a garage."
            , notes = "The endpoint for deleting a car. "
            , httpMethod = "PUT")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "GARAGE Not Found"),
            @ApiResponse(code = 500, message = "Something exceptional happend!  Be afraid") }
    )
    @ApiImplicitParams(@ApiImplicitParam(dataType = "Car", name = "Car", paramType = "body"))
    @RequestMapping(value = "/{garageId}/", method = RequestMethod.PUT)
    public @ResponseBody ResponseEntity addCarToGarage(
    )   {
        // Delete Car
        return new ResponseEntity( HttpStatus.OK);
    }

    @ApiOperation(value = "Get all cars in a garage"
            , notes = "The endpoint for deleting a car. "
            , httpMethod = "GET")
    @ApiResponses({
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 404, message = "GARAGE Not Found"),
            @ApiResponse(code = 500, message = "Something exceptional happend!  Be afraid") }
    )
    @RequestMapping(value = "/{garageId}/", method = RequestMethod.GET)
    public @ResponseBody ResponseEntity<List<Car>> getCarsInGarage()   {
        // Delete Car
        return new ResponseEntity<List<Car>>(new ArrayList<Car>(),  HttpStatus.OK);
    }




}
