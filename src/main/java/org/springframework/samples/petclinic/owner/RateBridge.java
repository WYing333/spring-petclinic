package org.springframework.samples.petclinic.owner;
import org.springframework.samples.petclinic.vet.RateSource;
public class RateBridge {
    private final RateSource source = new RateSource();
    public double rate(int units) { return source.base() * units; }
}
