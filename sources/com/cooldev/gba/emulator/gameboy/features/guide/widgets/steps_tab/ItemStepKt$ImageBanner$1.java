package com.cooldev.gba.emulator.gameboy.features.guide.widgets.steps_tab;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* loaded from: classes.dex */
public final class ItemStepKt$ImageBanner$1 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $image;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemStepKt$ImageBanner$1(int i2, int i3) {
        super(2);
        this.$image = i2;
        this.$$changed = i3;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        ItemStepKt.ImageBanner(this.$image, composer, RecomposeScopeImplKt.a(this.$$changed | 1));
    }
}
