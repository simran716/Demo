package phase1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

 class TicketBooking1 {
	
		 static boolean isValid(String s)
		{
		      
		    Pattern p = Pattern.compile("[a-zA-Z0-9][@#$%^&]");
		    Matcher m = p.matcher(s);
		    return (m.find() && m.group().equals(s));
		}
		    static Scanner sc=new Scanner(System.in);
			static String[] movielist={"1) ABC--------Rs.300\n", "2) MNP-------Rs.350\n ","3) XYZ-------Rs.400"};
			static String[] rowlist={"1) A row\n","2) B row\n","3) C row\n","4) D row\n","5) E row\n","6) F row"};
		    static String[] datelist={"1)21-08-2022\n", "2)22-08-2022\n","3)23-08-2022\n","4)24-08-2022\n","5)25-08-2022"};
		    static String[] timelist={"1) 9am till 12pm\n", "2) 1pm till 4pm\n","3) 6pm till 9pm"};
		    static String[] seatlist={"1) 1\n", "2) 2\n","3) 3\n","4) 4\n", "5) 5\n","6) 6\n","7) 7\n", "8) 8\n","9) 9\n","10) 10\n"};
		    static String[] optionlist={"1) Yes\n","2)No"};
			static String name;
			static int movie,date,seat1,time,row,seat,option,price,row1;
			
			public static void selectmovie(){
				System.out.println("Please select one movie:- ");
				for(int i=0; i<movielist.length;i++){
					System.out.println(movielist[i]);
				}
				movie=sc.nextInt();
				System.out.println("You selected movie "+movielist[movie-1].substring(3,movielist[movie-1].length()));
				if(movie==1){
					 price = 300;
					System.out.println("The price of this movie is:- "+price);
				}
				else if(movie==2){
					 price = 350;
					System.out.println("The price of this movie is:- "+price);
				}
				else if(movie==3){
					 price = 400;
					System.out.println("The price of this movie is:- "+price);
				}
				
				selectdate();
			}
			public   static void selectdate(){
				System.out.println("Select one date :-");
				for(int i=0; i<datelist.length;i++){
					System.out.println(datelist[i]);
					
				}
				date=sc.nextInt();
				System.out.println("You selected movie "+datelist[date-1].substring(3,datelist[date-1].length()));
				selecttime();
			}
			public  static void selecttime(){
				System.out.println("Select time slot :-");
				for(int i=0; i<timelist.length;i++){
					System.out.println(timelist[i]);
					
				}
				time=sc.nextInt();
				System.out.println("You selected time "+timelist[time-1].substring(3,timelist[time-1].length()));
				selectRow();
			}
			public static void selectRow(){
				System.out.println("Select one row  :-");
				for(int i=0; i<rowlist.length;i++){
					System.out.println(rowlist[i]);
				}
				row =sc.nextInt();
				for(int i=0; i<rowlist.length;i++){
					if(row==seatlist.length){
						System.out.println("This row is already booked select another ");
					}
				}
				System.out.println("You selected row "+rowlist[row-1].substring(3,rowlist[row-1].length()));
				selectseat();
				
			}
			public static void selectseat(){
				System.out.println("Select one seat  :-");
				for(int i=0; i<seatlist.length;i++){
					System.out.println(seatlist[i]);
				}
				seat1=seat1+seat;
				seat =sc.nextInt();
				for(int i=0; i<seatlist.length;i++){
					if(seat==seat1){
						System.out.println("This seat is already booked select another ");
					}
				}
				System.out.println("You selected seat "+seatlist[seat-1].substring(3,seatlist[row-1].length()));
				selectChoice();
				
			}
			
			public static void selectChoice(){
				System.out.println("Do you want to book another seat:- ");
				for(int i=0; i<optionlist.length;i++){
					System.out.println(optionlist[i]);
					
				}
				int count=1;
				option=sc.nextInt();
				System.out.println("You have selected number "+option+" otion");
			    if(option==1){
			    	System.out.println("You entered yes");
			    	count=count+1;
			    	System.out.println("Hence number of user are:- "+count);
			    	selectRow();
			    }
			    else{
			    	System.out.println("Hence number of user are:- "+count);
			    	//  totalprice=count*price;
			    	System.out.println("Hence total price is:- "+(count*price));
			    	return;
			    }
			
			}

	public static void main(String[] args) {
		System.out.println("Are you an user or admin:-");
		Scanner sc = new Scanner(System.in);
		String check = sc.nextLine();
		if(check.equals("Admin")||check.equals("admin")){
			System.out.println("You entered as an admin.");
			System.out.println("Do you want to change you password:-");
			String value=sc.nextLine();
			if(value.equals("Yes")||value.equals("yes")){
				System.out.println("Please enter your new password:- ");
			    String s =sc.nextLine();
			    if (isValid(s)) 
			        System.out.println("Password changed!");     
			    else
			        System.out.println("Please enter a valid Password");     
			}
			else{
				return;
			}
			}
		else if(check.equals("user")|| check.equals("User")){
			System.out.println("You entered as a user");
			 char ch = 0;
		        do{
		            System.out.println("Select any one option:-");
		            System.out.println("1. Select the  movie");
		            System.out.println("2. Select date ");
		            System.out.println("3. Select time ");
		            System.out.println("4. Select the row(A-F)");
		            System.out.println("5. Select the seats(1-10)");
		            System.out.println("6. Do you want to book another seat?");
		            int choice = sc.nextInt();
		            switch (choice)
		            {
		            case 1 : 
		                TicketBooking1.selectmovie();       
		                 break;           
		            case 2 : 
		            	TicketBooking1.selectdate();
		                break;       
		            case 3 : 
		            	TicketBooking1.selecttime();
		                break;   
		            case 4 : 
		            	TicketBooking1.selectRow();
		                break;                            
		            case 5 : 
		            	TicketBooking1.selectseat();
		                break; 
		            case 6 : 
		            	TicketBooking1.selectChoice();
		                break; 
		                                                    
		            default : System.out.println("Wrong Entry \n ");
		                break;
		            }
		        } while (ch == 'Y'|| ch == 'y');          
			}
			}
	}