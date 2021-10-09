package Recipe.state;


public class SpoiledState implements State {

    Curryrecipie curryrecipie;
    public SpoiledState(Curryrecipie curryrecipie) {
        this.curryrecipie = curryrecipie;
    }

    @Override
    public void garnishedCurryrecipie() {
        System.out.println("Buying spices");
        curryrecipie.setState(curryrecipie.getGarnishedState());
    }

    @Override
    public void cookingCurryrecipie() {
        System.out.println("Cooking a curry needs all the needed ingredients");
    }

    @Override
    public void undercookedCurryrecipie() {
        System.out.println("If not stored properly the curry will be spoiled");

    }

    @Override
    public void spoiledCurryrecipie() {
        System.out.println("The curry will be spoiled");

    }

    public String toString() {
        return "The curry will tasty";
    }

}
