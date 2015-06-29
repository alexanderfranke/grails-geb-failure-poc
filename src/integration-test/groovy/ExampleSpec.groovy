import spock.lang.Specification
import geb.spock.GebSpec
import grails.util.Holders
import grails.test.mixin.integration.Integration

@Integration
class ExampleSpec extends GebSpec {

    def setupSpec() {
        def testdataDB = Holders.config.someProperty
    }

    def "test"() {
        expect:
        true == true
    }
}