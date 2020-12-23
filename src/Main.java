public class Main {
    public static void main(String[] args) {
        Point point = new Point();
        MovablePoint movablePoint = new MovablePoint();

        movablePoint.setX(2);
        movablePoint.setY(4);
        movablePoint.setXSpeed(1);
        movablePoint.setYSpeed(1);

        System.out.println(movablePoint.toString());
        movablePoint.move();
        System.out.println(movablePoint.toString());

    }
}
