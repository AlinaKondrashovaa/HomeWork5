package Task;

public class Cat {
    private String name;
    private int appetite;
    private boolean satisfied;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satisfied = false;
    }
    public void eat(Plate p) {
        if(p.getFood() - appetite >=0 && !satisfied) {
            p.decreaseFood(appetite);
            this.satisfied = true;
        } else {
            System.out.println("Еды в миске меньше, чем аппетит котика :c, или он уже сыт :)");
        }
    }

    public boolean isSatisfied() {
        return satisfied;
    }

    public void setSatisfied(boolean satisfied) {
        this.satisfied = satisfied;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }
}
