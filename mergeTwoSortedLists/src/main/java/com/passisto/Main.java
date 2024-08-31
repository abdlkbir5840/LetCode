package com.passisto;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> list = new LinkedList<>();
        while (list1 != null) {
            list.add(list1.val);
            list1 = list1.next;
        }
        while(list2 !=null){
            list.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(list);
        ListNode head = new ListNode(list.get(0));
        for (int i = 1; i < list.size(); i++) {
            head.next = new ListNode(list.get(i));
            head = head.next;
        }
        return head;
    }
    public static void main(String[] args) {

        System.out.println("Hello world!");

    }
}