package f8;

import a5.C0398b;
import u7.C2814e;
import z.AbstractC2965e;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: d, reason: collision with root package name */
    public static final C2276a f20369d = new b(new h(false, false, false, false, false, true, "    ", false, false, "type", false, true), h8.a.f20611a);

    /* renamed from: a, reason: collision with root package name */
    public final h f20370a;
    public final C0398b b;

    /* renamed from: c, reason: collision with root package name */
    public final K2.b f20371c = new K2.b(1);

    public b(h hVar, C0398b c0398b) {
        this.f20370a = hVar;
        this.b = c0398b;
    }

    public final Object a(a8.b bVar, String str) {
        G7.j.e(str, "string");
        U7.k kVar = new U7.k(str);
        Object u8 = new g8.v(this, 1, kVar, bVar.getDescriptor(), null).u(bVar);
        if (kVar.g() == 10) {
            return u8;
        }
        U7.k.r(kVar, "Expected EOF after parsing, but had " + str.charAt(kVar.f3372c - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final String b(a8.b bVar, Object obj) {
        char[] cArr;
        Object removeLast;
        B3.e eVar;
        B3.g gVar = new B3.g(7, false);
        synchronized (g8.c.f20496a) {
            C2814e c2814e = g8.c.b;
            cArr = null;
            if (c2814e.isEmpty()) {
                removeLast = null;
            } else {
                removeLast = c2814e.removeLast();
            }
            char[] cArr2 = (char[]) removeLast;
            if (cArr2 != null) {
                g8.c.f20497c -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        gVar.f286d = cArr;
        try {
            G7.j.e(this, "<this>");
            o[] oVarArr = new o[AbstractC2965e.e(4).length];
            if (this.f20370a.f20388e) {
                eVar = new g8.f(gVar, this);
            } else {
                eVar = new B3.e(gVar);
            }
            new g8.w(eVar, this, 1, oVarArr).g(bVar, obj);
            return gVar.toString();
        } finally {
            gVar.g();
        }
    }
}
