class knapsack {
    static int max(int a,int b) {
        return (a>b) ? a : b;
    }
    static int knapsack(int M,int wt[],int val[],int n) {
        int i,w;
        int v[][]=new int[n+1][M+1];
        for(i=0;i<=n;i++){
            for(w=0;w<=M;w++) {
                if(i==0 || w==0)
                    v[i][w]=0;
                else if(wt[i-1] <= w)
                    v[i][w] = max(k[i-1][w],val[i-1] + k[i-1][w-wt[i-1]]);
                else
                    v[i][w] = k[i-1][w];

            }
        }
        return k[n][M];
    }
    public static void main(String args[])
    {
        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int M = 50;
        int n = val.length;
        System.out.println(knapsack(M, wt, val, n));
    }
}