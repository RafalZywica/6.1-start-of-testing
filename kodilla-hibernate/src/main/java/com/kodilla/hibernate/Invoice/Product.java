package com.kodilla.hibernate.Invoice;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "PRODUCTS")
public final class Product {

    private int id;
    private String name;
    private List<Item> items = new ArrayList<>();

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "NAME", unique = true)
    public String getName() {
        return name;
    }

    @OneToMany
    @JoinColumn(name = "ITEM_ID")
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
