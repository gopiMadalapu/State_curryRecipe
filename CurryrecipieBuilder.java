package Recipe.state;

public class CurryrecipieBuilder implements Builder{

    CurryrecipieBuilder(){

    }

    @Override
    public Builder addContents() {
        System.out.println("All needed ingredients must be added to prepare a curry");
        return this;
    }

    @Override
    public Builder addSpices() {
        System.out.println("Vegetables must be added");
        return this;
    }

    @Override
    public Builder Garnishing() {
        System.out.println("Salt applied to curry");
        return this;
    }

    @Override
    public Curryrecipie build() {
        Curryrecipie s=new Curryrecipie();
        System.out.println("Tasty curry is made!");
        return s;
    }
}