package dk.esmann.evecacheparser;

import dk.esmann.evecacheparser.enums.EveStreamCode;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Alex Esmann
 * Date: 5/16/12
 * Time: 9:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class CacheDBRowNode extends CacheNode {

    private Integer id;
    private Boolean last;
    private ArrayList<Character> data;

    CacheDBRowNode (Integer magic, ArrayList<Character> data) {
        super(EveStreamCode.CompressedRow);
        this.id = magic;
        this.last = false;
        this.data = data;
    }

    private Boolean isLast() {
        return this.last;
    }

    private void setLast(Boolean last) {
        this.last = last;
    }
}
