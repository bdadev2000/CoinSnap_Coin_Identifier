package ab;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes3.dex */
public final class d implements AppMeasurementSdk.OnEventListener {
    public final /* synthetic */ e a;

    public d(e eVar) {
        this.a = eVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzjl
    public final void onEvent(String str, String str2, Bundle bundle, long j3) {
        if (str != null && (!a.a.contains(str2))) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("name", str2);
            bundle2.putLong("timestampInMillis", j3);
            bundle2.putBundle("params", bundle);
            this.a.a.l(3, bundle2);
        }
    }
}
