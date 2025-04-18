package org.koin.android.java;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.koin.android.ext.koin.KoinExtKt;
import org.koin.core.KoinApplication;
import org.koin.core.logger.Level;
import p0.a;

/* loaded from: classes3.dex */
public final class KoinAndroidApplication {

    @NotNull
    public static final KoinAndroidApplication INSTANCE = new KoinAndroidApplication();

    private KoinAndroidApplication() {
    }

    @NotNull
    public static final KoinApplication create(@NotNull Context context) {
        a.s(context, "context");
        return create$default(context, null, 2, null);
    }

    public static /* synthetic */ KoinApplication create$default(Context context, Level level, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            level = Level.INFO;
        }
        return create(context, level);
    }

    @NotNull
    public static final KoinApplication create(@NotNull Context context, @NotNull Level level) {
        a.s(context, "context");
        a.s(level, "androidLoggerLevel");
        return KoinExtKt.androidLogger(KoinExtKt.androidContext(KoinApplication.Companion.init(), context), level);
    }
}
