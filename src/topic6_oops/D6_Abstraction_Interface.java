package topic6_oops;

public interface D6_Abstraction_Interface {

	public abstract void m1();

}

interface ABC1 {

	public abstract void m1();

	public abstract void m2();
}

interface ABC2 extends ABC1, D6_Abstraction_Interface {

	public abstract void m3();
}
