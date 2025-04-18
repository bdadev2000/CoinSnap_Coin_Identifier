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
/* loaded from: classes4.dex */
public final class a3 {
    private static final /* synthetic */ a3[] $VALUES;
    public static final a3 BOOL;
    public static final a3 BOOL_LIST;
    public static final a3 BOOL_LIST_PACKED;
    public static final a3 BYTES;
    public static final a3 BYTES_LIST;
    public static final a3 DOUBLE;
    public static final a3 DOUBLE_LIST;
    public static final a3 DOUBLE_LIST_PACKED;
    private static final java.lang.reflect.Type[] EMPTY_TYPES;
    public static final a3 ENUM;
    public static final a3 ENUM_LIST;
    public static final a3 ENUM_LIST_PACKED;
    public static final a3 FIXED32;
    public static final a3 FIXED32_LIST;
    public static final a3 FIXED32_LIST_PACKED;
    public static final a3 FIXED64;
    public static final a3 FIXED64_LIST;
    public static final a3 FIXED64_LIST_PACKED;
    public static final a3 FLOAT;
    public static final a3 FLOAT_LIST;
    public static final a3 FLOAT_LIST_PACKED;
    public static final a3 GROUP;
    public static final a3 GROUP_LIST;
    public static final a3 INT32;
    public static final a3 INT32_LIST;
    public static final a3 INT32_LIST_PACKED;
    public static final a3 INT64;
    public static final a3 INT64_LIST;
    public static final a3 INT64_LIST_PACKED;
    public static final a3 MAP;
    public static final a3 MESSAGE;
    public static final a3 MESSAGE_LIST;
    public static final a3 SFIXED32;
    public static final a3 SFIXED32_LIST;
    public static final a3 SFIXED32_LIST_PACKED;
    public static final a3 SFIXED64;
    public static final a3 SFIXED64_LIST;
    public static final a3 SFIXED64_LIST_PACKED;
    public static final a3 SINT32;
    public static final a3 SINT32_LIST;
    public static final a3 SINT32_LIST_PACKED;
    public static final a3 SINT64;
    public static final a3 SINT64_LIST;
    public static final a3 SINT64_LIST_PACKED;
    public static final a3 STRING;
    public static final a3 STRING_LIST;
    public static final a3 UINT32;
    public static final a3 UINT32_LIST;
    public static final a3 UINT32_LIST_PACKED;
    public static final a3 UINT64;
    public static final a3 UINT64_LIST;
    public static final a3 UINT64_LIST_PACKED;
    private static final a3[] VALUES;
    private final z2 collection;
    private final Class<?> elementType;

    /* renamed from: id, reason: collision with root package name */
    private final int f12127id;
    private final j4 javaType;
    private final boolean primitiveScalar;

    private static /* synthetic */ a3[] $values() {
        return new a3[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64, GROUP, DOUBLE_LIST, FLOAT_LIST, INT64_LIST, UINT64_LIST, INT32_LIST, FIXED64_LIST, FIXED32_LIST, BOOL_LIST, STRING_LIST, MESSAGE_LIST, BYTES_LIST, UINT32_LIST, ENUM_LIST, SFIXED32_LIST, SFIXED64_LIST, SINT32_LIST, SINT64_LIST, DOUBLE_LIST_PACKED, FLOAT_LIST_PACKED, INT64_LIST_PACKED, UINT64_LIST_PACKED, INT32_LIST_PACKED, FIXED64_LIST_PACKED, FIXED32_LIST_PACKED, BOOL_LIST_PACKED, UINT32_LIST_PACKED, ENUM_LIST_PACKED, SFIXED32_LIST_PACKED, SFIXED64_LIST_PACKED, SINT32_LIST_PACKED, SINT64_LIST_PACKED, GROUP_LIST, MAP};
    }

    static {
        z2 z2Var = z2.SCALAR;
        j4 j4Var = j4.DOUBLE;
        DOUBLE = new a3("DOUBLE", 0, 0, z2Var, j4Var);
        j4 j4Var2 = j4.FLOAT;
        FLOAT = new a3("FLOAT", 1, 1, z2Var, j4Var2);
        j4 j4Var3 = j4.LONG;
        INT64 = new a3("INT64", 2, 2, z2Var, j4Var3);
        UINT64 = new a3("UINT64", 3, 3, z2Var, j4Var3);
        j4 j4Var4 = j4.INT;
        INT32 = new a3("INT32", 4, 4, z2Var, j4Var4);
        FIXED64 = new a3("FIXED64", 5, 5, z2Var, j4Var3);
        FIXED32 = new a3("FIXED32", 6, 6, z2Var, j4Var4);
        j4 j4Var5 = j4.BOOLEAN;
        BOOL = new a3("BOOL", 7, 7, z2Var, j4Var5);
        j4 j4Var6 = j4.STRING;
        STRING = new a3("STRING", 8, 8, z2Var, j4Var6);
        j4 j4Var7 = j4.MESSAGE;
        MESSAGE = new a3("MESSAGE", 9, 9, z2Var, j4Var7);
        j4 j4Var8 = j4.BYTE_STRING;
        BYTES = new a3("BYTES", 10, 10, z2Var, j4Var8);
        UINT32 = new a3("UINT32", 11, 11, z2Var, j4Var4);
        j4 j4Var9 = j4.ENUM;
        ENUM = new a3("ENUM", 12, 12, z2Var, j4Var9);
        SFIXED32 = new a3("SFIXED32", 13, 13, z2Var, j4Var4);
        SFIXED64 = new a3("SFIXED64", 14, 14, z2Var, j4Var3);
        SINT32 = new a3("SINT32", 15, 15, z2Var, j4Var4);
        SINT64 = new a3("SINT64", 16, 16, z2Var, j4Var3);
        GROUP = new a3("GROUP", 17, 17, z2Var, j4Var7);
        z2 z2Var2 = z2.VECTOR;
        DOUBLE_LIST = new a3("DOUBLE_LIST", 18, 18, z2Var2, j4Var);
        FLOAT_LIST = new a3("FLOAT_LIST", 19, 19, z2Var2, j4Var2);
        INT64_LIST = new a3("INT64_LIST", 20, 20, z2Var2, j4Var3);
        UINT64_LIST = new a3("UINT64_LIST", 21, 21, z2Var2, j4Var3);
        INT32_LIST = new a3("INT32_LIST", 22, 22, z2Var2, j4Var4);
        FIXED64_LIST = new a3("FIXED64_LIST", 23, 23, z2Var2, j4Var3);
        FIXED32_LIST = new a3("FIXED32_LIST", 24, 24, z2Var2, j4Var4);
        BOOL_LIST = new a3("BOOL_LIST", 25, 25, z2Var2, j4Var5);
        STRING_LIST = new a3("STRING_LIST", 26, 26, z2Var2, j4Var6);
        MESSAGE_LIST = new a3("MESSAGE_LIST", 27, 27, z2Var2, j4Var7);
        BYTES_LIST = new a3("BYTES_LIST", 28, 28, z2Var2, j4Var8);
        UINT32_LIST = new a3("UINT32_LIST", 29, 29, z2Var2, j4Var4);
        ENUM_LIST = new a3("ENUM_LIST", 30, 30, z2Var2, j4Var9);
        SFIXED32_LIST = new a3("SFIXED32_LIST", 31, 31, z2Var2, j4Var4);
        SFIXED64_LIST = new a3("SFIXED64_LIST", 32, 32, z2Var2, j4Var3);
        SINT32_LIST = new a3("SINT32_LIST", 33, 33, z2Var2, j4Var4);
        SINT64_LIST = new a3("SINT64_LIST", 34, 34, z2Var2, j4Var3);
        z2 z2Var3 = z2.PACKED_VECTOR;
        DOUBLE_LIST_PACKED = new a3("DOUBLE_LIST_PACKED", 35, 35, z2Var3, j4Var);
        FLOAT_LIST_PACKED = new a3("FLOAT_LIST_PACKED", 36, 36, z2Var3, j4Var2);
        INT64_LIST_PACKED = new a3("INT64_LIST_PACKED", 37, 37, z2Var3, j4Var3);
        UINT64_LIST_PACKED = new a3("UINT64_LIST_PACKED", 38, 38, z2Var3, j4Var3);
        INT32_LIST_PACKED = new a3("INT32_LIST_PACKED", 39, 39, z2Var3, j4Var4);
        FIXED64_LIST_PACKED = new a3("FIXED64_LIST_PACKED", 40, 40, z2Var3, j4Var3);
        FIXED32_LIST_PACKED = new a3("FIXED32_LIST_PACKED", 41, 41, z2Var3, j4Var4);
        BOOL_LIST_PACKED = new a3("BOOL_LIST_PACKED", 42, 42, z2Var3, j4Var5);
        UINT32_LIST_PACKED = new a3("UINT32_LIST_PACKED", 43, 43, z2Var3, j4Var4);
        ENUM_LIST_PACKED = new a3("ENUM_LIST_PACKED", 44, 44, z2Var3, j4Var9);
        SFIXED32_LIST_PACKED = new a3("SFIXED32_LIST_PACKED", 45, 45, z2Var3, j4Var4);
        SFIXED64_LIST_PACKED = new a3("SFIXED64_LIST_PACKED", 46, 46, z2Var3, j4Var3);
        SINT32_LIST_PACKED = new a3("SINT32_LIST_PACKED", 47, 47, z2Var3, j4Var4);
        SINT64_LIST_PACKED = new a3("SINT64_LIST_PACKED", 48, 48, z2Var3, j4Var3);
        GROUP_LIST = new a3("GROUP_LIST", 49, 49, z2Var2, j4Var7);
        MAP = new a3("MAP", 50, 50, z2.MAP, j4.VOID);
        $VALUES = $values();
        EMPTY_TYPES = new java.lang.reflect.Type[0];
        a3[] values = values();
        VALUES = new a3[values.length];
        for (a3 a3Var : values) {
            VALUES[a3Var.f12127id] = a3Var;
        }
    }

    private a3(String str, int i10, int i11, z2 z2Var, j4 j4Var) {
        int i12;
        this.f12127id = i11;
        this.collection = z2Var;
        this.javaType = j4Var;
        int i13 = y2.$SwitchMap$com$google$protobuf$FieldType$Collection[z2Var.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                this.elementType = null;
            } else {
                this.elementType = j4Var.getBoxedType();
            }
        } else {
            this.elementType = j4Var.getBoxedType();
        }
        this.primitiveScalar = (z2Var != z2.SCALAR || (i12 = y2.$SwitchMap$com$google$protobuf$JavaType[j4Var.ordinal()]) == 1 || i12 == 2 || i12 == 3) ? false : true;
    }

    public static a3 forId(int i10) {
        if (i10 >= 0) {
            a3[] a3VarArr = VALUES;
            if (i10 < a3VarArr.length) {
                return a3VarArr[i10];
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
        boolean z10;
        while (true) {
            int i10 = 0;
            if (cls != List.class) {
                java.lang.reflect.Type genericSuperList = getGenericSuperList(cls);
                if (genericSuperList instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) genericSuperList;
                    java.lang.reflect.Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    for (int i11 = 0; i11 < actualTypeArguments.length; i11++) {
                        java.lang.reflect.Type type = actualTypeArguments[i11];
                        if (type instanceof TypeVariable) {
                            TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                            if (typeArr.length == typeParameters.length) {
                                int i12 = 0;
                                while (true) {
                                    if (i12 < typeParameters.length) {
                                        if (type == typeParameters[i12]) {
                                            actualTypeArguments[i11] = typeArr[i12];
                                            z10 = true;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        z10 = false;
                                        break;
                                    }
                                }
                                if (!z10) {
                                    throw new RuntimeException("Unable to find replacement for " + type);
                                }
                            } else {
                                throw new RuntimeException("Type array mismatch");
                            }
                        }
                    }
                    cls = (Class) parameterizedType.getRawType();
                    typeArr = actualTypeArguments;
                } else {
                    typeArr = EMPTY_TYPES;
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length = interfaces.length;
                    while (true) {
                        if (i10 < length) {
                            Class<?> cls2 = interfaces[i10];
                            if (List.class.isAssignableFrom(cls2)) {
                                cls = cls2;
                                break;
                            }
                            i10++;
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

    public static a3 valueOf(String str) {
        return (a3) java.lang.Enum.valueOf(a3.class, str);
    }

    public static a3[] values() {
        return (a3[]) $VALUES.clone();
    }

    public j4 getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.f12127id;
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        return this.collection == z2.MAP;
    }

    public boolean isPacked() {
        return z2.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        return this.collection == z2.SCALAR;
    }

    public boolean isValidForField(java.lang.reflect.Field field) {
        if (z2.VECTOR.equals(this.collection)) {
            return isValidForList(field);
        }
        return this.javaType.getType().isAssignableFrom(field.getType());
    }
}
