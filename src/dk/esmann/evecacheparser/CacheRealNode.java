package dk.esmann.evecacheparser;

import dk.esmann.evecacheparser.enums.EveStreamCode;

/**
 * Created with IntelliJ IDEA.
 * User: Alex Esmann
 * Date: 5/16/12
 * Time: 8:50 PM
 * To change this template use File | Settings | File Templates.
 */
public class CacheRealNode extends CacheNode {

    Double value;

    CacheRealNode(Double value) {
        super(EveStreamCode.Real);
        this.value = value;
    }

    public Double getValue() {
        return this.value;
    }
}
