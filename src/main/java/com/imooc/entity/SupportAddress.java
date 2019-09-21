package com.imooc.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Data
public class SupportAddress {
    @Id
    @GeneratedValue
    private Long id;
    private String belongTo;
    private String enName;
    private String cnName;
    private String level;
    private double baiduMapLng;
    private double baiduMapLat;



}
