package ab;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes3.dex */
public final class e {
    public final qa.a a;

    public e(AppMeasurementSdk appMeasurementSdk, qa.a aVar) {
        this.a = aVar;
        appMeasurementSdk.registerOnMeasurementEventListener(new d(this));
    }
}
