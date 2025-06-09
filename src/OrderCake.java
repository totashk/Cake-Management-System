/*public class OrderCake {

    private Cake[] cakeList;
    private int index;

    public OrderCake(int numberOfCakes) {
        cakeList = new Cake[numberOfCakes];
        index = 0;
    }

    public void addCake(Cake cake) {
        if (index < cakeList.length) {
            cakeList[index++] = cake;
        }
    }

    public double calcOrderCost() {
        double totalCost = 0;
        for (Cake cake : cakeList) {
            if (cake != null) {
                totalCost += cake.calcCakeCost();
            }
        }
        return totalCost;
    }

    @Override
    public String toString() {
        StringBuilder details = new StringBuilder();
        for (Cake cake : cakeList) {
            if (cake != null) {
                details.append(cake).append(", Cost: $").append(cake.calcCakeCost()).append("\n");
            }
        }
        return details.toString();
    }
}*/


