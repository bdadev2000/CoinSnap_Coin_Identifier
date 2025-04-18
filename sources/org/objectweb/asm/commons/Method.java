package org.objectweb.asm.commons;

import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import okhttp3.HttpUrl;
import org.objectweb.asm.Type;

/* loaded from: classes4.dex */
public class Method {
    private static final Map<String, String> PRIMITIVE_TYPE_DESCRIPTORS;
    private final String descriptor;
    private final String name;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("void", "V");
        hashMap.put("byte", "B");
        hashMap.put("char", "C");
        hashMap.put("double", "D");
        hashMap.put("float", "F");
        hashMap.put(ImpressionLog.w, "I");
        hashMap.put("long", "J");
        hashMap.put("short", "S");
        hashMap.put("boolean", "Z");
        PRIMITIVE_TYPE_DESCRIPTORS = hashMap;
    }

    public Method(String str, String str2) {
        this.name = str;
        this.descriptor = str2;
    }

    private static String getDescriptorInternal(String str, boolean z2) {
        if ("".equals(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            i2 = str.indexOf(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI, i2) + 1;
            if (i2 <= 0) {
                break;
            }
            sb.append('[');
        }
        String substring = str.substring(0, str.length() - (sb.length() * 2));
        String str2 = PRIMITIVE_TYPE_DESCRIPTORS.get(substring);
        if (str2 != null) {
            sb.append(str2);
        } else {
            sb.append('L');
            if (substring.indexOf(46) < 0) {
                if (!z2) {
                    sb.append("java/lang/");
                }
                sb.append(substring);
            } else {
                sb.append(substring.replace('.', '/'));
            }
            sb.append(';');
        }
        return sb.toString();
    }

    public static Method getMethod(java.lang.reflect.Method method) {
        return new Method(method.getName(), Type.getMethodDescriptor(method));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Method)) {
            return false;
        }
        Method method = (Method) obj;
        return this.name.equals(method.name) && this.descriptor.equals(method.descriptor);
    }

    public Type[] getArgumentTypes() {
        return Type.getArgumentTypes(this.descriptor);
    }

    public String getDescriptor() {
        return this.descriptor;
    }

    public String getName() {
        return this.name;
    }

    public Type getReturnType() {
        return Type.getReturnType(this.descriptor);
    }

    public int hashCode() {
        return this.name.hashCode() ^ this.descriptor.hashCode();
    }

    public String toString() {
        return this.name + this.descriptor;
    }

    public Method(String str, Type type, Type[] typeArr) {
        this(str, Type.getMethodDescriptor(type, typeArr));
    }

    public static Method getMethod(Constructor<?> constructor) {
        return new Method("<init>", Type.getConstructorDescriptor(constructor));
    }

    public static Method getMethod(String str) {
        return getMethod(str, false);
    }

    public static Method getMethod(String str, boolean z2) {
        int indexOf;
        String descriptorInternal;
        int indexOf2 = str.indexOf(32);
        int indexOf3 = str.indexOf(40, indexOf2);
        int i2 = indexOf3 + 1;
        int indexOf4 = str.indexOf(41, i2);
        if (indexOf2 != -1 && i2 != 0 && indexOf4 != -1) {
            String substring = str.substring(0, indexOf2);
            String trim = str.substring(indexOf2 + 1, indexOf3).trim();
            StringBuilder sb = new StringBuilder("(");
            do {
                indexOf = str.indexOf(44, i2);
                if (indexOf == -1) {
                    descriptorInternal = getDescriptorInternal(str.substring(i2, indexOf4).trim(), z2);
                } else {
                    descriptorInternal = getDescriptorInternal(str.substring(i2, indexOf).trim(), z2);
                    i2 = indexOf + 1;
                }
                sb.append(descriptorInternal);
            } while (indexOf != -1);
            sb.append(')');
            sb.append(getDescriptorInternal(substring, z2));
            return new Method(trim, sb.toString());
        }
        throw new IllegalArgumentException();
    }
}
