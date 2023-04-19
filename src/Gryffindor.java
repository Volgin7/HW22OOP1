public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int magic, int transgression, int nobility, int honor, int bravery) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getBravery() {
        return bravery;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", department=Gryffindor" +
                ", magic=" + getMagic() +
                ", transgression=" + getTransgression() +
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery;
    }

    public void compare(Gryffindor student) {
        int sumThis = this.getBravery() + this.getHonor() + this.getNobility();
        int sumStudent = student.getBravery() + student.getHonor() + student.getNobility();

        if(sumThis > sumStudent) {
            System.out.println(this.getName() + " лучший Гриффиндорец, чем " +  student.getName());
        } else if (sumThis < sumStudent) {
            System.out.println(student.getName() + " лучший Гриффиндорец, чем " +  this.getName());
        } else {
            System.out.println(student.getName() + " такой же Гриффиндорец, как и " +  this.getName());
        }
    }
}
