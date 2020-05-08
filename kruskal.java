import java.util.*;
public class kruskal {
    final static int MAX = 20;
    static int n; //no. of verices
    static int cost[][];//cost matrix
    static int parent[]=new int[9];
    static Scanner scan = new Scanner(System.in);
    public static void main(String args[]) {
        readMatrix();
        kruskals();
    }
    static void readMatrix() {
        int i, j;
        cost = new int[MAX][MAX];
        System.out.println("Enter the number of nodes\n");
        n = scan.nextInt();
        System.out.println("Cost adjency matrix\n");
        for (i = 1; i <= n; i++)
            for (j = 1; j <= n; j++) {
                cost[i][j] = scan.nextInt();
                if (cost[i][j] == 0)
                    cost[i][j] = 999;
            }
    }

        static void kruskals() {
            int a=0,b=0,u=0,v=0;
            int i,j,ne=1,min,mincost=0;
            System.out.println("The edges of minimum spanning tree");
            while(ne<n) {
                for(i=1,min=999;i<=n;i++)
                    for(j=1;j<=n;j++)
                        if(cost[i][j]<min) {
                            min = cost[i][j];
                            a=u=i;
                            b=v=j;

                        }
                u=find(u);
                v=find(v);
                if(u!=v) {
                    union(u,v);
                    System.out.println(ne++ + "edge("+ a + ","+ b +" )="+min);
                    mincost += min;
                }
                cost[a][b]=cost[b][a]=999;
            }
            System.out.println("mincost: "+ mincost);
        }

        static int find(int i) {
            while(parent[i]>0)
                i=parent[i];
            return i;
        }
        static void union(int i,int j) {
            parent[j]=i;

        }
    }