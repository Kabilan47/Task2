class Person {
    //  Create a class Person with properties (name and age)
    private String name;
    private int age;


    public Person(String name) {
        this.name = name;
        this.age = 18; // default age
    }


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        Person person1 = new Person("Kabilan");
        person1.displayPersonDetails();

        System.out.println();
    }
}
