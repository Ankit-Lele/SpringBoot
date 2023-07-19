package com.example.demo.util;

import org.springframework.stereotype.Component;
import com.example.demo.model.ToDo;
@Component
public class PayloadValidator {

    public static boolean validateCreatePayload(ToDo todo) {
        // Add your payload validation logic here
        // For example, check if the payload meets certain criteria and return true or false accordingly
    	return todo != null && todo.getText() != null && !todo.getText().isEmpty();
    	   
    }
}
