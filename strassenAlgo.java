import java.io.*;

class strassenAlgo {
    public static int[][] strassenMultiplication(int[][] A,int[][] B){
        int n = A.length;
        int[][] res = new int[n][n];
        if(n==1)
            res[0][0]=A[0][0] * B[0][0];
        else{
            //first matrix
            int[][] a1 = new int[n/2][n/2];
            int[][] a2 = new int[n/2][n/2];
            int[][] a3 = new int[n/2][n/2];
            int[][] a4 = new int[n/2][n/2];
            //second matrix
            int[][] b1 = new int[n/2][n/2];
            int[][] b2 = new int[n/2][n/2];
            int[][] b3 = new int[n/2][n/2];
            int[][] b4 = new int[n/2][n/2];

            //dividing A into 4 parts
            divideArray(A,a1,0,0);
            divideArray(A,a2,0,n/2);
            divideArray(A,a3,n/2,0);
            divideArray(A,a4,n/2,n/2);

            //dividing B into 4 parts
            divideArray(B,b1,0,0);
            divideArray(B,b2,0,n/2);
            divideArray(B,b3,n/2,0);
            divideArray(B,b4,n/2,n/2);

            int[][] D = strassenMultiplication(a1, subMatrices(b2,b4));
            int[][] E = strassenMultiplication(a4, subMatrices(b3,b1));
            int[][] F = strassenMultiplication(addMatrices(a3,a4),b1);
            int[][] G = strassenMultiplication(addMatrices(a1,a2),b4);
            int[][] H = strassenMultiplication(subMatrices(a3,a1),addMatrices(b1,b2));
            int[][] I = strassenMultiplication(subMatrices(a2,a4),addMatrices(b3,b4));
            int[][] J = strassenMultiplication(addMatrices(a1,a4),addMatrices(b1,b4));

            int[][] c2 = addMatrices(D,G);
            int[][] c3 = addMatrices(E,F);
            int[][] c4 = addMatrices(subMatrices(addMatrices(J, D), F), H);
            int[][] c1 = addMatrices(subMatrices(addMatrices(J, E), G), I);

            copySubArray(c1,res,0,0);
            copySubArray(c2,res,0,n/2);
            copySubArray(c3,res,n/2,0);
            copySubArray(c4,res,n/2,n/2);
        }
        return res;
    }
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the order of Matrices:");
        int order = Integer.parseInt(br.readLine());

        int[][] A = new int[order][order];
        int[][] B = new int[order][order];

        int[][] res = new int[order][order];

        // input first matrix
        System.out.println("Enter first matrix:");
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                A[i][j] = Integer.parseInt(br.readLine());
            }
        }

        //input second matrix
        System.out.println("Enter second matrix:");
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                B[i][j] = Integer.parseInt(br.readLine());
            }
        }

        res = strassenMultiplication(A,B);
        printMatrix(res);
    }

    public static int[][] addMatrices(int[][] a,int[][] b){
        int n = a.length;
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        return res;
    }

    public static int[][] subMatrices(int[][] a,int[][] b){
        int n=a.length;
        int[][] res = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = a[i][j] - b[i][j];
            }
        }
        return res;
    }

    public static void printMatrix(int[][] a) {
        int n = a.length;
        System.out.println("Resultant Matrix ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void divideArray(int[][] P, int[][] C, int iB, int jB)
    {
        for(int i1 = 0, i2 = iB; i1 < C.length; i1++, i2++)
            for(int j1 = 0, j2 = jB; j1 < C.length; j1++, j2++)
                C[i1][j1] = P[i2][j2];
    }

    public static void copySubArray(int[][] C, int[][] P, int iB, int jB)
    {
        for(int i1 = 0, i2 = iB; i1 < C.length; i1++, i2++)
            for(int j1 = 0, j2 = jB; j1 < C.length; j1++, j2++)
                P[i2][j2] = C[i1][j1];
    }

}