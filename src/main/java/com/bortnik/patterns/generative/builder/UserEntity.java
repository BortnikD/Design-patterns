package com.bortnik.patterns.generative.builder;

/**
 * Implementation of the builder pattern using the example of a user entity that contains many fields
 */
public class UserEntity {
    private final int id;
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String email;
    private final String password;
    private final boolean isAdmin;
    private final boolean isModerator;

    // Constructor with parameters
    public UserEntity(
            int id,
            String firstName,
            String middleName,
            String lastName,
            String email,
            String password,
            boolean isAdmin,
            boolean isModerator
    ) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
        this.isModerator = isModerator;
    }

    // Constructor with builder
    private UserEntity(UserBuilder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.middleName = builder.middleName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.password = builder.password;
        this.isAdmin = builder.isAdmin;
        this.isModerator = builder.isModerator;
    }

    public static class UserBuilder {
        private int id;
        private String firstName;
        private String middleName;
        private String lastName;
        private String email;
        private String password;
        private boolean isAdmin;
        private boolean isModerator;

        public UserBuilder() {}

        public UserBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public UserBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public UserBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setPassword(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder setIsAdmin(boolean isAdmin) {
            this.isAdmin = isAdmin;
            return this;
        }

        public UserBuilder setIsModerator(boolean isModerator) {
            this.isModerator = isModerator;
            return this;
        }

        public UserEntity build() {
            return new UserEntity(this);
        }
    }

    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                ", isModerator=" + isModerator +
                '}';
    }
}
