package Exception;

public class ExceptionEx9 {
    public static void main(String[] args) {
        try{
            Exception e = new Exception("고의로 발생시켰음.");
            throw e; // 고의 예외 발생
            // throw new Exception("고의로 발생시킴");
        } catch(Exception e) {
            System.out.println("에러메시지 : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("정상종료");
    }
}
