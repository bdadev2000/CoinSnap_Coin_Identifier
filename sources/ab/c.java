package ab;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;

/* loaded from: classes3.dex */
public final class c {
    public final HashSet a;

    /* renamed from: b, reason: collision with root package name */
    public final qa.a f424b;

    public c(AppMeasurementSdk appMeasurementSdk, qa.a aVar) {
        this.f424b = aVar;
        appMeasurementSdk.registerOnMeasurementEventListener(new b(this));
        this.a = new HashSet();
    }
}
