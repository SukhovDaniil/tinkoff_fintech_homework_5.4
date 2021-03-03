public class Library {
    public static void main(String[] args) {
        Book[] listOfBook = new Book[7];

        listOfBook[0] = new Book("Турбо-Суслик", "Д.Леушкин", 2, 150);
        listOfBook[1] = new Book("Хищные грибы - друзья человека", 300);
        listOfBook[2] = new Book("Как управлять вселенной, не привлекая внимания санитаров", 978);
        listOfBook[3] = new Book("If God loves Me, why can't I get my locker open?", "Lorraine Peterson", 246);
        listOfBook[4] = new Book("Будь смелее с бананами", 1, 90);
        listOfBook[5] = new Book("Как царь ушёл в девочки", "Савелий Низовский", 70);
        listOfBook[6] = new Book("Легко ли плыть в сиропе", "Генрих Элрих, Сергей Комаров", 1, 105);

        Reader akakovEvpat = new Reader();

        Book readableBook = akakovEvpat.choiceBook(listOfBook);

        akakovEvpat.readBook(readableBook);

        System.out.println(akakovEvpat.evaluateBook(readableBook));
    }
}
