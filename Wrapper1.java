class Wrapper1
{
public static void main(String args[])
{
   Integer I = Integer.valueOf("10"); 
        System.out.println(I); 
        
        Double D = Double.valueOf("10.0"); 
        System.out.println(D); 
        
        Boolean B = Boolean.valueOf("true"); 
        System.out.println(B); 
  
       Integer x1=Integer.valueOf("101001",2);
		int z=x1.intValue();//1+8+32
		System.out.println(z);
		
		int x=Integer.parseInt("2345");
		System.out.println(x);
		
		int p=Integer.parseInt("001001",2);
		System.out.println(p);

}



}