package k4;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import l4.AbstractC2445b;
import l4.C2447d;
import l4.C2448e;
import q4.C2645d;

/* renamed from: k4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2434c implements InterfaceC2433b {

    /* renamed from: c, reason: collision with root package name */
    public static volatile C2434c f21471c;

    /* renamed from: a, reason: collision with root package name */
    public final AppMeasurementSdk f21472a;
    public final ConcurrentHashMap b;

    public C2434c(AppMeasurementSdk appMeasurementSdk) {
        Preconditions.checkNotNull(appMeasurementSdk);
        this.f21472a = appMeasurementSdk;
        this.b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (!AbstractC2445b.d(str) || !AbstractC2445b.a(str2, bundle) || !AbstractC2445b.c(str, str2, bundle)) {
            return;
        }
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
        this.f21472a.logEvent(str, str2, bundle);
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, l4.c] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, l4.a] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, q4.d] */
    public final C2645d b(String str, a7.b bVar) {
        Object obj;
        Preconditions.checkNotNull(bVar);
        if (!AbstractC2445b.d(str)) {
            return null;
        }
        boolean isEmpty = str.isEmpty();
        ConcurrentHashMap concurrentHashMap = this.b;
        if (!isEmpty && concurrentHashMap.containsKey(str) && concurrentHashMap.get(str) != null) {
            return null;
        }
        boolean equals = AppMeasurement.FIAM_ORIGIN.equals(str);
        AppMeasurementSdk appMeasurementSdk = this.f21472a;
        if (equals) {
            ?? obj2 = new Object();
            obj2.b = bVar;
            appMeasurementSdk.registerOnMeasurementEventListener(new C2447d(obj2));
            obj2.f21566a = new HashSet();
            obj = obj2;
        } else if ("clx".equals(str)) {
            ?? obj3 = new Object();
            obj3.f21572a = bVar;
            appMeasurementSdk.registerOnMeasurementEventListener(new C2448e(obj3));
            obj = obj3;
        } else {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        concurrentHashMap.put(str, obj);
        return new Object();
    }
}
