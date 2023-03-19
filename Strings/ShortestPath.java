package com.company.Strings;

public class ShortestPath {
    public static void main(String[] args) {
        String dir = "WSNEEEEEEEE";
        float path = shortestpath(dir);
        System.out.println(path);

    }

    private static float shortestpath(String dir) {
        int x = 0, y=0;
        for (int i = 0; i < dir.length(); i++) {
            char direction = dir.charAt(i);
//            for right
            if(direction == 'E'){
            x++;
            }
//            for left
            else if (direction == 'W'){
                x--;
            }
//            for up
            else if (direction == 'N'){
                y++;
            }
//            for down
            else if(direction == 'S'){
                y--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;

        return (float) Math.sqrt(X2 - Y2);
    }
}
