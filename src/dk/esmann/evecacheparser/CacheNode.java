package dk.esmann.evecacheparser;

import dk.esmann.evecacheparser.enums.EveStreamCode;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Alex Esmann
 * Date: 5/16/12
 * Time: 6:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class CacheNode {
    private EveStreamCode type;
    protected ArrayList<CacheNode> members;

    CacheNode(CacheNode node) throws CloneNotSupportedException {
        for(CacheNode newNode : node.getMembers()) {
            members.add((CacheNode) newNode.clone());
        }
        this.type = node.getType();
    }

    CacheNode(EveStreamCode type) {
        this.type = type;
    }

    public EveStreamCode getType() {
        return this.type;
    }

    public void setType(EveStreamCode type) {
        this.type = type;
    }

    public void addMember(CacheNode node) {
        members.add(node);
    }

    public ArrayList<CacheNode> getMembers() {
        return this.members;
    }
}
