package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes4.dex */
public final class z9 {
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

    private z9() {
    }

    public static int getTagFieldNumber(int i10) {
        return i10 >>> 3;
    }

    public static int getTagWireType(int i10) {
        return i10 & 7;
    }

    public static int makeTag(int i10, int i11) {
        return (i10 << 3) | i11;
    }

    public static Object readPrimitiveField(r0 r0Var, t9 t9Var, y9 y9Var) throws IOException {
        switch (o9.$SwitchMap$com$google$protobuf$WireFormat$FieldType[t9Var.ordinal()]) {
            case 1:
                return Double.valueOf(r0Var.readDouble());
            case 2:
                return Float.valueOf(r0Var.readFloat());
            case 3:
                return Long.valueOf(r0Var.readInt64());
            case 4:
                return Long.valueOf(r0Var.readUInt64());
            case 5:
                return Integer.valueOf(r0Var.readInt32());
            case 6:
                return Long.valueOf(r0Var.readFixed64());
            case 7:
                return Integer.valueOf(r0Var.readFixed32());
            case 8:
                return Boolean.valueOf(r0Var.readBool());
            case 9:
                return r0Var.readBytes();
            case 10:
                return Integer.valueOf(r0Var.readUInt32());
            case 11:
                return Integer.valueOf(r0Var.readSFixed32());
            case 12:
                return Long.valueOf(r0Var.readSFixed64());
            case 13:
                return Integer.valueOf(r0Var.readSInt32());
            case 14:
                return Long.valueOf(r0Var.readSInt64());
            case 15:
                return y9Var.readString(r0Var);
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
