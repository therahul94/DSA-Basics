public class stringBuilderSpeed {
    public static void main(String[] args) {
        int n = 100000;
        
        long startTime = System.currentTimeMillis();
        // String s = "";
        // for(int i = 0; i < n; i ++) {
        //     s += i;
        // }
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < n; i ++) {
            sb.append(i);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println(duration);
    }
}
