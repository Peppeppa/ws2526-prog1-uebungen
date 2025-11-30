package Lektion9.Pizza;

public class Pizzarechner {
    public static void main(String[] args){
        Pizza[] pizzen = createPizzen();

        System.out.println("Pizza Preisleistungsrechner ");

        for (int i = 0; i<pizzen.length;i++){
            System.out.println(pizzen[i].name + ": " + pizzen[i].besteKombiAlsString());

        }

    }

    public static Pizza[] createPizzen(){
        Pizza kaese = new Pizza(
                "Kaese",
                new int[]{20, 30},
                new float[]{8.50F, 12.90F}
        );

        Pizza salamie = new Pizza(
                "Salamie",
                new int[]{25, 30},
                new float[]{9.90F, 13.34F}
        );

        Pizza hawaii = new Pizza(
                "Hawaii",
                new int[]{20, 30},
                new float[]{10.20F, 14.80F}
        );

        Pizza spezial = new Pizza(
                "Spezial",
                new int[]{24, 34},
                new float[]{11.90F, 16.40F}
        );

        Pizza vegan = new Pizza(
                "Vegan",
                new int[]{18, 28},
                new float[]{8.10F, 12.30F}
        );

        return new Pizza[]{kaese, salamie, hawaii, spezial, vegan};
    }


}
