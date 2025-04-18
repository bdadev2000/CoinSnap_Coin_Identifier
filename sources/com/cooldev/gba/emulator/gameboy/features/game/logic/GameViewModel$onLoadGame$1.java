package com.cooldev.gba.emulator.gameboy.features.game.logic;

import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.game.models.GameData;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import okhttp3.internal.http.StatusLine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$onLoadGame$1", f = "GameViewModel.kt", l = {StatusLine.HTTP_MISDIRECTED_REQUEST, 427, 430}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class GameViewModel$onLoadGame$1 extends i implements p {
    final /* synthetic */ a $block;
    final /* synthetic */ Game $game;
    final /* synthetic */ GameData $gameData;
    final /* synthetic */ int $index;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ GameViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameViewModel$onLoadGame$1(GameViewModel gameViewModel, Game game, GameData gameData, int i2, a aVar, g gVar) {
        super(2, gVar);
        this.this$0 = gameViewModel;
        this.$game = game;
        this.$gameData = gameData;
        this.$index = i2;
        this.$block = aVar;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new GameViewModel$onLoadGame$1(this.this$0, this.$game, this.$gameData, this.$index, this.$block, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((GameViewModel$onLoadGame$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00e6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e7  */
    @Override // j0.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$onLoadGame$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
