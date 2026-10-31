// class Solution {
//     public int leastInterval(char[] tasks, int n) {
//         int freq[]= new int[26];
//         for( int i =0;i<tasks.length;i++){
//             char ch =tasks[i];
//             freq[ch-'A']++;

//         }
//         PriorityQueue<Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
//         for( int i =0;i<26;i++){
//              if ( freq[i]>0){
//                  pq.add(freq[i]);
//              }
//         }
//         int time=0;
//         while(!pq.isEmpty()){
//             ArrayList<Integer> arr= new ArrayList<>();
//             for( int i=1;i<=n+1;i++){
//                  if ( !pq.isEmpty()){
//                     int freqq=pq.poll();
//                     freqq--;
//                     arr.add(freqq);
//                  }
//             }
//             for( int i =0;i<arr.size();i++){
//                 if ( arr.get(i)>0){
//                     pq.add(arr.get(i));
//                 }
//             }
//             if (!pq.isEmpty()){
//                 time+=n+1;
//             }
//             else{
//                 time+=arr.size();
//             }
//         }
//         return time;
        
//     }
// }
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[]= new int[26];
        for( int i =0;i<tasks.length;i++){
            freq[tasks[i]-'A']++;
        }
        Arrays.sort(freq);
        int maxfreq=freq[25];
        int slot=maxfreq-1;
        int slotsize=slot*n;
        for( int i =24;i>=0;i--){
            slotsize-=Math.min(slot,freq[i]);
        }
         if (slotsize>0){
            return tasks.length+slotsize;
         }
          return tasks.length;

    }
}