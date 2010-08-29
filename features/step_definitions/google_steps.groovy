import static org.junit.Assert.*
import static org.junit.matchers.JUnitMatchers.*

import pages.*

this.metaClass.mixin(cuke4duke.GroovyDsl)

Given(~"I am on the Google search page") { ->
	browser.to GoogleHomePage
	// google home page does a lot of stuff after page load
	// so we need to wait a little bit to ensure the page is usable
	Thread.sleep(1000) 
	assert browser.at(GoogleHomePage)
}

When(~"I search for \"(.*)\"") { String query ->
	browser.searchField.value(query)
	browser.searchButton.click()
}

Then(~"I am at the results page") {
	assert browser.at(GoogleResultsPage)
}

Then(~"The first link should be \"(.*)\"") { String text ->
	browser.waitForResults()
	assertThat browser.resultLink(0).text(), containsString(text)
}