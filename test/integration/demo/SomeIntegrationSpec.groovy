// test/integration/demo/SomeIntegrationSpec.groovy

package demo

import grails.test.spock.IntegrationSpec

class SomeIntegrationSpec extends IntegrationSpec {

    void "test something"() {
        // this is not a good example of an integration test,
        // just demonstrating that .save() works here...
        expect:
        !new Person(name: 'jeff').save()
        new Person(name: 'Jeff').save()
    }
}
