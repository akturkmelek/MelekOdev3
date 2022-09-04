import concretes.Bird;

import javax.swing.*;

public abstract class Dog extends abstracts.Animal
{

    String breed;
    int humanYears;

    public int getAgeInHumanYears(int age)
    {
        if (age < 2)
            humanYears += age + 11;
        else
            humanYears += 22 + ((age - 2) * 5);

        return humanYears;
    }

    public void Goster()
    {
        String name;
        System.out.println("Name:" + name + "\n");
        System.out.println("Breed:" + breed + "\n");
        String age;
        System.out.println("Age:" + age + "\n");
        getAgeInHumanYears(getAge());
        System.out.println("Age in human:" + humanYears + "\n");

    }

    public boolean equals(String name, int age, String breed)
    {
        if ((getName().equals(name) && (getAge() == age) && this.breed.equals(breed)))
        {
            return true;
        }
        else
        {
            return false;
        }


    }

    private Bird getName()
    {
        return null;
    }

    private int getAge()
    {
        return 0;
    }
}