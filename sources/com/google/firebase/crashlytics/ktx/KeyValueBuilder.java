package com.google.firebase.crashlytics.ktx;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import d0.a;
import org.jetbrains.annotations.NotNull;

@a
/* loaded from: classes4.dex */
public final class KeyValueBuilder {

    @NotNull
    private final FirebaseCrashlytics crashlytics;

    public KeyValueBuilder(@NotNull FirebaseCrashlytics firebaseCrashlytics) {
        p0.a.s(firebaseCrashlytics, "crashlytics");
        this.crashlytics = firebaseCrashlytics;
    }

    @a
    public final void key(@NotNull String str, boolean z2) {
        p0.a.s(str, SDKConstants.PARAM_KEY);
        this.crashlytics.setCustomKey(str, z2);
    }

    @a
    public final void key(@NotNull String str, double d) {
        p0.a.s(str, SDKConstants.PARAM_KEY);
        this.crashlytics.setCustomKey(str, d);
    }

    @a
    public final void key(@NotNull String str, float f2) {
        p0.a.s(str, SDKConstants.PARAM_KEY);
        this.crashlytics.setCustomKey(str, f2);
    }

    @a
    public final void key(@NotNull String str, int i2) {
        p0.a.s(str, SDKConstants.PARAM_KEY);
        this.crashlytics.setCustomKey(str, i2);
    }

    @a
    public final void key(@NotNull String str, long j2) {
        p0.a.s(str, SDKConstants.PARAM_KEY);
        this.crashlytics.setCustomKey(str, j2);
    }

    @a
    public final void key(@NotNull String str, @NotNull String str2) {
        p0.a.s(str, SDKConstants.PARAM_KEY);
        p0.a.s(str2, "value");
        this.crashlytics.setCustomKey(str, str2);
    }
}
