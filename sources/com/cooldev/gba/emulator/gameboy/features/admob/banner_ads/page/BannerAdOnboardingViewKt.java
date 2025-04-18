package com.cooldev.gba.emulator.gameboy.features.admob.banner_ads.page;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import com.google.android.gms.ads.AdView;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes.dex */
public final class BannerAdOnboardingViewKt {
    @ComposableTarget
    @Composable
    public static final void BannerAdOnboardingView(@Nullable AdView adView, @Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-1102207320);
        g2.J(-1180477885);
        Modifier.Companion companion = Modifier.Companion.f14687a;
        if (adView == null) {
            BoxKt.a(SizeKt.d(companion, 1.0f), g2, 6);
            g2.V(false);
            RecomposeScopeImpl Z = g2.Z();
            if (Z != null) {
                Z.d = new BannerAdOnboardingViewKt$BannerAdOnboardingView$1(adView, i2);
                return;
            }
            return;
        }
        g2.V(false);
        AndroidView_androidKt.a(new BannerAdOnboardingViewKt$BannerAdOnboardingView$2(adView), SizeKt.d(companion, 1.0f), null, g2, 48, 4);
        RecomposeScopeImpl Z2 = g2.Z();
        if (Z2 != null) {
            Z2.d = new BannerAdOnboardingViewKt$BannerAdOnboardingView$3(adView, i2);
        }
    }
}
