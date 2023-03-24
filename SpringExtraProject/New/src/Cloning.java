class Abc implements Cloneable{ // implements cloneable for security purposes
	int id;
	int phone;
	Abc(int id,int phone){
		this.id = id;
		this.phone = phone;
		
	}
	
	public Object clone() {
		try {
			return super.clone();
		}catch(CloneNotSupportedException e) {
			
		}
		return null;
	}
}
public class Cloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abc obj = new Abc(1,100);
		Abc obj1 = obj;
		obj1.id = 5;
		System.out.println(obj.id); // change in obj should be reflected as it is shallow copy
		// deep copy
		Abc obj3 = new Abc(obj.id,obj.phone); // deep copy it increses the lines of code and decreases readability
		obj3.id = 6;
		System.out.println(obj.id); // id will remain 5  for obj--> doesn't changes to 6
		
		// we need the mixture of both 
		Abc obj6 = (Abc) obj.clone(); // this cant be directly accessed as its protected in the object class override
		obj6.id = 10;
		System.out.println(obj.id); // shouldn't be 10
		
		
		
		
		
		

	}

}
