package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* loaded from: classes3.dex */
public final class zzjf {
    public static <T> T zza(@NonNull Bundle bundle, String str, Class<T> cls, T t5) {
        T t10 = (T) bundle.get(str);
        if (t10 == null) {
            return t5;
        }
        if (cls.isAssignableFrom(t10.getClass())) {
            return t10;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", str, cls.getCanonicalName(), t10.getClass().getCanonicalName()));
    }

    public static void zza(@NonNull Bundle bundle, @NonNull Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble(AppMeasurementSdk.ConditionalUserProperty.VALUE, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.VALUE, ((Long) obj).longValue());
        } else {
            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.VALUE, obj.toString());
        }
    }
}
