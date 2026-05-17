class Solution {
    public boolean isAnagram(String s, String t) {
        // char a[]= s.toCharArray();
        // char b[]=t.toCharArray();
        // Arrays.sort(a);
        // Arrays.sort(b);
        // return Arrays.equals(a,b);


// convert both strings to lower case
s=s.toLowerCase();
t=t.toLowerCase();
//remove all white space
s=s.replace(" ","");
t=t.replace(" ","");

//initialize bucket 
int counts[]= new int[26];

//fill the bucket 
for( int i=0;i<s.length();i++){
    counts[s.charAt(i)-'a']++;
}
// remove the bucket 
for( int i=0;i<t.length();i++){
    counts[t.charAt(i)-'a']--;
}
// check if all buckets are empty 

for(int c: counts){
    if(c!=0){
        return false;
    }
}

 return true;
    }
}
