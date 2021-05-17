package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Clasifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Clasifier {

    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookSet) {
        Map<BookSignature, Book> bookMap = new HashMap<>();
        bookSet.forEach(book -> {
            bookMap.put(new BookSignature(book.getSignature()), new Book(
                    book.getAuthor(), book.getTitle(), book.getPublicationYear()
            ));
        });
        return super.medianPublicationYear(bookMap);
    }
}
