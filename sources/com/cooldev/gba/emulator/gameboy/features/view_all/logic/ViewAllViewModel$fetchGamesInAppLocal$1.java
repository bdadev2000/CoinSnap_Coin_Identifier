package com.cooldev.gba.emulator.gameboy.features.view_all.logic;

import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import java.util.List;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class ViewAllViewModel$fetchGamesInAppLocal$1 extends r implements l {
    final /* synthetic */ List<Game> $filteredGames;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewAllViewModel$fetchGamesInAppLocal$1(List<Game> list) {
        super(1);
        this.$filteredGames = list;
    }

    @Override // q0.l
    @NotNull
    public final ViewAllState invoke(@NotNull ViewAllState viewAllState) {
        a.s(viewAllState, "it");
        return ViewAllState.m365copy1hIXUjU$default(viewAllState, this.$filteredGames, null, 0L, false, 0, false, 62, null);
    }
}
