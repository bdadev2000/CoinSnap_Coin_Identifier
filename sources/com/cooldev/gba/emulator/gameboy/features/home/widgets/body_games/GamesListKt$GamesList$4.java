package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import d0.b0;
import java.util.List;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* loaded from: classes.dex */
public final class GamesListKt$GamesList$4 extends r implements p {
    final /* synthetic */ int $$changed;
    final /* synthetic */ List<Game> $games;
    final /* synthetic */ boolean $isHorizontal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamesListKt$GamesList$4(List<Game> list, boolean z2, int i2) {
        super(2);
        this.$games = list;
        this.$isHorizontal = z2;
        this.$$changed = i2;
    }

    @Override // q0.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return b0.f30125a;
    }

    public final void invoke(@Nullable Composer composer, int i2) {
        GamesListKt.GamesList(this.$games, this.$isHorizontal, composer, RecomposeScopeImplKt.a(this.$$changed | 1));
    }
}
