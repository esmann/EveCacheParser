package dk.esmann.evecacheparser;

import dk.esmann.evecacheparser.enums.EveStreamCode;

/**
 * Created with IntelliJ IDEA.
 * User: Alex Esmann
 * Date: 5/16/12
 * Time: 7:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class CacheTupleNode extends CacheNode {

    protected Integer givenLength;

    CacheTupleNode(Integer length) {
        super(EveStreamCode.NTuple);
        this.givenLength = length;
    }

    CacheTupleNode(CacheTupleNode node) throws CloneNotSupportedException {
        super(node);
        this.givenLength = node.givenLength();
    }

    public Integer givenLength() {
        return givenLength;
    }
}

