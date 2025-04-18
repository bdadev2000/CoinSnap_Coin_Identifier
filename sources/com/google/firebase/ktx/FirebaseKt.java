package com.google.firebase.ktx;

import android.content.Context;
import b1.z;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.components.Component;
import java.lang.annotation.Annotation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* loaded from: classes4.dex */
public final class FirebaseKt {
    @NotNull
    public static final FirebaseApp app(@NotNull Firebase firebase, @NotNull String str) {
        a.s(firebase, "<this>");
        a.s(str, "name");
        FirebaseApp firebaseApp = FirebaseApp.getInstance(str);
        a.r(firebaseApp, "getInstance(name)");
        return firebaseApp;
    }

    private static final <T extends Annotation> Component<z> coroutineDispatcher() {
        a.A0();
        throw null;
    }

    @NotNull
    public static final FirebaseApp getApp(@NotNull Firebase firebase) {
        a.s(firebase, "<this>");
        FirebaseApp firebaseApp = FirebaseApp.getInstance();
        a.r(firebaseApp, "getInstance()");
        return firebaseApp;
    }

    @NotNull
    public static final FirebaseOptions getOptions(@NotNull Firebase firebase) {
        a.s(firebase, "<this>");
        FirebaseOptions options = getApp(Firebase.INSTANCE).getOptions();
        a.r(options, "Firebase.app.options");
        return options;
    }

    @d0.a
    @Nullable
    public static final FirebaseApp initialize(@NotNull Firebase firebase, @NotNull Context context) {
        a.s(firebase, "<this>");
        a.s(context, "context");
        return FirebaseApp.initializeApp(context);
    }

    @d0.a
    @NotNull
    public static final FirebaseApp initialize(@NotNull Firebase firebase, @NotNull Context context, @NotNull FirebaseOptions firebaseOptions) {
        a.s(firebase, "<this>");
        a.s(context, "context");
        a.s(firebaseOptions, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
        FirebaseApp initializeApp = FirebaseApp.initializeApp(context, firebaseOptions);
        a.r(initializeApp, "initializeApp(context, options)");
        return initializeApp;
    }

    @d0.a
    @NotNull
    public static final FirebaseApp initialize(@NotNull Firebase firebase, @NotNull Context context, @NotNull FirebaseOptions firebaseOptions, @NotNull String str) {
        a.s(firebase, "<this>");
        a.s(context, "context");
        a.s(firebaseOptions, SDKConstants.PARAM_GAME_REQUESTS_OPTIONS);
        a.s(str, "name");
        FirebaseApp initializeApp = FirebaseApp.initializeApp(context, firebaseOptions, str);
        a.r(initializeApp, "initializeApp(context, options, name)");
        return initializeApp;
    }
}
