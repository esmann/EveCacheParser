package dk.esmann.evecacheparser;

import dk.esmann.evecacheparser.enums.EveStreamCode;

/**
 * Created with IntelliJ IDEA.
 * User: Alex Esmann
 * Date: 5/16/12
 * Time: 7:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class CacheDBHeader extends CacheNode{

    CacheDBHeader() {
        super(EveStreamCode.CompressedRow);
    }
}
