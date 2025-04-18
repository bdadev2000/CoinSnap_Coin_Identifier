package com.google.firebase.analytics.ktx;

import androidx.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.ktx.FirebaseKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.l;

/* loaded from: classes3.dex */
public final class AnalyticsKt {

    @Nullable
    private static volatile FirebaseAnalytics zza;

    @NotNull
    private static final Object zzb = new Object();

    @androidx.annotation.Nullable
    public static final FirebaseAnalytics getANALYTICS() {
        return zza;
    }

    @NotNull
    public static final FirebaseAnalytics getAnalytics(@NonNull Firebase firebase) {
        a.s(firebase, "<this>");
        if (zza == null) {
            synchronized (zzb) {
                if (zza == null) {
                    zza = FirebaseAnalytics.getInstance(FirebaseKt.getApp(Firebase.INSTANCE).getApplicationContext());
                }
            }
        }
        FirebaseAnalytics firebaseAnalytics = zza;
        a.p(firebaseAnalytics);
        return firebaseAnalytics;
    }

    @NotNull
    public static final Object getLOCK() {
        return zzb;
    }

    @d0.a
    public static final void logEvent(@NonNull FirebaseAnalytics firebaseAnalytics, @NonNull String str, @NonNull l lVar) {
        a.s(firebaseAnalytics, "<this>");
        a.s(str, "name");
        a.s(lVar, "block");
        ParametersBuilder parametersBuilder = new ParametersBuilder();
        lVar.invoke(parametersBuilder);
        firebaseAnalytics.logEvent(str, parametersBuilder.getBundle());
    }

    public static final void setANALYTICS(@Nullable FirebaseAnalytics firebaseAnalytics) {
        zza = firebaseAnalytics;
    }

    @d0.a
    public static final void setConsent(@NonNull FirebaseAnalytics firebaseAnalytics, @NonNull l lVar) {
        a.s(firebaseAnalytics, "<this>");
        a.s(lVar, "block");
        ConsentBuilder consentBuilder = new ConsentBuilder();
        lVar.invoke(consentBuilder);
        firebaseAnalytics.setConsent(consentBuilder.asMap());
    }
}
