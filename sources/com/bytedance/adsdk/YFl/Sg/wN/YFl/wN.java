package com.bytedance.adsdk.YFl.Sg.wN.YFl;

import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

/* loaded from: classes.dex */
public class wN {
    private static Object YFl(int i10, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Long.valueOf(i10 - number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(i10 - number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(i10 - number.doubleValue());
            }
            throw new UnsupportedOperationException(a.h(number, "This type of addition operation is not supported"));
        }
        return Integer.valueOf(i10 - number.intValue());
    }

    private static Object YFl(long j3, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Long.valueOf(j3 - number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(((float) j3) - number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(j3 - number.doubleValue());
            }
            throw new UnsupportedOperationException(a.h(number, "This type of addition operation is not supported"));
        }
        return Long.valueOf(j3 - number.intValue());
    }

    private static Object YFl(float f10, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Float.valueOf(f10 - ((float) number.longValue()));
            }
            if (number instanceof Float) {
                return Float.valueOf(f10 - number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(f10 - number.doubleValue());
            }
            throw new UnsupportedOperationException(a.h(number, "This type of addition operation is not supported"));
        }
        return Float.valueOf(f10 - number.intValue());
    }

    private static Object YFl(double d10, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Double.valueOf(d10 - number.longValue());
            }
            if (number instanceof Float) {
                return Double.valueOf(d10 - number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(d10 - number.doubleValue());
            }
            throw new UnsupportedOperationException(a.h(number, "This type of addition operation is not supported"));
        }
        return Double.valueOf(d10 - number.intValue());
    }

    public static Object YFl(Number number, Number number2) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return YFl(number.longValue(), number2);
            }
            if (number instanceof Float) {
                return YFl(number.floatValue(), number2);
            }
            if (number instanceof Double) {
                return YFl(number.doubleValue(), number2);
            }
            throw new UnsupportedOperationException(a.h(number, "This type of addition operation is not supported"));
        }
        return YFl(number.intValue(), number2);
    }
}
