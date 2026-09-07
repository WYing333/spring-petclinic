package org.springframework.samples.petclinic.system;

import org.springframework.samples.petclinic.owner.Owner;

/** Cross-package caller of Owner.probeTag (system -> owner). */
public class ProbeCaller {

	public String call(Owner owner) {
		return owner.probeTag();
	}
}
