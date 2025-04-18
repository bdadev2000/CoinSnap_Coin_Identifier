package g1;

import b1.u1;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final u1 f30639a;

    static {
        String str;
        Object next;
        int i2 = b0.f30594a;
        u1 u1Var = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        List S = y0.m.S(y0.n.I(com.applovin.impl.adview.t.A()));
        Iterator it = S.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int c2 = ((t) next).c();
                do {
                    Object next2 = it.next();
                    int c3 = ((t) next2).c();
                    if (c2 < c3) {
                        next = next2;
                        c2 = c3;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        t tVar = (t) next;
        if (tVar != null) {
            try {
                u1Var = tVar.b(S);
            } catch (Throwable unused2) {
                tVar.a();
            }
            if (u1Var != null) {
                f30639a = u1Var;
                return;
            }
        }
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
