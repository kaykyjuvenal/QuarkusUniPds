package org.juvenal.flavio.kayky;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Readiness
public class ReadinessCheck implements HealthCheck {

    @RestClient
    StarWarsService starWarsService;

    @Override
    public HealthCheckResponse call() {
        if (starWarsService.getStarships().contains(StarWarsService.MSG_ERROR)){
            return HealthCheckResponse.down("Starships not found");
        }
        else{
            return HealthCheckResponse.down("Starships found");
        }
    }
}
