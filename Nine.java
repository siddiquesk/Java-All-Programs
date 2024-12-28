class A
{
 private int mic;
 private int cam;
 void setData()
{
  mic=33;
   cam=50;
}
void display()
{
System.out.println(mic);
System.out.println(cam);
}
}

class Nine
{
public static void main(String args[])
{
  A s1=new A();
   s1.display();
   s1.setData();
    s1.display();
}


}