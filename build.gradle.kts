plugins {
  id("org.danilopianini.gradle-latex")
}

latex {
    "CsMag_template"() {
        bib = "bibliography.bib"
    }
}
