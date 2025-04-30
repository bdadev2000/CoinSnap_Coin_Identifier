package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class Y5 {
    static final int FIXED32_SIZE = 4;
    static final int FIXED64_SIZE = 8;
    static final int MAX_VARINT32_SIZE = 5;
    static final int MAX_VARINT64_SIZE = 10;
    static final int MAX_VARINT_SIZE = 10;
    static final int MESSAGE_SET_ITEM = 1;
    static final int MESSAGE_SET_MESSAGE = 3;
    static final int MESSAGE_SET_TYPE_ID = 2;
    static final int TAG_TYPE_BITS = 3;
    static final int TAG_TYPE_MASK = 7;
    public static final int WIRETYPE_END_GROUP = 4;
    public static final int WIRETYPE_FIXED32 = 5;
    public static final int WIRETYPE_FIXED64 = 1;
    public static final int WIRETYPE_LENGTH_DELIMITED = 2;
    public static final int WIRETYPE_START_GROUP = 3;
    public static final int WIRETYPE_VARINT = 0;
    static final int MESSAGE_SET_ITEM_TAG = makeTag(1, 3);
    static final int MESSAGE_SET_ITEM_END_TAG = makeTag(1, 4);
    static final int MESSAGE_SET_TYPE_ID_TAG = makeTag(2, 0);
    static final int MESSAGE_SET_MESSAGE_TAG = makeTag(3, 2);

    private Y5() {
    }

    public static int getTagFieldNumber(int i9) {
        return i9 >>> 3;
    }

    public static int getTagWireType(int i9) {
        return i9 & 7;
    }

    public static int makeTag(int i9, int i10) {
        return (i9 << 3) | i10;
    }

    public static Object readPrimitiveField(S s5, S5 s52, X5 x52) throws IOException {
        switch (N5.$SwitchMap$com$google$protobuf$WireFormat$FieldType[s52.ordinal()]) {
            case 1:
                return Double.valueOf(s5.readDouble());
            case 2:
                return Float.valueOf(s5.readFloat());
            case 3:
                return Long.valueOf(s5.readInt64());
            case 4:
                return Long.valueOf(s5.readUInt64());
            case 5:
                return Integer.valueOf(s5.readInt32());
            case 6:
                return Long.valueOf(s5.readFixed64());
            case 7:
                return Integer.valueOf(s5.readFixed32());
            case 8:
                return Boolean.valueOf(s5.readBool());
            case 9:
                return s5.readBytes();
            case 10:
                return Integer.valueOf(s5.readUInt32());
            case 11:
                return Integer.valueOf(s5.readSFixed32());
            case 12:
                return Long.valueOf(s5.readSFixed64());
            case 13:
                return Integer.valueOf(s5.readSInt32());
            case 14:
                return Long.valueOf(s5.readSInt64());
            case 15:
                return x52.readString(s5);
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
