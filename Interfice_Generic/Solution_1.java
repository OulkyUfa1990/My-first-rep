package Interfice_Generic;
/*Fly, Run, Climb для классов Cat, Dog, Tiger, Duck
1) Внутри класса Solution создай интерфейс public interface Fly(летать) с методом void fly()
2) Внутри класса Solution создай интерфейс public interface Climb(лазить по деревьям) с методом void climb()
3) Внутри класса Solution создай интерфейс public interface Run(бегать) с методом void run()
4) Подумай логически, какие именно интерфейсы нужно добавить для каждого класса
5) Добавь интерфейсы классам Cat(кот), Dog(собака), Tiger(тигр), Duck(Утка).*/
public class Solution_1 {
    public interface Fly{
        void fly();
    }
    public interface Climb{
        void climb();
    }
    public interface Run{
        void run();
    }
    public abstract class Cat implements Run{}
    public abstract class Dog implements Run{}
    public abstract class Tiger implements Run, Climb{}
    public abstract class Duck implements Run, Fly{}
}
