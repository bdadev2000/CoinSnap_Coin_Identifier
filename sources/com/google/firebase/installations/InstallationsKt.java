package com.google.firebase.installations;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final class InstallationsKt {
    @NotNull
    public static final FirebaseInstallations getInstallations(@NotNull Firebase firebase) {
        p0.a.s(firebase, "<this>");
        FirebaseInstallations firebaseInstallations = FirebaseInstallations.getInstance();
        p0.a.r(firebaseInstallations, "getInstance()");
        return firebaseInstallations;
    }

    @NotNull
    public static final FirebaseInstallations installations(@NotNull Firebase firebase, @NotNull FirebaseApp firebaseApp) {
        p0.a.s(firebase, "<this>");
        p0.a.s(firebaseApp, "app");
        FirebaseInstallations firebaseInstallations = FirebaseInstallations.getInstance(firebaseApp);
        p0.a.r(firebaseInstallations, "getInstance(app)");
        return firebaseInstallations;
    }
}
