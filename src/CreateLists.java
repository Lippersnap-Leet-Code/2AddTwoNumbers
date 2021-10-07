public class CreateLists {
    public ListNode[] generateLinkedLists(int[] arr1, int[] arr2)
    {
        ListNode l1 = new ListNode(arr1[0]);
        ListNode l1_start = l1;
        for (int i = 1; i < arr1.length; i++) {
            l1.next = new ListNode(arr1[i]);
            l1 = l1.next;
        }

        ListNode l2 = new ListNode(arr2[0]);
        ListNode l2_start = l2;
        for (int i = 1; i < arr2.length; i++) {
            l2.next = new ListNode(arr2[i]);
            l2 = l2.next;
        }

        /*
        l1 = l1_start;
         while (l1 != null)
         {
             System.out.println(l1.val);
             l1 = l1.next;
         }

         l2 = l2_start;
         while (l2 != null)
         {
             System.out.println(l2.val);
             l2 = l2.next;
         }
        */

        return new ListNode[]{l1_start, l2_start};
    }
}