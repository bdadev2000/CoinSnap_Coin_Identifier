package com.mbridge.msdk.newreward.function.d.c;

/* loaded from: classes3.dex */
public final class z extends q {

    /* renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.newreward.function.d.a.b f17268a;
    private final com.mbridge.msdk.newreward.function.d.a.a b;

    /* renamed from: c, reason: collision with root package name */
    private final c f17269c;

    public z(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, c cVar) {
        this.f17268a = bVar;
        this.b = aVar;
        this.f17269c = cVar;
        cVar.b(true);
        cVar.a(false);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.p
    public final void a(int i9, x xVar) {
        if (xVar != null) {
            xVar.a(this.f17268a, this.b, this);
            xVar.b(this.f17268a, this.b, this);
        }
    }
}
