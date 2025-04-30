package com.google.protobuf;

/* renamed from: com.google.protobuf.k2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1939k2 {
    private java.lang.reflect.Field cachedSizeField;
    private boolean enforceUtf8;
    private X2 enumVerifier;
    private java.lang.reflect.Field field;
    private int fieldNumber;
    private Object mapDefaultEntry;
    private C1920h4 oneof;
    private Class<?> oneofStoredType;
    private java.lang.reflect.Field presenceField;
    private int presenceMask;
    private boolean required;
    private EnumC2022w2 type;

    public /* synthetic */ C1939k2(AbstractC1932j2 abstractC1932j2) {
        this();
    }

    public C1946l2 build() {
        C1920h4 c1920h4 = this.oneof;
        if (c1920h4 != null) {
            return C1946l2.forOneofMemberField(this.fieldNumber, this.type, c1920h4, this.oneofStoredType, this.enforceUtf8, this.enumVerifier);
        }
        Object obj = this.mapDefaultEntry;
        if (obj != null) {
            return C1946l2.forMapField(this.field, this.fieldNumber, obj, this.enumVerifier);
        }
        java.lang.reflect.Field field = this.presenceField;
        if (field != null) {
            if (this.required) {
                return C1946l2.forProto2RequiredField(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier);
            }
            return C1946l2.forProto2OptionalField(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier);
        }
        X2 x22 = this.enumVerifier;
        if (x22 != null) {
            java.lang.reflect.Field field2 = this.cachedSizeField;
            if (field2 == null) {
                return C1946l2.forFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, x22);
            }
            return C1946l2.forPackedFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, x22, field2);
        }
        java.lang.reflect.Field field3 = this.cachedSizeField;
        if (field3 == null) {
            return C1946l2.forField(this.field, this.fieldNumber, this.type, this.enforceUtf8);
        }
        return C1946l2.forPackedField(this.field, this.fieldNumber, this.type, field3);
    }

    public C1939k2 withCachedSizeField(java.lang.reflect.Field field) {
        this.cachedSizeField = field;
        return this;
    }

    public C1939k2 withEnforceUtf8(boolean z8) {
        this.enforceUtf8 = z8;
        return this;
    }

    public C1939k2 withEnumVerifier(X2 x22) {
        this.enumVerifier = x22;
        return this;
    }

    public C1939k2 withField(java.lang.reflect.Field field) {
        if (this.oneof == null) {
            this.field = field;
            return this;
        }
        throw new IllegalStateException("Cannot set field when building a oneof.");
    }

    public C1939k2 withFieldNumber(int i9) {
        this.fieldNumber = i9;
        return this;
    }

    public C1939k2 withMapDefaultEntry(Object obj) {
        this.mapDefaultEntry = obj;
        return this;
    }

    public C1939k2 withOneof(C1920h4 c1920h4, Class<?> cls) {
        if (this.field == null && this.presenceField == null) {
            this.oneof = c1920h4;
            this.oneofStoredType = cls;
            return this;
        }
        throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
    }

    public C1939k2 withPresence(java.lang.reflect.Field field, int i9) {
        this.presenceField = (java.lang.reflect.Field) C1898e3.checkNotNull(field, "presenceField");
        this.presenceMask = i9;
        return this;
    }

    public C1939k2 withRequired(boolean z8) {
        this.required = z8;
        return this;
    }

    public C1939k2 withType(EnumC2022w2 enumC2022w2) {
        this.type = enumC2022w2;
        return this;
    }

    private C1939k2() {
    }
}
