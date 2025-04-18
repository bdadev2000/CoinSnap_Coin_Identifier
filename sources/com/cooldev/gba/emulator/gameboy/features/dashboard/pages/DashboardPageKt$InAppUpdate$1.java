package com.cooldev.gba.emulator.gameboy.features.dashboard.pages;

import android.content.Context;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import com.cooldev.gba.emulator.gameboy.features.in_app_update.InAppUpdateManager;
import com.cooldev.gba.emulator.gameboy.local.storage.AppPrefUtils;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import p0.a;
import q0.l;

/* loaded from: classes.dex */
public final class DashboardPageKt$InAppUpdate$1 extends r implements l {
    final /* synthetic */ Context $context;
    final /* synthetic */ InAppUpdateManager $inAppUpdateManager;
    final /* synthetic */ ManagedActivityResultLauncher<IntentSenderRequest, ActivityResult> $updateLauncher;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DashboardPageKt$InAppUpdate$1(Context context, InAppUpdateManager inAppUpdateManager, ManagedActivityResultLauncher<IntentSenderRequest, ActivityResult> managedActivityResultLauncher) {
        super(1);
        this.$context = context;
        this.$inAppUpdateManager = inAppUpdateManager;
        this.$updateLauncher = managedActivityResultLauncher;
    }

    @Override // q0.l
    @NotNull
    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
        a.s(disposableEffectScope, "$this$DisposableEffect");
        AppPrefUtils appPrefUtils = AppPrefUtils.INSTANCE;
        if (!appPrefUtils.hasCheckedForUpdate(this.$context)) {
            this.$inAppUpdateManager.checkForUpdate(this.$updateLauncher);
            appPrefUtils.setHasCheckedForUpdate(this.$context, true);
        }
        final InAppUpdateManager inAppUpdateManager = this.$inAppUpdateManager;
        return new DisposableEffectResult() { // from class: com.cooldev.gba.emulator.gameboy.features.dashboard.pages.DashboardPageKt$InAppUpdate$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                InAppUpdateManager.this.unregisterListener();
            }
        };
    }
}
