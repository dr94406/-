package src;

class Tv10 {
    boolean power; // 전원상태(on/off)
    int channel; // 채널
    void power() {power = !power;}
    void channelUp() {++channel;}
    void channelDown() {--channel;}
}

class CaptionTv extends Tv10{
    boolean caption; // 캡션상태
    void displayCaption(String text) {
        if(caption) { //캡션 상태가 on일 때만 text를 보여줌
            System.out.println(text);
        }
    }
}
class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello, World");
        ctv.caption = true;
        ctv.displayCaption("Hello,World");
    }
}
