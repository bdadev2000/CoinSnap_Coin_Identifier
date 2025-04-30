package com.google.protobuf;

/* loaded from: classes3.dex */
public enum L5 {
    NULL_VALUE(1),
    NUMBER_VALUE(2),
    STRING_VALUE(3),
    BOOL_VALUE(4),
    STRUCT_VALUE(5),
    LIST_VALUE(6),
    KIND_NOT_SET(0);

    private final int value;

    L5(int i9) {
        this.value = i9;
    }

    public static L5 forNumber(int i9) {
        switch (i9) {
            case 0:
                return KIND_NOT_SET;
            case 1:
                return NULL_VALUE;
            case 2:
                return NUMBER_VALUE;
            case 3:
                return STRING_VALUE;
            case 4:
                return BOOL_VALUE;
            case 5:
                return STRUCT_VALUE;
            case 6:
                return LIST_VALUE;
            default:
                return null;
        }
    }

    public int getNumber() {
        return this.value;
    }

    @Deprecated
    public static L5 valueOf(int i9) {
        return forNumber(i9);
    }
}
