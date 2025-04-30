package w4;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* renamed from: w4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2870c implements G4.d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2870c f23830a = new Object();
    public static final G4.c b = G4.c.a("key");

    /* renamed from: c, reason: collision with root package name */
    public static final G4.c f23831c = G4.c.a(AppMeasurementSdk.ConditionalUserProperty.VALUE);

    @Override // G4.a
    public final void a(Object obj, Object obj2) {
        G4.e eVar = (G4.e) obj2;
        G g9 = (G) ((s0) obj);
        eVar.d(b, g9.f23724a);
        eVar.d(f23831c, g9.b);
    }
}
