package com.spring.webflow.xml.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by
 *
 * @author: liuwenqi on 2018-02-10.
 * Description:
 */
@Data
@Entity
@Table(name = "lwq_user")
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String userName;

    private String password;

    private String trueName;

    private String email;

    private Long phone;
}
