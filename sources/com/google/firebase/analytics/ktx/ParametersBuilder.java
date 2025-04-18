package com.google.firebase.analytics.ktx;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import d0.a;
import org.jetbrains.annotations.NotNull;

@a
/* loaded from: classes4.dex */
public final class ParametersBuilder {

    @NotNull
    private final Bundle zza = new Bundle();

    @NotNull
    public final Bundle getBundle() {
        return this.zza;
    }

    @a
    public final void param(@NonNull String str, double d) {
        p0.a.s(str, SDKConstants.PARAM_KEY);
        this.zza.putDouble(str, d);
    }

    @a
    public final void param(@NonNull String str, long j2) {
        p0.a.s(str, SDKConstants.PARAM_KEY);
        this.zza.putLong(str, j2);
    }

    @a
    public final void param(@NonNull String str, @NonNull Bundle bundle) {
        p0.a.s(str, SDKConstants.PARAM_KEY);
        p0.a.s(bundle, "value");
        this.zza.putBundle(str, bundle);
    }

    @a
    public final void param(@NonNull String str, @NonNull String str2) {
        p0.a.s(str, SDKConstants.PARAM_KEY);
        p0.a.s(str2, "value");
        this.zza.putString(str, str2);
    }

    @a
    public final void param(@NonNull String str, @NonNull Bundle[] bundleArr) {
        p0.a.s(str, SDKConstants.PARAM_KEY);
        p0.a.s(bundleArr, "value");
        this.zza.putParcelableArray(str, bundleArr);
    }
}
