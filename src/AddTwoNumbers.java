public class AddTwoNumbers {
    public static void main(String[] args){
        int[] arr1 = new int[]{9};
        int[] arr2 = new int[]{1,9,9,9,9,9,9,9,9,9};
        int[] arr3 = new int[]{2,4,3};
        int[] arr4 = new int[]{5,6,4};
        int[] arr5 = new int[]{3,9,9,9,9,9,9,9,9,9};
        int[] arr6 = new int[]{7};
        int[] arr7 = new int[]{1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
        int[] arr8 = new int[]{5,6,4};

        CreateLists generator = new CreateLists();
        Solution solver = new Solution();

        ListNode[] lists = generator.generateLinkedLists(arr7, arr8);
        ListNode answer = solver.addTwoNumbers(lists[0], lists[1]);

        StringBuilder ansBuilder = new StringBuilder("[");
        while (answer != null)
        {
            ansBuilder.append(answer.val).append(",");
            answer = answer.next;
        }
        ansBuilder.replace(ansBuilder.length() - 1, ansBuilder.length(),"]");
        String ans = ansBuilder.toString();
        System.out.println(ans);
    }
}
