class PackageRunner{

public static void main(String[] pac){

Package pack = (weight, length, width, height) ->{

double volume = length * width * height;
        return weight * 0.5 + volume * 0.01;

};
double cost = pack.calculateShippingCost(1, 2, 3, 4);
        System.out.println("Shipping Cost: " + cost);

}
}