An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

<h3>Python</h3>

```
class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        freq1={}
        freq2={}
        for i in range(len(s)):
            freq1[s[i]]=1+freq1.get(s[i],0)
            freq2[t[i]]=1+freq2.get(t[i],0)
        if freq1==freq2:
            return True
        else:
            return False
```
