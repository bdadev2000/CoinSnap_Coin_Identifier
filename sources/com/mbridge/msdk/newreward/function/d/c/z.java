package com.mbridge.msdk.newreward.function.d.c;

/* loaded from: classes4.dex */
public final class z extends q {
    private final com.mbridge.msdk.newreward.function.d.a.b a;

    /* renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.a f14643b;

    /* renamed from: c, reason: collision with root package name */
    private final c f14644c;

    public z(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, c cVar) {
        this.a = bVar;
        this.f14643b = aVar;
        this.f14644c = cVar;
        cVar.b(true);
        cVar.a(false);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public final void a(int i10, x xVar) {
        if (xVar != null) {
            xVar.a(this.a, this.f14643b, this);
            xVar.b(this.a, this.f14643b, this);
        }
    }
}
