public class Pet {
//      De attributen voor de klasse Pet
    private String name;
    private int age;
    private String species;
    private String owner;
//      De constructor voor de attributen
    public Pet(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
    }
//      De methode
    public void addOwner(){

    }

//      De getters en de setters
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
