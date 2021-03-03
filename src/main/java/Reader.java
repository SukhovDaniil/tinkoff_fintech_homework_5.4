import java.util.Random;

/**
 * Класс, описывающий читателя.
 * Реализует функционал выбора, прочтения и оценки книги.
 */
public class Reader {
    /**
     * Метод, реализующий выбор книги из массива книг
     *
     * @param listOfBook - входной массив книг
     * @return - возвращает случайную книгу из входного массива
     */
    public Book choiceBook(final Book[] listOfBook) {
        Random random = new Random();
        return listOfBook[random.nextInt(listOfBook.length)];
    }

    /**
     * Метод, реализующий "чтение" книги: выводит в консоль описание книги
     *
     * @param book - читаемая книга
     */
    public void readBook(Book book) {
        System.out.println(book.toString());
    }

    /**
     * Метод, реализующий оценку книги
     *
     * @param book - оцениваемая книга
     * @return - возвращает целочисленное значение оценки книги
     */
    public int evaluateBook(Book book) {
        Random random = new Random();
        int mark = 0;

        int numberOfCharactersInTitle;
        if (book.title == null){
            numberOfCharactersInTitle = 0;
        } else {
            numberOfCharactersInTitle = book.title.replace(" ", "").length();
        }

        if (numberOfCharactersInTitle == 0) {
            mark -= random.nextInt(10);
        } else {
            mark += numberOfCharactersInTitle;
        }

        int numberOfCharactersInAuthor;
        if (book.author == null){
            numberOfCharactersInAuthor = 0;
        } else {
            numberOfCharactersInAuthor = book.author.replace(" ", "").length();
        }

        if (numberOfCharactersInAuthor == 0) {
            mark -= random.nextInt(10);
        } else {
            mark += numberOfCharactersInTitle;
        }

        if (book.numberInSeries == 0) {
            mark -= random.nextInt(10);
        } else {
            mark -= book.numberInSeries;
        }

        if (book.numberOfPage == 0) {
            mark -= random.nextInt(10);
        } else {
            mark += book.numberOfPage;
        }

        return mark;
    }
}
