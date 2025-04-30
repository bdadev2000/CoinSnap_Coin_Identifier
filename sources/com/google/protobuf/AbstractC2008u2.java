package com.google.protobuf;

/* renamed from: com.google.protobuf.u2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC2008u2 {
    static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$FieldType$Collection;
    static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$JavaType;

    static {
        int[] iArr = new int[EnumC1926i3.values().length];
        $SwitchMap$com$google$protobuf$JavaType = iArr;
        try {
            iArr[EnumC1926i3.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            $SwitchMap$com$google$protobuf$JavaType[EnumC1926i3.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            $SwitchMap$com$google$protobuf$JavaType[EnumC1926i3.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[EnumC2015v2.values().length];
        $SwitchMap$com$google$protobuf$FieldType$Collection = iArr2;
        try {
            iArr2[EnumC2015v2.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            $SwitchMap$com$google$protobuf$FieldType$Collection[EnumC2015v2.VECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            $SwitchMap$com$google$protobuf$FieldType$Collection[EnumC2015v2.SCALAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
