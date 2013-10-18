package com.liruda.domain;

/**
 * Created with IntelliJ IDEA.
 * User: 020919
 * Date: 10/17/13
 * Time: 5:06 PM
 * To change this template use File | Settings | File Templates.
 */
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name="roles")
public class Role {

    @Id
    private Long id;

    @OneToOne
    private User user;
    private Integer role;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Integer getRole() {
        return role;
    }
    public void setRole(Integer role) {
        this.role = role;
    }
}
