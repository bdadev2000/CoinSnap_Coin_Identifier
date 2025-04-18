package t3;

import m3.x;

/* loaded from: classes.dex */
public final class a implements b {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final s3.d f25191b;

    /* renamed from: c, reason: collision with root package name */
    public final h4.c f25192c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f25193d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f25194e;

    public a(String str, s3.d dVar, h4.c cVar, boolean z10, boolean z11) {
        this.a = str;
        this.f25191b = dVar;
        this.f25192c = cVar;
        this.f25193d = z10;
        this.f25194e = z11;
    }

    @Override // t3.b
    public final o3.d a(x xVar, m3.j jVar, u3.b bVar) {
        return new o3.g(xVar, bVar, this);
    }
}
