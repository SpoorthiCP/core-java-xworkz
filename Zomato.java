class Zomato
{
public static double search(String foodName){
if(foodName=="pizza")
{
System.out.println("the ordered food is "+foodName);
return 150;
}

if(foodName=="onion pizza")
{
System.out.println("the ordered food is "+foodName);

return 190;
}
if(foodName=="pulav")
{
System.out.println("the ordered food is "+foodName);

return 295;
}

if(foodName=="hotdog")
{
System.out.println("the ordered food is "+foodName);

return 270;
}
if(foodName=="milkshake")
{
System.out.println("the ordered food is "+foodName);

return 190;
}
if(foodName=="water")
{
System.out.println("the ordered food is "+foodName);

return 30;
}
return 0.0;
}

}