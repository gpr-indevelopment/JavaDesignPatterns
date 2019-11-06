package com.example.AspectJDemo.cli;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class CommandLineInputScanner {

    public String readInput(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();
        return input;
    }
}
