class Solution {
    public int[] intersect(int[] num1, int[] num2) {
    ArrayList<Integer> list=new ArrayList<>();
    Arrays.sort(num1);
    Arrays.sort(num2);
    int i=0;
    int j=0;
    while(i<num1.length&&j<num2.length)
    {
        if(num1[i]==num2[j]){
            list.add(num1[i]);
            i++;
            j++;
        }
        else if(num1[i]>num2[j]){
            j++;
        }
        else{
            i++;
        }
    }
    int arr[]=new int[list.size()];
    for(i=0;i<list.size();i++){
       arr[i]=list.get(i);
    }
    return arr;
    }
    }