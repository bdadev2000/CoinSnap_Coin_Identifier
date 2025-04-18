package org.koin.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.l;
import q0.p;

/* loaded from: classes2.dex */
public final class KoinApplicationKt$KoinApplication$2 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ l $application;
    final /* synthetic */ p $content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KoinApplicationKt$KoinApplication$2(l lVar, p pVar, int i2) {
        super(2);
        this.$application = lVar;
        this.$content = pVar;
        this.$$changed = i2;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        KoinApplicationKt.KoinApplication(this.$application, this.$content, composer, RecomposeScopeImplKt.a(this.$$changed | 1));
    }
}
