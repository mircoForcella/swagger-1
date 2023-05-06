package co.develhope.swagger.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/name")
@Api(tags = "Name")
public class NameController {


    @GetMapping("/")
    @ApiOperation("Get my name")
    public String getName(){
        return "Mirco Forcella";
    }
}
