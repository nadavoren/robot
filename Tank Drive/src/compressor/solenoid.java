package compressor;

import edu.wpi.first.wpilibj.Solenoid;

public class solenoid {
	public void doSomething() {

	Solenoid exampleSolenoid = new Solenoid(1);

	exampleSolenoid.set(true);
	exampleSolenoid.set(false);

	}
}
