public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри Поттер", 99, 88, 77, 66, 55);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 22, 33, 44, 55, 66);
        Gryffindor ron = new Gryffindor("Рон Уизли", 11, 22, 33, 44, 55);

        System.out.println();
        System.out.println(harry.toString());
        System.out.println(hermione.toString());
        System.out.println(ron.toString());

        Puffenduy zakharia = new Puffenduy("Захария Смит", 99, 88, 77, 66, 55);
        Puffenduy cedric = new Puffenduy("Седрик Диггори", 22, 33, 44, 55, 66);
        Puffenduy justin = new Puffenduy("Джастин Финч-Флетчли", 11, 22, 33, 44, 55);

        System.out.println();
        System.out.println(zakharia.toString());
        System.out.println(cedric.toString());
        System.out.println(justin.toString());

        Kogtevran chjow = new Kogtevran("Чжоу Чанг", 99, 88, 77, 66, 55, 44);
        Kogtevran padma = new Kogtevran("Падма Патил", 22, 33, 44, 55, 66, 55);
        Kogtevran marcus = new Kogtevran("Маркус Белби", 11, 22, 33, 44, 55, 44);

        System.out.println();
        System.out.println(chjow.toString());
        System.out.println(padma.toString());
        System.out.println(marcus.toString());

        Slytherin drako = new Slytherin("Драко Малфой", 99, 88, 77, 66, 55, 44, 33);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 22, 33, 44, 55, 66, 55, 44);
        Slytherin gregory = new Slytherin("Грегори Гойл", 11, 22, 33, 44, 55, 44, 33);


        System.out.println();
        System.out.println(drako.toString());
        System.out.println(graham.toString());
        System.out.println(gregory.toString());


    }

}