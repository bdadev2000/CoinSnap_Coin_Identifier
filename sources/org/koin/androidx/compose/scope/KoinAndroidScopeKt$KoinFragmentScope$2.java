package org.koin.androidx.compose.scope;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* loaded from: classes.dex */
public final class KoinAndroidScopeKt$KoinFragmentScope$2 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ p $content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KoinAndroidScopeKt$KoinFragmentScope$2(p pVar, int i2) {
        super(2);
        this.$content = pVar;
        this.$$changed = i2;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        KoinAndroidScopeKt.KoinFragmentScope(this.$content, composer, RecomposeScopeImplKt.a(this.$$changed | 1));
    }
}
