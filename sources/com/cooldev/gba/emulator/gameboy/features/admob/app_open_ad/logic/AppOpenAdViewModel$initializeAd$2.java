package com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic;

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

@e(c = "com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic.AppOpenAdViewModel$initializeAd$2", f = "AppOpenAdViewModel.kt", l = {54, 56}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AppOpenAdViewModel$initializeAd$2 extends i implements p {
    int label;
    final /* synthetic */ AppOpenAdViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppOpenAdViewModel$initializeAd$2(AppOpenAdViewModel appOpenAdViewModel, g gVar) {
        super(2, gVar);
        this.this$0 = appOpenAdViewModel;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new AppOpenAdViewModel$initializeAd$2(this.this$0, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((AppOpenAdViewModel$initializeAd$2) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object fetchRemoteConfigData;
        boolean isAdEnabled;
        Object loadAd;
        a aVar = a.f30806a;
        int i2 = this.label;
        if (i2 == 0) {
            q.m(obj);
            AppOpenAdViewModel appOpenAdViewModel = this.this$0;
            this.label = 1;
            fetchRemoteConfigData = appOpenAdViewModel.fetchRemoteConfigData(this);
            if (fetchRemoteConfigData == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.m(obj);
                return b0.f30125a;
            }
            q.m(obj);
        }
        isAdEnabled = this.this$0.isAdEnabled();
        if (isAdEnabled) {
            AppOpenAdViewModel appOpenAdViewModel2 = this.this$0;
            this.label = 2;
            loadAd = appOpenAdViewModel2.loadAd(this);
            if (loadAd == aVar) {
                return aVar;
            }
        }
        return b0.f30125a;
    }
}
