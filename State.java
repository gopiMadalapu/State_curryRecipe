package Recipe.state;

public interface State
{
    public abstract void garnishedCurryrecipie();
    public abstract void cookingCurryrecipie();
    public abstract void undercookedCurryrecipie();
    public abstract void spoiledCurryrecipie();
}