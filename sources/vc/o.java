package vc;

/* loaded from: classes3.dex */
public final class o extends com.google.gson.c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final d f26457b = new d(new o(com.google.gson.a0.f12098c), 1);
    public final com.google.gson.b0 a;

    public o(com.google.gson.x xVar) {
        this.a = xVar;
    }

    @Override // com.google.gson.c0
    public final Object b(zc.a aVar) {
        int b02 = aVar.b0();
        int b3 = t.h.b(b02);
        if (b3 != 5 && b3 != 6) {
            if (b3 == 8) {
                aVar.X();
                return null;
            }
            throw new com.google.gson.v("Expecting number, got: " + vd.e.l(b02) + "; at path " + aVar.s(false));
        }
        return this.a.a(aVar);
    }

    @Override // com.google.gson.c0
    public final void c(zc.b bVar, Object obj) {
        bVar.W((Number) obj);
    }
}
