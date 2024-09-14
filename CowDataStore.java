import java.util.ArrayList;
import java.util.List;

public class CowDataStore {
    private List<CowModel> cows;

    public CowDataStore() {
        cows = new ArrayList<>();
        generateSampleData();
    }

    public void generateSampleData() {
        
        cows.add(new CowModel("11111111", "white", 3, 5));
        cows.add(new CowModel("12222222", "white", 2, 10));
        cows.add(new CowModel("13333333", "white", 1, 7));
        cows.add(new CowModel("14444444", "white", 4, 6));
        cows.add(new CowModel("15555555", "white", 5, 7));
        cows.add(new CowModel("21111111", "brown", 4, 3));
        cows.add(new CowModel("22222222", "brown", 6, 1));
        cows.add(new CowModel("23333333", "brown", 9, 4));
        cows.add(new CowModel("24444444", "brown", 7, 8));
        cows.add(new CowModel("25555555", "brown", 5, 11));
        cows.add(new CowModel("31111111", "pink", 0, 4));
        cows.add(new CowModel("32222222", "pink", 1, 8));
        cows.add(new CowModel("33333333", "pink", 2, 9));
        cows.add(new CowModel("34444444", "pink", 3, 11));
        cows.add(new CowModel("35555555", "pink", 4, 7));

    }

    public CowModel findCowById(String id) {
        for (CowModel cow : cows) {
            if (cow.getId().equals(id)) {
                return cow;
            }
        }
        return null; // if not found
    }
}
