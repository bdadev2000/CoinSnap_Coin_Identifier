package com.google.firebase.remoteconfig.ktx;

import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.FirebaseApp;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import d0.a;
import e1.h;
import org.jetbrains.annotations.NotNull;
import q0.l;

/* loaded from: classes2.dex */
public final class RemoteConfigKt {
    @a
    @NotNull
    public static final FirebaseRemoteConfigValue get(@NotNull FirebaseRemoteConfig firebaseRemoteConfig, @NotNull String str) {
        p0.a.s(firebaseRemoteConfig, "<this>");
        p0.a.s(str, SDKConstants.PARAM_KEY);
        FirebaseRemoteConfigValue value = firebaseRemoteConfig.getValue(str);
        p0.a.r(value, "this.getValue(key)");
        return value;
    }

    @NotNull
    public static final h getConfigUpdates(@NotNull FirebaseRemoteConfig firebaseRemoteConfig) {
        p0.a.s(firebaseRemoteConfig, "<this>");
        return p0.a.l(new RemoteConfigKt$configUpdates$1(firebaseRemoteConfig, null));
    }

    @a
    public static /* synthetic */ void getConfigUpdates$annotations(FirebaseRemoteConfig firebaseRemoteConfig) {
    }

    @NotNull
    public static final FirebaseRemoteConfig getRemoteConfig(@NotNull Firebase firebase) {
        p0.a.s(firebase, "<this>");
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        p0.a.r(firebaseRemoteConfig, "getInstance()");
        return firebaseRemoteConfig;
    }

    @NotNull
    public static final FirebaseRemoteConfig remoteConfig(@NotNull Firebase firebase, @NotNull FirebaseApp firebaseApp) {
        p0.a.s(firebase, "<this>");
        p0.a.s(firebaseApp, "app");
        FirebaseRemoteConfig firebaseRemoteConfig = FirebaseRemoteConfig.getInstance(firebaseApp);
        p0.a.r(firebaseRemoteConfig, "getInstance(app)");
        return firebaseRemoteConfig;
    }

    @NotNull
    public static final FirebaseRemoteConfigSettings remoteConfigSettings(@NotNull l lVar) {
        p0.a.s(lVar, "init");
        FirebaseRemoteConfigSettings.Builder builder = new FirebaseRemoteConfigSettings.Builder();
        lVar.invoke(builder);
        FirebaseRemoteConfigSettings build = builder.build();
        p0.a.r(build, "builder.build()");
        return build;
    }
}
