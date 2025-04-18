package com.cooldev.gba.emulator.gameboy.features.game.widgets;

import android.content.res.Configuration;
import androidx.compose.runtime.MutableFloatState;
import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.game.logic.GameViewModel;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.game.widgets.MainGameViewKt$MainGameView$2", f = "MainGameView.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MainGameViewKt$MainGameView$2 extends i implements p {
    final /* synthetic */ GameViewModel $gameViewModel;
    final /* synthetic */ MutableFloatState $gameWeight;
    final /* synthetic */ Configuration $localConfiguration;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainGameViewKt$MainGameView$2(GameViewModel gameViewModel, Configuration configuration, MutableFloatState mutableFloatState, g gVar) {
        super(2, gVar);
        this.$gameViewModel = gameViewModel;
        this.$localConfiguration = configuration;
        this.$gameWeight = mutableFloatState;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new MainGameViewKt$MainGameView$2(this.$gameViewModel, this.$localConfiguration, this.$gameWeight, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((MainGameViewKt$MainGameView$2) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        this.$gameViewModel.updateOrientation(this.$localConfiguration.orientation == 2);
        if (this.$localConfiguration.orientation == 2) {
            this.$gameWeight.n(1.0f);
        } else {
            this.$gameWeight.n(0.65f);
        }
        return b0.f30125a;
    }
}
