class Telecom
{
static String sim[]={null,null,null,null,null,null,null,null};
static int index=0;
public static boolean phoneSim(String simcard){
boolean isSimAdded=false;
if(simcard!=null)
{
 sim[index]=simcard;
 index++;
isSimAdded=true;
}else{
System.out.println("no such sim cards available");

}return isSimAdded;
}
public static void getSimCard(){
/*for(int i=0;i<sim.length;i++){
String reference = sim[i];
System.out.println(reference);*/
for(String ref:sim){
	System.out.println(ref);
}
}


public static boolean updateTelecom(String existingsim,String newsim){
	boolean isUpdated=false;
	for(int j=0;j<sim.length;j++){
		if(sim[j].equals(existingsim)){
			sim[j]=newsim;
			isUpdated=true;
		}
	}return isUpdated;
	
}
}