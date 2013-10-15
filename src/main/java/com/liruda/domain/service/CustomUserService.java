package com.liruda.domain.service;

/**
 * Created with IntelliJ IDEA.
 * User: liruda
 * Date: 13-10-15
 * Time: 23:05
 * To change this template use File | Settings | File Templates.
 */


import java.util.ArrayList;
import java.util.List;

//import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;



public class CustomUserService implements  UserDetailsService{

    @Override
    public UserDetails loadUserByUsername(String username)
    {
        List<GrantedAuthority> list = new ArrayList<GrantedAuthority>();
        list.add(new GrantedAuthorityImpl("ROLE_USER"));
        //GrantedAuthority authorities =     new GrantedAuthority{ new GrantedAuthorityImpl("ROLE_USER") } ;
        UserDetails user = new User(username, "password", true, true, true, true, list);
        return user;
    }
}
