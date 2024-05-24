import java.util.Arrays;
import java.util.List;

class Individual {
    private String name;
    private int age;
    private String gender;

    public Individual(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}

public class STreamExample {

    public static void main(String[] args) {
        
        List<Individual> individuals = Arrays.asList(
                new Individual("Alice", 25, "Female"),
                new Individual("Bob", 16, "Male"),
                new Individual("Charlie", 30, "Male"),
                new Individual("Diana", 10, "Female"),
                new Individual("Eve", 5, "Female")
        );

       
        boolean allAdults = individuals.stream().allMatch(individual -> individual.getAge() >= 18);
        System.out.println("All individuals are adults: " + allAdults);

       
        boolean anyTeenagers = individuals.stream().anyMatch(individual -> individual.getAge() >= 13 && individual.getAge() < 18);
        System.out.println("Any individual is a teenager: " + anyTeenagers);

     
        boolean noneInfants = individuals.stream().noneMatch(individual -> individual.getAge() < 1);
        System.out.println("None of the individuals are infants: " + noneInfants);
    }
}
