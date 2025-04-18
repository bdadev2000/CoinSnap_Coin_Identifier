package com.cooldev.gba.emulator.gameboy.features.game.logic;

import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.game.models.GameData;
import com.cooldev.gba.emulator.gameboy.features.game.models.StateEntry;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import java.util.List;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.l;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$getLoadSlotsInfo$1", f = "GameViewModel.kt", l = {226, 238}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class GameViewModel$getLoadSlotsInfo$1 extends i implements p {
    final /* synthetic */ GameData $gameData;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    boolean Z$0;
    int label;
    final /* synthetic */ GameViewModel this$0;

    /* renamed from: com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$getLoadSlotsInfo$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends r implements l {
        final /* synthetic */ List<StateEntry> $entries;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<StateEntry> list) {
            super(1);
            this.$entries = list;
        }

        @Override // q0.l
        @NotNull
        public final GameState invoke(@NotNull GameState gameState) {
            GameState copy;
            a.s(gameState, "it");
            copy = gameState.copy((r22 & 1) != 0 ? gameState.game : null, (r22 & 2) != 0 ? gameState.gameData : null, (r22 & 4) != 0 ? gameState.retroView : null, (r22 & 8) != 0 ? gameState.fastForwardEnabled : false, (r22 & 16) != 0 ? gameState.autoSaveEnable : false, (r22 & 32) != 0 ? gameState.isFirstTimeInPremium : false, (r22 & 64) != 0 ? gameState.audioEnabled : false, (r22 & 128) != 0 ? gameState.saveSlot : null, (r22 & 256) != 0 ? gameState.loadSlot : this.$entries, (r22 & 512) != 0 ? gameState.thumbnail : null);
            return copy;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameViewModel$getLoadSlotsInfo$1(GameViewModel gameViewModel, GameData gameData, g gVar) {
        super(2, gVar);
        this.this$0 = gameViewModel;
        this.$gameData = gameData;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new GameViewModel$getLoadSlotsInfo$1(this.this$0, this.$gameData, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((GameViewModel$getLoadSlotsInfo$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x009e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x010c -> B:6:0x0116). Please report as a decompilation issue!!! */
    @Override // j0.a
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$getLoadSlotsInfo$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
