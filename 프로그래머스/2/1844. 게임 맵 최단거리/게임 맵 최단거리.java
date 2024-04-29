
import java.util.*;

class Position {
    int x;
    int y;
    int cnt; // 시작점부터 현재 위치까지의 거리

    public Position(int x, int y, int cnt) {
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }
}

class Solution {
    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};

    public int solution(int[][] maps) {
        return bfs(0, 0, maps);
    }

    public int bfs(int x, int y, int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        boolean[][] visited = new boolean[n][m];
        Queue<Position> queue = new LinkedList<>();

        // 시작 위치를 큐에 추가하고 방문 처리
        queue.add(new Position(x, y, 1));
        visited[x][y] = true;

        while (!queue.isEmpty()) {
            Position current = queue.poll();

            // 도착지점에 도달한 경우 현재 경로의 길이 반환
            if (current.x == n - 1 && current.y == m - 1) {
                return current.cnt;
            }

            // 이동 시도
            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];

//                if (nx >= 0 && nx < n && ny >= 0 && ny < m && maps[nx][ny] == 1 && !visited[nx][ny]) {
                // nx와 ny가 지도의 범위 안에 있는지 확인
                if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                    // 해당 위치가 방문하지 않은 길(1)인지 확인
                    if (maps[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true; // 방문 처리
                        queue.add(new Position(nx, ny, current.cnt + 1)); // 큐에 추가
                    }
                }
            }
        }

        // 도착지점에 도달하지 못한 경우
        return -1;
    }
}