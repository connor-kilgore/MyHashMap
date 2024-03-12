package Core;

public class Dog implements LLNodeObject {
    String name;
    String breed;
    int age;

    public Dog (String name, String breed, int age)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getString ()
    {
        return "#Dog{name:" + name +
                " breed:" + breed +
                " age:" + age + "}";
    }

}
