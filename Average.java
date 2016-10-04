package com.example.iamyonghwan.test1;

/**
 * Created by iamyonghwan on 2016-10-03.
 */
public class Average extends Result {

    @Override
    public int getresult(int[] arr) {
        int sum =0;
        for(int i=0; i < arr.length; ++i){
            sum += arr[i];
        }
        return sum/arr.length;
    }
}
