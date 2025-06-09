public class SpecialCake extends Cake {

private String nameOfCake;
private double price;

public static final String[][] specialCakesArray = {
        {"Holiday", "25"},
        {"Birthday", "30"},
        {"Anniversary", "40"},
        {"Wedding", "50"}
};

public SpecialCake(String flavour, int cakeIndex){
    super(flavour);
    this.nameOfCake = specialCakesArray[cakeIndex][0];

    this.price = Integer.parseInt(specialCakesArray[cakeIndex][1]);
}

public double calcCakeCost(){
    return price;
}

public String toString(){
    return super.toString() + "Cake Type: "+ nameOfCake;
}



}