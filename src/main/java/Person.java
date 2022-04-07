import java.util.List;

public class Person {
//      De attributen voor de klasse Person
    private String name;
    private String middleName;
    private String lastName;
    private char sex;
    private int age;
    private String mother;
    private String father;
//    private List<Siblings> sibling;
//    private List<children> child;
//    private List<Pets> pet;
//      De constructor voor de attributen

    public Person(String name, String lastName, char sex, int age) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, String middleName, String lastName, char sex, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }
//    De methoden
    public void addParents(){

    }
    public void addChild(){

    }
    public void addPet(){

    }
    public void addSibling(){

    }
    public void addGrandChildren(){

    }

    //    De getters en de setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

//    public List<Siblings> getSibling() {
//        return sibling;
//    }
//
//    public void setSibling(List<Siblings> sibling) {
//        this.sibling = sibling;
//    }
//
//    public List<children> getChild() {
//        return child;
//    }
//
//    public void setChild(List<children> child) {
//        this.child = child;
//    }
//
//    public List<Pets> getPet() {
//        return pet;
//    }
//
//    public void setPet(List<Pets> pet) {
//        this.pet = pet;
//    }
}
