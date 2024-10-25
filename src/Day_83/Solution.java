package Day_83;

import java.util.*;

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> ans = new ArrayList<>();
        ans.add(folder[0]);
        for (int i = 1; i < folder.length; i++) {
            String lastFolder = ans.get(ans.size() - 1) + "/";
            if (!folder[i].startsWith(lastFolder)) {
                ans.add(folder[i]);
            }
        }
        return ans;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String[] folders = {"/a", "/a/b", "/c/d", "/c/d/e", "/c/f"};
        List<String> result = solution.removeSubfolders(folders);

        System.out.println("After removing subfolders: " + result);
    }
}

