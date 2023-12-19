#User function Template for python3

class Solution:
    def unique_substring(self,str):
        #code here
        if not str:
            return 0
        
        str_set = set()
        
        for i in range(len(str)):
            for j in range(i, len(str)): 
                str_set.add(str[i:j+1]) # +1 because j is exclusive in str slicing
        
        return len(str_set)


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input())
    for _ in range(t):
        str=input()
        ob = Solution()
        print(ob.unique_substring(str))

# } Driver Code Ends