package Practice;
 class FighterTest2 {
     public static void main(String[] args) {
         Fighter2 f = new Fighter2();

         if ( f instanceof Unit2)
             System.out.println("f는 Unit 클래스의 자손");
         if (f instanceof Fightable2)
             System.out.println("f는 Fightable인터페이스를 구현");
         if (f instanceof Movable)
             System.out.println("f는 Movable인터페이스를 구현");
         if( f instanceof Attackable)
             System.out.println("f는 Attackable인터페이스를 구현");
         if(f instanceof Object)
             System.out.println("f는 Object클래스의 자손");
     }
}
class Fighter2 implements Fightable2, Unit2 {
     public void main(int x , int y){}
    public void attack(Unit u) {}

    @Override
    public void move(int x, int y) {

    }
}
interface Unit2{
     int currentHP = 0;
     int x = 0;
     int y = 0;
}
interface Fightable2 extends Movable, Attackable{}
interface Movable2{void move(int x, int y);}
interface Attackable2 {void attack(Unit u);}
