package practice;

import java.util.*;

// 백준, 6603, 로또
// DFS + back tracking. 결국엔 DFS 메소드로 전부 해결나는 문제. 근데 이거 왜이렇게 생각이 안떠오르는거지... 
public class Main {
	static int n;
	static int[] a;
	static void dfs(int index, int cnt, String ans) {
		if (index == n) {
			if (cnt == 6) {
				System.out.println(ans);
			}
			return;
		}
		dfs(index + 1, cnt + 1, ans + a[index] + " ");
		dfs(index + 1, cnt, ans);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			n = sc.nextInt();
			if (n == 0) {
				break;
			}
			a = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			dfs(0, 0, "");
			System.out.println();
		}
	}
}