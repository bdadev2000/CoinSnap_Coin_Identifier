package com.cooldev.gba.emulator.gameboy.features;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.lifecycle.LifecycleOwner;
import com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic.AppOpenAdViewModel;
import com.cooldev.gba.emulator.gameboy.features.app.AppLifecycleObserver;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class GBAEmulatorAppKt$ObserveAppLifecycleForAppOpenAd$1 extends r implements l {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ AppOpenAdViewModel $appOpenAdViewModel;
    final /* synthetic */ Context $context;
    final /* synthetic */ LifecycleOwner $lifecycleOwner;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GBAEmulatorAppKt$ObserveAppLifecycleForAppOpenAd$1(LifecycleOwner lifecycleOwner, Context context, AppOpenAdViewModel appOpenAdViewModel, Activity activity) {
        super(1);
        this.$lifecycleOwner = lifecycleOwner;
        this.$context = context;
        this.$appOpenAdViewModel = appOpenAdViewModel;
        this.$activity = activity;
    }

    @Override // q0.l
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
        a.s(disposableEffectScope, "$this$DisposableEffect");
        final AppLifecycleObserver appLifecycleObserver = new AppLifecycleObserver(new GBAEmulatorAppKt$ObserveAppLifecycleForAppOpenAd$1$observer$1(this.$context, this.$appOpenAdViewModel, this.$activity), new GBAEmulatorAppKt$ObserveAppLifecycleForAppOpenAd$1$observer$2(this.$context));
        this.$lifecycleOwner.getLifecycle().a(appLifecycleObserver);
        final LifecycleOwner lifecycleOwner = this.$lifecycleOwner;
        return new DisposableEffectResult() { // from class: com.cooldev.gba.emulator.gameboy.features.GBAEmulatorAppKt$ObserveAppLifecycleForAppOpenAd$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                LifecycleOwner.this.getLifecycle().d(appLifecycleObserver);
            }
        };
    }
}
