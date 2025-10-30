package com.bortnik.patterns.creational.builder;

public class BuilderDemo {
    public static void demonstrate() {
        System.out.println("=== Demo Builder Pattern ===");

        final int id = 1;
        final String firstName = "John";
        final String middleName = "Smith";
        final String lastName = "Doe";
        final String email = "email@gmail.com";
        final String password = "password";
        final boolean isAdmin = true;
        final boolean isModerator = false;

        // Initialization with constructor - a lot of fields, unreadable
        UserEntity user = new UserEntity(id, firstName, middleName, lastName, email, password, isAdmin, isModerator);
        System.out.println("User created by constructor " + user);

        // Created with builder - readable
        UserEntity newUser = new UserEntity.UserBuilder()
                .setId(id)
                .setFirstName(firstName)
                .setMiddleName(middleName)
                .setLastName(lastName)
                .setEmail(email)
                .setPassword(password)
                .setIsAdmin(isAdmin)
                .setIsModerator(isModerator)
                .build();
        System.out.println("User created by builder " + newUser);
    }
}
