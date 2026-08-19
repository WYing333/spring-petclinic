package org.springframework.samples.petclinic.vet;
public class VetStats {
    private final VetRepository repo;
    public VetStats(VetRepository repo) { this.repo = repo; }
    public int specialties(Vet v) { return v == null ? 0 : v.getNrOfSpecialties(); }
}
