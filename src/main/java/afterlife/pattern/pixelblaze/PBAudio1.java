package afterlife.pattern.pixelblaze;

import heronarts.lx.LX;

public class PBAudio1 extends PixelblazePattern {

	public PBAudio1(LX lx) {
		super(lx);
	}

	@Override
	protected String getScriptName() {
		return "audio1";
	}

	@Override
	protected void run(double deltaMs) {
		runAfterlifeBasePattern(deltaMs);
	}
}
