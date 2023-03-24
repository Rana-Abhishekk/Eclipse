class Ab{ // there can only be one public class in java
		
		int id ;
		int rollno;
		Ab(int id,int rollno){
			this.id = id;
			this.rollno = rollno;
			System.out.println(this.id);
			System.out.println(this.rollno);
		}
		
	}
public class HashcodeEquals {
	
	Integer id ;
	Integer rollno;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ab obj1 = new Ab(1,56);
		Ab obj2 = new Ab(1,56);
		Ab obj3 = obj1;
		System.out.println(obj1.equals(obj2));
		obj3.id=5;
		obj3.rollno = 6698;
		System.out.println(obj1.equals(obj3)); // gives true even if only refrences are pointing to same  objects the properties may be different
		
		System.out.println(obj1.hashCode());
		System.out.println(obj3.hashCode());
		
		
		
		
		
	}
	
	@Override// ----> doubt in this override
	public boolean equals(Object obj) {
		if(obj==null) return false;
		Ab ob = (Ab)obj;
		return (ob.id==this.id && ob.rollno==this.rollno);
	}
	
	// hashcode override
	// cloning ...shallow,deep
	@Override
    public int hashCode() {
        int hash = 5;
        hash =  hash + (this.id != null ? this.id.hashCode() : 0);
        hash =   hash + (this.rollno != null ? this.rollno.hashCode() : 0);
       
        return hash * 65;
    }
	

}

