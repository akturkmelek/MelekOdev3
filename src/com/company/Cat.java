package concretes;

import abstracts.Animal;

import java.util.stream.Stream;

public class Cat extends Animal
{
    String breed;

    int humanYears;

    public Cat(String name, int age, String race)
    {
        super(name, age);
        this.breed = race;
    }

    @Override
    protected int getAgeInHumanYears()
    {
        this.humanYears = age <= 2 ? (age + 11) : (22 + ((age - 2) * 5));
        return this.humanYears;
    }

    @Override
    public void Goster()
    {

    }

    @Override
    public String toString()
    {
        return "Name: " + name + "\n" +
                "Breed: " + breed + "\n" +
                "Age in calendar years: " + age + "\n" +
                "Age in human years: " + getAgeInHumanYears();
    }

    public boolean equals(Cat cat)
    {
        boolean isSameName = this.name == cat.name;
        boolean isSameAge = this.age == cat.age;
        boolean isSameBreed = this.breed == cat.breed;

        return Stream.of(isSameName, isSameAge, isSameBreed).allMatch(Boolean::booleanValue);
    }
}


