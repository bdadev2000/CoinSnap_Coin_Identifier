package com.cooldev.gba.emulator.gameboy.features.game.utils;

import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.home.models.DirectoriesManager;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import java.io.File;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game.utils.SavesManager$getSaveFile$2", f = "SavesManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SavesManager$getSaveFile$2 extends i implements p {
    final /* synthetic */ String $fileName;
    int label;
    final /* synthetic */ SavesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SavesManager$getSaveFile$2(SavesManager savesManager, String str, g gVar) {
        super(2, gVar);
        this.this$0 = savesManager;
        this.$fileName = str;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new SavesManager$getSaveFile$2(this.this$0, this.$fileName, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((SavesManager$getSaveFile$2) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        DirectoriesManager directoriesManager;
        a aVar = a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        directoriesManager = this.this$0.directoriesManager;
        return new File(directoriesManager.getSavesDirectory(), this.$fileName);
    }
}
