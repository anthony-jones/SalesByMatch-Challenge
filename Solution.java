//METHOD 1: ARRAYLIST
public static int sockMerchant(int n, List<Integer> ar) {
        int pairCount = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if (list.contains(ar.get(i))){ //O(N)
                list.remove(ar.get(i));
                pairCount++;
            } else {
                list.add(ar.get(i));
            }
        }
        return pairCount;
}

//METHOD 2: HASHSET
public static int sockMerchant(int n, List<Integer> ar) {
        int pairCount = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            if(set.contains(ar.get(i))){ // O(1)
                set.remove(ar.get(i));
                pairCount++;
            } else {
                set.add(ar.get(i));
            }
        }
        return pairCount;
}
    
