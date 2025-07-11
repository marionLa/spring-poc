package com.kairos.poc_project;

import org.junit.jupiter.api.Test;
import org.springframework.modulith.core.ApplicationModules;
import org.springframework.modulith.docs.Documenter;
import org.springframework.modulith.test.ApplicationModuleTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@ApplicationModuleTest
class ModulithStructureTest {
    @Test
    void verifyModularStructure() {
        ApplicationModules modules = ApplicationModules.of(PocProjectApplication.class);
        modules.verify();
    }

    @Test
    void writeModuleDocumentation() {
        ApplicationModules modules = ApplicationModules.of(PocProjectApplication.class);
        new Documenter(modules).writeDocumentation();
        assertTrue(true);
    }
}
