class ProjectorTester
{
public static void main(String hii[]){


Projector proj=new Projector();
proj.name="epson 1234";
proj.price=5000;
proj.hdSupport="yes";
proj.getPro();
System.out.println(proj.name+" "+proj.price+" "+proj.hdSupport);

Projector proj1=new Projector();
proj1.name="sony";
proj1.price=14000;
proj1.hdSupport="no";
proj1.getPro();
System.out.println(proj1.name+" "+proj1.price+" "+proj1.hdSupport);

Projector proj2=new Projector();
proj2.name="benq";
proj2.price=12000;
proj2.hdSupport="yes";
proj2.getPro();
System.out.println(proj2.name+" "+proj2.price+" "+proj2.hdSupport);

Projector proj3=new Projector();
proj3.name="optoma 789";
proj3.price=15000;
proj3.hdSupport="yes";
proj3.getPro();
System.out.println(proj3.name+" "+proj3.price+" "+proj3.hdSupport);

Projector proj4=new Projector();
proj4.name="lg";
proj4.price=12000;
proj4.hdSupport="no";
proj4.getPro();
System.out.println(proj4.name+" "+proj4.price+" "+proj4.hdSupport);

Projector proj5=new Projector();
proj5.name="view sonic";
proj5.price=12000;
proj5.hdSupport="yes";
proj5.getPro();
System.out.println(proj5.name+" "+proj5.price+" "+proj5.hdSupport);

Projector proj6=new Projector();
proj6.name="samsung";
proj6.price=12000;
proj6.hdSupport="yes";
proj6.getPro();
System.out.println(proj6.name+" "+proj6.price+" "+proj6.hdSupport);

Projector proj7=new Projector();
proj7.name="panasonic";
proj7.price=8000;
proj7.hdSupport="no";
proj7.getPro();
System.out.println(proj7.name+" "+proj7.price+" "+proj7.hdSupport);

Projector proj8=new Projector();
proj8.name="acer";
proj8.price=12000;
proj8.hdSupport="no";
proj8.getPro();
System.out.println(proj8.name+" "+proj8.price+" "+proj8.hdSupport);

Projector proj9=new Projector();
proj9.name="infocus";
proj9.price=14000;
proj9.hdSupport="yes";
proj9.getPro();
System.out.println(proj9.name+" "+proj9.price+" "+proj9.hdSupport);

}
}