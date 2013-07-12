package com.xebia;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: jdewinne
 * Date: 7/12/13
 * Time: 7:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class Names {

    /**
     * gameboard
     */
    private int[][] theList;

    /**
     * returns all the flagged cells
     * @return
     */
    public List<int[]> getThem() {
        List<int[]> list1 = new ArrayList<int[]>();
        for(int[] x : theList)
            if(x[0] == 4)           // If cell is flagged
                list1.add(x);
        return list1;
    }
}
