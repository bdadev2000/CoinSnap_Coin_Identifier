package com.cooldev.gba.emulator.gameboy.features.game.utils;

import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import java.io.File;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.l;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game.utils.SavesManager$setSaveRAM$2$result$1", f = "SavesManager.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SavesManager$setSaveRAM$2$result$1 extends i implements l {
    final /* synthetic */ byte[] $data;
    final /* synthetic */ Game $game;
    int label;
    final /* synthetic */ SavesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavesManager$setSaveRAM$2$result$1(byte[] bArr, SavesManager savesManager, Game game, g gVar) {
        super(1, gVar);
        this.$data = bArr;
        this.this$0 = savesManager;
        this.$game = game;
    }

    @Override // j0.a
    @NotNull
    public final g create(@NotNull g gVar) {
        return new SavesManager$setSaveRAM$2$result$1(this.$data, this.this$0, this.$game, gVar);
    }

    @Override // q0.l
    @Nullable
    public final Object invoke(@Nullable g gVar) {
        return ((SavesManager$setSaveRAM$2$result$1) create(gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String saveRAMFileName;
        a aVar = a.f30806a;
        int i2 = this.label;
        b0 b0Var = b0.f30125a;
        if (i2 == 0) {
            q.m(obj);
            if (this.$data.length == 0) {
                return b0Var;
            }
            SavesManager savesManager = this.this$0;
            saveRAMFileName = savesManager.getSaveRAMFileName(this.$game);
            this.label = 1;
            obj = savesManager.getSaveFile(saveRAMFileName, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        q.p((File) obj, this.$data);
        return b0Var;
    }
}
