class Solution {
    public List<String> commonChars(String[] A) {
          ArrayList<String> AL = new ArrayList<>();
        if(A.length==0){
            return null;
        }
        HashMap<Character,Integer> HS = new HashMap<>();
        for(char c : A[0].toCharArray()){
            HS.put(c,HS.getOrDefault(c,0)+1);
        }
        for(int i=1;i<A.length;i++){
          
            for(char c : A[i].toCharArray()){
                HashMap<Character,Integer> TS = new HashMap<>();
        for(char cc : A[i].toCharArray()){
            HS.put(cc,TS.getOrDefault(cc,0)+1);
        }    
         for(Character ci : HS.keySet()){
            if(TS.containsKey(ci)&&HS.get(ci)<TS.get(ci)){
                TS.put(ci,HS.get(ci));
            }
        }    
         HS =(HashMap)TS.clone();   
        }
            
      
            for(char c : HS.keySet()){
                AL.add(Character.toString(c));
            }
       
    }
         
            return AL;
    }
}