package com.cooldev.gba.emulator.gameboy.features.loading_ads;

import android.app.Activity;
import androidx.compose.runtime.State;
import b1.d0;
import com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic.AppOpenAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import com.cooldev.gba.emulator.gameboy.network.services.remote_config.RemoteConfigService;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;
import q0.p;

@e(c = "com.cooldev.gba.emulator.gameboy.features.loading_ads.LoadingAdsPageKt$LoadingAdsPage$2", f = "LoadingAdsPage.kt", l = {Opcodes.CASTORE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class LoadingAdsPageKt$LoadingAdsPage$2 extends i implements p {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ AppOpenAdViewModel $appOpenAdViewModel;
    final /* synthetic */ IAPViewModel $iapViewModel;
    final /* synthetic */ State<Boolean> $isConnected$delegate;
    final /* synthetic */ RemoteConfigService $remoteConfigService;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadingAdsPageKt$LoadingAdsPage$2(State<Boolean> state, RemoteConfigService remoteConfigService, IAPViewModel iAPViewModel, AppOpenAdViewModel appOpenAdViewModel, Activity activity, g gVar) {
        super(2, gVar);
        this.$isConnected$delegate = state;
        this.$remoteConfigService = remoteConfigService;
        this.$iapViewModel = iAPViewModel;
        this.$appOpenAdViewModel = appOpenAdViewModel;
        this.$activity = activity;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        return new LoadingAdsPageKt$LoadingAdsPage$2(this.$isConnected$delegate, this.$remoteConfigService, this.$iapViewModel, this.$appOpenAdViewModel, this.$activity, gVar);
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull d0 d0Var, @Nullable g gVar) {
        return ((LoadingAdsPageKt$LoadingAdsPage$2) create(d0Var, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean LoadingAdsPage$lambda$0;
        a aVar = a.f30806a;
        int i2 = this.label;
        b0 b0Var = b0.f30125a;
        if (i2 == 0) {
            q.m(obj);
            LoadingAdsPage$lambda$0 = LoadingAdsPageKt.LoadingAdsPage$lambda$0(this.$isConnected$delegate);
            if (!LoadingAdsPage$lambda$0) {
                return b0Var;
            }
            LoadingAdsPageKt$LoadingAdsPage$2$result$1 loadingAdsPageKt$LoadingAdsPage$2$result$1 = new LoadingAdsPageKt$LoadingAdsPage$2$result$1(this.$remoteConfigService, this.$iapViewModel, this.$appOpenAdViewModel, this.$activity, null);
            this.label = 1;
            obj = p0.a.I0(15000L, loadingAdsPageKt$LoadingAdsPage$2$result$1, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        if (((b0) obj) == null) {
            LoadingAdsPageKt.navigateToIntroPage();
        }
        return b0Var;
    }
}
