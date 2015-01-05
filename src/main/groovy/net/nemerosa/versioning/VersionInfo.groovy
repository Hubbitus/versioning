package net.nemerosa.versioning

import groovy.transform.Canonical
import groovy.transform.builder.Builder

/**
 * Version information generated by the plug-in.
 */
@Builder
@Canonical
class VersionInfo {

    String display
    String full
    String branch
    String build
    String source
    String sourcetype
    String commit

}