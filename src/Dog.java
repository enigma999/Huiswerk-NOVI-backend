public class Dog {
    private String name;
    private String species;
    private int age;
    private String sex;

    public Dog(String name,String species,int age,String sex){
        this.name=name;
        this.species=species;
        this.age=age;
        this.sex=sex;

    }
    public void hasAged(){
        this.age++
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
