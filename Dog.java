public class Dog{
    private String name;
    public int age;
    public static String genus; 
  
    public Dog(String name, int input_age){
      this.name = name;
      age = input_age;
    }

    void bark(){
        System.out.println("brak"); 
    }

    public String getname(){
        return name;  
    }
    public String setname(String x){
        name= x; 
        return name; 
    }
    public static String family(){
        return "The dog is from the family " + genus; 
    }
    public void set_genus(String genus){
        Dog.genus=genus; 
    }
}  

class Doghose{
    static Dog obj= new Dog("Jow", 9);
    
    public static void main(String args[]){
       System.out.println(obj.getname()); 
       obj.setname("jowles"); 
       System.out.println(obj.getname()); 
       obj.set_genus("cainus"); 
       System.out.println(Dog.family()); 
       System.out.println(Dog.genus); 
    }
}
