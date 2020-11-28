package p1000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class n15552 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			int cnt = Integer.parseInt(br.readLine());
			for (int i = 0; i < cnt; i++) {
				String num = br.readLine();
				StringTokenizer st = new StringTokenizer(num);
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				String s = (a+b)+"";
				bw.write(s+"\n");
			}
			
		} catch (Exception e) {
		}finally {
			bw.flush();
			bw.close();			
		}
	}
}
