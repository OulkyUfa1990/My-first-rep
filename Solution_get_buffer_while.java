/* MovieFactory
Расширение функционала по аналогии, чтение с консоли:
1. Разобраться, что программа умеет делать.
2. Все классы должны быть внутри класса Solution.
3. Добавить классы Cartoon, Thriller.
4. Разобраться, как мы получаем объект класса SoapOpera по ключу "soapOpera".
Аналогично получению объекта SoapOpera сделать:
5. Добавить в MovieFactory.getMovie получение объекта Cartoon для ключа "cartoon".
6. Добавить в MovieFactory.getMovie получение объекта Thriller для ключа "thriller".
7. Считать с консоли несколько ключей (строк).
7.1. Ввод заканчивается, как только вводится строка не совпадающая с одной из: "cartoon", "thriller", "soapOpera".
8. Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1. Получить объект используя MovieFactory.getMovie и присвоить его переменной movie.
8.2. Вывести на экран movie.getClass().getSimpleName().
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_get_buffer_while
{
    public static void main(String[] args) throws Exception
    {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            String key = reader.readLine();
            if ("soapOpera".equals(key) || "cartoon".equals(key) || "thriller".equals(key))
            {
                Movie movie = MovieFactory.getMovie(key);           //ВАЖНО!!! Получение movie через метод работает именно так!
                System.out.println(movie.getClass().getSimpleName());           //походу, геттеры! в переводе на человеческий: объект / взять класс / взять имя объекта (например, SoapOpera).
            }
            else break;
        }
        /*
8 Создать переменную movie класса Movie и для каждой введенной строки(ключа):
8.1 получить объект используя MovieFactory.getMovie и присвоить его переменной movie
8.2 вывести на экран movie.getClass().getSimpleName()
        */
    }
    static class MovieFactory
    {
        static Movie getMovie(String key)
        {
            Movie movie = null;
            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key))
            {
                movie = new SoapOpera();
            }
            //напишите тут ваш код, пункты 5,6
            if ("cartoon".equals(key))
            {
                movie = new Cartoon();
            }
            if ("thriller".equals(key))
            {
                movie = new Thriller();
            }
            return movie;
        }
    }
    static abstract class Movie
    {
    }
    static class SoapOpera extends Movie
    {
    }
    //Напишите тут ваши классы, пункт 3
    public static class Cartoon extends Movie
    {
    }
    public static class Thriller extends Movie
    {
    }
}