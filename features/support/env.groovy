import geb.Browser

this.metaClass.mixin(cuke4duke.GroovyDsl)

After {
  browser.clearCookies()
}

World {
  new Bling()
}

class Bling {
  @Delegate Browser browser = new Browser('http://wikipedia.org')
}
