package org.koin.android.ext.koin;

import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import b1.f0;
import d0.b0;
import e0.q;
import java.io.InputStream;
import java.util.Properties;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.NotNull;
import org.koin.android.logger.AndroidLogger;
import org.koin.core.Koin;
import org.koin.core.KoinApplication;
import org.koin.core.logger.Level;
import org.koin.core.registry.PropertyRegistryExtKt;
import org.koin.dsl.ModuleDSLKt;
import p0.a;

/* loaded from: classes2.dex */
public final class KoinExtKt {
    @NotNull
    public static final KoinApplication androidContext(@NotNull KoinApplication koinApplication, @NotNull Context context) {
        a.s(koinApplication, "<this>");
        a.s(context, "androidContext");
        if (koinApplication.getKoin().getLogger().isAt(Level.INFO)) {
            koinApplication.getKoin().getLogger().info("[init] declare Android Context");
        }
        if (context instanceof Application) {
            Koin.loadModules$default(koinApplication.getKoin(), f0.u(ModuleDSLKt.module$default(false, new KoinExtKt$androidContext$1(context), 1, null)), false, false, 6, null);
        } else {
            Koin.loadModules$default(koinApplication.getKoin(), f0.u(ModuleDSLKt.module$default(false, new KoinExtKt$androidContext$2(context), 1, null)), false, false, 6, null);
        }
        return koinApplication;
    }

    @NotNull
    public static final KoinApplication androidFileProperties(@NotNull KoinApplication koinApplication, @NotNull String str) {
        String[] list;
        a.s(koinApplication, "<this>");
        a.s(str, "koinPropertyFile");
        Properties properties = new Properties();
        Context context = (Context) koinApplication.getKoin().getScopeRegistry().getRootScope().get(g0.a(Context.class), null, null);
        try {
            AssetManager assets = context.getAssets();
            if (assets != null && (list = assets.list("")) != null && q.N(list, str)) {
                try {
                    InputStream open = context.getAssets().open(str);
                    try {
                        properties.load(open);
                        kotlin.jvm.internal.q.b(open, null);
                        PropertyRegistryExtKt.saveProperties(koinApplication.getKoin().getPropertyRegistry(), properties);
                        b0 b0Var = b0.f30125a;
                        if (koinApplication.getKoin().getLogger().isAt(Level.INFO)) {
                            koinApplication.getKoin().getLogger().info("[Android-Properties] loaded " + b0Var + " properties from assets/" + str);
                        }
                    } finally {
                    }
                } catch (Exception e) {
                    koinApplication.getKoin().getLogger().error("[Android-Properties] error for binding properties : " + e);
                }
            } else if (koinApplication.getKoin().getLogger().isAt(Level.INFO)) {
                koinApplication.getKoin().getLogger().info("[Android-Properties] no assets/" + str + " file to load");
            }
        } catch (Exception e2) {
            koinApplication.getKoin().getLogger().error("[Android-Properties] error while loading properties from assets/" + str + " : " + e2);
        }
        return koinApplication;
    }

    public static /* synthetic */ KoinApplication androidFileProperties$default(KoinApplication koinApplication, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "koin.properties";
        }
        return androidFileProperties(koinApplication, str);
    }

    @NotNull
    public static final KoinApplication androidLogger(@NotNull KoinApplication koinApplication, @NotNull Level level) {
        a.s(koinApplication, "<this>");
        a.s(level, "level");
        koinApplication.getKoin().setupLogger(new AndroidLogger(level));
        return koinApplication;
    }

    public static /* synthetic */ KoinApplication androidLogger$default(KoinApplication koinApplication, Level level, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            level = Level.INFO;
        }
        return androidLogger(koinApplication, level);
    }
}
