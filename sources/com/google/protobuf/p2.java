package com.google.protobuf;

/* loaded from: classes4.dex */
public final class p2 implements Comparable {
    private final java.lang.reflect.Field cachedSizeField;
    private final boolean enforceUtf8;
    private final a4 enumVerifier;
    private final java.lang.reflect.Field field;
    private final int fieldNumber;
    private final Object mapDefaultEntry;
    private final Class<?> messageClass;
    private final i6 oneof;
    private final Class<?> oneofStoredType;
    private final java.lang.reflect.Field presenceField;
    private final int presenceMask;
    private final boolean required;
    private final a3 type;

    private p2(java.lang.reflect.Field field, int i10, a3 a3Var, Class<?> cls, java.lang.reflect.Field field2, int i11, boolean z10, boolean z11, i6 i6Var, Class<?> cls2, Object obj, a4 a4Var, java.lang.reflect.Field field3) {
        this.field = field;
        this.type = a3Var;
        this.messageClass = cls;
        this.fieldNumber = i10;
        this.presenceField = field2;
        this.presenceMask = i11;
        this.required = z10;
        this.enforceUtf8 = z11;
        this.oneof = i6Var;
        this.oneofStoredType = cls2;
        this.mapDefaultEntry = obj;
        this.enumVerifier = a4Var;
        this.cachedSizeField = field3;
    }

    private static void checkFieldNumber(int i10) {
        if (i10 > 0) {
        } else {
            throw new IllegalArgumentException(eb.j.i("fieldNumber must be positive: ", i10));
        }
    }

    public static p2 forField(java.lang.reflect.Field field, int i10, a3 a3Var, boolean z10) {
        checkFieldNumber(i10);
        f4.checkNotNull(field, "field");
        f4.checkNotNull(a3Var, "fieldType");
        if (a3Var != a3.MESSAGE_LIST && a3Var != a3.GROUP_LIST) {
            return new p2(field, i10, a3Var, null, null, 0, false, z10, null, null, null, null, null);
        }
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    public static p2 forFieldWithEnumVerifier(java.lang.reflect.Field field, int i10, a3 a3Var, a4 a4Var) {
        checkFieldNumber(i10);
        f4.checkNotNull(field, "field");
        return new p2(field, i10, a3Var, null, null, 0, false, false, null, null, null, a4Var, null);
    }

    public static p2 forMapField(java.lang.reflect.Field field, int i10, Object obj, a4 a4Var) {
        f4.checkNotNull(obj, "mapDefaultEntry");
        checkFieldNumber(i10);
        f4.checkNotNull(field, "field");
        return new p2(field, i10, a3.MAP, null, null, 0, false, true, null, null, obj, a4Var, null);
    }

    public static p2 forOneofMemberField(int i10, a3 a3Var, i6 i6Var, Class<?> cls, boolean z10, a4 a4Var) {
        checkFieldNumber(i10);
        f4.checkNotNull(a3Var, "fieldType");
        f4.checkNotNull(i6Var, "oneof");
        f4.checkNotNull(cls, "oneofStoredType");
        if (a3Var.isScalar()) {
            return new p2(null, i10, a3Var, null, null, 0, false, z10, i6Var, cls, null, a4Var, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i10 + " is of type " + a3Var);
    }

    public static p2 forPackedField(java.lang.reflect.Field field, int i10, a3 a3Var, java.lang.reflect.Field field2) {
        checkFieldNumber(i10);
        f4.checkNotNull(field, "field");
        f4.checkNotNull(a3Var, "fieldType");
        if (a3Var != a3.MESSAGE_LIST && a3Var != a3.GROUP_LIST) {
            return new p2(field, i10, a3Var, null, null, 0, false, false, null, null, null, null, field2);
        }
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    public static p2 forPackedFieldWithEnumVerifier(java.lang.reflect.Field field, int i10, a3 a3Var, a4 a4Var, java.lang.reflect.Field field2) {
        checkFieldNumber(i10);
        f4.checkNotNull(field, "field");
        return new p2(field, i10, a3Var, null, null, 0, false, false, null, null, null, a4Var, field2);
    }

    public static p2 forProto2OptionalField(java.lang.reflect.Field field, int i10, a3 a3Var, java.lang.reflect.Field field2, int i11, boolean z10, a4 a4Var) {
        checkFieldNumber(i10);
        f4.checkNotNull(field, "field");
        f4.checkNotNull(a3Var, "fieldType");
        f4.checkNotNull(field2, "presenceField");
        if (field2 != null && !isExactlyOneBitSet(i11)) {
            throw new IllegalArgumentException(eb.j.i("presenceMask must have exactly one bit set: ", i11));
        }
        return new p2(field, i10, a3Var, null, field2, i11, false, z10, null, null, null, a4Var, null);
    }

    public static p2 forProto2RequiredField(java.lang.reflect.Field field, int i10, a3 a3Var, java.lang.reflect.Field field2, int i11, boolean z10, a4 a4Var) {
        checkFieldNumber(i10);
        f4.checkNotNull(field, "field");
        f4.checkNotNull(a3Var, "fieldType");
        f4.checkNotNull(field2, "presenceField");
        if (field2 != null && !isExactlyOneBitSet(i11)) {
            throw new IllegalArgumentException(eb.j.i("presenceMask must have exactly one bit set: ", i11));
        }
        return new p2(field, i10, a3Var, null, field2, i11, true, z10, null, null, null, a4Var, null);
    }

    public static p2 forRepeatedMessageField(java.lang.reflect.Field field, int i10, a3 a3Var, Class<?> cls) {
        checkFieldNumber(i10);
        f4.checkNotNull(field, "field");
        f4.checkNotNull(a3Var, "fieldType");
        f4.checkNotNull(cls, "messageClass");
        return new p2(field, i10, a3Var, cls, null, 0, false, false, null, null, null, null, null);
    }

    private static boolean isExactlyOneBitSet(int i10) {
        return i10 != 0 && (i10 & (i10 + (-1))) == 0;
    }

    public static o2 newBuilder() {
        return new o2(null);
    }

    public java.lang.reflect.Field getCachedSizeField() {
        return this.cachedSizeField;
    }

    public a4 getEnumVerifier() {
        return this.enumVerifier;
    }

    public java.lang.reflect.Field getField() {
        return this.field;
    }

    public int getFieldNumber() {
        return this.fieldNumber;
    }

    public Class<?> getListElementType() {
        return this.messageClass;
    }

    public Object getMapDefaultEntry() {
        return this.mapDefaultEntry;
    }

    public Class<?> getMessageFieldClass() {
        int i10 = n2.$SwitchMap$com$google$protobuf$FieldType[this.type.ordinal()];
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                return null;
            }
            return this.messageClass;
        }
        java.lang.reflect.Field field = this.field;
        if (field != null) {
            return field.getType();
        }
        return this.oneofStoredType;
    }

    public i6 getOneof() {
        return this.oneof;
    }

    public Class<?> getOneofStoredType() {
        return this.oneofStoredType;
    }

    public java.lang.reflect.Field getPresenceField() {
        return this.presenceField;
    }

    public int getPresenceMask() {
        return this.presenceMask;
    }

    public a3 getType() {
        return this.type;
    }

    public boolean isEnforceUtf8() {
        return this.enforceUtf8;
    }

    public boolean isRequired() {
        return this.required;
    }

    @Override // java.lang.Comparable
    public int compareTo(p2 p2Var) {
        return this.fieldNumber - p2Var.fieldNumber;
    }
}
