package Recipe.state;

public interface Builder {
    Builder addContents();
    Builder addSpices();
    Builder Garnishing();
    Curryrecipie build();
}