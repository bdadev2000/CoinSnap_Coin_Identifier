package com.cooldev.gba.emulator.gameboy.features.game.page;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* loaded from: classes3.dex */
public final class GamePageKt$GamePage$6 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ Game $game;
    final /* synthetic */ Boolean $isRestart;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamePageKt$GamePage$6(Game game, Boolean bool, int i2) {
        super(2);
        this.$game = game;
        this.$isRestart = bool;
        this.$$changed = i2;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        GamePageKt.GamePage(this.$game, this.$isRestart, composer, RecomposeScopeImplKt.a(this.$$changed | 1));
    }
}
