package concretes;

import abstracts.Animal;

import java.util.stream.Stream;

public class Bird extends Animal
{
    boolean breed;

    int humanYears;

    public Bird(String bıcır, String age, String muhabbet)
    {
        super(bıcır, age, muhabbet);
    }

    @Override
    protected int getAgeInHumanYears()
    {
        this.humanYears = age <= 2 ? (age + 11) : (22 + ((age - 2) * 5));
        return this.humanYears;
    }

    @Override
    public String toString()
    {
        return "Name: " + name + "\n" +
                "Can Talk: " + breed + "\n" +
                "Age in calendar years: " + age + "\n" +
                "Age in human years: " + getAgeInHumanYears();
    }

    public boolean equals(Bird bird)
    {
        boolean isSameName = this.name == bird.name;
        boolean isSameAge = this.age == bird.age;
        boolean isSameBreed = this.breed == bird.breed;

        return Stream.of(isSameName, isSameAge, isSameBreed).allMatch(Boolean::booleanValue);
    }
}


