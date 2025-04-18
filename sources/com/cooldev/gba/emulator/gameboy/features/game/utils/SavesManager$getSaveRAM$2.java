package com.cooldev.gba.emulator.gameboy.features.game.utils;

import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import com.cooldev.gba.emulator.gameboy.features.home.models.SystemCoreConfig;
import com.cooldev.gba.emulator.gameboy.features.home.utils.UtilsKt;
import d0.b0;
import d0.m;
import d0.n;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game.utils.SavesManager$getSaveRAM$2", f = "SavesManager.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SavesManager$getSaveRAM$2 extends i implements p {
    final /* synthetic */ Game $game;
    final /* synthetic */ SystemCoreConfig $systemCoreConfig;
    int label;
    final /* synthetic */ SavesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavesManager$getSaveRAM$2(SavesManager savesManager, Game game, SystemCoreConfig systemCoreConfig, g gVar) {
        super(2, gVar);
        this.this$0 = savesManager;
        this.$game = game;
        this.$systemCoreConfig = systemCoreConfig;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new SavesManager$getSaveRAM$2(this.this$0, this.$game, this.$systemCoreConfig, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((SavesManager$getSaveRAM$2) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object runCatchingWithRetry;
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            SavesManager$getSaveRAM$2$result$1 savesManager$getSaveRAM$2$result$1 = new SavesManager$getSaveRAM$2$result$1(this.this$0, this.$game, this.$systemCoreConfig, null);
            this.label = 1;
            runCatchingWithRetry = UtilsKt.runCatchingWithRetry(3, savesManager$getSaveRAM$2$result$1, this);
            if (runCatchingWithRetry == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
            runCatchingWithRetry = ((n) obj).f30137a;
        }
        if (runCatchingWithRetry instanceof m) {
            return null;
        }
        return runCatchingWithRetry;
    }
}
