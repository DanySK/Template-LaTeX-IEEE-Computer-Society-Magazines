import de.fayard.dependencies.bootstrapRefreshVersionsAndDependencies

rootProject.name = "ieee-csmag-template"

buildscript {
    repositories { gradlePluginPortal() }
    dependencies.classpath("de.fayard:dependencies:+")
}

bootstrapRefreshVersionsAndDependencies()
