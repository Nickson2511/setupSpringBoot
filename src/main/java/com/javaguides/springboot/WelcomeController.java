// The package statement declares the namespace for the current class.
package com.javaguides.springboot;

// Importing necessary Spring Web annotations.
// @GetMapping is used to map HTTP GET requests to the appropriate handler method.
// @RestController is used to define the class as a RESTful controller (which returns data, not a view).
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// The @RestController annotation is a specialized version of @Controller.
// It automatically converts the return value of methods to JSON (or other formats) and sends it as the HTTP response body.
// It also combines @Controller and @ResponseBody, so we don't need to add @ResponseBody to each method.
@RestController
public class WelcomeController {

    // The @GetMapping annotation maps HTTP GET requests to the method it annotates.
    // The value "/welcome" specifies the URL path for which this method will handle GET requests.
    @GetMapping("/welcome")
    public String welcome() {

        // This method simply returns a string as a response to the HTTP GET request.
        // The string will be sent as the body of the HTTP response.
        return "Welcome To Spring Boot World Nickson2511, it sucks more though!";
    }
}
