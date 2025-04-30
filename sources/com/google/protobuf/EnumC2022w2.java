package com.google.protobuf;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* renamed from: com.google.protobuf.w2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC2022w2 {
    private static final /* synthetic */ EnumC2022w2[] $VALUES;
    public static final EnumC2022w2 BOOL;
    public static final EnumC2022w2 BOOL_LIST;
    public static final EnumC2022w2 BOOL_LIST_PACKED;
    public static final EnumC2022w2 BYTES;
    public static final EnumC2022w2 BYTES_LIST;
    public static final EnumC2022w2 DOUBLE;
    public static final EnumC2022w2 DOUBLE_LIST;
    public static final EnumC2022w2 DOUBLE_LIST_PACKED;
    private static final java.lang.reflect.Type[] EMPTY_TYPES;
    public static final EnumC2022w2 ENUM;
    public static final EnumC2022w2 ENUM_LIST;
    public static final EnumC2022w2 ENUM_LIST_PACKED;
    public static final EnumC2022w2 FIXED32;
    public static final EnumC2022w2 FIXED32_LIST;
    public static final EnumC2022w2 FIXED32_LIST_PACKED;
    public static final EnumC2022w2 FIXED64;
    public static final EnumC2022w2 FIXED64_LIST;
    public static final EnumC2022w2 FIXED64_LIST_PACKED;
    public static final EnumC2022w2 FLOAT;
    public static final EnumC2022w2 FLOAT_LIST;
    public static final EnumC2022w2 FLOAT_LIST_PACKED;
    public static final EnumC2022w2 GROUP;
    public static final EnumC2022w2 GROUP_LIST;
    public static final EnumC2022w2 INT32;
    public static final EnumC2022w2 INT32_LIST;
    public static final EnumC2022w2 INT32_LIST_PACKED;
    public static final EnumC2022w2 INT64;
    public static final EnumC2022w2 INT64_LIST;
    public static final EnumC2022w2 INT64_LIST_PACKED;
    public static final EnumC2022w2 MAP;
    public static final EnumC2022w2 MESSAGE;
    public static final EnumC2022w2 MESSAGE_LIST;
    public static final EnumC2022w2 SFIXED32;
    public static final EnumC2022w2 SFIXED32_LIST;
    public static final EnumC2022w2 SFIXED32_LIST_PACKED;
    public static final EnumC2022w2 SFIXED64;
    public static final EnumC2022w2 SFIXED64_LIST;
    public static final EnumC2022w2 SFIXED64_LIST_PACKED;
    public static final EnumC2022w2 SINT32;
    public static final EnumC2022w2 SINT32_LIST;
    public static final EnumC2022w2 SINT32_LIST_PACKED;
    public static final EnumC2022w2 SINT64;
    public static final EnumC2022w2 SINT64_LIST;
    public static final EnumC2022w2 SINT64_LIST_PACKED;
    public static final EnumC2022w2 STRING;
    public static final EnumC2022w2 STRING_LIST;
    public static final EnumC2022w2 UINT32;
    public static final EnumC2022w2 UINT32_LIST;
    public static final EnumC2022w2 UINT32_LIST_PACKED;
    public static final EnumC2022w2 UINT64;
    public static final EnumC2022w2 UINT64_LIST;
    public static final EnumC2022w2 UINT64_LIST_PACKED;
    private static final EnumC2022w2[] VALUES;
    private final EnumC2015v2 collection;
    private final Class<?> elementType;
    private final int id;
    private final EnumC1926i3 javaType;
    private final boolean primitiveScalar;

    private static /* synthetic */ EnumC2022w2[] $values() {
        return new EnumC2022w2[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64, GROUP, DOUBLE_LIST, FLOAT_LIST, INT64_LIST, UINT64_LIST, INT32_LIST, FIXED64_LIST, FIXED32_LIST, BOOL_LIST, STRING_LIST, MESSAGE_LIST, BYTES_LIST, UINT32_LIST, ENUM_LIST, SFIXED32_LIST, SFIXED64_LIST, SINT32_LIST, SINT64_LIST, DOUBLE_LIST_PACKED, FLOAT_LIST_PACKED, INT64_LIST_PACKED, UINT64_LIST_PACKED, INT32_LIST_PACKED, FIXED64_LIST_PACKED, FIXED32_LIST_PACKED, BOOL_LIST_PACKED, UINT32_LIST_PACKED, ENUM_LIST_PACKED, SFIXED32_LIST_PACKED, SFIXED64_LIST_PACKED, SINT32_LIST_PACKED, SINT64_LIST_PACKED, GROUP_LIST, MAP};
    }

    static {
        EnumC2015v2 enumC2015v2 = EnumC2015v2.SCALAR;
        EnumC1926i3 enumC1926i3 = EnumC1926i3.DOUBLE;
        DOUBLE = new EnumC2022w2("DOUBLE", 0, 0, enumC2015v2, enumC1926i3);
        EnumC1926i3 enumC1926i32 = EnumC1926i3.FLOAT;
        FLOAT = new EnumC2022w2("FLOAT", 1, 1, enumC2015v2, enumC1926i32);
        EnumC1926i3 enumC1926i33 = EnumC1926i3.LONG;
        INT64 = new EnumC2022w2("INT64", 2, 2, enumC2015v2, enumC1926i33);
        UINT64 = new EnumC2022w2("UINT64", 3, 3, enumC2015v2, enumC1926i33);
        EnumC1926i3 enumC1926i34 = EnumC1926i3.INT;
        INT32 = new EnumC2022w2("INT32", 4, 4, enumC2015v2, enumC1926i34);
        FIXED64 = new EnumC2022w2("FIXED64", 5, 5, enumC2015v2, enumC1926i33);
        FIXED32 = new EnumC2022w2("FIXED32", 6, 6, enumC2015v2, enumC1926i34);
        EnumC1926i3 enumC1926i35 = EnumC1926i3.BOOLEAN;
        BOOL = new EnumC2022w2("BOOL", 7, 7, enumC2015v2, enumC1926i35);
        EnumC1926i3 enumC1926i36 = EnumC1926i3.STRING;
        STRING = new EnumC2022w2("STRING", 8, 8, enumC2015v2, enumC1926i36);
        EnumC1926i3 enumC1926i37 = EnumC1926i3.MESSAGE;
        MESSAGE = new EnumC2022w2("MESSAGE", 9, 9, enumC2015v2, enumC1926i37);
        EnumC1926i3 enumC1926i38 = EnumC1926i3.BYTE_STRING;
        BYTES = new EnumC2022w2("BYTES", 10, 10, enumC2015v2, enumC1926i38);
        UINT32 = new EnumC2022w2("UINT32", 11, 11, enumC2015v2, enumC1926i34);
        EnumC1926i3 enumC1926i39 = EnumC1926i3.ENUM;
        ENUM = new EnumC2022w2("ENUM", 12, 12, enumC2015v2, enumC1926i39);
        SFIXED32 = new EnumC2022w2("SFIXED32", 13, 13, enumC2015v2, enumC1926i34);
        SFIXED64 = new EnumC2022w2("SFIXED64", 14, 14, enumC2015v2, enumC1926i33);
        SINT32 = new EnumC2022w2("SINT32", 15, 15, enumC2015v2, enumC1926i34);
        SINT64 = new EnumC2022w2("SINT64", 16, 16, enumC2015v2, enumC1926i33);
        GROUP = new EnumC2022w2("GROUP", 17, 17, enumC2015v2, enumC1926i37);
        EnumC2015v2 enumC2015v22 = EnumC2015v2.VECTOR;
        DOUBLE_LIST = new EnumC2022w2("DOUBLE_LIST", 18, 18, enumC2015v22, enumC1926i3);
        FLOAT_LIST = new EnumC2022w2("FLOAT_LIST", 19, 19, enumC2015v22, enumC1926i32);
        INT64_LIST = new EnumC2022w2("INT64_LIST", 20, 20, enumC2015v22, enumC1926i33);
        UINT64_LIST = new EnumC2022w2("UINT64_LIST", 21, 21, enumC2015v22, enumC1926i33);
        INT32_LIST = new EnumC2022w2("INT32_LIST", 22, 22, enumC2015v22, enumC1926i34);
        FIXED64_LIST = new EnumC2022w2("FIXED64_LIST", 23, 23, enumC2015v22, enumC1926i33);
        FIXED32_LIST = new EnumC2022w2("FIXED32_LIST", 24, 24, enumC2015v22, enumC1926i34);
        BOOL_LIST = new EnumC2022w2("BOOL_LIST", 25, 25, enumC2015v22, enumC1926i35);
        STRING_LIST = new EnumC2022w2("STRING_LIST", 26, 26, enumC2015v22, enumC1926i36);
        MESSAGE_LIST = new EnumC2022w2("MESSAGE_LIST", 27, 27, enumC2015v22, enumC1926i37);
        BYTES_LIST = new EnumC2022w2("BYTES_LIST", 28, 28, enumC2015v22, enumC1926i38);
        UINT32_LIST = new EnumC2022w2("UINT32_LIST", 29, 29, enumC2015v22, enumC1926i34);
        ENUM_LIST = new EnumC2022w2("ENUM_LIST", 30, 30, enumC2015v22, enumC1926i39);
        SFIXED32_LIST = new EnumC2022w2("SFIXED32_LIST", 31, 31, enumC2015v22, enumC1926i34);
        SFIXED64_LIST = new EnumC2022w2("SFIXED64_LIST", 32, 32, enumC2015v22, enumC1926i33);
        SINT32_LIST = new EnumC2022w2("SINT32_LIST", 33, 33, enumC2015v22, enumC1926i34);
        SINT64_LIST = new EnumC2022w2("SINT64_LIST", 34, 34, enumC2015v22, enumC1926i33);
        EnumC2015v2 enumC2015v23 = EnumC2015v2.PACKED_VECTOR;
        DOUBLE_LIST_PACKED = new EnumC2022w2("DOUBLE_LIST_PACKED", 35, 35, enumC2015v23, enumC1926i3);
        FLOAT_LIST_PACKED = new EnumC2022w2("FLOAT_LIST_PACKED", 36, 36, enumC2015v23, enumC1926i32);
        INT64_LIST_PACKED = new EnumC2022w2("INT64_LIST_PACKED", 37, 37, enumC2015v23, enumC1926i33);
        UINT64_LIST_PACKED = new EnumC2022w2("UINT64_LIST_PACKED", 38, 38, enumC2015v23, enumC1926i33);
        INT32_LIST_PACKED = new EnumC2022w2("INT32_LIST_PACKED", 39, 39, enumC2015v23, enumC1926i34);
        FIXED64_LIST_PACKED = new EnumC2022w2("FIXED64_LIST_PACKED", 40, 40, enumC2015v23, enumC1926i33);
        FIXED32_LIST_PACKED = new EnumC2022w2("FIXED32_LIST_PACKED", 41, 41, enumC2015v23, enumC1926i34);
        BOOL_LIST_PACKED = new EnumC2022w2("BOOL_LIST_PACKED", 42, 42, enumC2015v23, enumC1926i35);
        UINT32_LIST_PACKED = new EnumC2022w2("UINT32_LIST_PACKED", 43, 43, enumC2015v23, enumC1926i34);
        ENUM_LIST_PACKED = new EnumC2022w2("ENUM_LIST_PACKED", 44, 44, enumC2015v23, enumC1926i39);
        SFIXED32_LIST_PACKED = new EnumC2022w2("SFIXED32_LIST_PACKED", 45, 45, enumC2015v23, enumC1926i34);
        SFIXED64_LIST_PACKED = new EnumC2022w2("SFIXED64_LIST_PACKED", 46, 46, enumC2015v23, enumC1926i33);
        SINT32_LIST_PACKED = new EnumC2022w2("SINT32_LIST_PACKED", 47, 47, enumC2015v23, enumC1926i34);
        SINT64_LIST_PACKED = new EnumC2022w2("SINT64_LIST_PACKED", 48, 48, enumC2015v23, enumC1926i33);
        GROUP_LIST = new EnumC2022w2("GROUP_LIST", 49, 49, enumC2015v22, enumC1926i37);
        MAP = new EnumC2022w2("MAP", 50, 50, EnumC2015v2.MAP, EnumC1926i3.VOID);
        $VALUES = $values();
        EMPTY_TYPES = new java.lang.reflect.Type[0];
        EnumC2022w2[] values = values();
        VALUES = new EnumC2022w2[values.length];
        for (EnumC2022w2 enumC2022w2 : values) {
            VALUES[enumC2022w2.id] = enumC2022w2;
        }
    }

    private EnumC2022w2(String str, int i9, int i10, EnumC2015v2 enumC2015v2, EnumC1926i3 enumC1926i3) {
        int i11;
        this.id = i10;
        this.collection = enumC2015v2;
        this.javaType = enumC1926i3;
        int i12 = AbstractC2008u2.$SwitchMap$com$google$protobuf$FieldType$Collection[enumC2015v2.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                this.elementType = null;
            } else {
                this.elementType = enumC1926i3.getBoxedType();
            }
        } else {
            this.elementType = enumC1926i3.getBoxedType();
        }
        this.primitiveScalar = (enumC2015v2 != EnumC2015v2.SCALAR || (i11 = AbstractC2008u2.$SwitchMap$com$google$protobuf$JavaType[enumC1926i3.ordinal()]) == 1 || i11 == 2 || i11 == 3) ? false : true;
    }

    public static EnumC2022w2 forId(int i9) {
        if (i9 >= 0) {
            EnumC2022w2[] enumC2022w2Arr = VALUES;
            if (i9 < enumC2022w2Arr.length) {
                return enumC2022w2Arr[i9];
            }
            return null;
        }
        return null;
    }

    private static java.lang.reflect.Type getGenericSuperList(Class<?> cls) {
        for (java.lang.reflect.Type type : cls.getGenericInterfaces()) {
            if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        java.lang.reflect.Type genericSuperclass = cls.getGenericSuperclass();
        if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private static java.lang.reflect.Type getListParameter(Class<?> cls, java.lang.reflect.Type[] typeArr) {
        while (true) {
            int i9 = 0;
            if (cls != List.class) {
                java.lang.reflect.Type genericSuperList = getGenericSuperList(cls);
                if (genericSuperList instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) genericSuperList;
                    java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
                        java.lang.reflect.Type type = actualTypeArguments[i10];
                        if (type instanceof TypeVariable) {
                            TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                            if (typeArr.length == typeParameters.length) {
                                for (int i11 = 0; i11 < typeParameters.length; i11++) {
                                    if (type == typeParameters[i11]) {
                                        actualTypeArguments[i10] = typeArr[i11];
                                    }
                                }
                                throw new RuntimeException("Unable to find replacement for " + type);
                            }
                            throw new RuntimeException("Type array mismatch");
                        }
                    }
                    cls = (Class) parameterizedType.getRawType();
                    typeArr = actualTypeArguments;
                } else {
                    typeArr = EMPTY_TYPES;
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length = interfaces.length;
                    while (true) {
                        if (i9 < length) {
                            Class<?> cls2 = interfaces[i9];
                            if (List.class.isAssignableFrom(cls2)) {
                                cls = cls2;
                                break;
                            }
                            i9++;
                        } else {
                            cls = cls.getSuperclass();
                            break;
                        }
                    }
                }
            } else {
                if (typeArr.length == 1) {
                    return typeArr[0];
                }
                throw new RuntimeException("Unable to identify parameter type for List<T>");
            }
        }
    }

    private boolean isValidForList(java.lang.reflect.Field field) {
        Class<?> type = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type)) {
            return false;
        }
        java.lang.reflect.Type[] typeArr = EMPTY_TYPES;
        if (field.getGenericType() instanceof ParameterizedType) {
            typeArr = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        java.lang.reflect.Type listParameter = getListParameter(type, typeArr);
        if (!(listParameter instanceof Class)) {
            return true;
        }
        return this.elementType.isAssignableFrom((Class) listParameter);
    }

    public static EnumC2022w2 valueOf(String str) {
        return (EnumC2022w2) java.lang.Enum.valueOf(EnumC2022w2.class, str);
    }

    public static EnumC2022w2[] values() {
        return (EnumC2022w2[]) $VALUES.clone();
    }

    public EnumC1926i3 getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.id;
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        if (this.collection == EnumC2015v2.MAP) {
            return true;
        }
        return false;
    }

    public boolean isPacked() {
        return EnumC2015v2.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        if (this.collection == EnumC2015v2.SCALAR) {
            return true;
        }
        return false;
    }

    public boolean isValidForField(java.lang.reflect.Field field) {
        if (EnumC2015v2.VECTOR.equals(this.collection)) {
            return isValidForList(field);
        }
        return this.javaType.getType().isAssignableFrom(field.getType());
    }
}
