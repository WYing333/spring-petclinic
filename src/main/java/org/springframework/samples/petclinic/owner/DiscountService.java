package org.springframework.samples.petclinic.owner;
public class DiscountService {
    private final OwnerRepository repo;
    public DiscountService(OwnerRepository repo) { this.repo = repo; }
    public double discountFor(Owner o) { return o == null ? 0.0 : 0.1; }
}
