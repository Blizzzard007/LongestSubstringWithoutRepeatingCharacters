package com.company;

import java.util.HashMap;

/**
 * Created by hongruzh on 5/29/16.
 */
public class lengthOfLongestSubstring1 {
    public static int lengthOfLongestSubstring(String s) {
        if(s==null)
            return 0;
        char[] arr = s.toCharArray();
        int pre = 0;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        /**
         * 方法概述:创建一个hashmap 然后
        */

        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], i);
            } else {
                pre = Math.max(pre, map.size());
                i = map.get(arr[i]);
                map.clear();
            }
        }

        return Math.max(pre, map.size());
    }
}
