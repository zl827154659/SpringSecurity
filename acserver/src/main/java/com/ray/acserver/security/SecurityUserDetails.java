package com.ray.acserver.security;

import com.ray.acserver.model.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class SecurityUserDetails extends User implements UserDetails {
    private Collection<GrantedAuthority> authorities;
    private boolean isAccountNonExpired;
    private boolean isAccountNonLocked;
    private boolean isCredentialsNonExpired;
    private boolean isEnabled;

    public SecurityUserDetails() {}

    public SecurityUserDetails(User user, Collection<GrantedAuthority> authorities) {
        this.setPassword( user.getPassword());
        this.setUsername( user.getUsername());
        this.setAccountNonExpired( true);
        this.setAccountNonLocked( true);
        this.setCredentialsNonExpired( true);
        this.setEnabled( true);
        this.setAuthorities( authorities);
    }

    public void setAccountNonExpired(boolean isAccountNonExpired) {
        this.isAccountNonExpired = isAccountNonExpired;
    }

    public void setAccountNonLocked(boolean isAccountNonLocked) {
        this.isAccountNonLocked = isAccountNonLocked;
    }

    public void setCredentialsNonExpired(boolean isCredentialsNonExpired) {
        this.isCredentialsNonExpired = isCredentialsNonExpired;
    }

    public void setEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
