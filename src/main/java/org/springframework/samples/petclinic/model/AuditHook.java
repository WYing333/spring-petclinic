package org.springframework.samples.petclinic.model;
import org.springframework.samples.petclinic.owner.OwnerController;
public class AuditHook {
    private Class<?> ref = OwnerController.class;
    public String owner() { return ref.getSimpleName(); }
}
