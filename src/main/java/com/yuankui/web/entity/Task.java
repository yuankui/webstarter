package com.yuankui.web.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.Data;

@Entity
@Data
@Table(uniqueConstraints = @UniqueConstraint(
    name = "unique_name",
    columnNames = {"name"}
))
public class Task {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  
  private String name;
  
  private Integer minThreadNum;
  private Integer maxThreadNum;
  
  @Column(columnDefinition = "TEXT")
  private String inputConfig;
  @Column(columnDefinition = "TEXT")
  private String filterConfig;
  @Column(columnDefinition = "TEXT")
  private String outputConfig;
}