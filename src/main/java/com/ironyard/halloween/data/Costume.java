package com.ironyard.halloween.data;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by favianalopez on 10/12/16.
 */

@Entity
public class Costume {

    private double cost;
    private String category;
    private Date lastDateUsed;
    private long count;

    @OneToMany(cascade = CascadeType.ALL)
    List<Props> allProps;

    @OneToMany (cascade = CascadeType.ALL)
    List<ClothingItems> allClothingItems;

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    public List<Props> getAllProps() {
        return allProps;
    }

    public void setAllProps(List<Props> allProps) {
        this.allProps = allProps;
    }

    public List<ClothingItems> getAllClothingItems() {
        return allClothingItems;
    }

    public void setAllClothingItems(List<ClothingItems> allClothingItems) {
        this.allClothingItems = allClothingItems;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getLastDateUsed() {
        return lastDateUsed;
    }

    public void setLastDateUsed(Date lastDateUsed) {
        this.lastDateUsed = lastDateUsed;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
