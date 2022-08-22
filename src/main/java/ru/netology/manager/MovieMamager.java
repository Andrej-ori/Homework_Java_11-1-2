package ru.netology.manager;

import ru.netology.domain.MovieData;

public class MovieMamager {
    // объявление массивов и переменных
    private MovieData[] movies = new MovieData[0];
    private int lemit = 10; // лимит для вывода фильмов по умолчанию

    // конструкторы
    public MovieMamager() { // конструктор для вывода фильмов с лимитом по умолчанию
    }

    public MovieMamager(int lemit) { // конструктор для вывода фильмов с указаным лимитом вывода
        this.lemit = lemit;
    }

    // геттеры и сеттеры

    public MovieData[] getMovies() {
        return movies;
    }

    public void setMovies(MovieData[] movies) {
        this.movies = movies;
    }

    public int getLemit() {
        return lemit;
    }

    public void setLemit(int lemit) {
        this.lemit = lemit;
    }

    // Добавление фильмов
    public void addMovie(MovieData movie) {
        MovieData[] tmp = new MovieData[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[movies.length] = movie;
        movies = tmp;
    }
    // вывод фильмов в порядке добавления
    public void finAll() {
        getMovies();
    }
    // Вывод максимум лимит* последних добавленных фильмов в обратном от добавления порядкевывод фильмов в обратном по
    public void findLast() {
        int lengt;
        if (lemit > movies.length){ // проверям что длинна массива больше или меньше лимита вывода фильмов
            lengt = movies.length;
        } else {
            lengt = lemit;
        }
        MovieData[] tmp = new MovieData[lengt];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - i - 1];
        }
        return;
    }
}
