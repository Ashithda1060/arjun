public class LaptopUtil {

	public static void main(String[] args) {
		
		Laptop spec = new Laptop();
		
		spec.brand = "Dell";
		spec.modelName = "Inspiron 3501";
		spec.ramInGb = 4;
		spec.capacityInGb = 256;
		spec.series = "Inspiron";
		spec.color = "Silver";
		System.out.println(spec.brand+"\n"+spec.modelName+"\n"+spec.ramInGb+"\n"+spec.capacityInGb+"\n"+spec.series+"\n"+spec.color);
		spec.personalUse();
		
		Laptop spec1 = new Laptop();
		spec1.brand = "Realme Book";
		spec1.modelName = "RMNB1002";
		spec1.ramInGb = 8;
		spec1.capacityInGb = 512;
		spec1.series = "Book";
		spec1.color = "Real gray";
		System.out.println(spec1.brand+"\n"+spec1.modelName+"\n"+spec1.ramInGb+"\n"+spec1.capacityInGb+"\n"+spec1.series+"\n"+spec1.color);
		spec1.personalUse();
		
		Laptop spec2 = new Laptop();
		spec2.brand = "HP";
		spec2.modelName = "15-ec2004AX";
		spec2.ramInGb = 8;
		spec2.capacityInGb = 1000;
		spec2.series = "Pavillion";
		spec2.color = "Black";
		System.out.println(spec2.brand+"\n"+spec2.modelName+"\n"+spec2.ramInGb+"\n"+spec2.capacityInGb+"\n"+spec2.series+"\n"+spec2.color);
		spec2.personalUse();
				

	}

}