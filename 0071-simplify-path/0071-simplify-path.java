import java.util.Stack;
import java.util.stream.Collectors;
class Solution {
    public String simplifyPath(String path) {
        Stack<String> q = new Stack<>();
        for (String dir : path.split("/")) {
        	if (dir.equals("..")) {
                    if (!q.isEmpty())
        		        q.pop();
        	}
        	else if (!dir.equals(".") && !dir.equals("")) {
				q.add(dir);
			}
        }
        return "/" + q.stream().collect(Collectors.joining("/"));
    }
}