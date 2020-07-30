public abstract class Animal {

    protected int distanceRun;
    protected double distanceJump;
    protected int maxDistanceRun;
    protected double maxDistanceJump;

    public Animal(int distanceRun, double distanceJump, int maxDistanceRun, double maxDistanceJump) {
        this.distanceRun = distanceRun;
        this.distanceJump = distanceJump;

        this.maxDistanceRun = maxDistanceRun;
        this.maxDistanceJump = maxDistanceJump;
    }

    public void run() {
        if (distanceRun < maxDistanceRun)
            System.out.println("run: true");
        else
            System.out.println("run: false");
    }

    public void jump() {
        if (distanceJump < maxDistanceJump)
            System.out.println("jump: true");
        else
            System.out.println("jump: false");
    }

    public abstract void swim();
}
