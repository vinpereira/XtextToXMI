/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.mapping;

import org.xtext.example.mapping.MappingStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MappingStandaloneSetup extends MappingStandaloneSetupGenerated {
  public static void doSetup() {
    MappingStandaloneSetup _mappingStandaloneSetup = new MappingStandaloneSetup();
    _mappingStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}