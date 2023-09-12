public class Peoples {
    private String name;
    private int age;
    private double height;
    private char gender;

    public Peoples(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Peoples(double height, char gender){
        this.height = height;
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
}
