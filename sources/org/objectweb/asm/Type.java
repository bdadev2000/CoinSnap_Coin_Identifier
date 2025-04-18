package org.objectweb.asm;

import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import okhttp3.HttpUrl;

/* loaded from: classes4.dex */
public final class Type {
    public static final int ARRAY = 9;
    public static final int BOOLEAN = 1;
    public static final int BYTE = 3;
    public static final int CHAR = 2;
    public static final int DOUBLE = 8;
    public static final int FLOAT = 6;
    public static final int INT = 5;
    private static final int INTERNAL = 12;
    public static final int LONG = 7;
    public static final int METHOD = 11;
    public static final int OBJECT = 10;
    public static final int SHORT = 4;
    public static final int VOID = 0;
    private final int sort;
    private final int valueBegin;
    private final String valueBuffer;
    private final int valueEnd;
    private static final String PRIMITIVE_DESCRIPTORS = "VZCBSIFJD";
    public static final Type VOID_TYPE = new Type(0, PRIMITIVE_DESCRIPTORS, 0, 1);
    public static final Type BOOLEAN_TYPE = new Type(1, PRIMITIVE_DESCRIPTORS, 1, 2);
    public static final Type CHAR_TYPE = new Type(2, PRIMITIVE_DESCRIPTORS, 2, 3);
    public static final Type BYTE_TYPE = new Type(3, PRIMITIVE_DESCRIPTORS, 3, 4);
    public static final Type SHORT_TYPE = new Type(4, PRIMITIVE_DESCRIPTORS, 4, 5);
    public static final Type INT_TYPE = new Type(5, PRIMITIVE_DESCRIPTORS, 5, 6);
    public static final Type FLOAT_TYPE = new Type(6, PRIMITIVE_DESCRIPTORS, 6, 7);
    public static final Type LONG_TYPE = new Type(7, PRIMITIVE_DESCRIPTORS, 7, 8);
    public static final Type DOUBLE_TYPE = new Type(8, PRIMITIVE_DESCRIPTORS, 8, 9);

    private Type(int i2, String str, int i3, int i4) {
        this.sort = i2;
        this.valueBuffer = str;
        this.valueBegin = i3;
        this.valueEnd = i4;
    }

    private void appendDescriptor(StringBuilder sb) {
        int i2 = this.sort;
        if (i2 == 10) {
            sb.append((CharSequence) this.valueBuffer, this.valueBegin - 1, this.valueEnd + 1);
        } else {
            if (i2 == 12) {
                sb.append('L');
                sb.append((CharSequence) this.valueBuffer, this.valueBegin, this.valueEnd);
                sb.append(';');
                return;
            }
            sb.append((CharSequence) this.valueBuffer, this.valueBegin, this.valueEnd);
        }
    }

    public static String getConstructorDescriptor(Constructor<?> constructor) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        for (Class<?> cls : constructor.getParameterTypes()) {
            appendDescriptor(cls, sb);
        }
        sb.append(")V");
        return sb.toString();
    }

    public static String getMethodDescriptor(Type type, Type... typeArr) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        for (Type type2 : typeArr) {
            type2.appendDescriptor(sb);
        }
        sb.append(')');
        type.appendDescriptor(sb);
        return sb.toString();
    }

    public static Type getMethodType(String str) {
        return new Type(11, str, 0, str.length());
    }

    public static Type getObjectType(String str) {
        return new Type(str.charAt(0) == '[' ? 9 : 12, str, 0, str.length());
    }

    public static int getReturnTypeOffset(String str) {
        int i2 = 1;
        while (str.charAt(i2) != ')') {
            while (str.charAt(i2) == '[') {
                i2++;
            }
            int i3 = i2 + 1;
            i2 = str.charAt(i2) == 'L' ? Math.max(i3, str.indexOf(59, i3) + 1) : i3;
        }
        return i2 + 1;
    }

    public static Type getType(String str) {
        return getTypeInternal(str, 0, str.length());
    }

    private static Type getTypeInternal(String str, int i2, int i3) {
        char charAt = str.charAt(i2);
        if (charAt == '(') {
            return new Type(11, str, i2, i3);
        }
        if (charAt == 'F') {
            return FLOAT_TYPE;
        }
        if (charAt == 'L') {
            return new Type(10, str, i2 + 1, i3 - 1);
        }
        if (charAt == 'S') {
            return SHORT_TYPE;
        }
        if (charAt == 'V') {
            return VOID_TYPE;
        }
        if (charAt == 'I') {
            return INT_TYPE;
        }
        if (charAt == 'J') {
            return LONG_TYPE;
        }
        if (charAt == 'Z') {
            return BOOLEAN_TYPE;
        }
        if (charAt == '[') {
            return new Type(9, str, i2, i3);
        }
        switch (charAt) {
            case TypeReference.EXCEPTION_PARAMETER /* 66 */:
                return BYTE_TYPE;
            case TypeReference.INSTANCEOF /* 67 */:
                return CHAR_TYPE;
            case TypeReference.NEW /* 68 */:
                return DOUBLE_TYPE;
            default:
                throw new IllegalArgumentException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Type)) {
            return false;
        }
        Type type = (Type) obj;
        int i2 = this.sort;
        if (i2 == 12) {
            i2 = 10;
        }
        int i3 = type.sort;
        if (i2 != (i3 != 12 ? i3 : 10)) {
            return false;
        }
        int i4 = this.valueBegin;
        int i5 = this.valueEnd;
        int i6 = type.valueBegin;
        if (i5 - i4 != type.valueEnd - i6) {
            return false;
        }
        while (i4 < i5) {
            if (this.valueBuffer.charAt(i4) != type.valueBuffer.charAt(i6)) {
                return false;
            }
            i4++;
            i6++;
        }
        return true;
    }

    public Type[] getArgumentTypes() {
        return getArgumentTypes(getDescriptor());
    }

    public int getArgumentsAndReturnSizes() {
        return getArgumentsAndReturnSizes(getDescriptor());
    }

    public String getClassName() {
        switch (this.sort) {
            case 0:
                return "void";
            case 1:
                return "boolean";
            case 2:
                return "char";
            case 3:
                return "byte";
            case 4:
                return "short";
            case 5:
                return ImpressionLog.w;
            case 6:
                return "float";
            case 7:
                return "long";
            case 8:
                return "double";
            case 9:
                StringBuilder sb = new StringBuilder(getElementType().getClassName());
                for (int dimensions = getDimensions(); dimensions > 0; dimensions--) {
                    sb.append(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                }
                return sb.toString();
            case 10:
            case 12:
                return this.valueBuffer.substring(this.valueBegin, this.valueEnd).replace('/', '.');
            case 11:
            default:
                throw new AssertionError();
        }
    }

    public String getDescriptor() {
        int i2 = this.sort;
        if (i2 == 10) {
            return this.valueBuffer.substring(this.valueBegin - 1, this.valueEnd + 1);
        }
        if (i2 == 12) {
            return "L" + this.valueBuffer.substring(this.valueBegin, this.valueEnd) + ';';
        }
        return this.valueBuffer.substring(this.valueBegin, this.valueEnd);
    }

    public int getDimensions() {
        int i2 = 1;
        while (this.valueBuffer.charAt(this.valueBegin + i2) == '[') {
            i2++;
        }
        return i2;
    }

    public Type getElementType() {
        return getTypeInternal(this.valueBuffer, this.valueBegin + getDimensions(), this.valueEnd);
    }

    public String getInternalName() {
        return this.valueBuffer.substring(this.valueBegin, this.valueEnd);
    }

    public int getOpcode(int i2) {
        if (i2 == 46 || i2 == 79) {
            switch (this.sort) {
                case 0:
                case 11:
                    throw new UnsupportedOperationException();
                case 1:
                case 3:
                    return i2 + 5;
                case 2:
                    return i2 + 6;
                case 4:
                    return i2 + 7;
                case 5:
                    return i2;
                case 6:
                    return i2 + 2;
                case 7:
                    return i2 + 1;
                case 8:
                    return i2 + 3;
                case 9:
                case 10:
                case 12:
                    return i2 + 4;
                default:
                    throw new AssertionError();
            }
        }
        switch (this.sort) {
            case 0:
                if (i2 == 172) {
                    return Opcodes.RETURN;
                }
                throw new UnsupportedOperationException();
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return i2;
            case 6:
                return i2 + 2;
            case 7:
                return i2 + 1;
            case 8:
                return i2 + 3;
            case 9:
            case 10:
            case 12:
                if (i2 == 21 || i2 == 54 || i2 == 172) {
                    return i2 + 4;
                }
                throw new UnsupportedOperationException();
            case 11:
                throw new UnsupportedOperationException();
            default:
                throw new AssertionError();
        }
    }

    public Type getReturnType() {
        return getReturnType(getDescriptor());
    }

    public int getSize() {
        switch (this.sort) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 10:
            case 12:
                return 1;
            case 7:
            case 8:
                return 2;
            case 11:
            default:
                throw new AssertionError();
        }
    }

    public int getSort() {
        int i2 = this.sort;
        if (i2 == 12) {
            return 10;
        }
        return i2;
    }

    public int hashCode() {
        int i2 = this.sort;
        int i3 = (i2 == 12 ? 10 : i2) * 13;
        if (i2 >= 9) {
            int i4 = this.valueEnd;
            for (int i5 = this.valueBegin; i5 < i4; i5++) {
                i3 = (this.valueBuffer.charAt(i5) + i3) * 17;
            }
        }
        return i3;
    }

    public String toString() {
        return getDescriptor();
    }

    public static Type[] getArgumentTypes(String str) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (str.charAt(i4) != ')') {
            while (str.charAt(i4) == '[') {
                i4++;
            }
            int i5 = i4 + 1;
            i4 = str.charAt(i4) == 'L' ? Math.max(i5, str.indexOf(59, i5) + 1) : i5;
            i3++;
        }
        Type[] typeArr = new Type[i3];
        int i6 = 1;
        while (str.charAt(i6) != ')') {
            int i7 = i6;
            while (str.charAt(i7) == '[') {
                i7++;
            }
            int i8 = i7 + 1;
            if (str.charAt(i7) == 'L') {
                i8 = Math.max(i8, str.indexOf(59, i8) + 1);
            }
            typeArr[i2] = getTypeInternal(str, i6, i8);
            i2++;
            i6 = i8;
        }
        return typeArr;
    }

    public static int getArgumentsAndReturnSizes(String str) {
        char charAt = str.charAt(1);
        int i2 = 1;
        int i3 = 1;
        while (charAt != ')') {
            if (charAt == 'J' || charAt == 'D') {
                i2++;
                i3 += 2;
            } else {
                while (str.charAt(i2) == '[') {
                    i2++;
                }
                int i4 = i2 + 1;
                if (str.charAt(i2) == 'L') {
                    i4 = Math.max(i4, str.indexOf(59, i4) + 1);
                }
                i3++;
                i2 = i4;
            }
            charAt = str.charAt(i2);
        }
        char charAt2 = str.charAt(i2 + 1);
        if (charAt2 == 'V') {
            return i3 << 2;
        }
        return (i3 << 2) | ((charAt2 == 'J' || charAt2 == 'D') ? 2 : 1);
    }

    public static String getInternalName(Class<?> cls) {
        return cls.getName().replace('.', '/');
    }

    public static Type getMethodType(Type type, Type... typeArr) {
        return getType(getMethodDescriptor(type, typeArr));
    }

    public static Type getReturnType(String str) {
        return getTypeInternal(str, getReturnTypeOffset(str), str.length());
    }

    public static Type getType(Class<?> cls) {
        if (!cls.isPrimitive()) {
            return getType(getDescriptor(cls));
        }
        if (cls == Integer.TYPE) {
            return INT_TYPE;
        }
        if (cls == Void.TYPE) {
            return VOID_TYPE;
        }
        if (cls == Boolean.TYPE) {
            return BOOLEAN_TYPE;
        }
        if (cls == Byte.TYPE) {
            return BYTE_TYPE;
        }
        if (cls == Character.TYPE) {
            return CHAR_TYPE;
        }
        if (cls == Short.TYPE) {
            return SHORT_TYPE;
        }
        if (cls == Double.TYPE) {
            return DOUBLE_TYPE;
        }
        if (cls == Float.TYPE) {
            return FLOAT_TYPE;
        }
        if (cls == Long.TYPE) {
            return LONG_TYPE;
        }
        throw new AssertionError();
    }

    private static void appendDescriptor(Class<?> cls, StringBuilder sb) {
        char c2;
        while (cls.isArray()) {
            sb.append('[');
            cls = cls.getComponentType();
        }
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                c2 = 'I';
            } else if (cls == Void.TYPE) {
                c2 = 'V';
            } else if (cls == Boolean.TYPE) {
                c2 = 'Z';
            } else if (cls == Byte.TYPE) {
                c2 = 'B';
            } else if (cls == Character.TYPE) {
                c2 = 'C';
            } else if (cls == Short.TYPE) {
                c2 = 'S';
            } else if (cls == Double.TYPE) {
                c2 = 'D';
            } else if (cls == Float.TYPE) {
                c2 = 'F';
            } else {
                if (cls != Long.TYPE) {
                    throw new AssertionError();
                }
                c2 = 'J';
            }
            sb.append(c2);
            return;
        }
        sb.append('L');
        sb.append(getInternalName(cls));
        sb.append(';');
    }

    public static String getDescriptor(Class<?> cls) {
        StringBuilder sb = new StringBuilder();
        appendDescriptor(cls, sb);
        return sb.toString();
    }

    public static Type getReturnType(Method method) {
        return getType(method.getReturnType());
    }

    public static Type getType(Constructor<?> constructor) {
        return getType(getConstructorDescriptor(constructor));
    }

    public static Type getType(Method method) {
        return getType(getMethodDescriptor(method));
    }

    public static String getMethodDescriptor(Method method) {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        for (Class<?> cls : method.getParameterTypes()) {
            appendDescriptor(cls, sb);
        }
        sb.append(')');
        appendDescriptor(method.getReturnType(), sb);
        return sb.toString();
    }

    public static Type[] getArgumentTypes(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        Type[] typeArr = new Type[parameterTypes.length];
        for (int length = parameterTypes.length - 1; length >= 0; length--) {
            typeArr[length] = getType(parameterTypes[length]);
        }
        return typeArr;
    }
}
