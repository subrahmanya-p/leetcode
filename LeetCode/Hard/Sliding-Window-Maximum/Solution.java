
import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        int index = 0;
        int[] result = new int[nums.length - k + 1];

        Deque<Integer> queue = new LinkedList<>();

        // Process the first window
        for (int i = 0; i < k; i++) {

            while (!queue.isEmpty() &&
                   nums[queue.peekLast()] < nums[i]) {

                queue.removeLast();
            }

            queue.addLast(i);
        }

        result[index++] = nums[queue.peekFirst()];

        // Process remaining windows
        for (int i = k; i < nums.length; i++) {

            // Remove elements outside the current window
            while (!queue.isEmpty() &&
                   queue.peekFirst() < i - k + 1) {

                queue.removeFirst();
            }

            // Maintain decreasing order
            while (!queue.isEmpty() &&
                   nums[queue.peekLast()] < nums[i]) {

                queue.removeLast();
            }

            queue.addLast(i);

            result[index++] = nums[queue.peekFirst()];
        }

        return result;
    }
}
