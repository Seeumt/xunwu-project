package com.imooc.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "subway_station", schema = "xunwu", catalog = "")
public class SubwayStation {
    private int id;
    private int subwayId;
    private String name;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "subway_id")
    public int getSubwayId() {
        return subwayId;
    }

    public void setSubwayId(int subwayId) {
        this.subwayId = subwayId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubwayStation that = (SubwayStation) o;
        return id == that.id &&
                subwayId == that.subwayId &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, subwayId, name);
    }
}
