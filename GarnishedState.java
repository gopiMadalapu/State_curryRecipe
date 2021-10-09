package Recipe.state;

public class GarnishedState implements State {

    Curryrecipie curryrecipie;
    public GarnishedState(Curryrecipie curryrecipie) {
        this.curryrecipie = curryrecipie;
    }

    @Override
    public void garnishedCurryrecipie() {
        System.out.println("Buying ingredients");

    }

    @Override
    public void cookingCurryrecipie() {
        System.out.println("Vegetables, spices, salt and water must be added");
        curryrecipie.setState(curryrecipie.getCookingState());

    }

    @Override
    public void undercookedCurryrecipie() {
        System.out.println("cleaning vegetables");
        curryrecipie.setState(curryrecipie.getUndercookedState());
    }

    @Override
    public void spoiledCurryrecipie() {
        System.out.println("Curry will be made");
        curryrecipie.setState(curryrecipie.getSpoiledState());
    }
    public String toString() {
        return "The curry is dependent on its ingredients";
    }
}