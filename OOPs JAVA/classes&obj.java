import java.util.*;
class Car //Instantiating class Car
{
    //Variable declaration 
    String type;
    int total,price, extrafitting;
    double  net, gst, discount;
    
    //declaring flag variable
    int flag = 0; 
    
    Scanner sc = new Scanner(System.in);
    
    //Function to read data from the user
    void Read()
    {
        type = sc.nextLine();
        price = sc.nextInt();
        extrafitting = sc.nextInt();
        
    }
    
    //Function to compute net price
    void Compute()
    {
        total = price + extrafitting;
        if(type.equals("Hatchback"))
        {
            discount = total*0.03;
            gst = (total - discount)*0.12;
            net = total - discount + gst;
        }
        else if(type.equals("Sedan"))
        {
            discount = total*0.05;
            gst = (total - discount)*0.12;
            net = total - discount + gst;
        }
        else if(type.equals("SUV"))
        {
            discount = total*0.1;
            gst = (total - discount)*0.12;
            net = total - discount + gst;
        }
        else if(type.equals("MUV"))
        {
            discount = total*0.1;
            gst = (total - discount)*0.12;
            net = total - discount + gst;
        }
        else
        {
            flag++;
        }
    }
    
    void Display()
    {
        if(flag == 0)
        {
            int result = (int) net;
        System.out.println(result);
        }
        else
        {
            System.out.println("Invalid Type");
        }
    }
    
    
    
}

class Main{
    public static void main(String[] args)
    {
        Car c1 = new Car(); //Object creation in the main class
        c1.Read();
        c1.Compute();
        c1.Display();
    }
}