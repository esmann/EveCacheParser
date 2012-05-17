package dk.esmann.evecacheparser;

import dk.esmann.evecacheparser.enums.EveStreamCode;

/**
 * Created with IntelliJ IDEA.
 * User: Alex Esmann
 * Date: 5/16/12
 * Time: 8:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class CacheIdentNode extends CacheNode{

    private String name;

    CacheIdentNode(String name) {
        super(EveStreamCode.Ident);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
