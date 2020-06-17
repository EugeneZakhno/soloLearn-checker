package fromYouTubeChannels;
// video from youtube от Вечеслава Ковалевского
// https://www.youtube.com/watch?v=Wc4CIUlfpWg
public class LambdaIntro {

    public static void main(String[] args) {
        ISum summer = new ISum() {
            public int sum(int a, int b) {
                return a + b;
            }
        };

        ISum summer2 = (a, b) -> a + b;
    }

    @FunctionalInterface
    public interface ISum {
        public int sum(int a, int b);
    }
}