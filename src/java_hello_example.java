class java_hello_example {
    public static void main(String[] args) {
        String haystack = "Hi, I'm doing great, how are you?";
        String [] needles = {"Hi", "how", "are", "you?"}; 
        if (needles.length > 5) {
            System.err.println("Too many words!");
        } else {
            int[] countArray = new int[needles.length]; 
            String[] words = haystack.split("[ \"\'\t\n\b\f\r ]", 0);
            for (int i = 0; i < needles.length; i++) {
                for (int j = 0; j < words.length; j++) {
                    if (words[j].compareTo(needles[i]) == 0) {
                        countArray[i]++;
                    }
                }    
            }
        for (int j = 0; j < needles.length; j++) {
            System.out.println(needles[j] + ": " + countArray[j]);        
            }
        }    
    }
}


    
    
