class Swiggy
{
public static double search(String foodMenu)
{
if(foodMenu=="chilli chicken")
{
System.out.println("the orderd food is "+foodMenu);
return 130;
}
if(foodMenu=="butter chicken")
{
System.out.println("the orderd food is "+foodMenu);
return 290;
}
if(foodMenu=="butter nan and kadai masala")
{
System.out.println("the orderd food is "+foodMenu);
return 450.67;
}
if(foodMenu=="chicken gheroast")
{
System.out.println("the orderd food is "+foodMenu);
return 250;
}
return 0.0;
}
 
 
public static double search(String foodMenu ,int quantity)
{
if(foodMenu=="chilli chicken")
{
System.out.println("the orderd food is "+foodMenu);
return 130*quantity;
}
if(foodMenu=="butter chicken")
{
System.out.println("the orderd food is "+foodMenu);
return 290*quantity;
}
if(foodMenu=="butter nan and kadai masala")
{
System.out.println("the orderd food is "+foodMenu);
return 450.67*quantity;
}
if(foodMenu=="chicken gheroast")
{
System.out.println("the orderd food is "+foodMenu);
return 250*quantity;
}
return 0.0;
}
}
