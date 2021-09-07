class Car{

static String []brandName= new String[5];

 public static void main(String a[]){

  brandName[0]="Hyundai  ";
 brandName[1]="Toyota  ";
 brandName[2]="Honda  ";
 brandName[3]="Renault  ";
 brandName[4]="Ford  ";
 
 getBrandName();
  }


public static void getBrandName(){
System.out.println(brandName.length);
 for(int z=0;z<brandName.length;z++){
   System.out.print(brandName[z]  + "");
      }
   
  }   
} 
   