package dk.esmann.evecacheparser.enums;

/**
 * Created with IntelliJ IDEA.
 * User: Alex Esmann
 * Date: 5/12/12
 * Time: 4:31 PM
 * To change this template use File | Settings | File Templates.
 */
public enum EveStreamCode {
    StreamStart(0x7e),
    NTuple(0x14), // a tuple of N objects
    NTuple1(0x15), // a tuple of N objects, variant 2
    TwoTuple(0x2c), // a tuple of 2 objects
    OneTuple(0x25), // a tuple of 1 objects
    OneTuple2(0x27), // a tuple of 1 objects, variant 2
    ZeroTuple(0x24),   // a tuple of 0 objects
    ZeroTuple2(0x26),
    Marker(0x11),  // A one byte identifier code
    Ident(0x13),   // an identifier string
    String(0x2),  // Another type of string, also ids
    String2(0x2e),// stringtastic
    String3(0xf),  // really? another? single character string
    String4(0x10),
    UnicodeString(0x12),
    UnicodeString2(0x29),
    EmptyString(0x28),  // empty
    Integer(0x04), // 4 byte, little endian?
    Real(0x0a),  // floating point, 64 bits, assume matches machine double type
    ZeroReal(0x0b),
    ZeroInteger(0x08),  // int  == 0
    Neg1Integer(0x07), // int  == -1
    OneInteger(0x09), // int  == 1
    BoolTrue(0x1f),
    BoolFalse(0x20),
    Byte(0x6),  // i think
    SizedInt(0x2f), // when you can't decide ahead of time how long to make the integer...
    Short(0x05), // 2 byte
    Dict(0x16), // N objects, consisting of key object and value object
    Object(0x17),  // Object type ?
    None(0x01), // Python None type
    SubStream(0x2b), // substream - len bytes followed by 0x7e
    LongLong(0x3), // 64 bit value?
    CompressedRow(0x2a), // the datatype from hell, a RLEish compressed row
    Object22(0x22), // a database header field of some variety
    Object23(0x23),   // another datatype containing ECompressedRows/DBRows
    SharedObject(0x1b); // shared object reference


    Integer value;
    EveStreamCode(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public static EveStreamCode getCode(Integer value) {
        EveStreamCode[] codes = values();
        for (EveStreamCode code : codes) {
            if (code.getValue().equals(value)) {
                return code;
            }
        }
        return null;
    }
}
