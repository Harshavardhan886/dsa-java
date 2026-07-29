class baseCondition{
    public static void main(String[] args) {
        int count = 1;
        fun(count);
    }
    public static void fun(int count){
        System.out.println(count);
        if(count == 5){  // Base condition
            return; 
        }
        count++;
        fun(count);
    }
}