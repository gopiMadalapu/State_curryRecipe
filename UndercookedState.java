package Recipe.state;

public class UndercookedState implements State {

    Curryrecipie curryrecipie;
    public UndercookedState(Curryrecipie curryrecipie) {
        this.curryrecipie = curryrecipie;
    }

    @Override
    public void garnishedCurryrecipie() {
        System.out.println("Curry recipe need to be followed to make a curry");
        curryrecipie.setState(curryrecipie.getGarnishedState());
    }

    @Override
    public void cookingCurryrecipie() {
        System.out.println("All the ingredients if added correctly the curry will be ready");
        curryrecipie.setState(curryrecipie.getCookingState());
    }

    @Override
    public void undercookedCurryrecipie() {
        System.out.println("Under prepared curry is too raw to eat");
    }

    @Override
    public void spoiledCurryrecipie() {
        System.out.println("The curry will be spoiled");
        curryrecipie.setState(curryrecipie.getSpoiledState());
    }

    public String toString() {
        return "Curry Preparing";
    }

}