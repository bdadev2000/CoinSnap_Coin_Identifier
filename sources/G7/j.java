package G7;

import java.util.Arrays;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public abstract class j {
    public static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public static void b(Object obj) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException();
        i(nullPointerException, j.class.getName());
        throw nullPointerException;
    }

    public static void c(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str);
        i(nullPointerException, j.class.getName());
        throw nullPointerException;
    }

    public static void d(Object obj, String str) {
        if (obj != null) {
            return;
        }
        NullPointerException nullPointerException = new NullPointerException(str.concat(" must not be null"));
        i(nullPointerException, j.class.getName());
        throw nullPointerException;
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = j.class.getName();
            int i9 = 0;
            while (!stackTrace[i9].getClassName().equals(name)) {
                i9++;
            }
            while (stackTrace[i9].getClassName().equals(name)) {
                i9++;
            }
            StackTraceElement stackTraceElement = stackTrace[i9];
            StringBuilder o3 = com.mbridge.msdk.foundation.entity.o.o("Parameter specified as non-null is null: method ", stackTraceElement.getClassName(), ".", stackTraceElement.getMethodName(), ", parameter ");
            o3.append(str);
            NullPointerException nullPointerException = new NullPointerException(o3.toString());
            i(nullPointerException, j.class.getName());
            throw nullPointerException;
        }
    }

    public static int f(int i9, int i10) {
        if (i9 < i10) {
            return -1;
        }
        if (i9 == i10) {
            return 0;
        }
        return 1;
    }

    public static int g(long j7, long j9) {
        if (j7 < j9) {
            return -1;
        }
        if (j7 == j9) {
            return 0;
        }
        return 1;
    }

    public static final a h(Object[] objArr) {
        e(objArr, "array");
        return new a(objArr);
    }

    public static void i(RuntimeException runtimeException, String str) {
        StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i9 = -1;
        for (int i10 = 0; i10 < length; i10++) {
            if (str.equals(stackTrace[i10].getClassName())) {
                i9 = i10;
            }
        }
        runtimeException.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i9 + 1, length));
    }

    public static String j(Object obj, String str) {
        return str + obj;
    }

    public static void k(String str) {
        RuntimeException runtimeException = new RuntimeException(AbstractC2914a.e("lateinit property ", str, " has not been initialized"));
        i(runtimeException, j.class.getName());
        throw runtimeException;
    }
}
