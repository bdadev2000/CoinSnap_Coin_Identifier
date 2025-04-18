package org.koin.androidx.compose.scope;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* loaded from: classes.dex */
public final class KoinAndroidScopeKt$KoinFragmentScope$1 extends r implements p {
    final /* synthetic */ p $content;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KoinAndroidScopeKt$KoinFragmentScope$1(p pVar) {
        super(2);
        this.$content = pVar;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    @Composable
    public final void invoke(@Nullable Composer composer, int i2) {
        if ((i2 & 11) == 2 && composer.i()) {
            composer.A();
        } else {
            this.$content.invoke(composer, 0);
        }
    }
}
