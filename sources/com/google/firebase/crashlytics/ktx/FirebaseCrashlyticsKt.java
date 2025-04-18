package com.google.firebase.crashlytics.ktx;

import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.ktx.Firebase;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes3.dex */
public final class FirebaseCrashlyticsKt {
    @NotNull
    public static final FirebaseCrashlytics getCrashlytics(@NotNull Firebase firebase) {
        a.s(firebase, "<this>");
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        a.r(firebaseCrashlytics, "getInstance()");
        return firebaseCrashlytics;
    }

    @d0.a
    public static final void setCustomKeys(@NotNull FirebaseCrashlytics firebaseCrashlytics, @NotNull l lVar) {
        a.s(firebaseCrashlytics, "<this>");
        a.s(lVar, "init");
        lVar.invoke(new KeyValueBuilder(firebaseCrashlytics));
    }
}
