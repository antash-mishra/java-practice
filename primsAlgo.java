import java.util.*;
public class primsAlgo {
    final static int MAX =20;
    static int n;
    static int cost[][];
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        readMatrix();
        prims();
    }
    static void readMatrix() {
        int i,j;
        cost = new int[MAX][MAX];
        System.out.println("Enter no. of nodes\n");
        n=scan.nextInt();
        System.out.println("Enter adjency matrix\n");
        for(i=1;i<=n;i++)
            for(j=1;j<=n;j++) {
                cost[i][j]=scan.nextInt();
                if(cost[i][j]==0)
                    cost[i][j]=999;
            }
    }

    static void prims() {
        int visited[] = new int[10];
        int i,j,min,ne=1,a=0,b=0,u=0,v=0;
        int mincost=0;
        visited[1]=1;
        while(ne<n) {
            for (i = 1, min = 999; i <= n; i++)
                for (j = 1; j <= n; j++)
                    if (cost[i][j]<min) {
                        min=cost[i][j];
                        a=u=i;
                        b=v=j;
                        if(visited[u]==0 || visited[v]==0) {
                            System.out.println("Edge " +ne++ +":("+a+ ","+b+")"+ "cost:" + min );
                            mincost += min;
                            visited[b]=1;
                        }
                        cost[a][b]=cost[b][a]=999;
                }
        }
        System.out.println("minimum cost: "+ mincost);
    }

}