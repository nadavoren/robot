package compressor;

import edu.wpi.first.wpilibj.Compressor;

public class robot {
	Compressor c = new Compressor(0);

	public void doSomething() {
	c.setClosedLoopControl(true);
	c.setClosedLoopControl(false);
	boolean enabled = c.enabled();
	boolean pressureSwitch = c.getPressureSwitchValue();
	double current = c.getCompressorCurrent();

	}



}
