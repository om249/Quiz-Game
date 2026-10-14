import java.util.*;
public class KBC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Date dt=new Date();
        int score=0;
        String choice;
        int ruppes;
        

        System.out.println("******************************************");
        System.out.println("*          let's start our KBC           *");
        System.out.println("******************************************");
        
        System.out.print("Enter Your Name :");
        String Name=sc.nextLine();
        System.out.print("\nenter choice (a,b,c,d) :");
        choice=sc.nextLine();
        switch(choice)
        {
            case "a" : System.out.println("1)IN WHICH LANGUAGE THIS CODE IS WRITTEN ?");
            System.out.println("A] PYTHON"+"\nB] java"+"\nC] C"+"\nD] HTML");
            System.out.print("Ans:");
            String ans1=sc.nextLine();
            if(ans1.equals("B"))                //or we can use if(ans1=="B")
            {
                //System.out.println("correct Ans");
                score++;
            }
            // else{
            //     System.out.println("wrong option");
            // }
           
    
            System.out.println("2)WHAT IS FULL FORM OF 'WHO' ?");
            System.out.println("A] WORLD HEALTH ORGARNIZATION"+"\nB] WORLD HIV ORGANIZATION"+"\nC] WORLD HUMAN-RESOURCE ORGANIZATION"+"\nD] WORLD HEALTH OPTIMIZATION");
            System.out.print("Ans:");
            String ans2=sc.nextLine();
            if(ans2.equals("A"))               //or we can use if(ans1=="B")
            {
               // System.out.println("correct Ans");
                score++;
        }
        // else{
        //     System.out.println("wrong option");
        // } 
        
        System.out.println("3)WHICH IS INDIA'S FIRST SUPER COMPUTER ?");
        System.out.println("A] PARAM8000"+"\nB] PARAM80000"+"\nC] PARAM800"+"\nD] PARAM8");
        System.out.print("Ans:");
        String ans3=sc.nextLine();
        if(ans3.equals("A"))                  //or we can use if(ans1=="B")
        {
           // System.out.println("correct Ans");
            score++;
    } 
    // else{
    //     System.out.println("wrong option");
    // }
    
    System.out.println("4)WHIC IS THE LARGEST ANIMAL IN THE WORLD ?");
    System.out.println("A] SHARK"+"\nB] BLUE WHALE"+"\nC] ELEPHANT"+"\nD] GIRAFFE");
    System.out.print("Ans:");
    String ans4=sc.nextLine();
    if(ans4.equals("B"))                    //or we can use if(ans1=="B")
    {
        //System.out.println("correct Ans");
        score++;
    } 
    // else{
    //     System.out.println("wrong option");
    // }
    
    System.out.println("5) HOW MANY LETTERS ARE THERE IN THE ENGLISH ALPHABET ?");
    System.out.println("A] 20"+"\nB] 26"+"\nC] 24"+"\nD] 21");
    System.out.print("Ans:");
    String ans5=sc.nextLine();
    if(ans5.equals("B"))                  //or we can use if(ans1=="B")
    {
        //System.out.println("correct Ans");
        score++;
    } 
    // else{
    //     System.out.println("wrong option");
    // }
            break;

            case "b" : System.out.println("1) WHICH COUNTRY IS KNOWN AS THE LAND OF THE RISING SUN ?");
            System.out.println("A] CHINA"+"\nB] JAPAN"+"\nC] SOUTH KOREA"+"\nD] THAILAND");
            System.out.print("Ans:");
            String ans6=sc.nextLine();
            if(ans6.equals("B"))                //or we can use if(ans1=="B")
            {
                //System.out.println("correct Ans");
                score++;
            }
            // else{
            //     System.out.println("wrong option");
            // }
           
    
            System.out.println("2)WHO IS CREDITED WITH DISCOVERING GRAVITY ?");
            System.out.println("A] ALBERT EINSTEIN"+"\nB] ISAAC NEWTON"+"\nC] GALILEO GALILEI"+"\nD] NIKOLA TESLA");
            System.out.print("Ans:");
            String ans7=sc.nextLine();
            if(ans7.equals("B"))               //or we can use if(ans1=="B")
            {
               // System.out.println("correct Ans");
                score++;
        }
        // else{
        //     System.out.println("wrong option");
        // } 
        
        System.out.println("3) WHAT IS SYMBOL FOR IRON ?");
        System.out.println("A] Fe"+"\nB] Ir"+"\nC] In"+"\nD] Io");
        System.out.print("Ans:");
        String ans8=sc.nextLine();
        if(ans8.equals("A"))                  //or we can use if(ans1=="B")
        {
           // System.out.println("correct Ans");
            score++;
    } 
    // else{
    //     System.out.println("wrong option");
    // }
    
    System.out.println("4) WHAT IS THE LARGEST OCEAN IN THE WORLD ?");
    System.out.println("A] ATLANTIC OCEAN"+"\nB] INDIAN OCEAN"+"\nC] ARACTIC OCEAN"+"\nD] PACIFIC OCEAN");
    System.out.print("Ans:");
    String ans9=sc.nextLine();
    if(ans9.equals("D"))                    //or we can use if(ans1=="B")
    {
        //System.out.println("correct Ans");
        score++;
    } 
    // else{
    //     System.out.println("wrong option");
    // }
    
    System.out.println("5) WHO WROTE 'HARRY POTTER' SERIES ?");
    System.out.println("A] J.K. ROWLING"+"\nB] J.R.R. TOLKIEN"+"\nC] GEORGE R.R. MARTIN"+"\nD] C.S. LEWIS");
    System.out.print("Ans:");
    String ans10=sc.nextLine();
    if(ans10.equals("A"))                  //or we can use if(ans1=="B")
    {
        //System.out.println("correct Ans");
        score++;
    } 
    // else{
    //     System.out.println("wrong option");
    // }
            break;

            case "c" : System.out.println("1) WHAT IS THE SMALLEST COUNTRY IN THE WORLD ?");
            System.out.println("A] MONACO"+"\nB] VATICAN CITY"+"\nC] SAN MARION"+"\nD] LIECHTENSTEIN");
            System.out.print("Ans:");
            String ans11=sc.nextLine();
            if(ans11.equals("B"))                //or we can use if(ans1=="B")
            {
                //System.out.println("correct Ans");
                score++;
            }
            // else{
            //     System.out.println("wrong option");
            // }
           
    
            System.out.println("2) WHICH IS THE TALLEST MOUNTAIN IN THE WORLD ?");
            System.out.println("A] MOUNT KILIMANJARO"+"\nB] MOUNT EVEREST"+"\nC] MOUNT FUJI"+"\nD] MOUNT Mckinley");
            System.out.print("Ans:");
            String ans12=sc.nextLine();
            if(ans12.equals("b"))               //or we can use if(ans1=="B")
            {
               // System.out.println("correct Ans");
                score++;
        }
        // else{
        //     System.out.println("wrong option");
        // } 
        
        System.out.println("3) WHO INVENTED THE LIGHT BULB ?");
        System.out.println("A] THOMAS EDISON"+"\nB] ALEXANDER GRAHAM BELL"+"\nC]  NIKOLA TESLA"+"\nD] ALBERT EINSTEIN");
        System.out.print("Ans:");
        String ans13=sc.nextLine();
        if(ans13.equals("A"))                  //or we can use if(ans1=="B")
        {
           // System.out.println("correct Ans");
            score++;
    } 
    // else{
    //     System.out.println("wrong option");
    // }
    
    System.out.println("4) WHAT IS THE CURRENCY IN JAPAN ?");
    System.out.println("A] YEN"+"\nB] YUAN"+"\nC] EURO"+"\nD] DOLLAR");
    System.out.print("Ans:");
    String ans14=sc.nextLine();
    if(ans14.equals("A"))                    //or we can use if(ans1=="B")
    {
        //System.out.println("correct Ans");
        score++;
    } 
    // else{
    //     System.out.println("wrong option");
    // }
    
    System.out.println("5) HOW MANY CONTINENTS IN THE WORLD ?");
    System.out.println("A] 6"+"\nB] 7"+"\nC] 5"+"\nD] 8");
    System.out.print("Ans:");
    String ans15=sc.nextLine();
    if(ans15.equals("B"))                  //or we can use if(ans1=="B")
    {
        //System.out.println("correct Ans");
        score++;
    } 
    // else{
    //     System.out.println("wrong option");
    // }
            break;

        }
         System.out.println("your score is "+ score +" out of 5");

         if(score==1)
         System.out.println(Name +" won Rs 1000 ");
         else if(score==2)
         System.out.println(Name +" won Rs 2000");
         else if(score==3)
         System.out.println(Name +" won Rs 3000");
         else if(score==4)
         System.out.println(Name +" won Rs 4000");
         else if(score==5)
         System.out.println(Name +" won Rs 5000");
         else
         System.out.println("better luck next time");


        if(score<=5)
        System.out.println("Ruppes are transfer in " + Name + "account at : "+dt);
}
}

