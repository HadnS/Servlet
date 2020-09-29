package hs.example.pojo;

public class People {
    private String name;
    private int id;
    private int age;
    private String address;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public People(String name, int id, int age, String address) {

        this.name = name;
        this.id = id;
        this.age = age;
        this.address = address;
    }
    public People()
    {

    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
