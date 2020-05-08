public class Person {

	String name;

    String address;

    

    //Constructor

    public Person (String name, String address) {

        this.name = name;

        this.address = address;
                }

    //Métodos

    public String getName () { 
    	return name;  
    	}

    public String getAddress () { 
    	return address;  
    	}

    public void SetAddress (String address) { 
    	this.address=address;  
    	}
    
    public String toString() {
    	return name+"("+address+")";
    }

}