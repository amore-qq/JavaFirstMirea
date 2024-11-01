package ru.mirea.task2;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Eblan", "eblan@mail.ru", 'm');
        System.out.println(author.toString());
        author.setName("Manchik");
        System.out.println(author.toString());
    }
}
