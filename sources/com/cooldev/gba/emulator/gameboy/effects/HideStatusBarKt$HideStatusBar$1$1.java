package com.cooldev.gba.emulator.gameboy.effects;

import b1.d0;
import com.google.accompanist.systemuicontroller.SystemUiController;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.effects.HideStatusBarKt$HideStatusBar$1$1", f = "HideStatusBar.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class HideStatusBarKt$HideStatusBar$1$1 extends i implements p {
    final /* synthetic */ SystemUiController $systemUiController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HideStatusBarKt$HideStatusBar$1$1(SystemUiController systemUiController, g gVar) {
        super(2, gVar);
        this.$systemUiController = systemUiController;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new HideStatusBarKt$HideStatusBar$1$1(this.$systemUiController, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((HideStatusBarKt$HideStatusBar$1$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        this.$systemUiController.setStatusBarVisible(false);
        return b0.f30125a;
    }
}
