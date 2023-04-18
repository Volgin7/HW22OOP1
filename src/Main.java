import java.util.logging.Handler;

public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри Поттер", 99, 88, 77, 66, 55);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 22, 33, 44, 55, 66);
        Gryffindor ron = new Gryffindor("Рон Уизли", 11, 22, 33, 44, 55);
        compareStudents(ron, harry);

        Puffenduy zakharia = new Puffenduy("Захария Смит", 99, 88, 77, 66, 55);
        Puffenduy cedric = new Puffenduy("Седрик Диггори", 22, 33, 44, 55, 66);
        Puffenduy justin = new Puffenduy("Джастин Финч-Флетчли", 11, 22, 33, 44, 55);
        compareStudents(cedric, justin);

        Kogtevran chjow = new Kogtevran("Чжоу Чанг", 99, 88, 77, 66, 55, 44);
        Kogtevran padma = new Kogtevran("Падма Патил", 22, 99, 44, 55, 66, 55);
        Kogtevran marcus = new Kogtevran("Маркус Белби", 11, 22, 33, 44, 55, 44);
        compareStudents(padma, marcus);

        Slytherin drako = new Slytherin("Драко Малфой", 99, 88, 77, 66, 55, 44, 33);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 22, 33, 44, 55, 66, 55, 44);
        Slytherin gregory = new Slytherin("Грегори Гойл", 11, 22, 33, 44, 55, 44, 33);
        compareStudents(drako, gregory);

        compareAnyStudents(drako, padma);
        compareAnyStudents(harry, marcus);

    }

    public static void compareStudents(Gryffindor studentOne, Gryffindor studentTwo) {
        int sumOne = studentOne.getBravery() + studentOne.getHonor() + studentOne.getNobility();
        int sumTwo = studentTwo.getBravery() + studentTwo.getHonor() + studentTwo.getNobility();

        if(sumOne > sumTwo) {
            System.out.println(studentOne.getName() + " лучший Гриффиндорец, чем " +  studentTwo.getName());
        } else if (sumOne < sumTwo) {
            System.out.println(studentTwo.getName() + " лучший Гриффиндорец, чем " +  studentOne.getName());
        } else {
            System.out.println(studentTwo.getName() + " такой же Гриффиндорец, как и " +  studentOne.getName());
        }
    }

    public static void compareStudents(Puffenduy studentOne, Puffenduy studentTwo) {
        int sumOne = studentOne.getHardwork() + studentOne.getHonesty() + studentOne.getLoyalty();
        int sumTwo = studentTwo.getHardwork() + studentTwo.getHonesty() + studentTwo.getLoyalty();

        if(sumOne > sumTwo) {
            System.out.println(studentOne.getName() + " лучший Пафендуец, чем " +  studentTwo.getName());
        } else if (sumOne < sumTwo) {
            System.out.println(studentTwo.getName() + " лучший Пафендуец, чем " +  studentOne.getName());
        } else {
            System.out.println(studentTwo.getName() + " такой же Пафендуец, как и " +  studentOne.getName());
        }
    }

    public static void compareStudents(Kogtevran studentOne, Kogtevran studentTwo) {
        int sumOne = studentOne.getCreativity() + studentOne.getIntelligence() + studentOne.getWisdom() + studentOne.getWit();
        int sumTwo = studentTwo.getCreativity() + studentTwo.getIntelligence() + studentTwo.getWisdom() + studentTwo.getWit();

        if(sumOne > sumTwo) {
            System.out.println(studentOne.getName() + " лучший Когтевранец, чем " +  studentTwo.getName());
        } else if (sumOne < sumTwo) {
            System.out.println(studentTwo.getName() + " лучший Когтевранец, чем " +  studentOne.getName());
        } else {
            System.out.println(studentTwo.getName() + " такой же Когтевранец, как и " +  studentOne.getName());
        }
    }

    public static void compareStudents(Slytherin studentOne, Slytherin studentTwo) {
        int sumOne = studentOne.getAmbition() + studentOne.getAuthority() + studentOne.getCunning() + studentOne.getDetermination() + studentOne.getResourcefulness();
        int sumTwo = studentTwo.getAmbition() + studentTwo.getAuthority() + studentTwo.getCunning() + studentTwo.getDetermination() + studentTwo.getResourcefulness();


        if(sumOne > sumTwo) {
            System.out.println(studentOne.getName() + " лучший Слизеринец, чем " +  studentTwo.getName());
        } else if (sumOne < sumTwo) {
            System.out.println(studentTwo.getName() + " лучший Слизеринец, чем " +  studentOne.getName());
        } else {
            System.out.println(studentTwo.getName() + " такой же Слизеринец, как и " +  studentOne.getName());
        }
    }

    public static void compareAnyStudents(Hogwarts studentOne, Hogwarts studentTwo) {
        if(studentOne.getMagic() > studentTwo.getMagic()) {
            System.out.println(studentOne.getName() + " обладает большей магией, чем " +  studentTwo.getName());
        } else if (studentOne.getMagic() < studentTwo.getMagic()) {
            System.out.println(studentTwo.getName() + " обладает большей магией, чем " +  studentOne.getName());
        } else {
            System.out.println(studentTwo.getName() + " обладает такой же магией, как и " +  studentOne.getName());
        }

        if(studentOne.getTransgression() > studentTwo.getTransgression()) {
            System.out.println(studentOne.getName() + " обладает большей трансгрессией, чем " +  studentTwo.getName());
        } else if (studentOne.getTransgression() < studentTwo.getTransgression()) {
            System.out.println(studentTwo.getName() + " обладает большей рансгрессией, чем " +  studentOne.getName());
        } else {
            System.out.println(studentTwo.getName() + " обладает такой же рансгрессией, как и " +  studentOne.getName());
        }


    }



}