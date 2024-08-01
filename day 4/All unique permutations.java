class Solution {
    static ArrayList<ArrayList<Integer>> uniquePerms(ArrayList<Integer> arr , int n) {
        // code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        Collections.sort(arr);
        boolean visited[] = new boolean[n];
        backtrack(arr,new ArrayList<>(),result,visited,n);
        return result;
        
    }
    public static void backtrack(ArrayList<Integer> arr,ArrayList<Integer> current,ArrayList<ArrayList<Integer>> result,boolean[] visited,int n){
        if(current.size() == n){
            result.add(new ArrayList<>(current));
        }
        else{
        for(int i = 0; i < n; i++){
            if(visited[i] || (i > 0 && arr.get(i) == arr.get(i-1) && !visited[i-1])) continue;
            visited[i] = true;
            current.add(arr.get(i));
            backtrack(arr,current,result,visited,n);
            visited[i] = false;
            current.remove(current.size()-1);
            
        }
        }
    }
    
};
