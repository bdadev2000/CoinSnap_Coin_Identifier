package com.cooldev.gba.emulator.gameboy.features.game.logic;

import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.game.models.SaveState;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$onLoadGame$1$1$1$1$loaded$1", f = "GameViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class GameViewModel$onLoadGame$1$1$1$1$loaded$1 extends i implements p {
    final /* synthetic */ SaveState $it;
    int label;
    final /* synthetic */ GameViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameViewModel$onLoadGame$1$1$1$1$loaded$1(GameViewModel gameViewModel, SaveState saveState, g gVar) {
        super(2, gVar);
        this.this$0 = gameViewModel;
        this.$it = saveState;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new GameViewModel$onLoadGame$1$1$1$1$loaded$1(this.this$0, this.$it, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((GameViewModel$onLoadGame$1$1$1$1$loaded$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean loadSaveState;
        a aVar = a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        loadSaveState = this.this$0.loadSaveState(this.$it);
        return Boolean.valueOf(loadSaveState);
    }
}
