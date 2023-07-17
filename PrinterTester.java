class PrinterTester
{
public static void main(String bhaii[]){

Printer printer =new Printer();
printer.name="hp jet pro";
printer.price="$249.99";
printer.connectivity="wireless";
printer.isPrinting();
System.out.println(printer.name+" "+printer.price+" "+printer.connectivity);

Printer printer1 =new Printer();
printer1.name="epson eco tank";
printer1.price="$399.9";
printer1.connectivity="ethernet,usb";
printer1.isPrinting();
System.out.println(printer1.name+" "+printer1.price+" "+printer1.connectivity);

Printer printer2 =new Printer();
printer2.name="canon pixma";
printer2.price="$129.65";
printer2.connectivity="wireless";
printer2.isPrinting();
System.out.println(printer2.name+" "+printer2.price+" "+printer2.connectivity);

Printer printer3 =new Printer();
printer3.name="brother HL";
printer3.price="$149.99";
printer3.connectivity="wireless";
printer3.isPrinting();
System.out.println(printer3.name+" "+printer3.price+" "+printer3.connectivity);

Printer printer4 =new Printer();
printer4.name="HP laser jet pro";
printer4.price="$329.99";
printer4.connectivity="wireless";
printer4.isPrinting();
System.out.println(printer4.name+" "+printer4.price+" "+printer4.connectivity);

Printer printer5=new Printer();
printer5.name="epson workspace";
printer5.price="$299.99";
printer5.connectivity="usb";
printer5.isPrinting();
System.out.println(printer5.name+" "+printer5.price+" "+printer5.connectivity);

Printer printer6 =new Printer();
printer6.name="canon image class";
printer6.price="$199.99";
printer6.connectivity="ethernet";
printer6.isPrinting();
System.out.println(printer6.name+" "+printer6.price+" "+printer6.connectivity);

Printer printer7 =new Printer();
printer7.name="brother MFC";
printer7.price="$249.99";
printer7.connectivity="wireless";
printer7.isPrinting();
System.out.println(printer7.name+" "+printer7.price+" "+printer7.connectivity);

Printer printer8=new Printer();
printer8.name="HP envy photo";
printer8.price="$179.99";
printer8.connectivity="wireless";
printer8.isPrinting();
System.out.println(printer8.name+" "+printer8.price+" "+printer8.connectivity);

Printer printer9 =new Printer();
printer9.name="epson expression ";
printer9.price="$69.99";
printer9.connectivity="wireless";
printer9.isPrinting();
System.out.println(printer9.name+" "+printer9.price+" "+printer9.connectivity);

}
}