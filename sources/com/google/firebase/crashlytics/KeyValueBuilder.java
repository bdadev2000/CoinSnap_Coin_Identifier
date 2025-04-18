package com.google.firebase.crashlytics;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class KeyValueBuilder {

    @NotNull
    private final FirebaseCrashlytics crashlytics;

    public KeyValueBuilder(@NotNull FirebaseCrashlytics firebaseCrashlytics) {
        p0.a.s(firebaseCrashlytics, "crashlytics");
        this.crashlytics = firebaseCrashlytics;
    }

    public final void key(@NotNull String str, boolean z2) {
        p0.a.s(str, SDKConstants.PARAM_KEY);
        this.crashlytics.setCustomKey(str, z2);
    }

    public final void key(@NotNull String str, double d) {
        p0.a.s(str, SDKConstants.PARAM_KEY);
        this.crashlytics.setCustomKey(str, d);
    }

    public final void key(@NotNull String str, float f2) {
        p0.a.s(str, SDKConstants.PARAM_KEY);
        this.crashlytics.setCustomKey(str, f2);
    }

    public final void key(@NotNull String str, int i2) {
        p0.a.s(str, SDKConstants.PARAM_KEY);
        this.crashlytics.setCustomKey(str, i2);
    }

    public final void key(@NotNull String str, long j2) {
        p0.a.s(str, SDKConstants.PARAM_KEY);
        this.crashlytics.setCustomKey(str, j2);
    }

    public final void key(@NotNull String str, @NotNull String str2) {
        p0.a.s(str, SDKConstants.PARAM_KEY);
        p0.a.s(str2, "value");
        this.crashlytics.setCustomKey(str, str2);
    }
}
