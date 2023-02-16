import java.util.ArrayList;

public class DogOwner {
    private String name;
    private String sex;
    private Dog dog;

    public DogOwner(String name, String sex){
        this.name=name;
        this.sex=sex;

    }
    public void setDog(Dog dog){
        this.dog= dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Dog getDog() {
        return dog;
    }

    @Override
    public String toString() {
        return this.name + "heeft een " + this.dog.getSex() + " , deze is " + this.dog.getAge() + " jaar oud en van het soort: " + this.dog.getSpecies() + ". De hond heet: " + this.dog.getName() ;
    }
}
