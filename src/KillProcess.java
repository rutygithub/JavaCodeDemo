import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KillProcess {
    //https://leetcode.com/problems/kill-process/
    //time complexity O(n), space complexity O(n)
    //https://leetcode.com/problems/kill-process/solution/
    public Map<Integer, List<Integer>> map = new HashMap<>();

    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {

        for (int i = 0; i < ppid.size(); i++) {
            if (map.containsKey(ppid.get(i))) {
                map.get(ppid.get(i)).add(pid.get(i));
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(pid.get(i));
                map.put(ppid.get(i), list);
            }
        }

        List<Integer> res = new ArrayList<>();
        dfs(kill, res);
        return res;
    }

    public void dfs(int kill, List<Integer> res) {
        res.add(kill);
        if (map.containsKey(kill)) {
            List<Integer> next = map.get(kill);
            for (int n : next) {
                dfs(n, res);
            }
        } else {
            return;
        }
    }
}
