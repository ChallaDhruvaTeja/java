import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Individual {
    private String name;
    private String gender;
    private int height;

    public Individual(String name, String gender, int height) {
        this.name = name;
        this.gender = gender;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getHeight() {
        return height;
    }
}

class IndividualRepository {
    private List<Individual> individuals;

    public IndividualRepository(List<Individual> individuals) {
        this.individuals = individuals;
    }

    public List<String> getAllNames() {
        return individuals.stream()
                .map(Individual::getName)
                .collect(Collectors.toList());
    }

    public List<String> getAllGenders() {
        return individuals.stream()
                .map(Individual::getGender)
                .collect(Collectors.toList());
    }

    public List<String> getNamesByHeight(int minHeight) {
        return individuals.stream()
                .filter(individual -> individual.getHeight() > minHeight)
                .map(Individual::getName)
                .collect(Collectors.toList());
    }
}

class DataAnalysis {
    public static void main(String[] args) {
        Individual individual1 = new Individual("Aliya", "Female", 150);
        Individual individual2 = new Individual("Bobby", "Male", 120);
        Individual individual3 = new Individual("Charles", "Male", 100);
        Individual individual4 = new Individual("Riya", "Female", 130);

        IndividualRepository individualRepository = new IndividualRepository(Arrays.asList(individual1, individual2, individual3, individual4));

        System.out.println("Names of all individuals:");
        System.out.println(individualRepository.getAllNames());

        System.out.println("\nGenders of all individuals:");
        System.out.println(individualRepository.getAllGenders());

        System.out.println("\nNames of individuals whose height is greater than 110:");
        System.out.println(individualRepository.getNamesByHeight(110));
    }
}