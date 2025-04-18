package org.koin.java;

import b1.f0;
import d0.h;
import d0.i;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import p0.a;

/* loaded from: classes2.dex */
public final class KoinJavaComponent {

    @NotNull
    public static final KoinJavaComponent INSTANCE = new KoinJavaComponent();

    private KoinJavaComponent() {
    }

    public static final <T> T get(@NotNull Class<?> cls) {
        a.s(cls, "clazz");
        return (T) get$default(cls, null, null, 6, null);
    }

    public static /* synthetic */ Object get$default(Class cls, Qualifier qualifier, q0.a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            qualifier = null;
        }
        if ((i2 & 4) != 0) {
            aVar = null;
        }
        return get(cls, qualifier, aVar);
    }

    @NotNull
    public static final Koin getKoin() {
        return KoinPlatformTools.INSTANCE.defaultContext().get();
    }

    @Nullable
    public static final <T> T getOrNull(@NotNull Class<?> cls) {
        a.s(cls, "clazz");
        return (T) getOrNull$default(cls, null, null, 6, null);
    }

    public static /* synthetic */ Object getOrNull$default(Class cls, Qualifier qualifier, q0.a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            qualifier = null;
        }
        if ((i2 & 4) != 0) {
            aVar = null;
        }
        return getOrNull(cls, qualifier, aVar);
    }

    @NotNull
    public static final <T> h inject(@NotNull Class<?> cls) {
        a.s(cls, "clazz");
        return inject$default(cls, null, null, 6, null);
    }

    public static /* synthetic */ h inject$default(Class cls, Qualifier qualifier, q0.a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            qualifier = null;
        }
        if ((i2 & 4) != 0) {
            aVar = null;
        }
        return inject(cls, qualifier, aVar);
    }

    @NotNull
    public static final <T> h injectOrNull(@NotNull Class<?> cls) {
        a.s(cls, "clazz");
        return injectOrNull$default(cls, null, null, 6, null);
    }

    public static /* synthetic */ h injectOrNull$default(Class cls, Qualifier qualifier, q0.a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            qualifier = null;
        }
        if ((i2 & 4) != 0) {
            aVar = null;
        }
        return injectOrNull(cls, qualifier, aVar);
    }

    public static final <T> T get(@NotNull Class<?> cls, @Nullable Qualifier qualifier) {
        a.s(cls, "clazz");
        return (T) get$default(cls, qualifier, null, 4, null);
    }

    @Nullable
    public static final <T> T getOrNull(@NotNull Class<?> cls, @Nullable Qualifier qualifier) {
        a.s(cls, "clazz");
        return (T) getOrNull$default(cls, qualifier, null, 4, null);
    }

    @NotNull
    public static final <T> h inject(@NotNull Class<?> cls, @Nullable Qualifier qualifier) {
        a.s(cls, "clazz");
        return inject$default(cls, qualifier, null, 4, null);
    }

    @NotNull
    public static final <T> h injectOrNull(@NotNull Class<?> cls, @Nullable Qualifier qualifier) {
        a.s(cls, "clazz");
        return injectOrNull$default(cls, qualifier, null, 4, null);
    }

    public static final <T> T get(@NotNull Class<?> cls, @Nullable Qualifier qualifier, @Nullable q0.a aVar) {
        a.s(cls, "clazz");
        return (T) getKoin().get(g0.a(cls), qualifier, aVar);
    }

    @Nullable
    public static final <T> T getOrNull(@NotNull Class<?> cls, @Nullable Qualifier qualifier, @Nullable q0.a aVar) {
        a.s(cls, "clazz");
        return (T) getKoin().getOrNull(g0.a(cls), qualifier, aVar);
    }

    @NotNull
    public static final <T> h inject(@NotNull Class<?> cls, @Nullable Qualifier qualifier, @Nullable q0.a aVar) {
        a.s(cls, "clazz");
        return f0.s(i.f30131a, new KoinJavaComponent$inject$1(cls, qualifier, aVar));
    }

    @NotNull
    public static final <T> h injectOrNull(@NotNull Class<?> cls, @Nullable Qualifier qualifier, @Nullable q0.a aVar) {
        a.s(cls, "clazz");
        return f0.t(new KoinJavaComponent$injectOrNull$1(cls, qualifier, aVar));
    }
}
