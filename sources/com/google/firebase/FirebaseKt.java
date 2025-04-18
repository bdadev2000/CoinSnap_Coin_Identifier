package com.google.firebase;

import android.content.Context;
import b1.z;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.components.Component;
import java.lang.annotation.Annotation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public final class FirebaseKt {
    @NotNull
    public static final FirebaseApp app(@NotNull Firebase firebase, @NotNull String str) {
        p0.a.s(firebase, "<this>");
        p0.a.s(str, "name");
        FirebaseApp firebaseApp = FirebaseApp.getInstance(str);
        p0.a.r(firebaseApp, "getInstance(name)");
        return firebaseApp;
    }

    private static final <T extends Annotation> Component<z> coroutineDispatcher() {
        p0.a.A0();
        throw null;
    }

    @NotNull
    public static final FirebaseApp getApp(@NotNull Firebase firebase) {
        p0.a.s(firebase, "<this>");
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        p0.a.r(firebaseApp, "getInstance()");
        return firebaseApp;
    }

    @NotNull
    public static final FirebaseOptions getOptions(@NotNull Firebase firebase) {
        p0.a.s(firebase, "<this>");
        FirebaseOptions options = getApp(Firebase.INSTANCE).getOptions();
        p0.a.r(options, "Firebase.app.options");
        return options;
    }

    @Nullable
    public static final FirebaseApp initialize(@NotNull Firebase firebase, @NotNull Context context) {
        p0.a.s(firebase, "<this>");
        p0.a.s(context, "context");
        return FirebaseApp.initializeApp(context);
    }

    @NotNull
    public static final FirebaseApp initialize(@NotNull Firebase firebase, @NotNull Context context, @NotNull FirebaseOptions firebaseOptions) {
        p0.a.s(firebase, "<this>");
        p0.a.s(context, "context");
        p0.a.s(firebaseOptions, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
        FirebaseApp initializeApp = FirebaseApp.initializeApp(context, firebaseOptions);
        p0.a.r(initializeApp, "initializeApp(context, options)");
        return initializeApp;
    }

    @NotNull
    public static final FirebaseApp initialize(@NotNull Firebase firebase, @NotNull Context context, @NotNull FirebaseOptions firebaseOptions, @NotNull String str) {
        p0.a.s(firebase, "<this>");
        p0.a.s(context, "context");
        p0.a.s(firebaseOptions, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
        p0.a.s(str, "name");
        FirebaseApp initializeApp = FirebaseApp.initializeApp(context, firebaseOptions, str);
        p0.a.r(initializeApp, "initializeApp(context, options, name)");
        return initializeApp;
    }
}
