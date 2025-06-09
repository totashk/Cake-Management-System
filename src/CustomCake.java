public class CustomCake extends Cake {
      private int layers;
      private int size;

   public CustomCake(String flavour, int layers, int size){
       super(flavour);
       this.layers = layers;
       this.size = size;
   }

   public double calcCakeCost(){
       double baseCost = 25;
       double layersCost = layers * 3;
       double sizeCost = size;
       return baseCost + layersCost + sizeCost;
   }
public String toString(){
       return super.toString() + ",Layers: "+ layers + ", Size"+ size + "\"";
}







}
