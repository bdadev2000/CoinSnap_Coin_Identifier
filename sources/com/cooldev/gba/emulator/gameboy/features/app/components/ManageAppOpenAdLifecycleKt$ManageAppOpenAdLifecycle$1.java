package com.cooldev.gba.emulator.gameboy.features.app.components;

import android.content.Context;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import com.cooldev.gba.emulator.gameboy.local.storage.AppOpenAdPrefUtils;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.l;

/* loaded from: classes.dex */
public final class ManageAppOpenAdLifecycleKt$ManageAppOpenAdLifecycle$1 extends r implements l {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManageAppOpenAdLifecycleKt$ManageAppOpenAdLifecycle$1(Context context) {
        super(1);
        this.$context = context;
    }

    @Override // q0.l
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
        p0.a.s(disposableEffectScope, "$this$DisposableEffect");
        AppOpenAdPrefUtils.INSTANCE.setShowAppOpenAdOnResume(this.$context, false);
        final Context context = this.$context;
        return new DisposableEffectResult() { // from class: com.cooldev.gba.emulator.gameboy.features.app.components.ManageAppOpenAdLifecycleKt$ManageAppOpenAdLifecycle$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                AppOpenAdPrefUtils.INSTANCE.setShowAppOpenAdOnResume(context, true);
            }
        };
    }
}
