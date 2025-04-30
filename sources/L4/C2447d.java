package l4;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zziq;
import d4.u;

/* renamed from: l4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2447d implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2444a f21573a;

    public C2447d(C2444a c2444a) {
        this.f21573a = c2444a;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zziu
    public final void onEvent(String str, String str2, Bundle bundle, long j7) {
        C2444a c2444a = this.f21573a;
        if (!c2444a.f21566a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        u uVar = AbstractC2445b.f21567a;
        String zza = zziq.zza(str2);
        if (zza != null) {
            str2 = zza;
        }
        bundle2.putString("events", str2);
        c2444a.b.x(2, bundle2);
    }
}
