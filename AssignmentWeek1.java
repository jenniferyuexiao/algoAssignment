//Merge Two Sorted Lists
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if (l1 == null) {
      return l2;
    }
    if (l2 == null) {
      return l1;
    }
      
		if (l1.val < l2.val) {
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else {
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
  }
}

//Plus One
class Solution {
    public int[] plusOne(int[] digits) {
        
    int n = digits.length;
    for(int i=n-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        
        digits[i] = 0;
    }
    
    int[] newNumber = new int [n+1];
    newNumber[0] = 1;
    
    return newNumber;
  }
}

//Two Sum
class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> map = new HashMap<>();
      for (int i = 0; i < nums.length; i++) {
          int complement = target - nums[i];
          if (map.containsKey(complement)) {
              return new int[] { map.get(complement), i };
          }
          map.put(nums[i], i);
      }
      throw new IllegalArgumentException("No two sum solution");
  }
}
