package abstractdemo;

abstract class Animals
{
    abstract void cats();
    abstract void dogs();
}
class Cats extends Animals
{
    void cats()
    {
        System.out.println("Cats meow");
    }
    
    void dogs() 
    {
    }
}
class Dogs extends Animals 
{
    void cats()
    {
       
    }
    
    void dogs() 
    {
        System.out.println("Dogs bark");
    }
}


public class Main 
{
	public static void main(String[] args)
	{
        Cats catObj = new Cats();
        Dogs dogObj = new Dogs();
        
        catObj.cats();  // Output: Cats meow
        dogObj.dogs();  // Output: Dogs bark
	}
}
