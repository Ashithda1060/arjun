class Airport{

static String []airportName=new String[5];

public static void main(String args[]){
 airportName[0]="Kingfisher  ";  
airportName[1]="Indigo  ";  
airportName[2]="spicejet  ";  
airportName[3]="Airindia  ";  
airportName[4]="jetair  ";  
getAirportName();
  }


public static void getAirportName(){
System.out.println(airportName.length);
 for(int z=0;z<airportName.length;  z++){
   System.out.print(airportName[z]  + "");
      }
   
  }   
} 
   