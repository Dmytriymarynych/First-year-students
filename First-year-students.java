// Haпишите программу "Первокурсники":
// В программе должны быть созданы классы: студенты, профессор, группа (по желанию классы можно добавлять)
// Дизайн классов (их поля, взаимосвязи) - также Ваша задача;
// Студенты должны уметь выбрать Старосту по личным качествам одногруппников (правила отбора определяете Вы).
// Программа должна выводить старостой группы в консоль;
// Профессор должен уметь провести перекличку и определить, все ли студенты присутствуют (результат выводится в консоль)


public class Solution {
    public static void main(String[] args) {
        Proffesor proffesor = new Proffesor();
        Student student = new Student();
        Student1 student1 = new Student1();
        Student2 student2 = new Student2();
        Student3 student3 = new Student3();
        student1.course();
        student2.course();
        student3.course();
        Group group = new Group();
        group.choseLeader();
        proffesor.checkPresence( );

    }
    public static class Group{

        public void choseLeader(  ){
            if ( Student1.mark>=5){
                if(Student1.age>19){
                    System.out.println(Student1.name+" - староста групи.");
                }}
              else  if ( Student2.mark>=5){
                    if(Student2.age>19){
                        System.out.println(Student2.name+" - староста групи.");
                    }}
        else if (Student3.mark>=5){
                if(Student3.age>19) {
                    System.out.println(Student3.name + " - староста групи.");
                }}

                    }
    }
    
    public static class Student{
        public  String course( String course){
             course = "курс";
       return course; }

       public int year =0;

    }

    public static class Student1  extends Student{

        public  String course(){
            System.out.println(name+" - "+(super.year+1)+" "+super.course("1 курс"));
            return name+"-"+super.course("1 курс");
        }

        private static  boolean presence = true;
        private static String name = "Wasyl";
        private  static int age = 22;
        private  static int mark = 5;
    }
    
    public static class Student2 extends Student{
        public  String course(){
            System.out.println(name+" - "+(super.year+1)+" "+super.course("1 курс"));
            return name+"+"+super.course("1 курс");
        }
        private  static String name = "Igor";
        private  static int age = 19;
        private  static int mark = 4;
        private   static  boolean presence = true;
    }
    
    public static class Student3 extends Student{
        public  String course(){
               System.out.println(name+" - "+(super.year+1)+" "+super.course("1 курс"));
            return name+super.course("1 курс");
        }
        static String name = "Oleg";
      private   static int age = 21;
        private  static int mark = 3;
        private static boolean presence = false;
    }
    
    public static class Proffesor {
        public void checkPresence( ) {
            int count=0;
            if(Student3.presence ==true) {
                count++;
            }
            if(Student1.presence ==true) {
                count++;
            }
            if(Student2.presence==true) {
                count++;
            }

            if(count>=3) {
                System.out.println("Всi присутнi.");
            }
            else
                System.out.println("Не всi присутнi.");
        }
    }
}
