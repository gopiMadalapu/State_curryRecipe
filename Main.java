package Recipe.state;
public class Main {

    public static void main(String[] args) {

        CurryrecipieBuilder recipee=new CurryrecipieBuilder();
        Curryrecipie curry=recipee.addContents().addSpices().Garnishing().build();


        curry.garnishedCurryrecipie();

        curry.spoiledCurryrecipie();

        curry.undercookedCurryrecipie();

        curry.cookingCurryrecipie();

        curry.garnishedCurryrecipie();


    }

}
