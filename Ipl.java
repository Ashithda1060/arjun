class Ipl{

static String []teamName=new String[5];

public static void main(String args[]){
  teamName[0]="RCB  " ;  
  teamName[1]="MI  " ; 
  teamName[2]="CSK  " ; 
  teamName[3]="DC  " ; 
  teamName[4]="KXIP  " ; 
getTeamName();
  }


public static void getTeamName(){
System.out.println(teamName.length);
 for(int z=0; z<teamName.length;  z++){
   System.out.print(teamName[z]  + "");
      }
   
  }   
} 
   