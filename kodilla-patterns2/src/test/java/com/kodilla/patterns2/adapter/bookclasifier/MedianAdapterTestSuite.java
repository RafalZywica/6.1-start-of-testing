package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();

        Set<Book> books = new HashSet<>();

        books.add(new Book("Author 1", "Title 1", 1, "signature 1"));
        books.add(new Book("Author 2", "Title 2", 2, "signature 2"));
        books.add(new Book("Author 3", "Title 3", 3, "Signature 3"));

        //When
        int publicationYearMedian = medianAdapter.publicationYearMedian(books);

        //Then
        assertEquals(publicationYearMedian, 2);
    }
}
