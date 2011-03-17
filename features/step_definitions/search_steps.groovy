this.metaClass.mixin(cuke4duke.GroovyDsl)

Given(~'I am on the Wikipedia homepage') {
  browser.go()
}

When(~'I search for "(.+)"') { query ->
  browser.find('#searchInput').value(query)
  browser.find('.searchButton').click()
}

Then(~'I am shown the "(.+)" article') { article ->
  assert browser.find('h1').text() == article
}
