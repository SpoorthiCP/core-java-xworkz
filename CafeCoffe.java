class CafeCoffe
{
static String coffeeList[]={"kothas coffee","filter coffee","nescafe","black coffee","cold coffee"};
//method
public static void getCoffee(){

System.out.println("welcome to cafe coffee");

//using for  loop
for(int i=0;i<coffeeList.length;i++){

String ref=coffeeList[i];
System.out.println(ref);
}
System.out.println("visit again");

}
}