package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testLibrary() {
        //Given
        Book book1 = new Book("Book1", "Author 1", LocalDate.of(1996, Month.JANUARY,27));
        Book book2 = new Book("Book2", "Author 2", LocalDate.of(2000, Month.SEPTEMBER,2));
        Book book3 = new Book("Book3", "Author 3", LocalDate.of(2020, Month.AUGUST,13));

        Library library = new Library("Library1");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //When

        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowClone();
            shallowClonedLibrary.setName("Shallow Cloned Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepClone();
            deepClonedLibrary.setName("Deep Cloned Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        library.getBooks().remove(book1);

        //THEN

        assertEquals(2,library.getBooks().size());
        assertEquals(2, shallowClonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());

    }
}
