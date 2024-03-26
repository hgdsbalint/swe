package countries;

import repository.Repository;

/**
 * Represents a repository of {@code Country} objects.
 */
public class CountryRepository extends Repository<Country> {

    public CountryRepository() {
        super(Country.class, "countries.json");
    }

    public static void main(String[] args) {
        final var repo = new CountryRepository();
        repo.getAll().stream().forEach(System.out::println);
    }
}
