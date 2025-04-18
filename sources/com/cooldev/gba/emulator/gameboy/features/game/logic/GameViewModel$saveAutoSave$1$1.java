package com.cooldev.gba.emulator.gameboy.features.game.logic;

import android.content.Context;
import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.game.models.GameData;
import com.cooldev.gba.emulator.gameboy.features.game.models.SaveState;
import com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager;
import com.cooldev.gba.emulator.gameboy.features.home.models.CoreID;
import com.cooldev.gba.emulator.gameboy.features.home.models.DirectoriesManager;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import com.cooldev.gba.emulator.gameboy.router.MultiNavigationAppStateKt;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$saveAutoSave$1$1", f = "GameViewModel.kt", l = {318, 321}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class GameViewModel$saveAutoSave$1$1 extends i implements p {
    final /* synthetic */ Game $game;
    final /* synthetic */ GameData $gameData;
    int label;
    final /* synthetic */ GameViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameViewModel$saveAutoSave$1$1(GameViewModel gameViewModel, Game game, GameData gameData, g gVar) {
        super(2, gVar);
        this.this$0 = gameViewModel;
        this.$game = game;
        this.$gameData = gameData;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new GameViewModel$saveAutoSave$1$1(this.this$0, this.$game, this.$gameData, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((GameViewModel$saveAutoSave$1$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object saveRAM;
        SaveState currentSaveState;
        Context context;
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            GameViewModel gameViewModel = this.this$0;
            this.label = 1;
            saveRAM = gameViewModel.saveRAM(this);
            if (saveRAM == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
                this.this$0.clearRetroView();
                MultiNavigationAppStateKt.getLocalNavigationState().getRootNavigation().pop();
                return b0.f30125a;
            }
            q.m(obj);
        }
        currentSaveState = this.this$0.getCurrentSaveState();
        if (currentSaveState != null) {
            context = this.this$0.context;
            p0.a.r(context, "access$getContext$p(...)");
            StatesManager statesManager = new StatesManager(new DirectoriesManager(context));
            Game game = this.$game;
            CoreID coreID = this.$gameData.getSystemCoreConfig().getCoreID();
            this.label = 2;
            if (statesManager.setAutoSave(game, coreID, currentSaveState, this) == aVar) {
                return aVar;
            }
        }
        this.this$0.clearRetroView();
        MultiNavigationAppStateKt.getLocalNavigationState().getRootNavigation().pop();
        return b0.f30125a;
    }
}
