public class Monster {
    private int eyes, arms, legs, buttons;
    private String name;

    public Monster() {
        eyes = 2;
        arms = 2;
        legs = 2;
        buttons = 3;
        name = "Help";
    }

    public Monster (int eyes, int arms, int legs, int buttons, String name) {
        this.eyes = eyes;
        this.arms = arms;
        this.legs = legs;
        this.buttons = buttons;
        this.name = name;
    }

    public int getEyes() {
        return eyes;
    }

    public int getArms() {
        return arms;
    }

    public int getLegs() {
        return legs;
    }

    public int getButtons() {
        return buttons;
    }

    public String getName() {
        return name;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public void setArms(int arms) {
        this.arms = arms;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void setButtons(int buttons) {
        this.buttons = buttons;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String allToString() {
       return "Eyes: " + eyes + "\nArms: " + arms + "\nLegs: " + legs + "\nButtons: " + buttons + "\nName: " + name;
    }

    public static void main(String[] args) {
        Monster m1 = new Monster(2, 3, 2, 2, "Marshy");
        System.out.println(m1.allToString());
    }
}