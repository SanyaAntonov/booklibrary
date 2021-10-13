package ru.antonov.booklibrary.auth;

import org.springframework.security.core.GrantedAuthority;

public enum ApplicationUserRole implements GrantedAuthority {
    USER;

    @Override
    public String getAuthority() {
        return "ROLE_" + this.name();
    }
}
