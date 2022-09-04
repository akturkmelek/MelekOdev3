package abstracts;

public abstract class Animal
{

    protected String name;

    protected int age;

    public Animal(String bıcır, String s, String muhabbet)
    {

    }

    protected String getName()
    {
        return name;
    }

    protected void setName(String name)
    {
        this.name = name;
    }

    protected int getAge()
    {
        return age;
    }

    protected void setAge(int age)
    {
        this.age = age;
    }

    protected abstract int getAgeInHumanYears();

    protected Animal(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public abstract void Goster();
}


