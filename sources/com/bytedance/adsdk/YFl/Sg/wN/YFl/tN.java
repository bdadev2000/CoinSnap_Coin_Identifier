package com.bytedance.adsdk.YFl.Sg.wN.YFl;

import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

/* loaded from: classes.dex */
public class tN {
    private static Object YFl(int i10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(i10 > number.intValue());
        }
        if (number instanceof Long) {
            return Boolean.valueOf(((long) i10) > number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) i10) > number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) i10) > number.doubleValue());
        }
        throw new UnsupportedOperationException(a.h(number, "This type of addition operation is not supported"));
    }

    private static Object YFl(long j3, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(j3 > ((long) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(j3 > number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) j3) > number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) j3) > number.doubleValue());
        }
        throw new UnsupportedOperationException(a.h(number, "This type of addition operation is not supported"));
    }

    private static Object YFl(float f10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(f10 > ((float) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(f10 > ((float) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(f10 > number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) f10) > number.doubleValue());
        }
        throw new UnsupportedOperationException(a.h(number, "This type of addition operation is not supported"));
    }

    private static Object YFl(double d10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(d10 > ((double) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(d10 > ((double) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(d10 > ((double) number.floatValue()));
        }
        if (number instanceof Double) {
            return Boolean.valueOf(d10 > number.doubleValue());
        }
        throw new UnsupportedOperationException(a.h(number, "This type of addition operation is not supported"));
    }

    public static Object YFl(Object obj, Number number) {
        if (!(obj instanceof Integer) && !(obj instanceof Short) && !(obj instanceof Byte)) {
            if (obj instanceof Long) {
                return YFl(((Long) obj).longValue(), number);
            }
            if (obj instanceof Float) {
                return YFl(((Float) obj).floatValue(), number);
            }
            if (obj instanceof Double) {
                return YFl(((Double) obj).doubleValue(), number);
            }
            if (obj instanceof String) {
                try {
                    return YFl(Float.parseFloat((String) obj), number);
                } catch (NumberFormatException unused) {
                    throw new UnsupportedOperationException(obj.getClass().getName().concat("This type of addition operation is not supported"));
                }
            }
            throw new UnsupportedOperationException(obj.getClass().getName().concat("This type of addition operation is not supported"));
        }
        return YFl(((Number) obj).intValue(), number);
    }
}
