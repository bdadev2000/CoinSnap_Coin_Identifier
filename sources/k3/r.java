package k3;

import h3.C2318a;
import java.util.HashMap;
import p3.C2542a;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final j f21446a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final h3.c f21447c;

    /* renamed from: d, reason: collision with root package name */
    public final h3.e f21448d;

    /* renamed from: e, reason: collision with root package name */
    public final s f21449e;

    public r(j jVar, String str, h3.c cVar, h3.e eVar, s sVar) {
        this.f21446a = jVar;
        this.b = str;
        this.f21447c = cVar;
        this.f21448d = eVar;
        this.f21449e = sVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [k3.h, java.lang.Object] */
    public final void a(C2318a c2318a, h3.g gVar) {
        Integer num;
        j jVar = this.f21446a;
        if (jVar != null) {
            String str = this.b;
            if (str != null) {
                h3.e eVar = this.f21448d;
                if (eVar != null) {
                    h3.c cVar = this.f21447c;
                    if (cVar != null) {
                        s sVar = this.f21449e;
                        sVar.getClass();
                        j b = jVar.b(c2318a.b);
                        ?? obj = new Object();
                        obj.f21419f = new HashMap();
                        obj.f21417d = Long.valueOf(sVar.f21451a.a());
                        obj.f21418e = Long.valueOf(sVar.b.a());
                        obj.f21415a = str;
                        obj.f21416c = new m(cVar, (byte[]) eVar.apply(c2318a.f20582a));
                        obj.b = null;
                        h3.b bVar = c2318a.f20583c;
                        if (bVar != null && (num = bVar.f20584a) != null) {
                            obj.f21420g = num;
                        }
                        i b8 = obj.b();
                        C2542a c2542a = (C2542a) sVar.f21452c;
                        c2542a.getClass();
                        c2542a.b.execute(new I2.f(c2542a, b, gVar, b8, 10));
                        return;
                    }
                    throw new NullPointerException("Null encoding");
                }
                throw new NullPointerException("Null transformer");
            }
            throw new NullPointerException("Null transportName");
        }
        throw new NullPointerException("Null transportContext");
    }
}
