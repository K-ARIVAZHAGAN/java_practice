class Table{
    public static void main(String[] args){
        int number=5;
        while(number>=1){
            System.out.println("=============Multiplication table of "+number+"=======");
            for(int i=1;i<=10;i++){
                System.out.println(i+" x "+number+" = "+(number*i));
                }
            number--;
        }
    }
}
