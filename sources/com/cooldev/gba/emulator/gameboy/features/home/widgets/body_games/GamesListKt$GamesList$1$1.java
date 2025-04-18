package com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games;

import androidx.compose.foundation.lazy.LazyListState;
import b1.d0;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.home.widgets.body_games.GamesListKt$GamesList$1$1", f = "GamesList.kt", l = {46}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class GamesListKt$GamesList$1$1 extends i implements p {
    final /* synthetic */ LazyListState $listState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GamesListKt$GamesList$1$1(LazyListState lazyListState, g gVar) {
        super(2, gVar);
        this.$listState = lazyListState;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new GamesListKt$GamesList$1$1(this.$listState, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((GamesListKt$GamesList$1$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            LazyListState lazyListState = this.$listState;
            this.label = 1;
            if (LazyListState.j(lazyListState, 0, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return b0.f30125a;
    }
}
