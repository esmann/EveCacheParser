package dk.esmann.evecacheparser;

import dk.esmann.evecacheparser.enums.EveStreamCode;

/**
 * Created with IntelliJ IDEA.
 * User: Alex Esmann
 * Date: 5/16/12
 * Time: 9:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class CacheDBRecordsNode extends CacheNode {

    CacheDBRecordsNode() {
        super(EveStreamCode.CompressedRow);
    }
}
