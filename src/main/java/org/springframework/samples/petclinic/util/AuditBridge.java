package org.springframework.samples.petclinic.util;

import org.springframework.samples.petclinic.owner.PetController;

/**
 * Test fixture: a util-level bridge that reaches UP into the api layer
 * (backward crossing). One-way — nothing depends on it and PetController does
 * not reference it, so no cycle; isolates the BC crossing. Lives in the
 * {@code util} package so the layer classifier places it in {@code utils}.
 */
public class AuditBridge {

	public String audit() {
		return PetController.auditTag();
	}

}
