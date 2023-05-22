package architecture.rules;

import architecture.PackagesConstants;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

public class PortRules {

    @ArchTest
    public static final ArchRule noClassesShouldResideInAPackageCorePorts =
        noClasses().should().resideInAPackage(PackagesConstants.corePortsPackageName);

    @ArchTest
    public static final ArchRule classesThatResideInAPackagePortsInShouldBeInterfaces =
        classes().that().resideInAPackage(PackagesConstants.corePortsInPackageName)
            .should().beInterfaces()
            .andShould().haveSimpleNameEndingWith("PortIn");

    @ArchTest
    public static final ArchRule classesThatResideInAPackagePortsOutShouldBeInterfaces =
        classes().that().resideInAPackage(PackagesConstants.corePortsOutPackageName)
            .should().beInterfaces()
            .andShould().haveSimpleNameEndingWith("PortOut");
}
