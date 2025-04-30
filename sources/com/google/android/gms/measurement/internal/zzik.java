package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.o;
import x0.AbstractC2914a;

/* loaded from: classes2.dex */
public final class zzik {
    public static <T> T zza(@NonNull Bundle bundle, String str, Class<T> cls, T t9) {
        T t10 = (T) bundle.get(str);
        if (t10 == null) {
            return t9;
        }
        if (cls.isAssignableFrom(t10.getClass())) {
            return t10;
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalStateException(AbstractC2914a.h(o.o("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), t10.getClass().getCanonicalName(), "]"));
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
