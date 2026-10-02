class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < tickets.length; i++) {
            queue.offer(i);
        }

        int cnt = 0;

        while (!queue.isEmpty()) {

            int person = queue.poll();

            tickets[person]--;
            cnt++;

            if (tickets[person] == 0) {
                if (person == k) {
                    return cnt;
                }
            } 
            else {
                queue.offer(person);
            }
        }

        return cnt;
    }
}