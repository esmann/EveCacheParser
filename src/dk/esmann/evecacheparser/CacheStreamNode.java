package dk.esmann.evecacheparser;

import dk.esmann.evecacheparser.enums.EveStreamCode;

/**
 * Created with IntelliJ IDEA.
 * User: Alex Esmann
 * Date: 5/16/12
 * Time: 7:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class CacheStreamNode extends CacheNode {

    CacheStreamNode() {
       super(EveStreamCode.StreamStart);
    }

    CacheStreamNode(EveStreamCode type) {
        super(type);
    }

    CacheStreamNode(CacheStreamNode node) throws CloneNotSupportedException {
        super(node);
    }
}
