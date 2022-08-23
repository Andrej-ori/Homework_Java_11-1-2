package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MovieData;

public class MovieManagerTest {

    MovieData movie1 = new MovieData(1,"Movie 1");
    MovieData movie2 = new MovieData(2,"Movie 2");
    MovieData movie3 = new MovieData(3,"Movie 3");
    MovieData movie4 = new MovieData(4,"Movie 4");
    MovieData movie5 = new MovieData(5,"Movie 5");
    MovieData movie6 = new MovieData(6,"Movie 6");
    MovieData movie7 = new MovieData(7,"Movie 7");
    MovieData movie8 = new MovieData(8,"Movie 8");
    MovieData movie9 = new MovieData(9,"Movie 9");
    MovieData movie10 = new MovieData(10,"Movie 10");
    MovieData movie11 = new MovieData(11,"Movie 11");
    MovieData movie12 = new MovieData(12,"Movie 12");
    MovieData movie13 = new MovieData(13,"Movie 13");
    MovieData movie14 = new MovieData(14,"Movie 14");
    MovieData movie15 = new MovieData(15,"Movie 15");
    MovieData movie16 = new MovieData(16,"Movie 16");

    MovieMamager movieMamager = new MovieMamager();

    @Test // Добавление фильмов и вывод всех фильмов в порядке их добавления
    public void testAddMovies() {

        movieMamager.addMovie(movie1);
        movieMamager.addMovie(movie2);
        movieMamager.addMovie(movie3);

        movieMamager.finAll();

        MovieData[] expected = {
                movie1,
                movie2,
                movie3
        };
        MovieData[] actual = movieMamager.getMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов меньше лимита (нижняя граница) (лимит по умолчанию)
    public void outputMovieLimitOnMin() {

        movieMamager.findLast();

        MovieData[] expected = {};
        MovieData[] actual = movieMamager.getMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов меньше лимита (нижняя граница + 1) (лимит по умолчанию)
    public void outputMovieLimitOnMin1() {

        movieMamager.addMovie(movie1);

        movieMamager.findLast();

        MovieData[] expected = {
                movie1
        };
        MovieData[] actual = movieMamager.getMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов меньше лимита (лимит по умолчанию)
    public void outputMovieLimitOn() {

        movieMamager.addMovie(movie1);
        movieMamager.addMovie(movie2);
        movieMamager.addMovie(movie3);
        movieMamager.addMovie(movie4);
        movieMamager.addMovie(movie5);
        movieMamager.addMovie(movie6);

        movieMamager.findLast();

        MovieData[] expected = {
                movie6,
                movie5,
                movie4,
                movie3,
                movie2,
                movie1
        };
        MovieData[] actual = movieMamager.getMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test //  вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов меньше лимита (верхняя граница лимита - 1) (лимит по умолчанию)
    public void outputMovieLimitOnMax0() {

        movieMamager.addMovie(movie1);
        movieMamager.addMovie(movie2);
        movieMamager.addMovie(movie3);
        movieMamager.addMovie(movie4);
        movieMamager.addMovie(movie5);
        movieMamager.addMovie(movie6);
        movieMamager.addMovie(movie7);
        movieMamager.addMovie(movie8);
        movieMamager.addMovie(movie9);

        movieMamager.findLast();

        MovieData[] expected = {
                movie9,
                movie8,
                movie7,
                movie6,
                movie5,
                movie4,
                movie3,
                movie2,
                movie1
        };
        MovieData[] actual = movieMamager.getMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов равно лимиту (верхняя граница лимита) (лимит по умолчанию)
    public void outputMovieLimitOnMax1() {

        movieMamager.addMovie(movie1);
        movieMamager.addMovie(movie2);
        movieMamager.addMovie(movie3);
        movieMamager.addMovie(movie4);
        movieMamager.addMovie(movie5);
        movieMamager.addMovie(movie6);
        movieMamager.addMovie(movie7);
        movieMamager.addMovie(movie8);
        movieMamager.addMovie(movie9);
        movieMamager.addMovie(movie10);

        movieMamager.findLast();

        MovieData[] expected = {
                movie10,
                movie9,
                movie8,
                movie7,
                movie6,
                movie5,
                movie4,
                movie3,
                movie2,
                movie1
        };
        MovieData[] actual = movieMamager.getMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов больше лимита (верхняя граница лимита +1) (лимит по умолчанию)
    public void outputMovieLimitOnMax2() {

        movieMamager.addMovie(movie1);
        movieMamager.addMovie(movie2);
        movieMamager.addMovie(movie3);
        movieMamager.addMovie(movie4);
        movieMamager.addMovie(movie5);
        movieMamager.addMovie(movie6);
        movieMamager.addMovie(movie7);
        movieMamager.addMovie(movie8);
        movieMamager.addMovie(movie9);
        movieMamager.addMovie(movie10);
        movieMamager.addMovie(movie11);

        movieMamager.findLast();

        MovieData[] expected = {
                movie11,
                movie10,
                movie9,
                movie8,
                movie7,
                movie6,
                movie5,
                movie4,
                movie3,
                movie2
        };
        MovieData[] actual = movieMamager.getMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов больше лимита (лимит по умолчанию)
    public void outputMovieLimitOnMaxMax() {

        movieMamager.addMovie(movie1);
        movieMamager.addMovie(movie2);
        movieMamager.addMovie(movie3);
        movieMamager.addMovie(movie4);
        movieMamager.addMovie(movie5);
        movieMamager.addMovie(movie6);
        movieMamager.addMovie(movie7);
        movieMamager.addMovie(movie8);
        movieMamager.addMovie(movie9);
        movieMamager.addMovie(movie10);
        movieMamager.addMovie(movie11);
        movieMamager.addMovie(movie12);
        movieMamager.addMovie(movie13);
        movieMamager.addMovie(movie14);
        movieMamager.addMovie(movie15);

        movieMamager.findLast();

        MovieData[] expected = {
                movie15,
                movie14,
                movie13,
                movie12,
                movie11,
                movie10,
                movie9,
                movie8,
                movie7,
                movie6
        };
        MovieData[] actual = movieMamager.getMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов меньше лимита (нижняя граница) (лимит установлен)
    public void outputMovieLimitOffMin() {
        MovieMamager movieMamager = new MovieMamager(5);

        movieMamager.findLast();

        MovieData[] expected = {};
        MovieData[] actual = movieMamager.getMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов меньше лимита (нижняя граница + 1) (лимит установлен)
    public void outputMovieLimitOffMin1() {
        MovieMamager movieMamager= new MovieMamager(5);

        movieMamager.addMovie(movie1);

        movieMamager.findLast();

        MovieData[] expected = {
                movie1
        };
        MovieData[] actual = movieMamager.getMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов меньше лимита (лимит установлен)
    public void outputMovieLimitOff() {
       MovieMamager movieMamager = new MovieMamager(15);

        movieMamager.addMovie(movie1);
        movieMamager.addMovie(movie2);
        movieMamager.addMovie(movie3);
        movieMamager.addMovie(movie4);
        movieMamager.addMovie(movie5);
        movieMamager.addMovie(movie6);

        movieMamager.findLast();

        MovieData[] expected = {
                movie6,
                movie5,
                movie4,
                movie3,
                movie2,
                movie1
        };
        MovieData[] actual = movieMamager.getMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test //  вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов меньше лимита (верхняя граница лимита - 1) (лимит установлен)
    public void outputMovieLimitOffMax0() {
        MovieMamager movieMamager = new MovieMamager(5);

        movieMamager.addMovie(movie1);
        movieMamager.addMovie(movie2);
        movieMamager.addMovie(movie3);
        movieMamager.addMovie(movie4);

        movieMamager.findLast();

        MovieData[] expected = {
                movie4,
                movie3,
                movie2,
                movie1
        };
        MovieData[] actual = movieMamager.getMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов равно лимиту (верхняя граница лимита) (лимит установлен)
    public void outputMovieLimitOffMax1() {
        MovieMamager movieMamager = new MovieMamager(8);

        movieMamager.addMovie(movie1);
        movieMamager.addMovie(movie2);
        movieMamager.addMovie(movie3);
        movieMamager.addMovie(movie4);
        movieMamager.addMovie(movie5);
        movieMamager.addMovie(movie6);
        movieMamager.addMovie(movie7);
        movieMamager.addMovie(movie8);

        movieMamager.findLast();

        MovieData[] expected = {
                movie8,
                movie7,
                movie6,
                movie5,
                movie4,
                movie3,
                movie2,
                movie1
        };

        MovieData[] actual = movieMamager.getMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов больше лимита (верхняя граница лимита +1) (лимит установлен)
    public void outputMovieLimitOffMax2() {
        MovieMamager movieMamager = new MovieMamager(4);

        movieMamager.addMovie(movie1);
        movieMamager.addMovie(movie2);
        movieMamager.addMovie(movie3);
        movieMamager.addMovie(movie4);
        movieMamager.addMovie(movie5);

        movieMamager.findLast();


        MovieData[] expected = {
                movie5,
                movie4,
                movie3,
                movie2
        };

        MovieData[] actual = movieMamager.getMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test // вывод фильмов в обратном порядке добавления в количестве меньше лимита когда добавленых фильмов больше лимита (лимит установлен)
    public void outputMovieLimitOffMaxMax() {
       MovieMamager movieMamager = new MovieMamager(6);

        movieMamager.addMovie(movie1);
        movieMamager.addMovie(movie2);
        movieMamager.addMovie(movie3);
        movieMamager.addMovie(movie4);
        movieMamager.addMovie(movie5);
        movieMamager.addMovie(movie6);
        movieMamager.addMovie(movie7);
        movieMamager.addMovie(movie8);
        movieMamager.addMovie(movie9);
        movieMamager.addMovie(movie10);
        movieMamager.addMovie(movie11);
        movieMamager.addMovie(movie12);
        movieMamager.addMovie(movie13);
        movieMamager.addMovie(movie14);
        movieMamager.addMovie(movie15);

        movieMamager.findLast();

        MovieData[] expected = {
                movie15,
                movie14,
                movie13,
                movie12,
                movie11,
                movie10
        };
        MovieData[] actual = movieMamager.getMovies();

        Assertions.assertArrayEquals(expected, actual);
    }

}

