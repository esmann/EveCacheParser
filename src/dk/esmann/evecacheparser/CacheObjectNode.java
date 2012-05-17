package dk.esmann.evecacheparser;

import dk.esmann.evecacheparser.enums.EveStreamCode;

/**
 * Created with IntelliJ IDEA.
 * User: Alex Esmann
 * Date: 5/16/12
 * Time: 9:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class CacheObjectNode extends CacheNode {

    CacheObjectNode() {
        super(EveStreamCode.Object);
    }

    public String getName() {
        CacheNode cur = this;

        while(cur.members.size() > 0) {
            cur = cur.members.get(0);
        }

        if (cur instanceof CacheStringNode) { // TODO make sure this works as intended
            CacheStringNode string = (CacheStringNode) cur;
            return string.getName();
        }

        return "";
    }
}
