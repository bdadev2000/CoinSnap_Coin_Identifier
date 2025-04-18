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
import com.applovin.impl.adview.t;
import com.cooldev.gba.emulator.gameboy.features.dashboard.logic.UserGuideViewModel;
import org.jetbrains.annotations.Nullable;
import org.koin.core.scope.Scope;

/* loaded from: classes3.dex */
public final class ManageSubIconWidgetKt {
    @ComposableTarget
    @Composable
    public static final void ManageSubIconWidget(@Nullable Composer composer, int i2) {
        ComposerImpl g2 = composer.g(16203650);
        if (i2 == 0 && g2.i()) {
            g2.A();
        } else {
            Scope q2 = t.q(g2, 414512006, g2, 0, 1274527078);
            boolean y2 = t.y(g2, false, 511388516, null) | g2.I(q2);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (y2 || u2 == composer$Companion$Empty$1) {
                u2 = t.g(UserGuideViewModel.class, q2, null, null, g2);
            }
            g2.V(false);
            g2.V(false);
            UserGuideViewModel userGuideViewModel = (UserGuideViewModel) u2;
            Object e = t.e(g2, 1598786116, 757210042);
            if (e == composer$Companion$Empty$1) {
                e = SnapshotLongStateKt.a(0L);
                g2.o(e);
            }
            g2.V(false);
            ManageSubIconWidgetKt$ManageSubIconWidget$$inlined$debounced$1 manageSubIconWidgetKt$ManageSubIconWidget$$inlined$debounced$1 = new ManageSubIconWidgetKt$ManageSubIconWidget$$inlined$debounced$1(500L, (MutableLongState) e);
            g2.V(false);
            IconButtonKt.a(new ManageSubIconWidgetKt$ManageSubIconWidget$1(userGuideViewModel, manageSubIconWidgetKt$ManageSubIconWidget$$inlined$debounced$1), SizeKt.n(Modifier.Companion.f14687a, 40), false, null, null, ComposableSingletons$ManageSubIconWidgetKt.INSTANCE.m399getLambda1$gba_v1_0_35_54__09Apr2025_1046_release(), g2, 196656, 28);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ManageSubIconWidgetKt$ManageSubIconWidget$2(i2);
        }
    }
}
