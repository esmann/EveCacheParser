package dk.esmann.evecacheparser;

import dk.esmann.evecacheparser.enums.EveStreamCode;

/**
 * Created with IntelliJ IDEA.
 * User: Alex Esmann
 * Date: 5/16/12
 * Time: 8:07 PM
 * To change this template use File | Settings | File Templates.
 */
public class CacheDictNode extends CacheNode {

    protected Integer givenLength;

    CacheDictNode(Integer length) {
        super(EveStreamCode.Dict);
        this.givenLength = length;
    }

    CacheDictNode(CacheDictNode node) throws CloneNotSupportedException {
        super(node);
        this.givenLength = node.getGivenLength();
    }

    public Integer getGivenLength() {
        return givenLength;
    }

    public void addMember(CacheNode node) {
        assert(members.size() < givenLength);
        members.add(node);
    }

    CacheNode getByName(String target) {
        if ((members.size() < 2) || (isOdd(members.size()))) {
            return null;
        }

        // TODO what the hell is going on here.
        for (Integer i = 1; i < members.size(); i += 2) {
            CacheNode node = members.get(i);
            if (node instanceof CacheIdentNode) { // TODO will this even work as intended?
                CacheIdentNode identNode = (CacheIdentNode) node;
                if (identNode.getName().equals(target)) {
                    return members.get(i-1);
                }
            }
        }
        return null;
    }

    private Boolean isOdd(Integer number) {
        return ((number % 1) == 0);
    }
}
