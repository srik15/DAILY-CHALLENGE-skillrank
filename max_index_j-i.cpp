// Given an array a of n positive integers. The task is to find the maximum of j - i subjected to the constraint of a[i] < a[j] and i < j.
// Input:
// n = 9
// a[] = {34, 8, 10, 3, 2, 80, 30, 33, 1}
// Output:
// 6
// Explanation:
// In the given array a[1] < a[7] satisfying the required condition(a[i] < a[j]) thus giving the maximum difference of j - i which is 6(7-1).

class solution{
  public:
    int maxIndexDiff(int a[], int n){
      vector<int> leftMin(n), rightMin(n);
      leftMin[0] = a[0];
      for(int i=1;i<n;i++){
          leftMin[i] = min(leftMin[i-1], a[i]);
      }
      rightMax[n-1]=a[n-1];
      for(int i=n-2;i>=0;i--){
        rightMax[i] = max(rightMax[i+1], a[i]);
      }
      int i=0,j=0,maxDiff=INT_MIN;
      while(i<n && j<n){
        if(leftMin[i] <= rightMax[j]){
          maxDiff= max(maxDiff, j-i);
          j++;
        }
        else{
          i++;
        }
      }
      return maxDiff;
    }
};
