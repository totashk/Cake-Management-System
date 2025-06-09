abstract class Cake {

    public String falvour;

    public Cake(String falvour){

        this.falvour = falvour;
    }

   public double calcCakeCost(){
        return 0;
   }

    @Override
    public String toString() {
        return "Cake Flavour [ "+ falvour +"]";
    }

}
