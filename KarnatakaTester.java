class KarnatakaTester
{
public static void main(String cities[]){
Karnataka.addCities("chikkamagalur");
Karnataka.addCities("banagalore");
Karnataka.addCities("hassan");
Karnataka.addCities("mysuru");
Karnataka.addCities("udupi");
Karnataka.addCities("shivamogga");
Karnataka.addCities("mandya");


Karnataka.getCities();
boolean cham=Karnataka.updateCityName("banagalore","bangaluru");
System.out.println(cham);
boolean cham1=Karnataka.updateCityName("hassan","bellari");
System.out.println(cham1);
boolean cham2=Karnataka.updateCityName("mysuru","mysore");
System.out.println(cham2);
boolean cham3=Karnataka.updateCityName("mandya","tiptur");
System.out.println(cham3);

Karnataka.getCities();

}
}