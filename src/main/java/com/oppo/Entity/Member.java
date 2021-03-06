package com.oppo.Entity;

import javax.persistence.*;


/**
 * Created by JieChen on 2018/7/24.
 */

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    /**
     * 帳號
     */
    private String account;
    /**
     * 密碼
     */
    private String password;
    /**
     * 姓名
     */
    private String name;
    @ManyToOne(targetEntity = Departemt.class)
    private Departemt departemt;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Departemt getDepartemt() {
        return departemt;
    }

    public void setDepartemt(Departemt departemt) {
        this.departemt = departemt;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", departemt=" + departemt +
                '}';
    }

}