package com.cooldev.gba.emulator.gameboy.features.game.utils;

import com.cooldev.gba.emulator.gameboy.features.home.models.DirectoriesManager;
import com.cooldev.gba.emulator.gameboy.features.home.models.Game;
import com.cooldev.gba.emulator.gameboy.features.home.models.SystemCoreConfig;
import com.cooldev.gba.emulator.gameboy.features.home.utils.SavesMigrator;
import com.cooldev.gba.emulator.gameboy.features.home.utils.UtilsKt;
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

@e(c = "com.cooldev.gba.emulator.gameboy.features.game.utils.SavesManager$getSaveRAM$2$result$1", f = "SavesManager.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SavesManager$getSaveRAM$2$result$1 extends i implements l {
    final /* synthetic */ Game $game;
    final /* synthetic */ SystemCoreConfig $systemCoreConfig;
    int label;
    final /* synthetic */ SavesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavesManager$getSaveRAM$2$result$1(SavesManager savesManager, Game game, SystemCoreConfig systemCoreConfig, g gVar) {
        super(1, gVar);
        this.this$0 = savesManager;
        this.$game = game;
        this.$systemCoreConfig = systemCoreConfig;
    }

    @Override // j0.a
    @NotNull
    public final g create(@NotNull g gVar) {
        return new SavesManager$getSaveRAM$2$result$1(this.this$0, this.$game, this.$systemCoreConfig, gVar);
    }

    @Override // q0.l
    @Nullable
    public final Object invoke(@Nullable g gVar) {
        return ((SavesManager$getSaveRAM$2$result$1) create(gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String saveRAMFileName;
        DirectoriesManager directoriesManager;
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
        if (file.exists() && file.length() > 0) {
            return q.j(file);
        }
        SavesMigrator savesMigrator = UtilsKt.getSavesMigrator(this.$systemCoreConfig);
        if (savesMigrator == null) {
            return null;
        }
        Game game = this.$game;
        directoriesManager = this.this$0.directoriesManager;
        return savesMigrator.loadPreviousSaveForGame(game, directoriesManager);
    }
}
