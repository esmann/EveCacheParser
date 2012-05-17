package dk.esmann.evecacheparser;

import dk.esmann.evecacheparser.enums.EveStreamCode;

/**
 * Created with IntelliJ IDEA.
 * User: Alex Esmann
 * Date: 5/16/12
 * Time: 8:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class CacheIntegerNode extends CacheNode {

    private Integer value;

    CacheIntegerNode(Integer value) {
        super(EveStreamCode.Integer);
        this.value = value;
    }

    public Integer getValue() {
        return this.value;
    }
}
