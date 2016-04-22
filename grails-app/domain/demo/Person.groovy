// grails-app/domain/demo/Person.groovy

package demo

class Person {
    String name

    static constraints = {
        name matches: /[A-Z].*/
    }
}
