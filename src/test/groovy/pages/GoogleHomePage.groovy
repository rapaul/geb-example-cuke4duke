package pages

import geb.*

class GoogleHomePage extends Page {
	static url = "http://google.com"
	static at = { title == "Google" }
	static content = {
		searchField { $("input", name: "q") }
		searchButton(to: GoogleResultsPage) { $("input", value: "Google Search")  }
	}
}
