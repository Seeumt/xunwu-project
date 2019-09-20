package com.imooc.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class House {
    private int id;
    private String title;
    private int price;
    private int area;
    private int room;
    private int floor;
    private int totalFloor;
    private Integer watchTimes;
    private int buildYear;
    private int status;
    private Timestamp createTime;
    private Timestamp lastUpdateTime;
    private String cityEnName;
    private String regionEnName;
    private String cover;
    private int direction;
    private int distanceToSubway;
    private int parlour;
    private String district;
    private int adminId;
    private int bathroom;
    private String street;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "price")
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Basic
    @Column(name = "area")
    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Basic
    @Column(name = "room")
    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    @Basic
    @Column(name = "floor")
    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Basic
    @Column(name = "total_floor")
    public int getTotalFloor() {
        return totalFloor;
    }

    public void setTotalFloor(int totalFloor) {
        this.totalFloor = totalFloor;
    }

    @Basic
    @Column(name = "watch_times")
    public Integer getWatchTimes() {
        return watchTimes;
    }

    public void setWatchTimes(Integer watchTimes) {
        this.watchTimes = watchTimes;
    }

    @Basic
    @Column(name = "build_year")
    public int getBuildYear() {
        return buildYear;
    }

    public void setBuildYear(int buildYear) {
        this.buildYear = buildYear;
    }

    @Basic
    @Column(name = "status")
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "last_update_time")
    public Timestamp getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Timestamp lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    @Basic
    @Column(name = "city_en_name")
    public String getCityEnName() {
        return cityEnName;
    }

    public void setCityEnName(String cityEnName) {
        this.cityEnName = cityEnName;
    }

    @Basic
    @Column(name = "region_en_name")
    public String getRegionEnName() {
        return regionEnName;
    }

    public void setRegionEnName(String regionEnName) {
        this.regionEnName = regionEnName;
    }

    @Basic
    @Column(name = "cover")
    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    @Basic
    @Column(name = "direction")
    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    @Basic
    @Column(name = "distance_to_subway")
    public int getDistanceToSubway() {
        return distanceToSubway;
    }

    public void setDistanceToSubway(int distanceToSubway) {
        this.distanceToSubway = distanceToSubway;
    }

    @Basic
    @Column(name = "parlour")
    public int getParlour() {
        return parlour;
    }

    public void setParlour(int parlour) {
        this.parlour = parlour;
    }

    @Basic
    @Column(name = "district")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Basic
    @Column(name = "admin_id")
    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    @Basic
    @Column(name = "bathroom")
    public int getBathroom() {
        return bathroom;
    }

    public void setBathroom(int bathroom) {
        this.bathroom = bathroom;
    }

    @Basic
    @Column(name = "street")
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return id == house.id &&
                price == house.price &&
                area == house.area &&
                room == house.room &&
                floor == house.floor &&
                totalFloor == house.totalFloor &&
                buildYear == house.buildYear &&
                status == house.status &&
                direction == house.direction &&
                distanceToSubway == house.distanceToSubway &&
                parlour == house.parlour &&
                adminId == house.adminId &&
                bathroom == house.bathroom &&
                Objects.equals(title, house.title) &&
                Objects.equals(watchTimes, house.watchTimes) &&
                Objects.equals(createTime, house.createTime) &&
                Objects.equals(lastUpdateTime, house.lastUpdateTime) &&
                Objects.equals(cityEnName, house.cityEnName) &&
                Objects.equals(regionEnName, house.regionEnName) &&
                Objects.equals(cover, house.cover) &&
                Objects.equals(district, house.district) &&
                Objects.equals(street, house.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, price, area, room, floor, totalFloor, watchTimes, buildYear, status, createTime, lastUpdateTime, cityEnName, regionEnName, cover, direction, distanceToSubway, parlour, district, adminId, bathroom, street);
    }
}
