package com.cooldev.gba.emulator.gameboy.features.setting.widgets;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$FillWidth$1;
import androidx.compose.ui.res.PainterResources_androidKt;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.constants.MyImages;
import com.cooldev.gba.emulator.gameboy.extensions.DebounceExtensionsKt;
import com.cooldev.gba.emulator.gameboy.features.app.logic.PaywallNavigationViewModel;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import org.jetbrains.annotations.Nullable;
import org.koin.compose.KoinApplicationKt;
import org.koin.core.scope.Scope;

/* loaded from: classes.dex */
public final class BannerSettingKt {
    @ComposableTarget
    @Composable
    public static final void BannerSetting(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(610977334);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (y2 || u2 == composer$Companion$Empty$1) {
                u2 = t.g(IAPViewModel.class, q2, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            boolean isPremium = ((IAPState) t.f((IAPViewModel) u2, g2, 8)).isPremium();
            g2.J(1682610755);
            ContentScale$Companion$FillWidth$1 contentScale$Companion$FillWidth$1 = ContentScale.Companion.d;
            Modifier.Companion companion = Modifier.Companion.f14687a;
            if (isPremium) {
                ImageKt.a(PainterResources_androidKt.a(MyImages.INSTANCE.getPremium2(), g2, 6), null, SizeKt.d(companion, 1.0f), null, contentScale$Companion$FillWidth$1, 0.0f, null, g2, 25016, 104);
                g2.V(false);
                RecomposeScopeImpl Z = g2.Z();
                if (Z != null) {
                    Z.d = new BannerSettingKt$BannerSetting$1(i2);
                    return;
                }
                return;
            }
            g2.V(false);
            g2.t(414512006);
            Scope currentKoinScope = KoinApplicationKt.currentKoinScope(g2, 0);
            g2.t(1274527078);
            g2.V(false);
            g2.t(511388516);
            boolean I = g2.I(null) | g2.I(currentKoinScope);
            Object u3 = g2.u();
            if (I || u3 == composer$Companion$Empty$1) {
                u3 = t.g(PaywallNavigationViewModel.class, currentKoinScope, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            ImageKt.a(PainterResources_androidKt.a(MyImages.INSTANCE.getBannerSetting(), g2, 6), null, DebounceExtensionsKt.debouncedClickable$default(SizeKt.d(companion, 1.0f), false, 0L, new BannerSettingKt$BannerSetting$2((PaywallNavigationViewModel) u3), 3, null), null, contentScale$Companion$FillWidth$1, 0.0f, null, g2, 24632, 104);
        }
        RecomposeScopeImpl Z2 = g2.Z();
        if (Z2 != null) {
            Z2.d = new BannerSettingKt$BannerSetting$3(i2);
        }
    }
}
