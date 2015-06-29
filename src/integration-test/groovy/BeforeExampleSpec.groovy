import spock.lang.Specification
import geb.spock.GebSpec
import grails.util.Holders
import grails.test.mixin.integration.Integration

@Integration
class BeforeExampleSpec extends GebSpec {

    def "test"() {
        expect:
        true == true
    }
}