package com.cooldev.gba.emulator.gameboy.features;

import android.app.Activity;
import android.content.Context;
import com.cooldev.gba.emulator.gameboy.features.admob.app_open_ad.logic.AppOpenAdViewModel;
import com.cooldev.gba.emulator.gameboy.local.storage.AppOpenAdPrefUtils;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class GBAEmulatorAppKt$ObserveAppLifecycleForAppOpenAd$1$observer$1 extends r implements a {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ AppOpenAdViewModel $appOpenAdViewModel;
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GBAEmulatorAppKt$ObserveAppLifecycleForAppOpenAd$1$observer$1(Context context, AppOpenAdViewModel appOpenAdViewModel, Activity activity) {
        super(0);
        this.$context = context;
        this.$appOpenAdViewModel = appOpenAdViewModel;
        this.$activity = activity;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m55invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m55invoke() {
        if (AppOpenAdPrefUtils.INSTANCE.getShowAppOpenAdOnResume(this.$context)) {
            AppOpenAdViewModel.showAd$default(this.$appOpenAdViewModel, this.$activity, null, 2, null);
        }
    }
}
