package com.example.iamyonghwan.test1;

/**
 * Created by iamyonghwan on 2016-10-03.
 */
public class Minimun extends Result {
    @Override
    public int getresult(int[] arr) {
        int min =arr[0];
        for(int i=0; i < arr.length; ++i)
            if(min > arr[i])
                min = arr[i];
        return min;
    }
}
