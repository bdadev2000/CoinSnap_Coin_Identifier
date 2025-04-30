package k3;

/* loaded from: classes.dex */
public final class f implements G4.d {

    /* renamed from: a, reason: collision with root package name */
    public static final f f21411a = new Object();
    public static final G4.c b = new G4.c("currentCacheSizeBytes", com.mbridge.msdk.foundation.entity.o.r(com.mbridge.msdk.foundation.entity.o.q(J4.e.class, new J4.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final G4.c f21412c = new G4.c("maxCacheSizeBytes", com.mbridge.msdk.foundation.entity.o.r(com.mbridge.msdk.foundation.entity.o.q(J4.e.class, new J4.a(2))));

    @Override // G4.a
    public final void a(Object obj, Object obj2) {
        n3.f fVar = (n3.f) obj;
        G4.e eVar = (G4.e) obj2;
        eVar.b(b, fVar.f21850a);
        eVar.b(f21412c, fVar.b);
    }
}
