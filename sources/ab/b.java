package ab;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzji;
import com.google.common.collect.b1;

/* loaded from: classes3.dex */
public final class b implements AppMeasurementSdk.OnEventListener {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzjl
    public final void onEvent(String str, String str2, Bundle bundle, long j3) {
        c cVar = this.a;
        if (!cVar.a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        b1 b1Var = a.a;
        String zza = zzji.zza(str2);
        if (zza != null) {
            str2 = zza;
        }
        bundle2.putString("events", str2);
        cVar.f424b.l(2, bundle2);
    }
}
