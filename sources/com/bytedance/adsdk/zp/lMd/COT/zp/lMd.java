package com.bytedance.adsdk.zp.lMd.COT.zp;

import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes.dex */
public class lMd {
    private static boolean zp(int i9, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return i9 == number.intValue();
        }
        if (number instanceof Long) {
            return ((long) i9) == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) i9) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) i9) == number.doubleValue();
        }
        throw new UnsupportedOperationException(o.i(number, "This type of addition operation is not supported"));
    }

    private static boolean zp(long j7, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return j7 == ((long) number.intValue());
        }
        if (number instanceof Long) {
            return j7 == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) j7) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) j7) == number.doubleValue();
        }
        throw new UnsupportedOperationException(o.i(number, "This type of addition operation is not supported"));
    }

    private static boolean zp(float f9, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return f9 == ((float) number.intValue());
        }
        if (number instanceof Long) {
            return f9 == ((float) number.longValue());
        }
        if (number instanceof Float) {
            return f9 == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) f9) == number.doubleValue();
        }
        throw new UnsupportedOperationException(o.i(number, "This type of addition operation is not supported"));
    }

    private static boolean zp(double d2, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return d2 == ((double) number.intValue());
        }
        if (number instanceof Long) {
            return d2 == ((double) number.longValue());
        }
        if (number instanceof Float) {
            return d2 == ((double) number.floatValue());
        }
        if (number instanceof Double) {
            return d2 == number.doubleValue();
        }
        throw new UnsupportedOperationException(o.i(number, "This type of addition operation is not supported"));
    }

    public static boolean zp(Number number, Number number2) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return zp(number.longValue(), number2);
            }
            if (number instanceof Float) {
                return zp(number.floatValue(), number2);
            }
            if (number instanceof Double) {
                return zp(number.doubleValue(), number2);
            }
            throw new UnsupportedOperationException(o.i(number, "This type of addition operation is not supported"));
        }
        return zp(number.intValue(), number2);
    }
}
