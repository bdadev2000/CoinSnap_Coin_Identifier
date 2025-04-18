package com.google.protobuf;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class y2 {
    static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$FieldType$Collection;
    static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$JavaType;

    static {
        int[] iArr = new int[j4.values().length];
        $SwitchMap$com$google$protobuf$JavaType = iArr;
        try {
            iArr[j4.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            $SwitchMap$com$google$protobuf$JavaType[j4.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            $SwitchMap$com$google$protobuf$JavaType[j4.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[z2.values().length];
        $SwitchMap$com$google$protobuf$FieldType$Collection = iArr2;
        try {
            iArr2[z2.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            $SwitchMap$com$google$protobuf$FieldType$Collection[z2.VECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            $SwitchMap$com$google$protobuf$FieldType$Collection[z2.SCALAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
