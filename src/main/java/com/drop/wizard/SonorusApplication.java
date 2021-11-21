package com.drop.wizard;

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
    public void run(final SonorusConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
