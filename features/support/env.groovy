import geb.Browser
import geb.report.PageSourceReporter

this.metaClass.mixin(cuke4duke.GroovyDsl)

Before() { scenario ->
	browser = new Browser()
}

After() { scenario ->
	// cuke4duke doesn't provide a way to get the name of the scenario.
	// If it did, you could add reporting (i.e. dumping the page source)
	// by the following code.
	
	// def reportsDir = new File("target/geb-output")
	// def reportName = scenario.name
	
	// new PageSourceReporter(reportsDir).writeReport(reportName, browser)
}