package genealogy;

import java.util.*;
import Dog.Dog;

public class GenealogicalTreeImpl<T> implements GenealogicalTree<T> {
    private List<T> items;

    public GenealogicalTreeImpl() {
        items = new ArrayList<>();
    }

    @Override
    public void add(T item) {
        items.add(item);
    }

    @Override
    public void remove(T item) {
        items.remove(item);
    }

    @Override
    public boolean contains(T item) {
        return items.contains(item);
    }

    public void sort(Comparator<T> comparator) {
        Collections.sort(items, comparator);
    }

    @Override
    public Iterator<T> iterator() {
        return items.iterator();
    }

    public static void main(String[] args) {
        GenealogicalTreeImpl<Person> personTree = new GenealogicalTreeImpl<>();

        // Создаем несколько объектов Person
        Person person1 = new Person("Vlad", new Date(1999));
        Person person2 = new Person("Olga", new Date(1987));
        Person person3 = new Person("Brad", new Date(1995));

        // Добавляем объекты в генеалогическое дерево
        personTree.add(person1);
        personTree.add(person2);
        personTree.add(person3);

        // Выводим список людей до сортировки
        System.out.println("Список людей до сортировки: ");
        for (Person person : personTree) {
            System.out.println(person.getName() + " - " + person.getBirthDate());
        }

        // Сортируем список по имени
        personTree.sort(Comparator.comparing(Person::getName));

        // Выводим отсортированный список
        System.out.println("Список людей после сортировки по имени: ");
        for (Person person : personTree) {
            System.out.println(person.getName() + " - " + person.getBirthDate());
        }

        // Создаем новое генеалогическое дерево для собак
        GenealogicalTreeImpl<Dog> dogTree = new GenealogicalTreeImpl<>();

        // Создаем несколько объектов Dog
        Dog dog1 = new Dog("Rex", new Date(2016));
        Dog dog2 = new Dog("Charles", new Date(2020));
        Dog dog3 = new Dog("Max", new Date(2018));

        // Добавляем объекты в генеалогическое дерево собак
        dogTree.add(dog1);
        dogTree.add(dog2);
        dogTree.add(dog3);

        // Выводим список собак до сортировки
        System.out.println("Список собак до сортировки: ");
        for (Dog dog : dogTree) {
            System.out.println(dog.getName() + " - " + dog.getBirthDate());
        }

        // Сортируем список собак по имени
        dogTree.sort(Comparator.comparing(Dog::getName));

        // Выводим отсортированный список
        System.out.println("Список собак после сортировки по имени: ");
        for (Dog dog : dogTree) {
            System.out.println(dog.getName() + " - " + dog.getBirthDate());
        }
    }
}