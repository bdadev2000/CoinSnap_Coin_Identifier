package com.google.firebase.crashlytics;

import com.google.firebase.Firebase;
import org.jetbrains.annotations.NotNull;
import q0.l;

/* loaded from: classes4.dex */
public final class FirebaseCrashlyticsKt {
    @NotNull
    public static final FirebaseCrashlytics getCrashlytics(@NotNull Firebase firebase) {
        p0.a.s(firebase, "<this>");
        FirebaseCrashlytics firebaseCrashlytics = FirebaseCrashlytics.getInstance();
        p0.a.r(firebaseCrashlytics, "getInstance()");
        return firebaseCrashlytics;
    }

    public static final void setCustomKeys(@NotNull FirebaseCrashlytics firebaseCrashlytics, @NotNull l lVar) {
        p0.a.s(firebaseCrashlytics, "<this>");
        p0.a.s(lVar, "init");
        lVar.invoke(new KeyValueBuilder(firebaseCrashlytics));
    }
}
