package Test;

public class test2 {
    public static int countFaults(int n, int m, String[] logs) {
        int count = 0;
        int[] faultsArr = new int[n+1];
        for(int i = 0; i < m; i ++) {
            String[] server = logs[i].split(" ");
            int serverIdx = Integer.parseInt(server[0].substring(1));
            String serverStatus = server[1];
            if(serverStatus.equals("error")) {
                faultsArr[serverIdx] += 1;
            }   
            else {
                faultsArr[serverIdx] = 0;
            }
            if(faultsArr[serverIdx] >= 3) {
                count ++;
            }
        }
       
        return count;
    }
    public static void main(String[] args) {
        int n = 5;
        int m = 7;
        String[] logs = new String[]{"s1 error", "s2 error", "s1 error", "s4 success", "s5 error", "s3 success", "s1 error"};
        System.out.println(countFaults(n, m, logs));
    }
}
