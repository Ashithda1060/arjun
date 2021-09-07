class Watch{

static String []watchName=new String[5];

public static void main(String args[]){
watchName[0]="sonata  " ; 
watchName[1]="titan  " ;  
watchName[2]="HMT  " ;  
watchName[3]="Roadstar  " ;  
watchName[4]="Wrogn  " ;   
getWatchName();
  }


public static void getWatchName(){
System.out.println(watchName.length);
 for(int z=0; z<watchName.length;  z++){
   System.out.print(watchName[z]  + "");
      }
   
  }   
} 
   