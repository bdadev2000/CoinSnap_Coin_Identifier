package k3;

/* loaded from: classes.dex */
public final class d implements G4.d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f21408a = new Object();
    public static final G4.c b = new G4.c("logSource", com.mbridge.msdk.foundation.entity.o.r(com.mbridge.msdk.foundation.entity.o.q(J4.e.class, new J4.a(1))));

    /* renamed from: c, reason: collision with root package name */
    public static final G4.c f21409c = new G4.c("logEventDropped", com.mbridge.msdk.foundation.entity.o.r(com.mbridge.msdk.foundation.entity.o.q(J4.e.class, new J4.a(2))));

    @Override // G4.a
    public final void a(Object obj, Object obj2) {
        n3.e eVar = (n3.e) obj;
        G4.e eVar2 = (G4.e) obj2;
        eVar2.d(b, eVar.f21849a);
        eVar2.d(f21409c, eVar.b);
    }
}
