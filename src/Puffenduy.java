public class Puffenduy extends Hogwarts {
    private int hardwork;
    private int loyalty;
    private int honesty;

    public Puffenduy(String name, int magic, int transgression, int hardwork, int loyalty, int honesty) {
        super(name, magic, transgression);
        this.hardwork = hardwork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardwork() {
        return hardwork;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", department=Puffenduy" +
                ", magic=" + getMagic() +
                ", transgression=" + getTransgression() +
                ", hardwork=" + hardwork +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty;
    }

}
