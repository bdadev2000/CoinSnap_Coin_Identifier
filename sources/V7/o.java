package V7;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceConfigurationError;

/* loaded from: classes3.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final R7.c f3533a;

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, R7.a] */
    static {
        String str;
        int i9 = w.f3542a;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = Arrays.asList(new Object()).iterator();
            G7.j.e(it, "<this>");
            List A8 = N7.h.A(new N7.a(new N7.j(it, 0)));
            Iterator it2 = A8.iterator();
            if (it2.hasNext()) {
                obj = it2.next();
                if (it2.hasNext()) {
                    int b = ((R7.a) obj).b();
                    do {
                        Object next = it2.next();
                        int b8 = ((R7.a) next).b();
                        if (b < b8) {
                            obj = next;
                            b = b8;
                        }
                    } while (it2.hasNext());
                }
            }
            R7.a aVar = (R7.a) obj;
            if (aVar != null) {
                try {
                    R7.c a6 = aVar.a(A8);
                    if (a6 != null) {
                        f3533a = a6;
                        return;
                    }
                } catch (Throwable th) {
                    aVar.c();
                    throw th;
                }
            }
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
