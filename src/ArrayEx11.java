package src;

public class ArrayEx11 {
    public static void main(String[] args) {
        // 정수 numArr을 담는 배열 만듬 값은 10
        int[] numArr = new int[10];
        // 정수 counter을 담는 배열 만듬 값은 10
        int[] counter = new int[10];
        // numArr을 길이만큼 돌리는 for문 만듬 (값 i로)
        for (int i = 1; i < numArr.length; i++) {
            // numArr을 i값의 배열에 담고 int 형변환 후에 난수 0~9개를 배열에 저장함
            numArr[i] = (int) (Math.random() * 10);
            //줄바꿈
            System.out.println();
        }
            // numArr을 길이만큼 돌리는 for문 만듬 (값 i로)
            for (int i= 0; i< numArr.length; i++) {
            // counter을 numArr 안의 i값을 배열에담고 후위형으로 증가시킴
                counter[numArr[i]]++;
            }
            for(int i=0; i< numArr.length; i++){
                System.out.println(i+"의 개수 :"+ counter[i]);
            // numArr의 길이만큼 for문
            // i +"의 개수 : " + counter[i] 시스아웃

        }
    }
}
