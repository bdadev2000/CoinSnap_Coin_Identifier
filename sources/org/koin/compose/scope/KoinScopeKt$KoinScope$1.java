package org.koin.compose.scope;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.l;
import q0.p;

/* loaded from: classes3.dex */
public final class KoinScopeKt$KoinScope$1 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ p $content;
    final /* synthetic */ l $scopeDefinition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KoinScopeKt$KoinScope$1(l lVar, p pVar, int i2) {
        super(2);
        this.$scopeDefinition = lVar;
        this.$content = pVar;
        this.$$changed = i2;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        KoinScopeKt.KoinScope(this.$scopeDefinition, this.$content, composer, RecomposeScopeImplKt.a(this.$$changed | 1));
    }
}
