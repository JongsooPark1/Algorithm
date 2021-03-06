package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

// 백준, 2468, 안전영역
public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static int n = sc.nextInt();
	public static int[][] graph = new int[n][n];
	public static int[][] no = new int[n][n];
	public static boolean[][] visited = new boolean[n][n];
	public static List<Integer> answers = new ArrayList<Integer>();
	public static int cnt = 0;


	// 조건은 3개다. 1. 범위 벗어나는 것 2. 방문한 것 3. 불가능한 것
	public static void countBlobs(int x, int y) {
		if (x < 0 || x >= n || y < 0 || y >= n) {
			return;
		} else if (visited[x][y] || no[x][y] == -1) {
			return;
		} else {
			visited[x][y] = true;
			countBlobs(x - 1, y);
			countBlobs(x + 1, y);
			countBlobs(x, y - 1);
			countBlobs(x, y + 1);
			return;
		}
	}

	public static void main(String[] args) {
		Stack<Integer> value = new Stack<Integer>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				graph[i][j] = sc.nextInt();
				if (!value.contains(graph[i][j])) {
					value.push(graph[i][j]);
				}
			}
		}

		while (!value.isEmpty()) {
			int criterion = value.pop();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (graph[i][j] <= criterion) {
						no[i][j] = -1;
					}
				}
			}

			// 조건 2개다
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (no[i][j] != -1 && !visited[i][j]) {
						countBlobs(i, j);
						cnt++;
					}
				}
			}

			answers.add(cnt);

			for (int[] temp : no) {
				Arrays.fill(temp, 0);
			}
			for (boolean[] temp : visited) {
				Arrays.fill(temp, false);
			}
			cnt = 0;
		}

		if (Collections.max(answers) == 0) {
			System.out.println(1);
		} else {
			System.out.println(Collections.max(answers));
		}
	}
}
