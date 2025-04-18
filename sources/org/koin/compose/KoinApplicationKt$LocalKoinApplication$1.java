package org.koin.compose;

import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import q0.a;

/* loaded from: classes2.dex */
public final class KoinApplicationKt$LocalKoinApplication$1 extends r implements a {
    public static final KoinApplicationKt$LocalKoinApplication$1 INSTANCE = new KoinApplicationKt$LocalKoinApplication$1();

    public KoinApplicationKt$LocalKoinApplication$1() {
        super(0);
    }

    @Override // q0.a
    @NotNull
    public final Koin invoke() {
        Koin defaultKoinContext;
        defaultKoinContext = KoinApplicationKt.getDefaultKoinContext();
        KoinApplicationKt.warnNoContext(defaultKoinContext);
        return defaultKoinContext;
    }
}
