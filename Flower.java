class Flower
{
static String garden[]={null,null,null,null,null,null,null,null};
static int index=0;
public static boolean flowerShow(String flower)
{
boolean isBlosom=false;
if(flower!=null){
garden[index]=flower;
index++;
isBlosom=true;
}else{
System.out.println("no blosom found");
}
return isBlosom;
}
public static void getFlowersFromGarden(){
for(int j=0;j<garden.length;j++){
String reference=garden[j];
System.out.println(reference);
}
}

public static boolean updateFlower(String oldFlower,String newFlower){
	boolean isUpdated=false;
	for(int f=0;f<garden.length;f++){
		if(garden[f].equals(oldFlower)){
			garden[f]=newFlower;
		}
	}return isUpdated;
}

}