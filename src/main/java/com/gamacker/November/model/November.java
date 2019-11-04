package com.gamacker.November.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class November
{
    @Id
    private Integer id;
    private String name;
    private Integer salary;
    private String team;

    public November() {
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

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }





}
