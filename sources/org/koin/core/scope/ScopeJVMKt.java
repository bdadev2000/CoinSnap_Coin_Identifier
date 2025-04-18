package org.koin.core.scope;

import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.qualifier.Qualifier;
import p0.a;

/* loaded from: classes4.dex */
public final class ScopeJVMKt {
    @NotNull
    public static final <T> T get(@NotNull Scope scope, @NotNull Class<?> cls) {
        a.s(scope, "<this>");
        a.s(cls, "clazz");
        return (T) get$default(scope, cls, null, null, 6, null);
    }

    public static /* synthetic */ Object get$default(Scope scope, Class cls, Qualifier qualifier, q0.a aVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            qualifier = null;
        }
        if ((i2 & 4) != 0) {
            aVar = null;
        }
        return get(scope, cls, qualifier, aVar);
    }

    @NotNull
    public static final <T> T get(@NotNull Scope scope, @NotNull Class<?> cls, @Nullable Qualifier qualifier) {
        a.s(scope, "<this>");
        a.s(cls, "clazz");
        return (T) get$default(scope, cls, qualifier, null, 4, null);
    }

    @NotNull
    public static final <T> T get(@NotNull Scope scope, @NotNull Class<?> cls, @Nullable Qualifier qualifier, @Nullable q0.a aVar) {
        a.s(scope, "<this>");
        a.s(cls, "clazz");
        return (T) scope.get(g0.a(cls), qualifier, aVar);
    }
}
