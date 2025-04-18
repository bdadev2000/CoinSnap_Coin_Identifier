package com.google.protobuf;

/* loaded from: classes4.dex */
public final class o2 {
    private java.lang.reflect.Field cachedSizeField;
    private boolean enforceUtf8;
    private a4 enumVerifier;
    private java.lang.reflect.Field field;
    private int fieldNumber;
    private Object mapDefaultEntry;
    private i6 oneof;
    private Class<?> oneofStoredType;
    private java.lang.reflect.Field presenceField;
    private int presenceMask;
    private boolean required;
    private a3 type;

    private o2() {
    }

    public /* synthetic */ o2(n2 n2Var) {
        this();
    }

    public p2 build() {
        i6 i6Var = this.oneof;
        if (i6Var != null) {
            return p2.forOneofMemberField(this.fieldNumber, this.type, i6Var, this.oneofStoredType, this.enforceUtf8, this.enumVerifier);
        }
        Object obj = this.mapDefaultEntry;
        if (obj != null) {
            return p2.forMapField(this.field, this.fieldNumber, obj, this.enumVerifier);
        }
        java.lang.reflect.Field field = this.presenceField;
        if (field != null) {
            if (this.required) {
                return p2.forProto2RequiredField(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier);
            }
            return p2.forProto2OptionalField(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier);
        }
        a4 a4Var = this.enumVerifier;
        if (a4Var != null) {
            java.lang.reflect.Field field2 = this.cachedSizeField;
            if (field2 == null) {
                return p2.forFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, a4Var);
            }
            return p2.forPackedFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, a4Var, field2);
        }
        java.lang.reflect.Field field3 = this.cachedSizeField;
        if (field3 == null) {
            return p2.forField(this.field, this.fieldNumber, this.type, this.enforceUtf8);
        }
        return p2.forPackedField(this.field, this.fieldNumber, this.type, field3);
    }

    public o2 withCachedSizeField(java.lang.reflect.Field field) {
        this.cachedSizeField = field;
        return this;
    }

    public o2 withEnforceUtf8(boolean z10) {
        this.enforceUtf8 = z10;
        return this;
    }

    public o2 withEnumVerifier(a4 a4Var) {
        this.enumVerifier = a4Var;
        return this;
    }

    public o2 withField(java.lang.reflect.Field field) {
        if (this.oneof == null) {
            this.field = field;
            return this;
        }
        throw new IllegalStateException("Cannot set field when building a oneof.");
    }

    public o2 withFieldNumber(int i10) {
        this.fieldNumber = i10;
        return this;
    }

    public o2 withMapDefaultEntry(Object obj) {
        this.mapDefaultEntry = obj;
        return this;
    }

    public o2 withOneof(i6 i6Var, Class<?> cls) {
        if (this.field == null && this.presenceField == null) {
            this.oneof = i6Var;
            this.oneofStoredType = cls;
            return this;
        }
        throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
    }

    public o2 withPresence(java.lang.reflect.Field field, int i10) {
        this.presenceField = (java.lang.reflect.Field) f4.checkNotNull(field, "presenceField");
        this.presenceMask = i10;
        return this;
    }

    public o2 withRequired(boolean z10) {
        this.required = z10;
        return this;
    }

    public o2 withType(a3 a3Var) {
        this.type = a3Var;
        return this;
    }
}
