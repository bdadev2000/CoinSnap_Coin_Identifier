package org.koin.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import q0.p;

/* loaded from: classes2.dex */
public final class KoinApplicationKt$KoinContext$2 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ p $content;
    final /* synthetic */ Koin $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KoinApplicationKt$KoinContext$2(Koin koin, p pVar, int i2, int i3) {
        super(2);
        this.$context = koin;
        this.$content = pVar;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        KoinApplicationKt.KoinContext(this.$context, this.$content, composer, RecomposeScopeImplKt.a(this.$$changed | 1), this.$$default);
    }
}
