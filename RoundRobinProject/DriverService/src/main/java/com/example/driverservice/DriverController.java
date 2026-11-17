package com.example.driverservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class DriverController {

    private final Environment environment;

    DriverController(Environment environment) {
        this.environment = environment;
    }

    @GetMapping("/drivers")
    public String getDrivers() {

        String port = environment.getProperty("local.server.port");

        System.out.println("Request handled by Driver Service on port: " + port);

        return "Driver Service is running on port: " + port;
    }
}