import geb.Browser
this.metaClass.mixin(cuke4duke.GroovyDsl)

World {
  new Browser('http://wikipedia.org')
}

After {
  clearCookies()
}
