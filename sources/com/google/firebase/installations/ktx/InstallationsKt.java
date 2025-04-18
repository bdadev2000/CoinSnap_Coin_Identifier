package com.google.firebase.installations.ktx;

import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallations;
import com.google.firebase.ktx.Firebase;
import org.jetbrains.annotations.NotNull;
import p0.a;

/* loaded from: classes4.dex */
public final class InstallationsKt {
    @NotNull
    public static final FirebaseInstallations getInstallations(@NotNull Firebase firebase) {
        a.s(firebase, "<this>");
        FirebaseInstallations firebaseInstallations = FirebaseInstallations.getInstance();
        a.r(firebaseInstallations, "getInstance()");
        return firebaseInstallations;
    }

    @NotNull
    public static final FirebaseInstallations installations(@NotNull Firebase firebase, @NotNull FirebaseApp firebaseApp) {
        a.s(firebase, "<this>");
        a.s(firebaseApp, "app");
        FirebaseInstallations firebaseInstallations = FirebaseInstallations.getInstance(firebaseApp);
        a.r(firebaseInstallations, "getInstance(app)");
        return firebaseInstallations;
    }
}
