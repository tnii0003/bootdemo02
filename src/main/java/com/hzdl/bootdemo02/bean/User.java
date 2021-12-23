package com.hzdl.bootdemo02.bean;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * user
 * @author 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class User implements Serializable {
    private Integer id;

    private String account;

    private String password;

    private String name;

    private Integer age;

    private String sex;

    private String photo;

    private Date createtime;

    private Date logintime;

    private static final long serialVersionUID = 1L;
}