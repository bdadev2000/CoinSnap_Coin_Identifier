package com.google.firebase.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes4.dex */
public final class ParametersBuilder {

    @NotNull
    private final Bundle zza = new Bundle();

    @NotNull
    public final Bundle getBundle() {
        return this.zza;
    }

    public final void param(@NonNull String str, double d) {
        a.s(str, SDKConstants.PARAM_KEY);
        this.zza.putDouble(str, d);
    }

    public final void param(@NonNull String str, long j2) {
        a.s(str, SDKConstants.PARAM_KEY);
        this.zza.putLong(str, j2);
    }

    public final void param(@NonNull String str, @NonNull Bundle bundle) {
        a.s(str, SDKConstants.PARAM_KEY);
        a.s(bundle, "value");
        this.zza.putBundle(str, bundle);
    }

    public final void param(@NonNull String str, @NonNull String str2) {
        a.s(str, SDKConstants.PARAM_KEY);
        a.s(str2, "value");
        this.zza.putString(str, str2);
    }

    public final void param(@NonNull String str, @NonNull Bundle[] bundleArr) {
        a.s(str, SDKConstants.PARAM_KEY);
        a.s(bundleArr, "value");
        this.zza.putParcelableArray(str, bundleArr);
    }
}
