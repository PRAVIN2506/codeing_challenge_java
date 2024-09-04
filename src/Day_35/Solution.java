package Day_35;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] commands={4,-1,3};
        int[][] obstacles={};
        System.out.println(s.robotSim(commands,obstacles));
    }
    public int robotSim(int[] commands, int[][] obstacles) {
        Set<String> obstacleSet = new HashSet<>();
        for (int[] obstacle : obstacles) {
            obstacleSet.add(obstacle[0] + "," + obstacle[1]);
        }

        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // North, East, South, West
        int x = 0, y = 0, direction = 0, maxDistance = 0;

        for (int command : commands) {
            if (command == -1) {
                direction = (direction + 1) % 4;
            } else if (command == -2) {
                direction = (direction + 3) % 4;
            } else {
                for (int i = 0; i < command; i++) {
                    int newX = x + directions[direction][0];
                    int newY = y + directions[direction][1];
                    if (!obstacleSet.contains(newX + "," + newY)) {
                        x = newX;
                        y = newY;
                        maxDistance = Math.max(maxDistance, x * x + y * y);
                    } else {
                        break;
                    }
                }
            }
        }

        return maxDistance;
    }
}
