class Main{


    private void print(String msg){
        System.out.println(msg);
    }

    public static void main(String... str){
        new Main().print(" Hello " + str[0] + "!!");
    }

}