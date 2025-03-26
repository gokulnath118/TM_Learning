class Main {
    public static void main(String[] args) {
        int n=10;
        int c=0;
        for(int i=1;i<=n;i+=1){
            n-=i;
            c+=1;
            if (n<0){
                break;
            }
        }
        System.out.println(c);
    }
}