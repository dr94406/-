package Practice;

abstract class Unit3{
    int x, y;
    abstract void move(int x, int y);
    void stop(){
        System.out.println("멈춥니다.");
    }

    interface Fightable4{ // interface의 모든 method는 public abstract
       public void move(int x, int y);
       public void attack(Fightable4 f);
    }

    class Fighter4 extends Unit3 implements Fightable4{
        public void move(int x, int y){
            System.out.println("["+x+","+y+"]로 이동");
        }
        public void attack(Fightable4 f){
            System.out.println(f+"를 공격");
        }

        Fightable4 getFightable4(){
            Fighter f = new Fighter();
            return (Fightable4)f;
        }
    }
}
public class FighterTTest {
    public static void main(String[] args) {
    Fighter f = new Fighter();
        Fighter f2 = new Fighter();
     }
}
