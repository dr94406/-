import com.sun.jdi.Value;

public class EqualsEx1 {
    public static void main(String[] args) {
        Value3 v1 = new Value3(10);
        Value3 v2 = new Value3(10);

        if(v1.equals(v2))
            System.out.println("v1과 v2는 같음");

        else
            System.out.println("v1과 v2는 다름");
        v2 = v1;

        if(v1.equals(v2))
            System.out.println("v1과 v2는 같다");
        else
            System.out.println("v1과 v2는 다르다");
    }
}

class Value3 {
    int value;
    Value3(int value){
        this.value = value;
    }
}
