import edu.princeton.cs.algs4.*;
public class DebugExercise3 {
    public static int countTurnips(In in) {
        int totalTurnips = 0;
        while (!in.isEmpty()) {
            String vendor = in.readString();
            String foodType = in.readString();
            double cost = in.readDouble();
            int numAvailable = in.readInt();
            if (foodType.equals("turnip") && numAvailable >= 0) { // 增加 numAvailable >= 0 的检查
                totalTurnips += numAvailable;
            }
        }
        return totalTurnips;
    }

    public static void main(String[] args) {
        In in = null;
        try {
            in = new In("foods.csv");
            System.out.println(countTurnips(in));
        } catch (Exception e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } finally {
            if (in != null) {
                in.close(); // 手动关闭 In 对象
            }
        }
    }
}