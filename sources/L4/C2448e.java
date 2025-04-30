package l4;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* renamed from: l4.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2448e implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2446c f21574a;

    public C2448e(C2446c c2446c) {
        this.f21574a = c2446c;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zziu
    public final void onEvent(String str, String str2, Bundle bundle, long j7) {
        if (str != null && (!AbstractC2445b.f21567a.contains(str2))) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j7);
            bundle2.putBundle("params", bundle);
            this.f21574a.f21572a.x(3, bundle2);
        }
    }
}
