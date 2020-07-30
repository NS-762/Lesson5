public class Cat extends Animal { //задание 5

    private int appetite;
    private int bowl;
    private boolean hunger = false;

    public Cat(int distanceRun, double distanceJump, int maxDistanceRun, double maxDistanceJump, int appetite) {
        super(distanceRun, distanceJump, maxDistanceRun, maxDistanceJump);
        this.appetite = appetite;
    }

    public void setBowl(int food) { // наполнение миски, задание 1-5
        this.bowl += food;
    }

    public void getBowl() { // задание 1-5
        System.out.println("Кол-во еды в миске: " + bowl);
    }

    public int getAppetite() { // задание 1-5
        return appetite;
    }

    public void eatUp() { // задание 1-5
        if ((bowl - appetite) >= 0) {
            hunger = true;
            bowl -= appetite;
            System.out.println("Кот поел. Кол-во еды в миске стало: " + bowl);
        } else {
            System.out.println("Не хватает еды в миске");
        }
    }

    @Override
    public void swim() {
            System.out.println("Коты не умеют плавать");
    }
}