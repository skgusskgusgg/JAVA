package exec01;
class Parent {  }

class Child extends Parent {}

class Brother extends Parent { }

public class test22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f = new Fighter();
		if(f instanceof Unit) {System.out.println("자손");}
		if(f instanceof Fightable) {System.out.println("자손");}
		if(f instanceof Movable) {System.out.println("자손");}
		if(f instanceof Attackable) {System.out.println("자손");}
		if(f instanceof Object) {System.out.println("자손");}

	}
}
class Fighter extends Unit implements Fightable{
	public void move(int x, int y) {}
	public void attack(Unit u) {}
}
class Unit{
	int currentHP;
	int x;
	int y;
}
interface Fightable extends Movable, Attackable{}
interface Movable {void move(int x, int y);}
interface Attackable {void attack(Unit u);}
