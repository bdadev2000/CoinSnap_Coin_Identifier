package com.cooldev.gba.emulator.gameboy.features;

import android.content.Context;
import com.cooldev.gba.emulator.gameboy.local.storage.AppOpenAdPrefUtils;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes.dex */
public final class GBAEmulatorAppKt$ObserveAppLifecycleForAppOpenAd$1$observer$2 extends r implements a {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GBAEmulatorAppKt$ObserveAppLifecycleForAppOpenAd$1$observer$2(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // q0.a
    public /* bridge */ /* synthetic */ Object invoke() {
        m56invoke();
        return b0.f30125a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m56invoke() {
        AppOpenAdPrefUtils.INSTANCE.setShowAppOpenAdOnResume(this.$context, true);
    }
}
