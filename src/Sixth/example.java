package Sixth;

public class example {
    int no; int age; String name; char gender;
    public int getNo() { return no; }
    public int getAge() { return age; }
    public String getName() { return name; }
    public char getGender() { return gender; }
    public void setNo(int no) { this.no = no; }
    public void setAge(int age) { this.age = age; }
    public void setName(String name) { this.name = name; }
    public void setGender(char gender) {this.gender = gender;}

    public example (int no, int age, String name, char gender) {
        super();
        this.no = no;
        this.age = age;
        this.name = name;
        this.gender = gender;

    }

    public static void main(String[] args) {
        example people = new example(1,20,"김소망",'F');
        System.out.println(people.getNo() + "번, " + people.getAge()+ "세, " + people.getName() + ", " + people.getGender());
    }

}
