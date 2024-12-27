public class Elevator {
    private int currentFloor = 1;
    private int minFloor;
    private int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }

    public void moveUp() {
        this.currentFloor = currentFloor;
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }

    public void move(int floor) {
        while (true) {

            if (floor > currentFloor) {
                moveUp();
                System.out.println("Этаж " + getCurrentFloor());
                if (floor == currentFloor) {
                    break;
                } else if (currentFloor == maxFloor) {
                    System.out.println("Выше этажа " + maxFloor + " ничего нет...");
                    break;
                }
            }

            if (floor < currentFloor) {
                moveDown();
                System.out.println("Этаж " + getCurrentFloor());
                if (floor == currentFloor) {
                    break;
                } else if (currentFloor == minFloor) {
                    System.out.println("Ниже этажа " + minFloor + " ничего нет...");
                    break;
                }
            }

            if (floor == currentFloor) {
                System.out.println("Вы находитесь на этом этаже");
                break;
            }
        }
    }
}
