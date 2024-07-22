class Animal {
    protected String specie;

    protected Animal(String specie) {
        this.specie = specie;
    }
}

class Person extends Animal {
    String name;
    int age;
    
    public Person(String name, int age) {
        super("human");
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Person jonas = new Person("Jonas", 20);
        System.out.println(jonas.name + " is " + jonas.specie);
        try {
            int[] caralho = {1, 2, 3, 4, 5};
            System.out.println(caralho[5]);
        } catch (Exception e) {
            System.out.println("não pode não man: " + e);
        }
    }
}
