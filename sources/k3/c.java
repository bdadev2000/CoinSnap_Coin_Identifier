package k3;

/* loaded from: classes.dex */
public final class c implements G4.d {

    /* renamed from: a, reason: collision with root package name */
    public static final c f21406a = new Object();
    public static final G4.c b = new G4.c("eventsDroppedCount", com.mbridge.msdk.foundation.entity.o.r(com.mbridge.msdk.foundation.entity.o.q(J4.e.class, new J4.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final G4.c f21407c = new G4.c("reason", com.mbridge.msdk.foundation.entity.o.r(com.mbridge.msdk.foundation.entity.o.q(J4.e.class, new J4.a(3))));

    @Override // G4.a
    public final void a(Object obj, Object obj2) {
        n3.d dVar = (n3.d) obj;
        G4.e eVar = (G4.e) obj2;
        eVar.b(b, dVar.f21847a);
        eVar.d(f21407c, dVar.b);
    }
}
