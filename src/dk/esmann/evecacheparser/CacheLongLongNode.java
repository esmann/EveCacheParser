package dk.esmann.evecacheparser;

import dk.esmann.evecacheparser.enums.EveStreamCode;

import java.math.BigInteger;

/**
 * Created with IntelliJ IDEA.
 * User: Alex Esmann
 * Date: 5/16/12
 * Time: 9:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class CacheLongLongNode extends CacheNode {
    
    private BigInteger value;
    
    CacheLongLongNode(BigInteger value) {
        super(EveStreamCode.LongLong);
        this.value = value;
    }
    
    public BigInteger getValue() {
        return this.value;
    }
}
