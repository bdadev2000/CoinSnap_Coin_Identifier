package com.bytedance.adsdk.YFl.Sg.wN.YFl;

import kotlin.reflect.jvm.internal.impl.serialization.deserialization.a;

/* loaded from: classes.dex */
public class Sg {
    private static boolean YFl(int i10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return i10 == number.intValue();
        }
        if (number instanceof Long) {
            return ((long) i10) == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) i10) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) i10) == number.doubleValue();
        }
        throw new UnsupportedOperationException(a.h(number, "This type of addition operation is not supported"));
    }

    private static boolean YFl(long j3, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return j3 == ((long) number.intValue());
        }
        if (number instanceof Long) {
            return j3 == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) j3) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) j3) == number.doubleValue();
        }
        throw new UnsupportedOperationException(a.h(number, "This type of addition operation is not supported"));
    }

    private static boolean YFl(float f10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return f10 == ((float) number.intValue());
        }
        if (number instanceof Long) {
            return f10 == ((float) number.longValue());
        }
        if (number instanceof Float) {
            return f10 == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) f10) == number.doubleValue();
        }
        throw new UnsupportedOperationException(a.h(number, "This type of addition operation is not supported"));
    }

    private static boolean YFl(double d10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return d10 == ((double) number.intValue());
        }
        if (number instanceof Long) {
            return d10 == ((double) number.longValue());
        }
        if (number instanceof Float) {
            return d10 == ((double) number.floatValue());
        }
        if (number instanceof Double) {
            return d10 == number.doubleValue();
        }
        throw new UnsupportedOperationException(a.h(number, "This type of addition operation is not supported"));
    }

    public static boolean YFl(Number number, Number number2) {
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
