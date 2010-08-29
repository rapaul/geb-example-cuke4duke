package pages

import geb.*

class GoogleResultsPage extends Page {
	static at = { waitForResults() }
	static content = {
		resultStats { $("div#resultStats") }
		results(required: false) { $("li.g") }
		result { results[it] }
		resultLink { result(it).find("a.l") }
	}
	
	def waitForResults() {
		// content is added dynamically after load so may not be available when
		// we look for it, which is why we wait for it to become available
		waitFor { results }
	}
}
