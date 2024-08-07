public class DisctanceTwoPoint {
    public static void main(String[] args) {
        int x1=1,y1=1, x2=5, y2=5;
        
        double distance;
        // distance = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
        
        distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));

        System.out.println(distance);
        
        
    }
}
