package com.cooldev.gba.emulator.gameboy.features.loading_ads;

import androidx.compose.runtime.State;
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

@e(c = "com.cooldev.gba.emulator.gameboy.features.loading_ads.LoadingAdsPageKt$LoadingAdsPage$3$1", f = "LoadingAdsPage.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LoadingAdsPageKt$LoadingAdsPage$3$1 extends i implements p {
    final /* synthetic */ State<Boolean> $isConnected$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingAdsPageKt$LoadingAdsPage$3$1(State<Boolean> state, g gVar) {
        super(2, gVar);
        this.$isConnected$delegate = state;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new LoadingAdsPageKt$LoadingAdsPage$3$1(this.$isConnected$delegate, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((LoadingAdsPageKt$LoadingAdsPage$3$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean LoadingAdsPage$lambda$0;
        a aVar = a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        LoadingAdsPage$lambda$0 = LoadingAdsPageKt.LoadingAdsPage$lambda$0(this.$isConnected$delegate);
        if (!LoadingAdsPage$lambda$0) {
            LoadingAdsPageKt.navigateToIntroPage();
        }
        return b0.f30125a;
    }
}
