package com.drop.wizard;

import com.drop.wizard.health.TemplateHealthCheck;
import com.drop.wizard.resources.HelloWorldResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class SonorusApplication extends Application<SonorusConfiguration> {

    public static void main(final String[] args) throws Exception {
        new SonorusApplication().run(args);
    }

    @Override
    public String getName() {
        return "Sonorus";
    }

    @Override
    public void initialize(final Bootstrap<SonorusConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final SonorusConfiguration configuration, final Environment environment) {
        final HelloWorldResource resource = new HelloWorldResource(configuration.getTemplate(),
                configuration.getDefaultName());
        final TemplateHealthCheck healthCheck = new TemplateHealthCheck(configuration.getTemplate());
        environment.healthChecks().register("template", healthCheck);
        environment.jersey().register(resource);
    }

}
