class Solution {
public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
return mergeList(list1, list2);
}

public ListNode mergeList(ListNode list1, ListNode list2){
    if (list1 == null){
       return list2;
    }
    
    if (list2 == null){
       return list1;
    }
    var result = new ListNode();
    
    if (list1.val < list2.val){
        result = list1;
        result.next = mergeList(list1.next, list2);
    }else{
        result = list2;
        result.next = mergeList(list1, list2.next);
    }
    
    return result;
}
}