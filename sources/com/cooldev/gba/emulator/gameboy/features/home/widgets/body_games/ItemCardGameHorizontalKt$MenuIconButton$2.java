package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* loaded from: classes2.dex */
public final class ItemCardGameHorizontalKt$MenuIconButton$2 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Game $data;
    final /* synthetic */ Modifier $modifier;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemCardGameHorizontalKt$MenuIconButton$2(Modifier modifier, Game game, int i2) {
        super(2);
        this.$modifier = modifier;
        this.$data = game;
        this.$$changed = i2;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        ItemCardGameHorizontalKt.MenuIconButton(this.$modifier, this.$data, composer, RecomposeScopeImplKt.a(this.$$changed | 1));
    }
}
