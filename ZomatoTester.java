class ZomatoTester
{
public static void main(String hii[]){

System.out.println("plzz oder ur fav dish");
String foodMenu="pizza";
double searchedFood=Zomato.search(foodMenu);
System.out.println("the ordered food"+"is" +foodMenu+"price is"+searchedFood);
String foodMenu1="onion pizza";
double searchedFood1=Zomato.search(foodMenu1);
System.out.println("the ordered food"+"is" +foodMenu1+"price is"+searchedFood1);
String foodMenu2="pulav";
double searchedFood2=Zomato.search(foodMenu2);
System.out.println("the ordered food"+"is" +foodMenu2+"price is"+searchedFood2);
String foodMenu3="hotdog";
double searchedFood3=Zomato.search(foodMenu3);
System.out.println("the ordered food"+"is" +foodMenu3+"price is"+searchedFood3);
String foodMenu4="milkshake";
double searchedFood4=Zomato.search(foodMenu4);
System.out.println("the ordered food"+"is" +foodMenu4+"price is"+searchedFood4);
String foodMenu5="water";
double searchedFood5=Zomato.search(foodMenu5);
System.out.println("the ordered food"+"is" +foodMenu5+"price is"+searchedFood5);


}
}