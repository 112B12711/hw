class Part {
    int cost;

    int getCost() {
        return cost;
    }
}

class LCD extends Part {
    LCD(int size) {
        if (size == 10)
            cost = 2000;
        else if (size == 15)
            cost = 2500;
        else if (size == 17)
            cost = 3000;
    }
}

class CPU extends Part {
    CPU(double speed) {
        if (speed == 1.66)
            cost = 6000;
        else if (speed == 2.2)
            cost = 8000;
        else if (speed == 2.4)
            cost = 11000;
    }
}

class HD extends Part {
    HD(int size) {
        if (size == 120)
            cost = 2400;
        else if (size == 160)
            cost = 2800;
    }
}

class Note {
    LCD lcd;
    CPU cpu;
    HD hd;

    Note(LCD lcd, CPU cpu, HD hd) {
        this.lcd = lcd;
        this.cpu = cpu;
        this.hd = hd;
    }

    int getPartCost() {
        return lcd.getCost() + cpu.getCost() + hd.getCost();
    }

    double getCost() {
        return getPartCost() * 1.4;
    }

    double getPrice() {
        return getPartCost() * 2;
    }
}

class MiniNote extends Note {
    MiniNote() {
        super(new LCD(10), new CPU(1.66), new HD(120));
    }
}

class Note15 extends Note {
    Note15() {
        super(new LCD(15), new CPU(2.2), new HD(160));
    }
}

class JPA06_1 {
    public static void main(String args[]) {
        MiniNote mininote = new MiniNote();
        System.out.println("MiniNote cost:" + mininote.getCost() + ", price:" + mininote.getPrice());
        Note15 note15 = new Note15();
        System.out.println("Note15 cost:" + note15.getCost() + ", price:" + note15.getPrice());
    }
}
