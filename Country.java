class Car{

static String []brandName= new String[5];

 public static void main(String a[]){

  brandName[0]="india";
 brandName[1]="india";
 brandName[2]="india";
 brandName[3]="india";
 brandName[4]="india";
 
 getBrandName();
  }


public static void getBrandName(){
System.out.print(brandName.length);
 for(int z=0;z<brandName.length;z++){
   System.out.print(brandName[z]  + "");
      }
   
  }   
} 
   