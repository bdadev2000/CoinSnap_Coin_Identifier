package com.cooldev.gba.emulator.gameboy.features.game.logic;

import android.content.Context;
import b1.d0;
import d0.b0;
import h0.g;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel$onLoadGame$1$1$1$1$1", f = "GameViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class GameViewModel$onLoadGame$1$1$1$1$1 extends i implements p {
    final /* synthetic */ a $block;
    final /* synthetic */ int $index;
    final /* synthetic */ boolean $loaded;
    int label;
    final /* synthetic */ GameViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameViewModel$onLoadGame$1$1$1$1$1(a aVar, boolean z2, GameViewModel gameViewModel, int i2, g gVar) {
        super(2, gVar);
        this.$block = aVar;
        this.$loaded = z2;
        this.this$0 = gameViewModel;
        this.$index = i2;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new GameViewModel$onLoadGame$1$1$1$1$1(this.$block, this.$loaded, this.this$0, this.$index, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((GameViewModel$onLoadGame$1$1$1$1$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Context context;
        i0.a aVar = i0.a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        this.$block.invoke();
        if (!this.$loaded) {
            context = this.this$0.context;
            b0.a.b(context, "Failed to load game state from slot " + this.$index + ". Please try again.").show();
        }
        return b0.f30125a;
    }
}
