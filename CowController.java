public class CowController {
    private CowDataStore model;
    private CowView view;
    private double totalMilkProducedPlain = 0;
    private double totalMilkProducedChocolate = 0;
    private double totalMilkProducedStrawberry = 0;

    public CowController(CowDataStore model, CowView view) {
        this.model = model;
        this.view = view;
        
        this.view.addCheckButtonListener(e -> {
            String id = view.getCowId();
            if (!isValidId(id)) {
                view.setResult("Invalid ID format");
                view.resetInput();  
                return;
            }
            
            CowModel cow = model.findCowById(id);
            if (cow != null) {
                double milkProduced = cow.calculateMilk();
                String milkType = "";

                switch (cow.getBreed().toLowerCase()) {
                    case "white":
                        milkType = "Plain Milk";
                        totalMilkProducedPlain += milkProduced; 
                        break;
                    case "brown":
                        milkType = "Chocolate Milk";
                        totalMilkProducedChocolate += milkProduced; 
                        break;
                    case "pink":
                        milkType = "Strawberry Milk";
                        totalMilkProducedStrawberry += milkProduced; 
                        break;
                    default:
                        milkType = "Unknown Milk Type";
                }
                
                String result = String.format("<html>Cow Breed: %s<br>Milk Type: %s<br>Milk Produced: %.2f liters<br>",
                                               cow.getBreed(), milkType, milkProduced);

                String totalResult = String.format(
                    "Total Milk Produced : Plain: %.2f liters , Chocolate: %.2f liters and Strawberry: %.2f liters</html>",
                    totalMilkProducedPlain, totalMilkProducedChocolate, totalMilkProducedStrawberry);

                view.setResult(result + totalResult);

            } else {
                view.setResult("Cow not found. Please try again.");
                view.resetInput(); 
            }
        });
    }

    private boolean isValidId(String id) {
        return id.length() == 8 && id.matches("[1-9][0-9]{7}");
    }
}
