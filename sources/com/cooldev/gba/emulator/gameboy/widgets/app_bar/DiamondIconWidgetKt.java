package com.cooldev.gba.emulator.gameboy.widgets.app_bar;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.features.app.logic.PaywallNavigationViewModel;
import com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPState;
import com.cooldev.gba.emulator.gameboy.features.paywalls.logic.IAPViewModel;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;

/* loaded from: classes2.dex */
public final class DiamondIconWidgetKt {
    @ComposableTarget
    @Composable
    public static final void DiamondIconWidget(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(-1836982320);
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
            IAPViewModel iAPViewModel = (IAPViewModel) u2;
            Scope q3 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y3 = t.y(g2, false, 511388516, null) | g2.I(q3);
            Object u3 = g2.u();
            if (y3 || u3 == composer$Companion$Empty$1) {
                u3 = t.g(UserGuideViewModel.class, q3, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            UserGuideViewModel userGuideViewModel = (UserGuideViewModel) u3;
            boolean isPremium = ((IAPState) t.f(iAPViewModel, g2, 8)).isPremium();
            Scope q4 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y4 = t.y(g2, false, 511388516, null) | g2.I(q4);
            Object u4 = g2.u();
            if (y4 || u4 == composer$Companion$Empty$1) {
                u4 = t.g(PaywallNavigationViewModel.class, q4, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            PaywallNavigationViewModel paywallNavigationViewModel = (PaywallNavigationViewModel) u4;
            Object e = t.e(g2, 1598786116, 757210042);
            if (e == composer$Companion$Empty$1) {
                e = SnapshotLongStateKt.a(0L);
                g2.o(e);
            }
            g2.V(false);
            DiamondIconWidgetKt$DiamondIconWidget$$inlined$debounced$1 diamondIconWidgetKt$DiamondIconWidget$$inlined$debounced$1 = new DiamondIconWidgetKt$DiamondIconWidget$$inlined$debounced$1(500L, (MutableLongState) e, paywallNavigationViewModel);
            g2.V(false);
            IconButtonKt.a(new DiamondIconWidgetKt$DiamondIconWidget$1(userGuideViewModel, diamondIconWidgetKt$DiamondIconWidget$$inlined$debounced$1), AlphaKt.a(SizeKt.n(Modifier.Companion.f14687a, 40), isPremium ? 0.0f : 1.0f), false, null, null, ComposableSingletons$DiamondIconWidgetKt.INSTANCE.m398getLambda1$gba_v1_0_35_54__09Apr2025_1046_release(), g2, 196608, 28);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new DiamondIconWidgetKt$DiamondIconWidget$2(i2);
        }
    }
}
