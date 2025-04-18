package com.cooldev.gba.emulator.gameboy.features.theme.page;

import androidx.compose.runtime.MutableState;
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

@e(c = "com.cooldev.gba.emulator.gameboy.features.theme.page.ThemePageKt$ThemePage$3$1", f = "ThemePage.kt", l = {100}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ThemePageKt$ThemePage$3$1 extends i implements p {
    final /* synthetic */ MutableState<Boolean> $showingDialogGoodLuck$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemePageKt$ThemePage$3$1(MutableState<Boolean> mutableState, g gVar) {
        super(2, gVar);
        this.$showingDialogGoodLuck$delegate = mutableState;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new ThemePageKt$ThemePage$3$1(this.$showingDialogGoodLuck$delegate, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((ThemePageKt$ThemePage$3$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean ThemePage$lambda$4;
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            ThemePage$lambda$4 = ThemePageKt.ThemePage$lambda$4(this.$showingDialogGoodLuck$delegate);
            if (ThemePage$lambda$4) {
                this.label = 1;
                if (p0.a.L(3000L, this) == aVar) {
                    return aVar;
                }
            }
            return b0.f30125a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        ThemePageKt.ThemePage$lambda$5(this.$showingDialogGoodLuck$delegate, false);
        return b0.f30125a;
    }
}
