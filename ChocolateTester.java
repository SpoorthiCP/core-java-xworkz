class ChocolateTester
{
public static void main(String hlo[]){
Chocolates choco=new Chocolates();
choco.name="milky bar";
choco.flavours="vanilla";
choco.quantity=2;
choco.price=20;
choco.expDate=2023;
choco.mgfDate=2023;
choco.colour="white";
choco.toGetCalories();
System.out.println(choco.name+ "  "+choco.flavours+ "  "+choco.quantity+ "  "+choco.price+ "  "+choco.expDate+ "  "+choco.mgfDate+ "  "+choco.colour);

Chocolates choco1=new Chocolates();
choco1.name="dairy milk";
choco1.price=100;
choco1.expDate=2023;
choco1.mgfDate=2023;
choco1.toGetCalories();
System.out.println(choco1.name+ "  "+choco1.price+ "  "+choco1.expDate+ "  "+choco1.mgfDate);

Chocolates choco2=new Chocolates();
choco2.name="dairy milk";
choco2.price=100;
choco2.expDate=2023;
choco2.mgfDate=2023;
choco2.toGetCalories();
System.out.println(choco2.name+ "  "+choco2.price+ "  "+choco2.expDate+ "  "+choco2.mgfDate);

Chocolates choco3=new Chocolates();
choco3.name="dairy milk";
choco3.price=100;
choco3.expDate=2023;
choco3.mgfDate=2023;
choco3.toGetCalories();
System.out.println(choco3.name+ "  "+choco3.price+ "  "+choco3.expDate+ "  "+choco3.mgfDate);

Chocolates choco4=new Chocolates();
choco4.name="kikat";
choco4.price=150;
choco4.expDate=2023;
choco4.mgfDate=2023;
choco4.toGetCalories();
System.out.println(choco4.name+ "  "+choco4.price+ "  "+choco4.expDate+ "  "+choco4.mgfDate);

Chocolates choco5=new Chocolates();
choco5.name="lolipop";
choco5.price=20;
choco5.expDate=2023;
choco5.mgfDate=2023;
choco5.toGetCalories();
System.out.println(choco5.name+ "  "+choco5.price+ "  "+choco5.expDate+ "  "+choco5.mgfDate);

Chocolates choco6=new Chocolates();
choco6.name="dark chocolate";
choco6.price=300;
choco6.expDate=2023;
choco6.mgfDate=2023;
choco6.toGetCalories();
System.out.println(choco6.name+ "  "+choco6.price+ "  "+choco6.expDate+ "  "+choco6.mgfDate);

Chocolates choco7=new Chocolates();
choco7.name="amul chocolate";
choco7.price=150;
choco7.expDate=2023;
choco7.mgfDate=2023;
choco7.toGetCalories();
System.out.println(choco7.name+ "  "+choco7.price+ "  "+choco7.expDate+ "  "+choco7.mgfDate);

Chocolates choco8=new Chocolates();
choco8.name="jelly";
choco8.price=100;
choco8.expDate=2023;
choco8.mgfDate=2023;
choco8.toGetCalories();
System.out.println(choco8.name+ "  "+choco8.price+ "  "+choco8.expDate+ "  "+choco8.mgfDate);

Chocolates choco9=new Chocolates();
choco9.name="dairy milk bubble";
choco9.price=150;
choco9.expDate=2023;
choco9.mgfDate=2024;
choco9.toGetCalories();
System.out.println(choco9.name+ "  "+choco9.price+ "  "+choco9.expDate+ "  "+choco9.mgfDate);
}
}