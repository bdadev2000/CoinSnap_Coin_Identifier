package org.koin;

import org.jetbrains.annotations.NotNull;
import org.koin.core.KoinApplication;
import org.koin.core.registry.PropertyRegistryExtKt;
import p0.a;

/* loaded from: classes4.dex */
public final class KoinApplicationExtKt {
    @NotNull
    public static final KoinApplication environmentProperties(@NotNull KoinApplication koinApplication) {
        a.s(koinApplication, "<this>");
        PropertyRegistryExtKt.loadEnvironmentProperties(koinApplication.getKoin().getPropertyRegistry());
        return koinApplication;
    }

    @NotNull
    public static final KoinApplication fileProperties(@NotNull KoinApplication koinApplication, @NotNull String str) {
        a.s(koinApplication, "<this>");
        a.s(str, "fileName");
        PropertyRegistryExtKt.loadPropertiesFromFile(koinApplication.getKoin().getPropertyRegistry(), str);
        return koinApplication;
    }

    public static /* synthetic */ KoinApplication fileProperties$default(KoinApplication koinApplication, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "/koin.properties";
        }
        return fileProperties(koinApplication, str);
    }
}
