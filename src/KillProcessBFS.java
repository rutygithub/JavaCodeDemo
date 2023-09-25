import java.util.*;

public class KillProcessBFS {

    public Map<Integer, List<Integer>> map = new HashMap<>();

    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        //https://leetcode.com/problems/kill-process/
        //time complexity O(n), space complexity O(n)
        //https://leetcode.com/problems/kill-process/solution/
        //具体code在video solution里面
        //这个是bfs版本的，dfs版本的在后面，感觉bfs的比dfs的简单，就是正常的bfs建立queue， offer, poll, offer
        //hashmap+BFS
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
        Queue<Integer> q = new LinkedList<>();
        q.offer(kill);
        while (!q.isEmpty()) {
            int e = q.poll();
            res.add(e);
            if (map.containsKey(e)) {
                for (int next : map.get(e)) {
                    q.offer(next);
                }
            }
        }
        return res;
    }
}
