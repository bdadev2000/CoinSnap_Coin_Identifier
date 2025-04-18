package i7;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class p {
    public final i a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19189b;

    /* renamed from: c, reason: collision with root package name */
    public final f7.c f19190c;

    /* renamed from: d, reason: collision with root package name */
    public final f7.e f19191d;

    /* renamed from: e, reason: collision with root package name */
    public final q f19192e;

    public p(i iVar, String str, f7.c cVar, f7.e eVar, q qVar) {
        this.a = iVar;
        this.f19189b = str;
        this.f19190c = cVar;
        this.f19191d = eVar;
        this.f19192e = qVar;
    }

    public final void a(f7.a aVar, f7.g gVar) {
        Integer num;
        w3.h hVar = new w3.h();
        i iVar = this.a;
        if (iVar != null) {
            hVar.a = iVar;
            hVar.f26700c = aVar;
            String str = this.f19189b;
            if (str != null) {
                hVar.f26699b = str;
                f7.e eVar = this.f19191d;
                if (eVar != null) {
                    hVar.f26701d = eVar;
                    f7.c cVar = this.f19190c;
                    if (cVar != null) {
                        hVar.f26702e = cVar;
                        String str2 = "";
                        if (((f7.c) hVar.f26702e) == null) {
                            str2 = eb.j.k("", " encoding");
                        }
                        if (str2.isEmpty()) {
                            i iVar2 = (i) hVar.a;
                            String str3 = (String) hVar.f26699b;
                            f7.a aVar2 = (f7.a) hVar.f26700c;
                            f7.e eVar2 = (f7.e) hVar.f26701d;
                            f7.c cVar2 = (f7.c) hVar.f26702e;
                            r rVar = (r) this.f19192e;
                            rVar.getClass();
                            i c10 = iVar2.c(aVar2.f17685b);
                            u2.l lVar = new u2.l();
                            lVar.f25473f = new HashMap();
                            lVar.f25471d = Long.valueOf(((q7.b) rVar.a).a());
                            lVar.f25472e = Long.valueOf(((q7.b) rVar.f19194b).a());
                            lVar.t(str3);
                            lVar.p(new l(cVar2, (byte[]) eVar2.apply(aVar2.a)));
                            lVar.f25469b = null;
                            f7.b bVar = aVar2.f17686c;
                            if (bVar != null && (num = bVar.a) != null) {
                                lVar.f25474g = num;
                            }
                            h b3 = lVar.b();
                            m7.a aVar3 = (m7.a) rVar.f19195c;
                            aVar3.getClass();
                            aVar3.f21630b.execute(new c3.b(8, aVar3, c10, gVar, b3));
                            return;
                        }
                        throw new IllegalStateException("Missing required properties:".concat(str2));
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
