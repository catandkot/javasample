package Sixth;

public class exampleUseful {
    int no; int age; String name; char gender;
    public int getNo() { return no; }
    public int getAge() { return age; }
    public String getName() { return name; }
    public char getGender() { return gender; }
    /* public void setNo(int no) { this.no = no; }
    public void setAge(int age) { this.age = age; }
    public void setName(String name) { this.name = name; }
    public void setGender(char gender) {this.gender = gender;} */

    public exampleUseful(int no, int age, String name, char gender) {
        super();
        this.no = no;
        this.age = age;
        this.name = name;
        this.gender = gender;

    }
    public boolean nameFinder(String searchString) {
        return this.name.contains(searchString);
    }
    public boolean genderChecker(String searchString) {
        return this.gender == searchString.charAt(0);
    }
    public boolean ageChecker(int searchString) {
        return this.age < searchString;
    }

    public static void main(String[] args) {
        exampleUseful[] people = new exampleUseful[4];
        people[0] = new exampleUseful(1, 20, "김소망", 'M');
        people[1] = new exampleUseful(2, 21, "박희망", 'F');
        people[2] = new exampleUseful(3,19,"송대길",'M');
        people[3] = new exampleUseful(4,15,"박소망",'F');

        System.out.println("현재 배열에 저장된 사람 수는 "+ people.length +"명 입니다.");
        System.out.println("배열에 저장된 사람중 이름에 박이 포함된 사람은");
        boolean found = false;

        for (exampleUseful person : people) {
            if (person.nameFinder("박")) {
                System.out.print("\""+person.getName() + "\" ");
                found = true;
            }
        }

        if (!found) {
            System.out.println("없습니다.");
        } else {
            System.out.println("이 있습니다.");
        }

        System.out.print("배열에 저장된 사람 중 이름에 송이 포함된 사람은 ");
        int count=0;
        for (exampleUseful person : people) {
            if (person.nameFinder("송")) {
                count++;
            }
        }
        System.out.println(count+"명 있습니다.");

        System.out.print("배열에 저장된 사람중 남성은 ");
        count=0;
        for (exampleUseful person : people) {
            if (person.genderChecker("M")) {
                count++;
            }
        }
        System.out.println(count+"명 있습니다.");

        System.out.println("배열에 저장된 사람 중 20세 미만인 사람은 ");
        count=0;
        for (exampleUseful person : people) {
            if (person.ageChecker(20)) {
                count++;
            }
        }
        System.out.println(count+"명 있습니다.");



        /*
        example people = new example(1,20,"김소망",'F');
        System.out.println(people.getNo() + "번, " + people.getAge()+ "세, " + people.getName() + ", " + people.getGender());
        */
    }

}
