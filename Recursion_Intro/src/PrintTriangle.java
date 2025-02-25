public class PrintTriangle {
    public static void main(String[] args) {
        printTriangleUpsideDown(4,0);
        System.out.println();
        printTriangleNormal(4,0);
    }
    static void printTriangleUpsideDown(int i, int j){
        if(i<1){
            return;
        }

        if(j<i){
            System.out.print("* ");
            printTriangleUpsideDown(i,j+1);
        }else {
            System.out.println();
            printTriangleUpsideDown(i-1,0);
        }
    }

    static void printTriangleNormal(int i, int j){
        if(i<1){
            return;
        }

        if(j<i){
            printTriangleNormal(i,j+1);
            System.out.print("* ");
        }else{
            printTriangleNormal(i-1,0);
            System.out.println();
        }
    }
}
