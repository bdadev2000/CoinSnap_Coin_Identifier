package mb;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes3.dex */
public final class c implements vb.d {
    public static final c a = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final vb.c f21859b = vb.c.a("key");

    /* renamed from: c, reason: collision with root package name */
    public static final vb.c f21860c = vb.c.a(AppMeasurementSdk.ConditionalUserProperty.VALUE);

    @Override // vb.a
    public final void a(Object obj, Object obj2) {
        vb.e eVar = (vb.e) obj2;
        f0 f0Var = (f0) ((v1) obj);
        eVar.a(f21859b, f0Var.a);
        eVar.a(f21860c, f0Var.f21907b);
    }
}
