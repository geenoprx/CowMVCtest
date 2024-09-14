public class CowMain {
    public static void main(String[] args) {
        CowDataStore model = new CowDataStore();
        CowView view = new CowView();
        CowController controller = new CowController(model, view);

        view.setVisible(true);
    }
}
