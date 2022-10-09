package org.example;

import org.example.model.Book;
import org.example.model.Person;
import org.example.model.Samples;

import java.util.List;
import java.util.Random;

public class BooksAggregator {

    public void aggregateBooksThroughPeople(){
        while(Samples.getAvailableBooks().size()!=0){
            for (Person person: Samples.getSampleListOfPeople())
            {
                //List<Book> books = Samples.getAvailableBooks();
                int index = getRandomIndex();
                if (index==0){
                    index = getRandomIndex();
                }
                    if (Samples.getAvailableBooks().size()-1>=index) {
                        person.getBooks().add(Samples.getAvailableBooks().get(index));
                        Samples.getAvailableBooks().get(index).setOwner(person);
                        Samples.removeBook(index);
                    }
            }
        }


    }
    private int getRandomIndex(){
        return new Random().nextInt(Samples.getAvailableBooks().size()+5);
    }


}
