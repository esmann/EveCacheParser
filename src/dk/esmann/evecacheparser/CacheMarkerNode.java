package dk.esmann.evecacheparser;

import dk.esmann.evecacheparser.enums.EveStreamCode;

/**
 * Created with IntelliJ IDEA.
 * User: Alex Esmann
 * Date: 5/16/12
 * Time: 8:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class CacheMarkerNode extends CacheNode {

    private Character id;

    CacheMarkerNode(Character character) {
        super(EveStreamCode.Marker);
        this.id = character;
    }

    public Character getId() {
        return this.id;
    }

    String string() {
        // TODO implement (needs ColumnLookup, whatever that is);
        return null;
    }
}
