package org.springframework.samples.petclinic.owner;

/** Test fixture: forms a 2-node dependency cycle with CycleBeta (same package). */
public class CycleAlpha {

	private CycleBeta beta;

	public CycleAlpha() {
		this.beta = new CycleBeta();
	}

	public String describe() {
		return "alpha->" + (beta == null ? "?" : beta.name());
	}

	public String name() {
		return "alpha";
	}
}
