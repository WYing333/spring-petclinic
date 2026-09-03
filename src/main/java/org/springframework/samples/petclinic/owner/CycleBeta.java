package org.springframework.samples.petclinic.owner;

/** Test fixture: forms a 2-node dependency cycle with CycleAlpha (same package). */
public class CycleBeta {

	private CycleAlpha alpha;

	public void link() {
		this.alpha = new CycleAlpha();
	}

	public String describe() {
		return "beta->" + (alpha == null ? "?" : alpha.name());
	}

	public String name() {
		return "beta";
	}
}
