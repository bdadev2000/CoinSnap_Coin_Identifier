package com.cooldev.gba.emulator.gameboy.router;

import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.navigation.NavBackStackEntry;
import com.cooldev.gba.emulator.gameboy.features.loading_ads.LoadingAdsPageKt;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

/* renamed from: com.cooldev.gba.emulator.gameboy.router.ComposableSingletons$RouterDelegateKt$lambda-1$1, reason: invalid class name */
/* loaded from: classes.dex */
public final class ComposableSingletons$RouterDelegateKt$lambda1$1 extends r implements q0.r {
    public static final ComposableSingletons$RouterDelegateKt$lambda1$1 INSTANCE = new ComposableSingletons$RouterDelegateKt$lambda1$1();

    public ComposableSingletons$RouterDelegateKt$lambda1$1() {
        super(4);
    }

    @Override // q0.r
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        invoke((AnimatedContentScope) obj, (NavBackStackEntry) obj2, (Composer) obj3, ((Number) obj4).intValue());
        return b0.f30125a;
    }

    @ComposableTarget
    @Composable
    public final void invoke(@NotNull AnimatedContentScope animatedContentScope, @NotNull NavBackStackEntry navBackStackEntry, @Nullable Composer composer, int i2) {
        a.s(animatedContentScope, "$this$composable");
        a.s(navBackStackEntry, "it");
        LoadingAdsPageKt.LoadingAdsPage(composer, 0);
    }
}
