package com.bytedance.adsdk.zp.lMd.COT.zp;

import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes.dex */
public class zp {
    private static Object zp(int i9, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Long.valueOf(i9 / number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(i9 / number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(i9 / number.doubleValue());
            }
            throw new UnsupportedOperationException(o.i(number, "This type of addition operation is not supported"));
        }
        return Integer.valueOf(i9 / number.intValue());
    }

    private static Object zp(long j7, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Long.valueOf(j7 / number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(((float) j7) / number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(j7 / number.doubleValue());
            }
            throw new UnsupportedOperationException(o.i(number, "This type of addition operation is not supported"));
        }
        return Long.valueOf(j7 / number.intValue());
    }

    private static Object zp(float f9, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Float.valueOf(f9 / ((float) number.longValue()));
            }
            if (number instanceof Float) {
                return Float.valueOf(f9 / number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(f9 / number.doubleValue());
            }
            throw new UnsupportedOperationException(o.i(number, "This type of addition operation is not supported"));
        }
        return Float.valueOf(f9 / number.intValue());
    }

    private static Object zp(double d2, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Double.valueOf(d2 / number.longValue());
            }
            if (number instanceof Float) {
                return Double.valueOf(d2 / number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(d2 / number.doubleValue());
            }
            throw new UnsupportedOperationException(o.i(number, "This type of addition operation is not supported"));
        }
        return Double.valueOf(d2 / number.intValue());
    }

    public static Object zp(Number number, Number number2) {
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
