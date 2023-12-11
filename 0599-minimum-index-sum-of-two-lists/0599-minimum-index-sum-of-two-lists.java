class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        
        for(int i=0; i <list1.length; i++) {
            map.put(list1[i],i);
        }
        
        int min=Integer.MAX_VALUE;
        int total=0;
        List<String> result=new ArrayList<String>();
        for(int i=0; i<list2.length;i++) {
            if(map.get(list2[i])!=null) {
                total = i+map.get(list2[i]);
                if(total < min) {
                    result.clear();
                    result.add(list2[i]);
                } else if(total == min) {
                    
                    result.add(list2[i]);
                }
                
                min = Math.min(min , total);
            }
        }
        
        String[] arr=new String[result.size()];
        return result.toArray(arr);
        
    }
}