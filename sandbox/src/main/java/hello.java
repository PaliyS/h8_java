public class hello {
    public static void main(String[] args) {

            var x = 1;
            var y = 0;
            if (y==0){
                System.out.println("Деление на ноль запрещено");
            } else {
                int z = devide(x, y);
                System.out.println(z);
            }
        }


    private static int devide(int x, int y) {
        var z = x / y;
        return z;
    }
}
