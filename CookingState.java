package Recipe.state;

public class CookingState implements State{

    Curryrecipie curryrecipie;
    public CookingState(Curryrecipie curryrecipie) {
        this.curryrecipie = curryrecipie;
    }

    @Override
    public void garnishedCurryrecipie() {
        System.out.println("Curryrecipie has been prepared");
        curryrecipie.setState(curryrecipie.getGarnishedState());

    }

    @Override
    public void cookingCurryrecipie() {
        System.out.println("Curryrecipie is prepared by adding ingredients according to taste");
    }

    @Override
    public void undercookedCurryrecipie() {
        System.out.println("If overcooked the curry will be burnt");
        curryrecipie.setState(curryrecipie.getUndercookedState());
    }

    @Override
    public void spoiledCurryrecipie() {
        System.out.println("Curry will be spoiled");
        curryrecipie.setState(curryrecipie.getSpoiledState());
    }

    public String toString() {
        return "According to taste";
    }


}
