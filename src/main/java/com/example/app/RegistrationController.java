package com.example.app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {

    // 1. Handles GET request to show the registration form
    @GetMapping("/")
    public String showForm(Model model) {
        // Add an empty Student object to the model for the form data binding
        model.addAttribute("student", new Student()); 
        return "registrationForm"; // Renders src/main/resources/templates/registrationForm.html
    }

    // 2. Handles POST request when the form is submitted
    @PostMapping("/register")
    public String submitForm(@ModelAttribute("student") Student student, Model model) {
        // The Student object now holds the form data
        // For this simple app, we just pass the object to the results page
        model.addAttribute("student", student);
        return "registrationResult"; // Renders src/main/resources/templates/registrationResult.html
    }
}
