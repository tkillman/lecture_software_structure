package facade_pattern;

class CPU {

    public void freeze() {
        System.out.println("CPU freeze");
    }

    public void jump(long position) {
        System.out.println("CPU jump to " + position);
    }

    public void execute() {
        System.out.println("CPU execute");
    }
}

// Subsystem 2
class Memory {

    public void load(long position, byte[] data) {
        System.out.println("Memory load at " + position);
    }
}

// Subsystem 3
class HardDrive {

    public byte[] read(long lba, int size) {
        System.out.println("HardDrive read");
        return new byte[size];
    }
}
