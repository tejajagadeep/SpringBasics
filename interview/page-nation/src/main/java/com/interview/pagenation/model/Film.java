package com.interview.pagenation.model;

// Generated 20/10/2012 11:23:03 AM by Hibernate Tools 3.4.0.CR1

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.Year;
import java.util.Date;
import java.util.List;

import static jakarta.persistence.GenerationType.IDENTITY;

/**
 * Film generated by hbm2java
 *
 * @author pdiaz
 */
@Entity
@Table(name = "film", catalog = "sakila")
public class Film implements java.io.Serializable {

    private static final long serialVersionUID = 1L;
    private Short filmId;
    private Language languageByOriginalLanguageId;
    private Language languageByLanguageId;
    private String title;
    private String description;
    private Year releaseYear;
    private byte rentalDuration;
    private BigDecimal rentalRate;
    private Short length;
    private BigDecimal replacementCost;
    private Rating rating;
    private String specialFeatures;
    private Date lastUpdate;
    private List<FilmActor> filmActors;
    private List<FilmCategory> filmCategories;
    private List<Inventory> inventories;

    public Film() {
    }

    public Film(Language languageByLanguageId, String title,
                byte rentalDuration, BigDecimal rentalRate,
                BigDecimal replacementCost, Date lastUpdate) {
        this.languageByLanguageId = languageByLanguageId;
        this.title = title;
        this.rentalDuration = rentalDuration;
        this.rentalRate = rentalRate;
        this.replacementCost = replacementCost;
        this.lastUpdate = lastUpdate;
    }

    public Film(Language languageByOriginalLanguageId,
                Language languageByLanguageId, String title, String description,
                Year releaseYear, byte rentalDuration, BigDecimal rentalRate,
                Short length, BigDecimal replacementCost, Rating rating,
                String specialFeatures, Date lastUpdate,
                List<FilmActor> filmActors, List<FilmCategory> filmCategories,
                List<Inventory> inventories) {
        this.languageByOriginalLanguageId = languageByOriginalLanguageId;
        this.languageByLanguageId = languageByLanguageId;
        this.title = title;
        this.description = description;
        this.releaseYear = releaseYear;
        this.rentalDuration = rentalDuration;
        this.rentalRate = rentalRate;
        this.length = length;
        this.replacementCost = replacementCost;
        this.rating = rating;
        this.specialFeatures = specialFeatures;
        this.lastUpdate = lastUpdate;
        this.filmActors = filmActors;
        this.filmCategories = filmCategories;
        this.inventories = inventories;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "film_id", unique = true, nullable = false)
    public Short getFilmId() {
        return this.filmId;
    }

    public void setFilmId(Short filmId) {
        this.filmId = filmId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "original_language_id")
    public Language getLanguageByOriginalLanguageId() {
        return this.languageByOriginalLanguageId;
    }

    public void setLanguageByOriginalLanguageId(
            Language languageByOriginalLanguageId) {
        this.languageByOriginalLanguageId = languageByOriginalLanguageId;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "language_id", nullable = false)
    public Language getLanguageByLanguageId() {
        return this.languageByLanguageId;
    }

    public void setLanguageByLanguageId(Language languageByLanguageId) {
        this.languageByLanguageId = languageByLanguageId;
    }

    @Column(name = "title", nullable = false)
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "description", length = 65535)
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "release_year", length = 0)
    @Convert(converter = YearConverter.class)
    public Year getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(Year releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Column(name = "rental_duration", nullable = false)
    public byte getRentalDuration() {
        return this.rentalDuration;
    }

    public void setRentalDuration(byte rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    @Column(name = "rental_rate", nullable = false, precision = 4)
    public BigDecimal getRentalRate() {
        return this.rentalRate;
    }

    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }

    @Column(name = "length")
    public Short getLength() {
        return this.length;
    }

    public void setLength(Short length) {
        this.length = length;
    }

    @Column(name = "replacement_cost", nullable = false, precision = 5)
    public BigDecimal getReplacementCost() {
        return this.replacementCost;
    }

    public void setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
    }

    @Column(name = "rating", length = 5)
    @Convert(converter = RatingConverter.class)
    public Rating getRating() {
        return this.rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    @Column(name = "special_features", length = 54)
    public String getSpecialFeatures() {
        return this.specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "last_update", nullable = false, insertable = false, length = 19)
    public Date getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "film")
    public List<FilmActor> getFilmActors() {
        return this.filmActors;
    }

    public void setFilmActors(List<FilmActor> filmActors) {
        this.filmActors = filmActors;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "film")
    public List<FilmCategory> getFilmCategories() {
        return this.filmCategories;
    }

    public void setFilmCategories(List<FilmCategory> filmCategories) {
        this.filmCategories = filmCategories;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "film")
    public List<Inventory> getInventories() {
        return this.inventories;
    }

    public void setInventories(List<Inventory> inventories) {
        this.inventories = inventories;
    }

}
