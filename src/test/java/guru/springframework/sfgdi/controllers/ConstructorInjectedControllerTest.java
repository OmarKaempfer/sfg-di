package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.SetterGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;
    @BeforeEach
    void setUp() {
        this.constructorInjectedController = new ConstructorInjectedController(new SetterGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(constructorInjectedController.getGreeting());
    }
}