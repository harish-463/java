class box
{
double width=10;
double height=20;
double depth=15;
}
class boxdemo
{
public static void main(String args[])
{
box mybox=new box();
double vol;

vol=mybox.width*mybox.height*mybox.depth;
System.out.println("volume is"+vol);
}
}