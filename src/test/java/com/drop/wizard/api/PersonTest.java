package com.drop.wizard.api;

import static io.dropwizard.testing.FixtureHelpers.*;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import io.dropwizard.jackson.Jackson;
import org.junit.jupiter.api.Test;
import com.fasterxml.jackson.databind.ObjectMapper;

public class PersonTest {

    private static final ObjectMapper MAPPER = Jackson.newObjectMapper();

    @Test
    public void serializesToJSON() throws Exception {
        final Person person = new Person("Luther Blissett", "lb@example.com");

        final String expected = MAPPER
                .writeValueAsString(MAPPER.readValue(fixture("fixtures/person.json"), Person.class));

        assertThat(MAPPER.writeValueAsString(person)).isEqualTo(expected);
    }

    @Test
    public void testPerson() {
        System.out.println("Running Test");
        final Person person = new Person("Jojo", "StarPlatinum@jostar.com");
        assertEquals("Jojo", person.getName());
        person.setName("Dio");
        assertEquals("Dio", person.getName());
    }
}