package com.cooldev.gba.emulator.gameboy.features.app.theme;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* loaded from: classes3.dex */
public final class ThemeKt$GBAEmulatorTheme$1 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ p $content;
    final /* synthetic */ boolean $darkTheme;
    final /* synthetic */ boolean $dynamicColor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeKt$GBAEmulatorTheme$1(boolean z2, boolean z3, p pVar, int i2, int i3) {
        super(2);
        this.$darkTheme = z2;
        this.$dynamicColor = z3;
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
        ThemeKt.GBAEmulatorTheme(this.$darkTheme, this.$dynamicColor, this.$content, composer, RecomposeScopeImplKt.a(this.$$changed | 1), this.$$default);
    }
}
