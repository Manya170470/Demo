public class first {
    public static void main(String[] args) {
        Student Student1 = new Student();
        System.out.println(Student1.rno);
        Student1.greeting();
        Student Student2 = new Student("Rahul", 15, 55.6f);
        System.out.println(Student2.name);
        Student1.change_name("youtuber");
        System.out.println(Student1.name);
        
    }
}
    class Student{
            int rno;
            String name;
            float marks;

            //default constructor
            Student(){
                this.name = "Kunal";
                this.rno = 13;
                this.marks = 84.3f;
            }
            
            //parameterized constructor with different parameter name (can be of teh same name as well)
            Student(String naam, int roll, float mark ){
                this.rno = roll;
                this.name = naam;
                this.marks = mark;
            }
            void greeting(){
                System.out.println("Hello! this is" + " " + this.name);
            }

            void change_name(String othername){
                this.name = othername;
            }
        }
    

