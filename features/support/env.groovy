import geb.Browser

this.metaClass.mixin(cuke4duke.GroovyDsl)

Before() {
  browser = new Browser()
}