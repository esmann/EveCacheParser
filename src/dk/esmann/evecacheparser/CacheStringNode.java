package dk.esmann.evecacheparser;

import dk.esmann.evecacheparser.enums.EveStreamCode;

/**
 * Created with IntelliJ IDEA.
 * User: Alex Esmann
 * Date: 5/16/12
 * Time: 8:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class CacheStringNode extends CacheNode {

    private String name;

    CacheStringNode(String name) {
        super(EveStreamCode.String);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
