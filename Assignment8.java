// create class Teacher
public class Teacher{
    int regId;
    String name;
    String Subject_Taught;
    public Teacher(int regId,String name,String Subject_Taught){
        this.regId = regId;
        this.name = name;
        this.Subject_Taught = Subject_Taught;
         }
    public int getregId(){
        return regId;
    }
    public String getname(){
        return name;
    }
    public String getSubject_Taught(){
        return Subject_Taught;
    }
    
  
    public static void main(String[] args){
         Teacher s1 = new Teacher(202,"Shreya","Maths");
         System.out.println(s1.getregId());
         System.out.println(s1.getname());
         System.out.println(s1.getSubject_Taught());

 	}
 }