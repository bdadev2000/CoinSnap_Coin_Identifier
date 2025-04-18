package com.cooldev.gba.emulator.gameboy.features.themenew.widgets;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* loaded from: classes2.dex */
public final class ItemThemeKt$LegacyBlurImage$2 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ float $blurRadio;
    final /* synthetic */ int $image;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemThemeKt$LegacyBlurImage$2(int i2, float f2, int i3) {
        super(2);
        this.$image = i2;
        this.$blurRadio = f2;
        this.$$changed = i3;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        ItemThemeKt.LegacyBlurImage(this.$image, this.$blurRadio, composer, RecomposeScopeImplKt.a(this.$$changed | 1));
    }
}
