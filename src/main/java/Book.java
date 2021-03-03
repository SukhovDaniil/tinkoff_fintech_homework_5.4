/**
 * Класс, определяющий книгу
 */
public class Book {
    String title;
    String author;
    int numberInSeries;
    int numberOfPage;

    /**
     * Конструктор, заполняющий все поля описания книги
     *
     * @param title          - название книги
     * @param author         - автор книги
     * @param numberInSeries - номер книги в серии
     * @param numberOfPage   - количество страниц в книге
     */
    Book(String title, String author, int numberInSeries, int numberOfPage) {
        this.title = title;
        this.author = author;
        this.numberInSeries = numberInSeries;
        this.numberOfPage = numberOfPage;
    }

    /**
     * Конструктор для книги без автора (Пример: Библия или сборник народных сказок)
     *
     * @param title          - название книги
     * @param numberInSeries - номер книги в серии
     * @param numberOfPage   - количество страниц в книге
     */
    Book(String title, int numberInSeries, int numberOfPage) {
        this.title = title;
        this.numberInSeries = numberInSeries;
        this.numberOfPage = numberOfPage;
    }

    /**
     * Конструктор для книги, не входящей в серию
     *
     * @param title        - название книги
     * @param author       - автор книги
     * @param numberOfPage - количество старниц в книге
     */
    Book(String title, String author, int numberOfPage) {
        this.title = title;
        this.author = author;
        this.numberOfPage = numberOfPage;
    }

    /**
     * Конструктор книги, не входящей в серию и не имеющей автора
     *
     * @param title        - название книги
     * @param numberOfPage - количество страний в книге
     */
    Book(String title, int numberOfPage) {
        this.title = title;
        this.numberOfPage = numberOfPage;
    }

    /**
     * Переопределяем метод toString, унаследованный от Object
     *
     * @return - возвращает строку с "красивым" описанием книги
     */
    @Override
    public String toString() {
        // Добавляем название книги (считаем, что не бывает книги без названия)
        String description = "Книга \"" + this.title + "\"";

        // Добавляем в описание книги автора (если есть)
        if (this.author != null) {
            description += " автора " + this.author;
        }

        // Добавляем двоеточие тут на случай, если отсутствует автор
        description += ":";

        // Добавляем номер книги в серии (если есть)
        if (this.numberInSeries != 0) {
            description += " номер в серии = " + this.numberInSeries + ",";
        }

        // Добавляем количество страниц (считаем, что не может быть книги без страниц)
        description += " количество страниц = " + this.numberOfPage + ".";

        return description;
    }
}
