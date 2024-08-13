package nithaj;

public class Dog {
	String name;
	String breed;
	
	Dog(String name , String breed){
		this.name=name;
		this.breed=breed;
	}
	void setname(String name) {
		this.name=name;
	}
	void setbreed(String breed) {
		this.breed=breed;
	}
	String getname() {
		return name;
	}
	String getbreed() {
		return breed;
	}
	void display() {
		System.out.println("dog is "+ name +" "+ "breed is " + breed);
	}

	public static void main(String[] args) {
      Dog obj=new Dog("Tommy","rajapalayam");
      obj.display();
      obj.setname("dommy");
      obj.setbreed("Begel");
      obj.display();
     
	}

}
