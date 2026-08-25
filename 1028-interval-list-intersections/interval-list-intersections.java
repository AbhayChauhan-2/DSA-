import java.util.*;

class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {

        int i = 0;
        int j = 0;

        List<int[]> list = new ArrayList<>();

        while (i < firstList.length && j < secondList.length) {

            int firstStart = firstList[i][0];
            int firstEnd = firstList[i][1];

            int secondStart = secondList[j][0];
            int secondEnd = secondList[j][1];

            int overlapStart = Math.max(firstStart, secondStart);
            int overlapEnd = Math.min(firstEnd, secondEnd);

            if (overlapStart <= overlapEnd) {
                list.add(new int[]{overlapStart, overlapEnd});
            }

            if (firstEnd < secondEnd) {
                i++;
            } else if (firstEnd > secondEnd) {
                j++;
            } else {
                i++;
                j++;
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}