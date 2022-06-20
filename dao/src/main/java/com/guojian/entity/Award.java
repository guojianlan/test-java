package com.guojian.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Award implements Serializable {
    private Long id;
    private String name;
    private Integer storage;
    private Integer ctime;
    private Integer mtime;
    private Integer dtime;
    private Integer is_del;
    private Integer status;
}
