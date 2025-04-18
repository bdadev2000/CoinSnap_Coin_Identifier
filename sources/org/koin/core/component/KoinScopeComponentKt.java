package org.koin.core.component;

import b1.f0;
import d0.h;
import kotlin.jvm.internal.g0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.qualifier.TypeQualifier;
import org.koin.core.scope.Scope;
import org.koin.ext.KClassExtKt;
import p0.a;

/* loaded from: classes.dex */
public final class KoinScopeComponentKt {
    @NotNull
    public static final <T extends KoinScopeComponent> Scope createScope(@NotNull T t2, @Nullable Object obj) {
        a.s(t2, "<this>");
        return t2.getKoin().createScope(getScopeId(t2), getScopeName(t2), obj);
    }

    public static /* synthetic */ Scope createScope$default(KoinScopeComponent koinScopeComponent, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            obj = null;
        }
        return createScope(koinScopeComponent, obj);
    }

    @NotNull
    public static final <T extends KoinScopeComponent> h getOrCreateScope(@NotNull T t2) {
        a.s(t2, "<this>");
        return f0.t(new KoinScopeComponentKt$getOrCreateScope$1(t2));
    }

    @NotNull
    public static final <T> String getScopeId(@NotNull T t2) {
        a.s(t2, "<this>");
        return KClassExtKt.getFullName(g0.a(t2.getClass())) + '@' + t2.hashCode();
    }

    @NotNull
    public static final <T> TypeQualifier getScopeName(@NotNull T t2) {
        a.s(t2, "<this>");
        return new TypeQualifier(g0.a(t2.getClass()));
    }

    @Nullable
    public static final <T extends KoinScopeComponent> Scope getScopeOrNull(@NotNull T t2) {
        a.s(t2, "<this>");
        return t2.getKoin().getScopeOrNull(getScopeId(t2));
    }

    @NotNull
    public static final <T extends KoinScopeComponent> h newScope(@NotNull T t2) {
        a.s(t2, "<this>");
        return f0.t(new KoinScopeComponentKt$newScope$1(t2));
    }
}
