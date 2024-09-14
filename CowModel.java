public class CowModel {
    private String id;
    private String breed;
    private int ageYears;
    private int ageMonths;

    public CowModel(String id, String breed, int ageYears, int ageMonths) {
        this.id = id;
        this.breed = breed;
        this.ageYears = ageYears;
        this.ageMonths = ageMonths;
    }

    public String getId() {
        return id;
    }

    public String getBreed() {
        return breed;
    }

    public int getAgeYears() {
        return ageYears;
    }

    public int getAgeMonths() {
        return ageMonths;
    }

    public double calculateMilk() {
        int totalMonths = (ageYears * 12) + ageMonths;
        switch (breed.toLowerCase()) {
            case "white":
                return 120 - totalMonths;
            case "brown":
                return 40 - ageYears;
            case "pink":
                return 30 - ageMonths;
            default:
                return 0;
        }
    }
}
