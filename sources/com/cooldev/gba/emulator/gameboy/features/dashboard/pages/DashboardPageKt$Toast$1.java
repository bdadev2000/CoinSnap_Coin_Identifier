package com.cooldev.gba.emulator.gameboy.features.dashboard.pages;

import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.home.logic.HomeViewModel;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.dashboard.pages.DashboardPageKt$Toast$1", f = "DashboardPage.kt", l = {251}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class DashboardPageKt$Toast$1 extends i implements p {
    final /* synthetic */ HomeViewModel $homeViewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardPageKt$Toast$1(HomeViewModel homeViewModel, g gVar) {
        super(2, gVar);
        this.$homeViewModel = homeViewModel;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new DashboardPageKt$Toast$1(this.$homeViewModel, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((DashboardPageKt$Toast$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            this.label = 1;
            if (p0.a.L(3000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        this.$homeViewModel.hideToast();
        return b0.f30125a;
    }
}
