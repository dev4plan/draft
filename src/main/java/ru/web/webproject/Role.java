package ru.web.webproject;

public enum Role {
    ADMIN("Administrator"),
    GUEST("Guest"),
    USER("User");
    private final String role;

    Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
