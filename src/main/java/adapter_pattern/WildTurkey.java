package adapter_pattern;

class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void jump() {
        System.out.println("I can fly in short distance");
    }
}
