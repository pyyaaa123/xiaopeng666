package com.njwb.zijin.entity;

public class Dept {
    private int id;
    private String name;
    private String leader;

    public Dept(Integer id, String name, String leader) {
        this.id = id;
        this.name = name;
        this.leader = leader;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", leader='" + leader + '\'' +
                '}';
    }
}
