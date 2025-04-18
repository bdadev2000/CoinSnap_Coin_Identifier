package com.cooldev.gba.emulator.gameboy.features.game.utils;

import com.cooldev.gba.emulator.gameboy.features.game.models.SaveState;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.l;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game.utils.StatesManager$setSaveState$2", f = "StatesManager.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class StatesManager$setSaveState$2 extends i implements l {
    final /* synthetic */ String $coreName;
    final /* synthetic */ String $fileName;
    final /* synthetic */ SaveState $saveState;
    int label;
    final /* synthetic */ StatesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatesManager$setSaveState$2(StatesManager statesManager, String str, String str2, SaveState saveState, g gVar) {
        super(1, gVar);
        this.this$0 = statesManager;
        this.$fileName = str;
        this.$coreName = str2;
        this.$saveState = saveState;
    }

    @Override // j0.a
    @NotNull
    public final g create(@NotNull g gVar) {
        return new StatesManager$setSaveState$2(this.this$0, this.$fileName, this.$coreName, this.$saveState, gVar);
    }

    @Override // q0.l
    @Nullable
    public final Object invoke(@Nullable g gVar) {
        return ((StatesManager$setSaveState$2) create(gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        this.this$0.writeStateToDisk(this.$fileName, this.$coreName, this.$saveState.getState());
        this.this$0.writeMetadataToDisk(this.$fileName, this.$coreName, this.$saveState.getMetadata());
        return b0.f30125a;
    }
}
