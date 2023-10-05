# RobotNavigation

## Overview

This Java program simulates the navigation of a robot in a grid, designed to deliver food and medicine to patients affected by COVID in an isolation ward. The robot receives navigation instructions from a person outside the ward.

## Input Format

Each input consists of three lines:

1. The upper-right coordinates of the grid representing the COVID ward's floor.
2. The robot's initial position and orientation.
3. Navigation instructions for the robot.

### Example: 1

Test Input:
5 5
1 2 N
LMLMLMLMM

Expected Output:
1 3 N

### Example: 2

Test Input:
5 5
3 3 E
MMRMMRMRRM

Expected Output:
5 1 E


