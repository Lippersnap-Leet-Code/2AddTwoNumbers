import java.math.BigInteger;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int i = 0;
        BigInteger sum_l1 = BigInteger.valueOf(0);
        BigInteger sum_l2 = BigInteger.valueOf(0);

        while (l1 != null) //sum up the value of the numbers in the array multiplying by a factor of 10 for every link.
        {
            sum_l1 = sum_l1.add(BigInteger.TEN.pow(i).multiply(BigInteger.valueOf(l1.val)));
            l1 = l1.next;
            i++;
        }

        i = 0;
        while (l2 != null)
        {
            sum_l2 = sum_l2.add(BigInteger.TEN.pow(i).multiply(BigInteger.valueOf(l2.val)));
            l2 = l2.next;
            i++;
        }

        String sum = String.valueOf(sum_l1.add(sum_l2)); //convert sum into a string
        ListNode next = new ListNode(sum.charAt(0) - 48); //make a new end node taking the character value at the index -48 because ASCII
        for (int j = 1; j < sum.length(); j++) //start looping at 1 because we hardcoded the first node
        {
            next = new ListNode(sum.charAt(j) - 48, next);
        }

        return next;
    }
}