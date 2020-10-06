public class Animal {

    private int age;
    private int weight;

    public Animal(int age, int weight) {
        this.age = age;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void running (){
        System.out.println("Running");
    }

    public void eating (){
        System.out.println("Eating");
    }
}
