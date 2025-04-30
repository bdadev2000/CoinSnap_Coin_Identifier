package G7;

import java.util.Collection;
import t7.InterfaceC2714c;

/* loaded from: classes3.dex */
public abstract class v {
    public static Collection a(Object obj) {
        if ((obj instanceof H7.a) && !(obj instanceof H7.b)) {
            d(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e4) {
            j.i(e4, v.class.getName());
            throw e4;
        }
    }

    public static void b(int i9, Object obj) {
        if (obj != null && !c(i9, obj)) {
            d(obj, "kotlin.jvm.functions.Function" + i9);
            throw null;
        }
    }

    public static boolean c(int i9, Object obj) {
        int i10;
        if (!(obj instanceof InterfaceC2714c)) {
            return false;
        }
        if (obj instanceof g) {
            i10 = ((g) obj).getArity();
        } else if (obj instanceof F7.a) {
            i10 = 0;
        } else if (obj instanceof F7.l) {
            i10 = 1;
        } else if (obj instanceof F7.p) {
            i10 = 2;
        } else if (obj instanceof F7.q) {
            i10 = 3;
        } else {
            i10 = -1;
        }
        if (i10 != i9) {
            return false;
        }
        return true;
    }

    public static void d(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(com.mbridge.msdk.foundation.entity.o.k(name, " cannot be cast to ", str));
        j.i(classCastException, v.class.getName());
        throw classCastException;
    }
}
