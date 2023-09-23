/*시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	128 MB	334828	158061	132604	47.362%
문제
(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.

(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

출력
첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.

예제 입력 1 
472
385
예제 출력 1 
2360
3776
1416
181720
*/
package Sep1823;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class no2588 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		int a = Integer.parseInt(bf.readLine());
		char[] b = bf.readLine().toCharArray();
		int l=b.length;
		int sum=0;
		for(int i=0;i<l;i++) {
			sb.append(a*(b[l-i-1]-'0'));
			sb.append("\n");
			sum+=a*(b[l-i-1]-'0')*Math.pow(10, i);
		}
		sb.append(sum);
		System.out.println(sb);
	}

}
