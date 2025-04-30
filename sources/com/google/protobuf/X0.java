package com.google.protobuf;

/* loaded from: classes3.dex */
public enum X0 implements V2 {
    SPEED(1),
    CODE_SIZE(2),
    LITE_RUNTIME(3);

    public static final int CODE_SIZE_VALUE = 2;
    public static final int LITE_RUNTIME_VALUE = 3;
    public static final int SPEED_VALUE = 1;
    private static final W2 internalValueMap = new W2() { // from class: com.google.protobuf.V0
        @Override // com.google.protobuf.W2
        public X0 findValueByNumber(int i9) {
            return X0.forNumber(i9);
        }
    };
    private final int value;

    X0(int i9) {
        this.value = i9;
    }

    public static X0 forNumber(int i9) {
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    return null;
                }
                return LITE_RUNTIME;
            }
            return CODE_SIZE;
        }
        return SPEED;
    }

    public static W2 internalGetValueMap() {
        return internalValueMap;
    }

    public static X2 internalGetVerifier() {
        return W0.INSTANCE;
    }

    @Override // com.google.protobuf.V2
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static X0 valueOf(int i9) {
        return forNumber(i9);
    }
}
