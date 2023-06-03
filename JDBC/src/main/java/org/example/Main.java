package org.example;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//            List<List<Integer>> res = generate(5);
//        System.out.println(toString(res));
        //
    }
    public static String toString(List<List<Integer>>myBoard){
        String result = "";
        for(int i = 0; i < myBoard.size(); i++){
            for(int j = 0; j < myBoard.get(i).size(); j++){
                result += myBoard.get(i).get(j);
            }
            result += System.lineSeparator();
        }
        return result;
    }
    private static List<List<Integer>> generate (int numRows){
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> row = new ArrayList<Integer>();
        for(int i = 0; i < numRows; i++){
            row.add(1);
            for(int j = 1 ; j < row.size() - 1; j++){
                row.set(j,row.get(j) + row.get(j + 1));
            }
            res.add(new ArrayList<Integer>(row));
        }
        return res;
    }
}