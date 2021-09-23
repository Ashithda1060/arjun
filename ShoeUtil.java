public class ShoeUtil {

	public static void main(String[] args) {

		Shoe specifications = new Shoe();
		specifications.brand = "PUMA";
		specifications.size = 10;
		specifications.color = "GREEN";
		specifications.occasion = "Casual";
		System.out.println(specifications.brand+"\n"+specifications.size+"\n"+specifications.color+"\n"+specifications.occasion);
		specifications.details();
		
		Shoe specifications1 = new Shoe();
		specifications1.brand = "ADIDAS";
		specifications1.size = 9;
		specifications1.color = "RED";
		specifications1.occasion = "Sports";
		System.out.println(specifications1.brand+"\n"+specifications1.size+"\n"+specifications1.color+"\n"+specifications1.occasion);
		specifications1.details();
		
		Shoe specifications2 = new Shoe();
		specifications2.brand = "NIKE";
		specifications2.size = 10;
		specifications2.color = "BLACK";
		specifications2.occasion = "Sports";
		System.out.println(specifications2.brand+"\n"+specifications2.size+"\n"+specifications2.color+"\n"+specifications2.occasion);
		specifications2.details();
	}

}