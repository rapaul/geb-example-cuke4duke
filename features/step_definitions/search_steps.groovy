this.metaClass.mixin(cuke4duke.GroovyDsl)

Given(~'I am on the Wikipedia homepage') {
  go()
}

When(~'I search for "(.+)"') { query ->
  $('#searchInput').value(query)
  $('.searchButton').click()
}

Then(~'I am shown the "(.+)" article') { article ->
  assert $('h1').text() == article
}

Then(~'I am shown "(.+)"') { text ->
  assert $('li', text:text)
}