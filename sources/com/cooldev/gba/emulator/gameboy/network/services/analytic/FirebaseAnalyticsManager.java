package com.cooldev.gba.emulator.gameboy.network.services.analytic;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.safedk.android.analytics.events.MaxEvent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class FirebaseAnalyticsManager {
    private static FirebaseAnalytics firebaseAnalytics;

    @NotNull
    public static final FirebaseAnalyticsManager INSTANCE = new FirebaseAnalyticsManager();
    public static final int $stable = 8;

    private FirebaseAnalyticsManager() {
    }

    public static /* synthetic */ void logEvent$default(FirebaseAnalyticsManager firebaseAnalyticsManager, String str, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        firebaseAnalyticsManager.logEvent(str, bundle);
    }

    public final void initialize(@NotNull FirebaseAnalytics firebaseAnalytics2) {
        a.s(firebaseAnalytics2, "firebaseAnalytics");
        firebaseAnalytics = firebaseAnalytics2;
    }

    public final void logEvent(@NotNull String str, @Nullable Bundle bundle) {
        a.s(str, MaxEvent.f29810a);
        FirebaseAnalytics firebaseAnalytics2 = firebaseAnalytics;
        if (firebaseAnalytics2 != null) {
            firebaseAnalytics2.logEvent(str, bundle);
        } else {
            a.B0("firebaseAnalytics");
            throw null;
        }
    }
}
