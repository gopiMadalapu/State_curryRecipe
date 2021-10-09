package Recipe.state;

public class Curryrecipie
{
    CookingState cookingState;
    UndercookedState undercookedState;
    GarnishedState garnishedState;
    SpoiledState spoiledState;
    State state;

    Curryrecipie()
    {
        cookingState = new CookingState(this);
        undercookedState= new UndercookedState(this);
        spoiledState = new SpoiledState(this);
        garnishedState=new GarnishedState(this);
        state=garnishedState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public CookingState getCookingState() {
        return cookingState;
    }

    public UndercookedState getUndercookedState() {
        return undercookedState;
    }

    public GarnishedState getGarnishedState() {
        return garnishedState;
    }

    public SpoiledState getSpoiledState() {
        return spoiledState;
    }

    public void garnishedCurryrecipie()  {
        state.garnishedCurryrecipie();
    }

    public void cookingCurryrecipie()  {
        state.cookingCurryrecipie();
    }

    public void undercookedCurryrecipie() {
        state.undercookedCurryrecipie();
    }
    public void spoiledCurryrecipie() {
        state.spoiledCurryrecipie();
    }

    public String toString() {
        StringBuffer sbuffer=new StringBuffer();

        sbuffer.append("\nCurryrecipie State  \nCurryrecipie "+state);

        return sbuffer.toString();
    }
}