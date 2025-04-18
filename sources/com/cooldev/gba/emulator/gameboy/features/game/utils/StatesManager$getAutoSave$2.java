package com.cooldev.gba.emulator.gameboy.features.game.utils;

import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.home.models.CoreID;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.TypeReference;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager$getAutoSave$2", f = "StatesManager.kt", l = {TypeReference.METHOD_REFERENCE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class StatesManager$getAutoSave$2 extends i implements p {
    final /* synthetic */ CoreID $coreID;
    final /* synthetic */ Game $game;
    int label;
    final /* synthetic */ StatesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatesManager$getAutoSave$2(StatesManager statesManager, Game game, CoreID coreID, g gVar) {
        super(2, gVar);
        this.this$0 = statesManager;
        this.$game = game;
        this.$coreID = coreID;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new StatesManager$getAutoSave$2(this.this$0, this.$game, this.$coreID, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((StatesManager$getAutoSave$2) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String autoSaveFileName;
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            StatesManager statesManager = this.this$0;
            autoSaveFileName = statesManager.getAutoSaveFileName(this.$game);
            String coreName = this.$coreID.getCoreName();
            this.label = 1;
            obj = statesManager.getSaveState(autoSaveFileName, coreName, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return obj;
    }
}
