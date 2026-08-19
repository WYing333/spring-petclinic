package org.springframework.samples.petclinic.system;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
@Controller
public class MetricsController {
    @GetMapping("/metrics/health")
    public String health() { return "ok"; }
}
