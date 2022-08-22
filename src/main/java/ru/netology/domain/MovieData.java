package ru.netology.domain;

public class MovieData {
    // объявляем переменые Id и Название фильма
    private int id;
    private String movieName;

    // конструкты пустои и с данными
    public MovieData() {
    }

    public MovieData(int id, String movieName) {
        this.id = id;
        this.movieName = movieName;
    }
    // геттеры и сеттеры (для присвоения и обработки Id и Названия фильма)


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}