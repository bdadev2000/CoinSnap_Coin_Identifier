package com.cooldev.gba.emulator.gameboy.features.loading_ads;

import b1.d0;
import com.cooldev.gba.emulator.gameboy.network.services.analytic.events.ScreenEvents;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.loading_ads.LoadingAdsPageKt$LogEventScreen$1", f = "LoadingAdsPage.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LoadingAdsPageKt$LogEventScreen$1 extends i implements p {
    int label;

    public LoadingAdsPageKt$LogEventScreen$1(g gVar) {
        super(2, gVar);
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new LoadingAdsPageKt$LogEventScreen$1(gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((LoadingAdsPageKt$LogEventScreen$1) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        ScreenEvents.INSTANCE.logFirstLoadingScreen();
        return b0.f30125a;
    }
}
