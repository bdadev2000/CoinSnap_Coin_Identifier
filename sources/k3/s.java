package k3;

import T1.C0300f;
import android.content.Context;
import com.vungle.ads.L;
import i3.C2342a;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;
import t3.C2707b;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static volatile k f21450e;

    /* renamed from: a, reason: collision with root package name */
    public final C2707b f21451a;
    public final C2707b b;

    /* renamed from: c, reason: collision with root package name */
    public final p3.b f21452c;

    /* renamed from: d, reason: collision with root package name */
    public final q3.h f21453d;

    public s(C2707b c2707b, C2707b c2707b2, p3.b bVar, q3.h hVar, q3.j jVar) {
        this.f21451a = c2707b;
        this.b = c2707b2;
        this.f21452c = bVar;
        this.f21453d = hVar;
        jVar.getClass();
        jVar.f22783a.execute(new L(jVar, 8));
    }

    public static s a() {
        k kVar = f21450e;
        if (kVar != null) {
            return (s) kVar.f21439h.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f21450e == null) {
            synchronized (s.class) {
                try {
                    if (f21450e == null) {
                        C0300f c0300f = new C0300f();
                        context.getClass();
                        c0300f.f2970c = context;
                        f21450e = c0300f.f();
                    }
                } finally {
                }
            }
        }
    }

    public final q c(l lVar) {
        Set singleton;
        byte[] bytes;
        if (lVar instanceof l) {
            ((C2342a) lVar).getClass();
            singleton = Collections.unmodifiableSet(C2342a.f20644d);
        } else {
            singleton = Collections.singleton(new h3.c("proto"));
        }
        C.c a6 = j.a();
        lVar.getClass();
        a6.f347c = "cct";
        C2342a c2342a = (C2342a) lVar;
        String str = c2342a.f20647a;
        String str2 = c2342a.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = AbstractC2914a.k("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        a6.f348d = bytes;
        return new q(singleton, a6.l(), this);
    }
}
