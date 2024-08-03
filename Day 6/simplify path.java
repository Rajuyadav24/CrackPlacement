class Solution {
    public String simplifyPath(String A) {
         Stack<String> stack = new Stack<>();
         String[] dirs = A.split("/");

         for(String dir : dirs){
            if(dir.equals(".") || dir.isEmpty()) continue;

            else if(dir.equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else {
                    stack.push(dir);
                }
            }
        if(stack.isEmpty()) return "/";
        String res = "";
        while(!stack.isEmpty()){
            res = "/" + stack.peek() + res;
            stack.pop();
        }
        return res;
    }
}
