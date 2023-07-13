class FlowerTester
{
public static void main(String hlo[]){
Flower.flowerShow("sunflower");
Flower.flowerShow("rose");
Flower.flowerShow("lily");
Flower.flowerShow("jasmine");
Flower.flowerShow("whiterose");
Flower.flowerShow("iris");
Flower.flowerShow("daffodil");
Flower.flowerShow("daisy");

Flower.getFlowersFromGarden();


boolean values=Flower.updateFlower("iris","Iris");
boolean values1=Flower.updateFlower("jasmine","jasmineGold");
boolean values2=Flower.updateFlower("lily","lilyFlower");
boolean values3=Flower.updateFlower("daisy","Daisy");
boolean values4=Flower.updateFlower("rose","Rosy");
Flower.getFlowersFromGarden();

}
}