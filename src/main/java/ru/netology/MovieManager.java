package ru.netology;

import java.util.stream.Stream;

public class MovieManager {
    protected String[] movies = new String[0];
    protected int size;

    //Конструкторы
    public MovieManager() {
        this.size = 10;
    }

    public MovieManager(int size) {
        this.size = size;
    }

    // Операции менеджера
    public void add(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLength;
        if (movies.length < size) {
            resultLength = movies.length;
        } else {
            resultLength = size;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;

        //*********************************


//    public AddMovie[] getMovies() {
//        AddMovie[] all = repo.getMovies();
//        AddMovie[] reversed = new AddMovie[all.length];
//        for (int i = 0; i < reversed.length; i++) {
//            reversed[i] = all[all.length - 1 - i];
//        }
//        return reversed;
//    }


    }
}