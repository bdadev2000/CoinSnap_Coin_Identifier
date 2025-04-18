package org.koin.android.ext.koin;

import android.app.Application;
import android.content.Context;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.NotNull;
import org.koin.android.error.MissingAndroidContextException;
import org.koin.core.scope.Scope;
import p0.a;

/* loaded from: classes.dex */
public final class ModuleExtKt {

    @NotNull
    public static final String ERROR_MSG = "Please use androidContext() function in your KoinApplication configuration.";

    @NotNull
    public static final Application androidApplication(@NotNull Scope scope) {
        a.s(scope, "<this>");
        try {
            return (Application) scope.get(g0.a(Application.class), null, null);
        } catch (Exception unused) {
            throw new MissingAndroidContextException("Can't resolve Application instance. Please use androidContext() function in your KoinApplication configuration.");
        }
    }

    @NotNull
    public static final Context androidContext(@NotNull Scope scope) {
        a.s(scope, "<this>");
        try {
            return (Context) scope.get(g0.a(Context.class), null, null);
        } catch (Exception unused) {
            throw new MissingAndroidContextException("Can't resolve Context instance. Please use androidContext() function in your KoinApplication configuration.");
        }
    }
}
