class MedicalTester
{
public static void main(String hlo[]){
MedicalStore.mediPlus("Aspirin");
MedicalStore.mediPlus("Paracetamol");
MedicalStore.mediPlus("ibuprofen");
MedicalStore.mediPlus("Antibiotics");
MedicalStore.mediPlus("insulin");
MedicalStore.mediPlus("cough syrup");
MedicalStore.mediPlus("vitamin c");
MedicalStore.mediPlus("antihistamine");
MedicalStore.mediPlus("pain killers");
MedicalStore.getMedicines();
System.out.println("the updated medicines are:");

boolean name=MedicalStore.updateMedicinesNames("Aspirin","ASPIRIN");
System.out.println(name);
boolean name1=MedicalStore.updateMedicinesNames("Paracetamol","PARACETAMOL");
System.out.println(name1);
boolean name2=MedicalStore.updateMedicinesNames("insulin","INSULIN");
System.out.println(name2);
boolean name3=MedicalStore.updateMedicinesNames("vitamin c","vitamin d");
System.out.println(name3);
MedicalStore.getMedicines();



}
}