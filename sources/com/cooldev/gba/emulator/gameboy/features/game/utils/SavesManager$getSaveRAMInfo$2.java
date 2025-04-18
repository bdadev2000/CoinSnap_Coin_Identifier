package com.cooldev.gba.emulator.gameboy.features.game.utils;

import b1.d0;
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
import org.objectweb.asm.TypeReference;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game.utils.SavesManager$getSaveRAMInfo$2", f = "SavesManager.kt", l = {TypeReference.CONSTRUCTOR_INVOCATION_TYPE_ARGUMENT}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SavesManager$getSaveRAMInfo$2 extends i implements p {
    final /* synthetic */ Game $game;
    int label;
    final /* synthetic */ SavesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavesManager$getSaveRAMInfo$2(SavesManager savesManager, Game game, g gVar) {
        super(2, gVar);
        this.this$0 = savesManager;
        this.$game = game;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new SavesManager$getSaveRAMInfo$2(this.this$0, this.$game, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((SavesManager$getSaveRAMInfo$2) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String saveRAMFileName;
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
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
        File file = (File) obj;
        return new SaveInfo(file.exists() && file.length() > 0, file.lastModified());
    }
}
