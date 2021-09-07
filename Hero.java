class Hero{

static String []heroName= new String[5];

 public static void main(String a[]){

  heroName[0]="Uppi  ";
heroName[1]="Puneeth  ";
heroName[2]="Darshan  ";
heroName[3]="Sudeep  ";
heroName[4]="Yash  ";

 
 getHeroName();
  }


public static void getHeroName(){
System.out.println(heroName.length);
 for(int z=0;z<heroName.length;z++){
   System.out.print(heroName[z]  + "");
      }
   
  }   
} 
   