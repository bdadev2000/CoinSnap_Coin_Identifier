package org.koin.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import org.koin.core.KoinApplication;
import q0.p;

/* loaded from: classes2.dex */
public final class KoinApplicationKt$KoinIsolatedContext$2 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ p $content;
    final /* synthetic */ KoinApplication $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KoinApplicationKt$KoinIsolatedContext$2(KoinApplication koinApplication, p pVar, int i2) {
        super(2);
        this.$context = koinApplication;
        this.$content = pVar;
        this.$$changed = i2;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        KoinApplicationKt.KoinIsolatedContext(this.$context, this.$content, composer, RecomposeScopeImplKt.a(this.$$changed | 1));
    }
}
