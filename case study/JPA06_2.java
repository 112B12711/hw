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

abstract class PCandMultiPC {
    CPU cpu;
    HD hd;
    int cpuQuantity; // CPU 的數量
    int hdQuantity; // HD 的數量

    PCandMultiPC(CPU cpu, HD hd, int cpuQuantity, int hdQuantity) {
        this.cpu = cpu;
        this.hd = hd;
        this.cpuQuantity = cpuQuantity;
        this.hdQuantity = hdQuantity;
    }

    int getPartCost() { // 零件成本
        return cpu.getCost() * cpuQuantity + hd.getCost() * hdQuantity;

    }

    abstract double getCost();

    double getPrice() {
        return getPartCost() * 1.8;
    }
}

class PC extends PCandMultiPC {
    PC() {
        super(new CPU(2.4), new HD(160), 1, 1);
    }

    double getCost() {
        return getPartCost() + 500;
    }
}

class MultiPC extends PCandMultiPC {
    MultiPC(int cpuQuantity, int hdQuantity) {
        super(new CPU(2.4), new HD(160), cpuQuantity, hdQuantity);
    }

    double getCost() {
        return getPartCost() * 1.2;
    }
}

class JPA06_2 {
    public static void main(String args[]) {
        PC pc = new PC();
        System.out.println("PC cost:" + pc.getCost() + ", price:" + pc.getPrice());
        MultiPC multipc1 = new MultiPC(2, 4);
        System.out.println(
                "MultiPC: 2CPU, 4HD, cost:" + multipc1.getCost() + ", price:" + multipc1.getPrice());
        MultiPC multipc2 = new MultiPC(4, 8);

        System.out.println(
                "MultiPC: 4CPU, 8HD, cost:" + multipc2.getCost() + ", price:" + multipc2.getPrice());
    }
}
