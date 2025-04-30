package com.google.protobuf;

/* renamed from: com.google.protobuf.l2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1946l2 implements Comparable {
    private final java.lang.reflect.Field cachedSizeField;
    private final boolean enforceUtf8;
    private final X2 enumVerifier;
    private final java.lang.reflect.Field field;
    private final int fieldNumber;
    private final Object mapDefaultEntry;
    private final Class<?> messageClass;
    private final C1920h4 oneof;
    private final Class<?> oneofStoredType;
    private final java.lang.reflect.Field presenceField;
    private final int presenceMask;
    private final boolean required;
    private final EnumC2022w2 type;

    private C1946l2(java.lang.reflect.Field field, int i9, EnumC2022w2 enumC2022w2, Class<?> cls, java.lang.reflect.Field field2, int i10, boolean z8, boolean z9, C1920h4 c1920h4, Class<?> cls2, Object obj, X2 x22, java.lang.reflect.Field field3) {
        this.field = field;
        this.type = enumC2022w2;
        this.messageClass = cls;
        this.fieldNumber = i9;
        this.presenceField = field2;
        this.presenceMask = i10;
        this.required = z8;
        this.enforceUtf8 = z9;
        this.oneof = c1920h4;
        this.oneofStoredType = cls2;
        this.mapDefaultEntry = obj;
        this.enumVerifier = x22;
        this.cachedSizeField = field3;
    }

    private static void checkFieldNumber(int i9) {
        if (i9 > 0) {
        } else {
            throw new IllegalArgumentException(com.mbridge.msdk.foundation.entity.o.h(i9, "fieldNumber must be positive: "));
        }
    }

    public static C1946l2 forField(java.lang.reflect.Field field, int i9, EnumC2022w2 enumC2022w2, boolean z8) {
        checkFieldNumber(i9);
        C1898e3.checkNotNull(field, "field");
        C1898e3.checkNotNull(enumC2022w2, "fieldType");
        if (enumC2022w2 != EnumC2022w2.MESSAGE_LIST && enumC2022w2 != EnumC2022w2.GROUP_LIST) {
            return new C1946l2(field, i9, enumC2022w2, null, null, 0, false, z8, null, null, null, null, null);
        }
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    public static C1946l2 forFieldWithEnumVerifier(java.lang.reflect.Field field, int i9, EnumC2022w2 enumC2022w2, X2 x22) {
        checkFieldNumber(i9);
        C1898e3.checkNotNull(field, "field");
        return new C1946l2(field, i9, enumC2022w2, null, null, 0, false, false, null, null, null, x22, null);
    }

    public static C1946l2 forMapField(java.lang.reflect.Field field, int i9, Object obj, X2 x22) {
        C1898e3.checkNotNull(obj, "mapDefaultEntry");
        checkFieldNumber(i9);
        C1898e3.checkNotNull(field, "field");
        return new C1946l2(field, i9, EnumC2022w2.MAP, null, null, 0, false, true, null, null, obj, x22, null);
    }

    public static C1946l2 forOneofMemberField(int i9, EnumC2022w2 enumC2022w2, C1920h4 c1920h4, Class<?> cls, boolean z8, X2 x22) {
        checkFieldNumber(i9);
        C1898e3.checkNotNull(enumC2022w2, "fieldType");
        C1898e3.checkNotNull(c1920h4, "oneof");
        C1898e3.checkNotNull(cls, "oneofStoredType");
        if (enumC2022w2.isScalar()) {
            return new C1946l2(null, i9, enumC2022w2, null, null, 0, false, z8, c1920h4, cls, null, x22, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i9 + " is of type " + enumC2022w2);
    }

    public static C1946l2 forPackedField(java.lang.reflect.Field field, int i9, EnumC2022w2 enumC2022w2, java.lang.reflect.Field field2) {
        checkFieldNumber(i9);
        C1898e3.checkNotNull(field, "field");
        C1898e3.checkNotNull(enumC2022w2, "fieldType");
        if (enumC2022w2 != EnumC2022w2.MESSAGE_LIST && enumC2022w2 != EnumC2022w2.GROUP_LIST) {
            return new C1946l2(field, i9, enumC2022w2, null, null, 0, false, false, null, null, null, null, field2);
        }
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    public static C1946l2 forPackedFieldWithEnumVerifier(java.lang.reflect.Field field, int i9, EnumC2022w2 enumC2022w2, X2 x22, java.lang.reflect.Field field2) {
        checkFieldNumber(i9);
        C1898e3.checkNotNull(field, "field");
        return new C1946l2(field, i9, enumC2022w2, null, null, 0, false, false, null, null, null, x22, field2);
    }

    public static C1946l2 forProto2OptionalField(java.lang.reflect.Field field, int i9, EnumC2022w2 enumC2022w2, java.lang.reflect.Field field2, int i10, boolean z8, X2 x22) {
        checkFieldNumber(i9);
        C1898e3.checkNotNull(field, "field");
        C1898e3.checkNotNull(enumC2022w2, "fieldType");
        C1898e3.checkNotNull(field2, "presenceField");
        if (field2 != null && !isExactlyOneBitSet(i10)) {
            throw new IllegalArgumentException(com.mbridge.msdk.foundation.entity.o.h(i10, "presenceMask must have exactly one bit set: "));
        }
        return new C1946l2(field, i9, enumC2022w2, null, field2, i10, false, z8, null, null, null, x22, null);
    }

    public static C1946l2 forProto2RequiredField(java.lang.reflect.Field field, int i9, EnumC2022w2 enumC2022w2, java.lang.reflect.Field field2, int i10, boolean z8, X2 x22) {
        checkFieldNumber(i9);
        C1898e3.checkNotNull(field, "field");
        C1898e3.checkNotNull(enumC2022w2, "fieldType");
        C1898e3.checkNotNull(field2, "presenceField");
        if (field2 != null && !isExactlyOneBitSet(i10)) {
            throw new IllegalArgumentException(com.mbridge.msdk.foundation.entity.o.h(i10, "presenceMask must have exactly one bit set: "));
        }
        return new C1946l2(field, i9, enumC2022w2, null, field2, i10, true, z8, null, null, null, x22, null);
    }

    public static C1946l2 forRepeatedMessageField(java.lang.reflect.Field field, int i9, EnumC2022w2 enumC2022w2, Class<?> cls) {
        checkFieldNumber(i9);
        C1898e3.checkNotNull(field, "field");
        C1898e3.checkNotNull(enumC2022w2, "fieldType");
        C1898e3.checkNotNull(cls, "messageClass");
        return new C1946l2(field, i9, enumC2022w2, cls, null, 0, false, false, null, null, null, null, null);
    }

    private static boolean isExactlyOneBitSet(int i9) {
        return i9 != 0 && (i9 & (i9 + (-1))) == 0;
    }

    public static C1939k2 newBuilder() {
        return new C1939k2(null);
    }

    public java.lang.reflect.Field getCachedSizeField() {
        return this.cachedSizeField;
    }

    public X2 getEnumVerifier() {
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
        int i9 = AbstractC1932j2.$SwitchMap$com$google$protobuf$FieldType[this.type.ordinal()];
        if (i9 != 1 && i9 != 2) {
            if (i9 != 3 && i9 != 4) {
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

    public C1920h4 getOneof() {
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

    public EnumC2022w2 getType() {
        return this.type;
    }

    public boolean isEnforceUtf8() {
        return this.enforceUtf8;
    }

    public boolean isRequired() {
        return this.required;
    }

    @Override // java.lang.Comparable
    public int compareTo(C1946l2 c1946l2) {
        return this.fieldNumber - c1946l2.fieldNumber;
    }
}
