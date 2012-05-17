package dk.esmann.evecacheparser;

import com.sun.org.apache.xalan.internal.xsltc.dom.SingleNodeCounter;
import dk.esmann.evecacheparser.enums.EveStreamCode;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: Alex Esmann
 * Date: 5/12/12
 * Time: 3:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class EveParser {

    File cacheFile;
    FileInputStream inputStream;

    EveParser(String filename) throws FileNotFoundException {
        cacheFile = new File(filename);
        FileInputStream inputStream = new FileInputStream(cacheFile);
    }

    public CacheNode parseOne() {
        Integer check = null;
        EveStreamCode checkCode = null;
        Integer isShared;
        CacheNode thisObj = null;
        CacheDBRowNode lastDbRow = null;


        try {
            Integer type = inputStream.read(); //TODO readChar

            if (endOfFile(type)) {
                return null;
            }

            check = type & 0x3f; // TODO make sure this works
            checkCode = EveStreamCode.getCode(check);
            isShared = type & 0x40; // TODO make sure this works

        } catch(IOException e) {
            // TODO handle exception
        }


        assert checkCode != null;
        switch (checkCode) {
            case None:
                thisObj = new CacheNoneNode();
                break;
            case Real:
                //Double value = inputStream.read(); // TODO readDouble
                break;
        }
        return null; // TODO remove this
    }

    private boolean endOfFile(Integer type) {
        return type == -1;
    }
}
