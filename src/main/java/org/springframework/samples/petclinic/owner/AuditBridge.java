package org.springframework.samples.petclinic.owner;

/**
 * Test fixture: a util-level bridge that reaches UP into the api layer
 * (backward crossing). One-way — nothing depends on it and PetController does
 * not reference it, so no cycle; isolates the BC crossing.
 */
public class AuditBridge {

	public String audit() {
		return PetController.auditTag();
	}
}
