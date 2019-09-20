package com.imooc.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "house_tag", schema = "xunwu", catalog = "")
public class HouseTag {
    private int houseId;
    private int id;
    private String name;

    @Basic
    @Column(name = "house_id")
    public int getHouseId() {
        return houseId;
    }

    public void setHouseId(int houseId) {
        this.houseId = houseId;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        HouseTag houseTag = (HouseTag) o;
        return houseId == houseTag.houseId &&
                id == houseTag.id &&
                Objects.equals(name, houseTag.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(houseId, id, name);
    }
}
