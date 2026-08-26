class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        int len = strs.length;

        List<List<String>> result = new ArrayList<>();

        if (len == 0) {
            return result;
        }

        if (len == 1) {
            List<String> temp = new ArrayList<>();
            temp.add(strs[0]);
            result.add(temp);
            return result;
        }

        int arr[] = new int[len];

        String[] strss = new String[len];

        for (int i = 0; i < len; i++) {
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            strss[i] = new String(ch);
        }

        for (int i = 0; i < len; i++) {

            if (arr[i] == 1) {
                continue;
            }

            List<String> resultdemo = new ArrayList<>();
            resultdemo.add(strs[i]);
            arr[i] = 1;

            for (int j = i + 1; j < len; j++) {

                if (strss[i].equals(strss[j]) && arr[j] != 1) {
                    resultdemo.add(strs[j]);
                    arr[j] = 1;
                }
            }

            result.add(resultdemo);
        }

        return result;
    }
}