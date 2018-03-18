package com.sdabyd2.Hibernate.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "books")
public class BookEntity {

    @Column(name = "title",nullable = false,length = 128) // parametr odnosi sie tylko do kolejnej lini
    private String title;
    @Column(name = "author",nullable = false,length = 128)
    private String author;
    @Column(length = 4)
    private Integer published;
    @Column(length = 13)
    private String isbn;
    @Column(length = 30)
    private String category;
    @Column(length = 3)
    private Integer pageCount;
    @Column(length = 30)
    private String publisher;
    @Column(precision = 2)
    private BigDecimal price;
    @Column(length = 3)
    private Integer onStock;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPublished() {
        return published;
    }

    public void setPublished(Integer published) {
        this.published = published;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getOnStock() {
        return onStock;
    }

    public void setOnStock(Integer onStock) {
        this.onStock = onStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
