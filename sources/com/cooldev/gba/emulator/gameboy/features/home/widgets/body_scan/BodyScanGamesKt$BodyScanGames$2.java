package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_scan;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* loaded from: classes4.dex */
public final class BodyScanGamesKt$BodyScanGames$2 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Modifier $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BodyScanGamesKt$BodyScanGames$2(Modifier modifier, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$$changed = i2;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        BodyScanGamesKt.BodyScanGames(this.$modifier, composer, RecomposeScopeImplKt.a(this.$$changed | 1));
    }
}
