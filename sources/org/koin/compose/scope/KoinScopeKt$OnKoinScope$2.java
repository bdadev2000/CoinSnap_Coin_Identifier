package org.koin.compose.scope;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;
import q0.p;

/* loaded from: classes3.dex */
public final class KoinScopeKt$OnKoinScope$2 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ p $content;
    final /* synthetic */ Scope $scope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KoinScopeKt$OnKoinScope$2(Scope scope, p pVar, int i2) {
        super(2);
        this.$scope = scope;
        this.$content = pVar;
        this.$$changed = i2;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        KoinScopeKt.OnKoinScope(this.$scope, this.$content, composer, RecomposeScopeImplKt.a(this.$$changed | 1));
    }
}
