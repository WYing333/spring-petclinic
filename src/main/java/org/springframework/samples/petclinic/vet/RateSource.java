package org.springframework.samples.petclinic.vet;
import org.springframework.samples.petclinic.owner.RateBridge;
public class RateSource {
    public double base() { return 1.5; }
    public RateBridge bridge() { return new RateBridge(); }
}
