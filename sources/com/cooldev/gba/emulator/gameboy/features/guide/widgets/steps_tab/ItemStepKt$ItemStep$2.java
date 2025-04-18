package com.cooldev.gba.emulator.gameboy.features.guide.widgets.steps_tab;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.cooldev.gba.emulator.gameboy.features.guide.enums.GameDownloadStep;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* loaded from: classes.dex */
public final class ItemStepKt$ItemStep$2 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ GameDownloadStep $data;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemStepKt$ItemStep$2(GameDownloadStep gameDownloadStep, int i2) {
        super(2);
        this.$data = gameDownloadStep;
        this.$$changed = i2;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        ItemStepKt.ItemStep(this.$data, composer, RecomposeScopeImplKt.a(this.$$changed | 1));
    }
}
