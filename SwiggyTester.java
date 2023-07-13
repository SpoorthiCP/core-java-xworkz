class SwiggyTester
{
public static void main(String hlo[]){
System.out.println("welcome to swiggy");
System.out.println("plz oerder ur dish");
String foodList="chilli chicken";
double foodInSwiggy=Swiggy.search(foodList,4);
System.out.println("the ordered food is"+foodList+"and its price is"+foodInSwiggy);

String foodList1="butter chicken";
double foodInSwiggy1=Swiggy.search(foodList1,4);
System.out.println("the ordered food is"+foodList1+"and its price is"+foodInSwiggy1);

String foodList2="butter nan and kadai masala";
double foodInSwiggy2=Swiggy.search(foodList2,4);
System.out.println("the ordered food is"+foodList2+"and its price is"+foodInSwiggy2);


String foodList3="chicken gheroast";
double foodInSwiggy3=Swiggy.search(foodList3,4);
System.out.println("the ordered food is"+foodList3+"and its price is"+foodInSwiggy3);
}



}