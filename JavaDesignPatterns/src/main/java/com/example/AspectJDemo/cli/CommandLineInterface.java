package com.example.AspectJDemo.cli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CommandLineInterface implements CommandLineRunner {

    @Autowired
    private CommandLineInputScanner scanner;

    @Override
    public void run(String... args) throws Exception {
        String input = scanner.readInput();
        System.out.println(input);
    }
}
