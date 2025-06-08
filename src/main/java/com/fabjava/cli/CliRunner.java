package com.fabjava.cli;

import com.fabjava.service.UserService;

public class CliRunner {
    public static void run() {
        UserService userService = new UserService();
        userService.printUserEmails();
    }
}
