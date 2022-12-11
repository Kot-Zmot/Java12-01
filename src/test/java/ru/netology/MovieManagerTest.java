package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void shouldReturnAllMovies() {
        MovieManager manager = new MovieManager();
        manager.add("01");
        manager.add("02");
        manager.add("03");
        String[] actual = manager.findAll();
        String[] expected = {"01", "02", "03"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnLastMoviesLess10() {
        MovieManager manager = new MovieManager();
        manager.add("01");
        manager.add("02");
        manager.add("03");
        manager.add("04");
        manager.add("05");
        String[] actual = manager.findLast();
        String[] expected = {"05", "04", "03", "02", "01"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnLastMoviesAbove10() {
        MovieManager manager = new MovieManager(11);
        manager.add("01");
        manager.add("02");
        manager.add("03");
        manager.add("04");
        manager.add("05");
        manager.add("06");
        manager.add("07");
        manager.add("08");
        manager.add("09");
        manager.add("10");
        manager.add("11");
        String[] actual = manager.findLast();
        String[] expected = {"11", "10", "09", "08", "07", "06", "05", "04", "03", "02", "01"};
        Assertions.assertArrayEquals(expected, actual);
    }

}
