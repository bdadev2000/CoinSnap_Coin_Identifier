package com.bytedance.adsdk.zp.lMd.COT.zp;

import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes.dex */
public class KS {
    private static Object zp(int i9, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(i9 > number.intValue());
        }
        if (number instanceof Long) {
            return Boolean.valueOf(((long) i9) > number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) i9) > number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) i9) > number.doubleValue());
        }
        throw new UnsupportedOperationException(o.i(number, "This type of addition operation is not supported"));
    }

    private static Object zp(long j7, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(j7 > ((long) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(j7 > number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) j7) > number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) j7) > number.doubleValue());
        }
        throw new UnsupportedOperationException(o.i(number, "This type of addition operation is not supported"));
    }

    private static Object zp(float f9, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(f9 > ((float) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(f9 > ((float) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(f9 > number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) f9) > number.doubleValue());
        }
        throw new UnsupportedOperationException(o.i(number, "This type of addition operation is not supported"));
    }

    private static Object zp(double d2, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(d2 > ((double) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(d2 > ((double) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(d2 > ((double) number.floatValue()));
        }
        if (number instanceof Double) {
            return Boolean.valueOf(d2 > number.doubleValue());
        }
        throw new UnsupportedOperationException(o.i(number, "This type of addition operation is not supported"));
    }

    public static Object zp(Object obj, Number number) {
        if (!(obj instanceof Integer) && !(obj instanceof Short) && !(obj instanceof Byte)) {
            if (obj instanceof Long) {
                return zp(((Long) obj).longValue(), number);
            }
            if (obj instanceof Float) {
                return zp(((Float) obj).floatValue(), number);
            }
            if (obj instanceof Double) {
                return zp(((Double) obj).doubleValue(), number);
            }
            if (obj instanceof String) {
                try {
                    return zp(Float.parseFloat((String) obj), number);
                } catch (NumberFormatException unused) {
                    throw new UnsupportedOperationException(obj.getClass().getName().concat("This type of addition operation is not supported"));
                }
            }
            throw new UnsupportedOperationException(obj.getClass().getName().concat("This type of addition operation is not supported"));
        }
        return zp(((Number) obj).intValue(), number);
    }
}
