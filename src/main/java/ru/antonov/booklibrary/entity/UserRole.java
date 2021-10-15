package ru.antonov.booklibrary.entity;

import org.springframework.security.core.GrantedAuthority;

public enum UserRole implements GrantedAuthority {
    USER;

    @Override
    public String getAuthority() {
        return "ROLE_" + this.name();
    }
}
