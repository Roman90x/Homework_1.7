public class Main {
    public static void main(String[] args) {
        System.out.println("1.9. Объекты и классы");
        Author  georgeMartin = new Author("George","Martin");
        Author levTolstoy = new Author("Лев","Толстой");
        Book theStand = new Book("A Game of Thrones", georgeMartin, 1996);
        System.out.println("Название книги: " + theStand.getTitle()
                + " Автор: " + theStand.getAuthor().getFullName()
                + " Дата: "+theStand.getYearPublication());

    }
}