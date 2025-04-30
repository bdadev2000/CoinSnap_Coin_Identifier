package com.google.protobuf;

/* loaded from: classes3.dex */
public enum O0 implements V2 {
    JS_NORMAL(0),
    JS_STRING(1),
    JS_NUMBER(2);

    public static final int JS_NORMAL_VALUE = 0;
    public static final int JS_NUMBER_VALUE = 2;
    public static final int JS_STRING_VALUE = 1;
    private static final W2 internalValueMap = new W2() { // from class: com.google.protobuf.M0
        @Override // com.google.protobuf.W2
        public O0 findValueByNumber(int i9) {
            return O0.forNumber(i9);
        }
    };
    private final int value;

    O0(int i9) {
        this.value = i9;
    }

    public static O0 forNumber(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    return null;
                }
                return JS_NUMBER;
            }
            return JS_STRING;
        }
        return JS_NORMAL;
    }

    public static W2 internalGetValueMap() {
        return internalValueMap;
    }

    public static X2 internalGetVerifier() {
        return N0.INSTANCE;
    }

    @Override // com.google.protobuf.V2
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static O0 valueOf(int i9) {
        return forNumber(i9);
    }
}
