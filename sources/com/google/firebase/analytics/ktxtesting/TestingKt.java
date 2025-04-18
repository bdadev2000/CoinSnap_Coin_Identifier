package com.google.firebase.analytics.ktxtesting;

import androidx.annotation.NonNull;
import com.google.firebase.analytics.AnalyticsKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import q0.a;

/* loaded from: classes2.dex */
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
