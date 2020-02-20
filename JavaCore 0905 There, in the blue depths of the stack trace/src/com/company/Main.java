package com.company;

/*

0905 There, in the blue depths of the stack trace ...
Write a method that returns the result — the depth of its stack trace — the number of methods in it (the number of elements in the list).
The method should display the same number.

Requirements:
1. The getStackTraceDeep method should return the depth of its stack trace.
2. The getStackTraceDeep method should display the depth of its stack trace.
3. Use the Thread.currentThread (). GetStackTrace () method.
4. The main method should call the getStackTraceDeep method.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDeep();
    }

    public static int getStackTraceDeep() {
        int count = 0;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : stackTraceElements)
        {
            count++;
        }
        System.out.println(count);
        return count;
    }
}

