import java.util.HashSet;
import java.util.Set;

class Solution 
{
    public int robotSim(int[] commands, int[][] obstacles) 
    {
        int[] current = {0, 0}; 
        int dirIndex = 0; 
        char[] directions = {'n', 'e', 's', 'w'};
        Set<String> obstacleSet = new HashSet<>();

        for (int[] obstacle : obstacles) 
        {
            obstacleSet.add(obstacle[0] + "," + obstacle[1]);
        }

        int maxDistance = 0; 

        for (int command : commands) 
        {
            if (command == -1) 
            {
                dirIndex = (dirIndex + 1) % 4; 
            } 
            else if (command == -2) 
            {
                dirIndex = (dirIndex + 3) % 4; 
            } 
            else 
            {
                char dir = directions[dirIndex]; 
                for (int step = 0; step < command; step++) 
                {
                    int nextX = current[0];
                    int nextY = current[1];
                    
                    if (dir == 'n') 
                    {
                        nextY++;
                    } 
                    else if (dir == 'e') 
                    {
                        nextX++;
                    } 
                    else if (dir == 's') 
                    {
                        nextY--;
                    } 
                    else if (dir == 'w') 
                    {
                        nextX--;
                    }
                    
                    if (obstacleSet.contains(nextX + "," + nextY)) 
                    {
                        break;  
                    }
                    
                    current[0] = nextX;
                    current[1] = nextY;
                    
                    int currentDistance = current[0] * current[0] + current[1] * current[1];
                    
                    maxDistance = Math.max(maxDistance, currentDistance);
                }
            }
        }

        return maxDistance; 
    }
}