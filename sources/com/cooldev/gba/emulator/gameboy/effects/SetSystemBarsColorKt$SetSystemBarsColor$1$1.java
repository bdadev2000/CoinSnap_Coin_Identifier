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

@e(c = "com.cooldev.gba.emulator.gameboy.effects.SetSystemBarsColorKt$SetSystemBarsColor$1$1", f = "SetSystemBarsColor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SetSystemBarsColorKt$SetSystemBarsColor$1$1 extends i implements p {
    final /* synthetic */ long $color;
    final /* synthetic */ SystemUiController $systemUiController;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetSystemBarsColorKt$SetSystemBarsColor$1$1(SystemUiController systemUiController, long j2, g gVar) {
        super(2, gVar);
        this.$systemUiController = systemUiController;
        this.$color = j2;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new SetSystemBarsColorKt$SetSystemBarsColor$1$1(this.$systemUiController, this.$color, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((SetSystemBarsColorKt$SetSystemBarsColor$1$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        SystemUiController.m596setSystemBarsColorIv8Zu3U$default(this.$systemUiController, this.$color, false, false, null, 14, null);
        return b0.f30125a;
    }
}
