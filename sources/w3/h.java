package w3;

import java.util.List;
import mb.c2;
import mb.d2;
import mb.s0;
import mb.u1;

/* loaded from: classes.dex */
public final class h {
    public Object a;

    /* renamed from: b, reason: collision with root package name */
    public Object f26699b;

    /* renamed from: c, reason: collision with root package name */
    public Object f26700c;

    /* renamed from: d, reason: collision with root package name */
    public Object f26701d;

    /* renamed from: e, reason: collision with root package name */
    public Object f26702e;

    public h() {
    }

    public final fc.a a() {
        return new fc.a((String) this.a, (String) this.f26699b, (String) this.f26700c, (fc.b) this.f26701d, (fc.d) this.f26702e);
    }

    public final s0 b() {
        List list;
        d2 d2Var = (d2) this.f26701d;
        if (d2Var != null && (list = (List) this.f26702e) != null) {
            return new s0((List) this.a, (c2) this.f26699b, (u1) this.f26700c, d2Var, list);
        }
        StringBuilder sb2 = new StringBuilder();
        if (((d2) this.f26701d) == null) {
            sb2.append(" signal");
        }
        if (((List) this.f26702e) == null) {
            sb2.append(" binaries");
        }
        throw new IllegalStateException(vd.e.f("Missing required properties:", sb2));
    }

    public h(h4.c cVar, s3.a aVar, s3.a aVar2, s3.a aVar3, s3.a aVar4) {
        this.a = cVar;
        this.f26699b = aVar;
        this.f26700c = aVar2;
        this.f26701d = aVar3;
        this.f26702e = aVar4;
    }
}
