class Solution {
public:
    bool solve(int n,int x)
      {
          //base
          if(n==0)return true;
          
          
          //choices
          while(x<=n)
          {
              if(solve(n-x,x*3)==true)
              {
                  return true;
              }
              x=x*3;
          }
          return false;
      }
      bool checkPowersOfThree(int n) {
          int x=1;
          return solve(n,x);
    }
};