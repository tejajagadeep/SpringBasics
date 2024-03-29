package com.interview.pagenation.model;

// Generated 20/10/2012 11:23:03 AM by Hibernate Tools 3.4.0.CR1

import jakarta.persistence.*;
import java.util.Date;

/**
 * FilmCategory generated by hbm2java
 */
@Entity
@Table(name = "film_category", catalog = "sakila")
public class FilmCategory implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private FilmCategoryId id;
    private Film film;
    private Category category;
    private Date lastUpdate;

    public FilmCategory() {
    }

    public FilmCategory(FilmCategoryId id, Film film, Category category,
                        Date lastUpdate) {
        this.id = id;
        this.film = film;
        this.category = category;
        this.lastUpdate = lastUpdate;
    }

    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name = "filmId", column = @Column(name = "film_id", nullable = false)),
            @AttributeOverride(name = "categoryId", column = @Column(name = "category_id", nullable = false))})
    public FilmCategoryId getId() {
        return this.id;
    }

    public void setId(FilmCategoryId id) {
        this.id = id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "film_id", nullable = false, insertable = false, updatable = false)
    public Film getFilm() {
        return this.film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id", nullable = false, insertable = false, updatable = false)
    public Category getCategory() {
        return this.category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_update", nullable = false, length = 19)
    public Date getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

}
