package za;

import ab.e;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: c, reason: collision with root package name */
    public static volatile c f28713c;
    public final AppMeasurementSdk a;

    /* renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f28714b;

    public c(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.a = appMeasurementSdk;
        this.f28714b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (!ab.a.d(str) || !ab.a.a(bundle, str2) || !ab.a.c(bundle, str, str2)) {
            return;
        }
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
        this.a.logEvent(str, str2, bundle);
    }

    public final qa.a b(qa.a aVar, String str) {
        boolean z10;
        Object obj;
        Preconditions.checkNotNull(aVar);
        if (!ab.a.d(str)) {
            return null;
        }
        boolean isEmpty = str.isEmpty();
        ConcurrentHashMap concurrentHashMap = this.f28714b;
        int i10 = 1;
        if (!isEmpty && concurrentHashMap.containsKey(str) && concurrentHashMap.get(str) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return null;
        }
        boolean equals = AppMeasurement.FIAM_ORIGIN.equals(str);
        AppMeasurementSdk appMeasurementSdk = this.a;
        if (equals) {
            obj = new ab.c(appMeasurementSdk, aVar);
        } else if ("clx".equals(str)) {
            obj = new e(appMeasurementSdk, aVar);
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        concurrentHashMap.put(str, obj);
        return new qa.a(i10, this, str);
    }
}
