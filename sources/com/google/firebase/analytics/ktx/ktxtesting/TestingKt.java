package com.google.firebase.analytics.ktx.ktxtesting;

import androidx.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.ktx.AnalyticsKt;
import q0.a;

/* loaded from: classes4.dex */
public final class TestingKt {
    public static final void withAnalyticsForTest(@NonNull FirebaseAnalytics firebaseAnalytics, @NonNull a aVar) {
        p0.a.s(firebaseAnalytics, "analytics");
        p0.a.s(aVar, "block");
        synchronized (AnalyticsKt.getLOCK()) {
            FirebaseAnalytics analytics = AnalyticsKt.getANALYTICS();
            AnalyticsKt.setANALYTICS(firebaseAnalytics);
            try {
                aVar.invoke();
            } finally {
                AnalyticsKt.setANALYTICS(analytics);
            }
        }
    }
}
