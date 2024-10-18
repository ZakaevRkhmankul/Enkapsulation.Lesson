public class Main {
    public static void main(String[] args) {
//        University, School, Car жана Person деген класс тузунуз
//   Алардын свойстваларын ойлоп табыныз
//   Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
//   Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз
//   Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз

        Person person = new Person();


        System.out.print("\n1");
        person.setName("Rakhmankul");
        person.setLastname("Zhakaev");
        person.setAge(21);
        System.out.println(person.toString());

        System.out.print("\n2");
        person.setName("Ali");
        person.setLastname("Umarov");
        person.setAge(19);
        System.out.println(person.toString());

        System.out.print("\n3");
        person.setName("Emir");
        person.setLastname("Jumashov");
        person.setAge(14);
        System.out.println(person.toString());

        System.out.print("\n4");
        person.setName("Bilal");
        person.setLastname("Bekzatov");
        person.setAge(17);
        System.out.println(person.toString());

        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~");
        Car car = new Car();

        System.out.println("1");
        car.setModel("Mersedes-Bens");
        car.setColour("black");
        car.setYear(2003);
        System.out.println(car.toString());

        System.out.println("\n2");
        car.setModel("Honda");
        car.setColour("silver");
        car.setYear(2001);
        System.out.println(car.toString());

        System.out.println("3");
        car.setModel("Hunday Sonata");
        car.setColour("White");
        car.setYear(2017);
        System.out.println(car.toString());

        System.out.println("4");
        car.setModel("Tayota");
        car.setColour("red");
        car.setYear(2009);
        System.out.println(car.toString());

        University university =new University();
        university.setName("KGTU");
        university.setAddres("Ch.Aytmatov,66");
        university.setFolials(3);
        System.out.println(university.toString());

        university.setName("KGMA");
        university.setAddres("I.Achunbaev,92");
        university.setFolials(2);
        System.out.println(university.toString());

        university.setName("BGU");
        university.setAddres("Ch.Aytmatov,27");
        university.setFolials(1);
        System.out.println(university.toString());

        university.setName("AUZA");
        university.setAddres("Aaly Tocombaev,7/6");
        university.setFolials(1);
        System.out.println(university.toString());


        School school = new School();
        school.setNumber(14);
        school.setName("T.Baysalov");
        school.setStudents(350);
        System.out.println(school.toString());

        school.setNumber(84);
        school.setName("Tabyldy Aktanov");
        school.setStudents(1250);
        System.out.println(school.toString());

        school.setNumber(77);
        school.setName("Doolon Omursakov");
        school.setStudents(875);
        System.out.println(school.toString());

        school.setNumber(19);
        school.setName("Kojomkul");
        school.setStudents(1435);
        System.out.println(school.toString());
    }
}