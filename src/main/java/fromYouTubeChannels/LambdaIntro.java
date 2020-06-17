package fromYouTubeChannels;

public class LambdaIntro {

    public static void main(String[] args) {
        ISum summer = new ISum() {
            public int sum(int a, int b) {
                return a + b;
            }
        };
    }

    @FunctionalInterface
    public interface ISum {
        public int sum(int a, int b);
    }
}