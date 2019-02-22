package com.company;

public class Solution10to20 {

   /*
        二进制中1的个数
        输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
    */

    public static int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            ++count;
            n = (n - 1) & n;
        }
        return count;

        // return Integer.toBinaryString(n).replaceAll("0","").length();
    }

     /*
        数值的整数次方
        给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
      */

    public double Power(double base, int exponent) {
        double sum = 1;
        for (int i = 0; i < Math.abs(exponent); i++) {
            sum *= base;
        }
        return (exponent < 0) ? 1 / sum : sum;

    }


    /*
        调整数组顺序使奇数位于偶数前面
        输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
        使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
        并保证奇数和奇数，偶数和偶数之间的相对位置不变。
     */
    public void reOrderArray(int[] array) {
        int k = 0, i = 0;
        int orderArray[] = new int[array.length];
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) orderArray[k++] = array[i];
        }
        for (i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) orderArray[k++] = array[i];
        }
        for (i = 0; i < array.length; i++) {
            array[i] = orderArray[i];
        }
    }

    /*
        链表中倒数第k个结点
        输入一个链表，输出该链表中倒数第k个结点。
     */
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
        }

        public ListNode FindKthToTail(ListNode head, int k) {
            if (head == null || k <= 0) {
                return null;
            }
            ListNode pre = head;
            ListNode last = head;
            for (int i = 1; i < k; i++) {
                if (pre.next != null) {
                    pre = pre.next;
                } else {
                    return null;
                }
            }
            while (pre.next != null) {
                pre = pre.next;
                last = last.next;
            }
            return last;
        }


    /*
        反转链表
        输入一个链表，反转链表后，输出新链表的表头。
    */
    public ListNode ReverseList(ListNode head) {
            ListNode p1,p2,p3;
            p1 = head;
            p2 = head.next;
            p1.next = null;
            while(p2!=null){
                p3 = p2.next;
                p2.next = p1;
                p1 = p2;
                p2 = p3;
            }
        return p1;
    }

}
