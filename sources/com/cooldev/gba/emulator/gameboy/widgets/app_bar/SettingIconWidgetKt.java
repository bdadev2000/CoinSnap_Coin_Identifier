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
import q0.a;

/* loaded from: classes3.dex */
public final class SettingIconWidgetKt {
    @ComposableTarget
    @Composable
    public static final void SettingIconWidget(@Nullable a aVar, @Nullable Composer composer, int i2, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(127836510);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (g2.w(aVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i4 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            if (i5 != 0) {
                aVar = SettingIconWidgetKt$SettingIconWidget$1.INSTANCE;
            }
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
            SettingIconWidgetKt$SettingIconWidget$$inlined$debounced$1 settingIconWidgetKt$SettingIconWidget$$inlined$debounced$1 = new SettingIconWidgetKt$SettingIconWidget$$inlined$debounced$1(500L, (MutableLongState) e, aVar);
            g2.V(false);
            IconButtonKt.a(new SettingIconWidgetKt$SettingIconWidget$2(userGuideViewModel, settingIconWidgetKt$SettingIconWidget$$inlined$debounced$1), SizeKt.n(Modifier.Companion.f14687a, 40), false, null, null, ComposableSingletons$SettingIconWidgetKt.INSTANCE.m400getLambda1$gba_v1_0_35_54__09Apr2025_1046_release(), g2, 196656, 28);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new SettingIconWidgetKt$SettingIconWidget$3(aVar, i2, i3);
        }
    }
}
