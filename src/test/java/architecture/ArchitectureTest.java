package architecture;

import architecture.rules.PortRules;
import com.tngtech.archunit.core.importer.ImportOption;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.junit.ArchTests;

@AnalyzeClasses(
    importOptions = {
            ImportOption.DoNotIncludeJars.class,
            ImportOption.DoNotIncludeArchives.class,
            ImportOption.DoNotIncludeTests.class,
            ImportOption.DoNotIncludePackageInfos.class
    },
    packages = ".."
)
public class ArchitectureTest {

    @ArchTest
    public static final ArchTests portRules = ArchTests.in(PortRules.class);
}
