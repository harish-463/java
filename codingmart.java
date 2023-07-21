import java.util.Scanner;
public class codingmart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("no.of.houses: ");
        int n = scanner.nextInt();
        int[][] costs = new int[n][3];
        System.out.println("costs:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                costs[i][j] = scanner.nextInt();
            }
        }
        int minCost =mincost(costs);
        System.out.println("minimum cost: "+ minCost);
    }
    public static int mincost(int[][] costs) {
        int n = costs.length;
        int[][] a= new int[n][3];
        a[0][0] = costs[0][0];
        a[0][1] = costs[0][1];
        a[0][2] = costs[0][2];
        for (int i = 1; i < n; i++) {
            a[i][0] = costs[i][0] + Math.min(a[i-1][1], a[i-1][2]);
            a[i][1] = costs[i][1] + Math.min(a[i-1][0], a[i-1][2]);
            a[i][2] = costs[i][2] + Math.min(a[i-1][0], a[i-1][1]);
        }
        return Math.min(a[n-1][0], Math.min(a[n-1][1], a[n-1][2]));
    }
}
