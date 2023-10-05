import java.util.Scanner;

public class RobotNavigation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading grid coordinates
        String[] gridInput = scanner.nextLine().split(" ");
        int maxX = Integer.parseInt(gridInput[0]);
        int maxY = Integer.parseInt(gridInput[1]);

        // Reading robot's initial position and orientation
        String[] initialPositionInput = scanner.nextLine().split(" ");
        int initialX = Integer.parseInt(initialPositionInput[0]);
        int initialY = Integer.parseInt(initialPositionInput[1]);
        char initialOrientation = initialPositionInput[2].charAt(0);

        // Reading navigation instructions
        String instructions = scanner.nextLine();

        // Closing the scanner
        scanner.close();

        // Perform navigation
        navigateRobot(maxX, maxY, initialX, initialY, initialOrientation, instructions);
    }

    private static void navigateRobot(int maxX, int maxY, int x, int y, char orientation, String instructions) {
        for (char instruction : instructions.toCharArray()) {
            switch (instruction) {
                case 'L':
                    orientation = turnLeft(orientation);
                    break;
                case 'R':
                    orientation = turnRight(orientation);
                    break;
                case 'M':
                    int[] newPosition = moveForward(x, y, orientation);
                    x = newPosition[0];
                    y = newPosition[1];
                    break;
                default:
                    System.out.println("Invalid instruction: " + instruction);
            }
        }

        // Print the final position
        System.out.println(x + " " + y + " " + orientation);
    }

    private static char turnLeft(char orientation) {
        switch (orientation) {
            case 'N':
                return 'W';
            case 'E':
                return 'N';
            case 'S':
                return 'E';
            case 'W':
                return 'S';
            default:
                return orientation; // Should not happen
        }
    }

    private static char turnRight(char orientation) {
        switch (orientation) {
            case 'N':
                return 'E';
            case 'E':
                return 'S';
            case 'S':
                return 'W';
            case 'W':
                return 'N';
            default:
                return orientation; // Should not happen
        }
    }

    private static int[] moveForward(int x, int y, char orientation) {
        switch (orientation) {
            case 'N':
                return new int[]{x, y + 1};
            case 'E':
                return new int[]{x + 1, y};
            case 'S':
                return new int[]{x, y - 1};
            case 'W':
                return new int[]{x - 1, y};
            default:
                return new int[]{x, y}; // Should not happen
        }
    }
}
