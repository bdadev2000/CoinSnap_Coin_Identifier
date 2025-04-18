package org.koin.compose;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.scope.Scope;
import q0.a;

/* loaded from: classes2.dex */
public final class KoinApplicationKt$LocalKoinScope$1 extends r implements a {
    public static final KoinApplicationKt$LocalKoinScope$1 INSTANCE = new KoinApplicationKt$LocalKoinScope$1();

    public KoinApplicationKt$LocalKoinScope$1() {
        super(0);
    }

    @Override // q0.a
    @NotNull
    public final Scope invoke() {
        Koin defaultKoinContext;
        defaultKoinContext = KoinApplicationKt.getDefaultKoinContext();
        KoinApplicationKt.warnNoContext(defaultKoinContext);
        return defaultKoinContext.getScopeRegistry().getRootScope();
    }
}
