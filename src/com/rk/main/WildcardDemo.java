
package com.rk.main;

import com.rk.MyGeneric;

public class WildcardDemo {

    public static void main(String[] args) {
        MyGeneric<Integer> nums = new MyGeneric<Integer>();
        nums.push(21);
        nums.push(3);
        nums.push(15);

        // error karena gak spesifik tipe bounded
        //System.out.println("The max number is " + max(nums));

        showData(nums);
    }

    /*
     // method yang error  
     public static double max(MyGeneric<Number> list) {
        double max = list.pop().doubleValue();

        while (!list.isEmpty()) {
            double value = list.pop().doubleValue();
            if (value > max) {
                max = value;
            }
        }

        return max;
     }
     */
    public static double max(MyGeneric<?> list) {
        Double max = Double.parseDouble(String.valueOf(list.pop()));

        while (!list.isEmpty()) {
            Double value = Double.parseDouble(String.valueOf(list.pop()));
            if (value > max) {
                max = value;
            }
        }

        return max;
    }

    public static void showData(MyGeneric<?> list) {
        while (!list.isEmpty()) {
            System.out.println(list.pop());
        }
    }
}
