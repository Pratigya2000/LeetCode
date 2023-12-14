class Solution {
    //(N * d)
    //N
    public List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> map = new HashMap();
        for(String path : paths) {
            String[] token = path.split(" ");
            String dir = token[0];
            for(int i = 1; i < token.length; i++) {
                int index = token[i].indexOf('(');
                String fileName = token[i].substring(0, index);
                String content = token[i].substring(index + 1, token[i].length() - 1);
                map.computeIfAbsent(content, l -> new ArrayList()).add(dir + "/" + fileName);
            }
        }
        
        return map.values().stream().filter(g -> g.size() > 1).collect(Collectors.toList());
    }
}