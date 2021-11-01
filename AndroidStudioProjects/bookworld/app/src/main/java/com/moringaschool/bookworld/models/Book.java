package com.moringaschool.bookworld.models;

import org.parceler.Parcel;

/**
 * An {@link Book} object contains information related to a single book.
 */
@Parcel
public class Book {

    /** Title of the book */
    private String mTitle;

    /** Subtitle of the book */
    private String mSubtitle;

    /** Authors of the book */
    private String mAuthors;

    /** Rating of the book */
    private double mRating;

    /** Website URL of the book */
    private String mUrl;

    /** Description of the book */
    private String mDescription;

    /**
     * Constructs a new {@link Book} object.
     *
     * @param title is the title of the book
     * @param subtitle is the subtitle of the book
     * @param authors are the authors of the book
     * @param rating is the rating out of 5 for the book
     * @param url is the website URL to find more details about the book
     */
    public Book(String title, String subtitle, String authors, double rating, String url, String description) {
        mTitle = title;
        mSubtitle = subtitle;
        mAuthors = authors;
        mRating = rating;
        mUrl = url;
        mDescription = description;
    }

    /**
     * Returns the authors of the book.
     */
    public String getAuthor() {
        return mAuthors;
    }

    /**
     * Returns the title of the book.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Returns the title of the book.
     */
    public String getSubtitle() {
        return mSubtitle;
    }

    /**
     * Returns the rating of the book.
     */
    public double getRating() {
        return mRating;
    }

    /**
     * Returns the website URL to find more information about the book.
     */
    public String getUrl() {
        return mUrl;
    }

    public String getDescription() {
        return mDescription;
    }
}
