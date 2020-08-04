package com.soft.boot.security;

import com.soft.boot.domain.SysRole;
import com.soft.boot.domain.SysUser;
import com.soft.boot.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserDetailsImpl implements UserDetails {
    private  String username;
    private String password;
    private List<SysRole> roles;


    public  UserDetailsImpl(){}
    public  UserDetailsImpl(SysUser user){
        this.password=user.getPASSWORD();
        this.username=user.getUSERNAME();
    }
    public  UserDetailsImpl(List<SysRole> roles){
        this.roles=roles;
    }
    public  UserDetailsImpl(SysUser user,List<SysRole> roles){
        this.password=user.getPASSWORD();
        this.username=user.getUSERNAME();
        this.roles=roles;
    }


    @Autowired
    RoleService roleService;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> list=new ArrayList<>();
        for (SysRole role:roles) {
            list.add(new SimpleGrantedAuthority(role.getROLE_NAME()));
        }
        return list;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
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


    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<SysRole> getRoles() {
        return roles;
    }

    public void setRoles(List<SysRole> roles) {
        this.roles = roles;
    }

}
