package com.cooldev.gba.emulator.gameboy.widgets.app_bar;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.ui.Modifier;
import com.applovin.impl.adview.t;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;

/* loaded from: classes.dex */
public final class CloseIconWidgetKt {
    @ComposableTarget
    @Composable
    public static final void CloseIconWidget(@NotNull a aVar, @Nullable Composer composer, int i2) {
        int i3;
        p0.a.s(aVar, "onClick");
        ComposerImpl g2 = composer.g(1639095774);
        if ((i2 & 14) == 0) {
            i3 = (g2.w(aVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && g2.i()) {
            g2.A();
        } else {
            Object e = t.e(g2, 1598786116, 757210042);
            Object obj = Composer.Companion.f13690a;
            if (e == obj) {
                e = SnapshotLongStateKt.a(0L);
                g2.o(e);
            }
            g2.V(false);
            CloseIconWidgetKt$CloseIconWidget$$inlined$debounced$1 closeIconWidgetKt$CloseIconWidget$$inlined$debounced$1 = new CloseIconWidgetKt$CloseIconWidget$$inlined$debounced$1(2000L, (MutableLongState) e, aVar);
            g2.V(false);
            g2.J(46122833);
            boolean I = g2.I(closeIconWidgetKt$CloseIconWidget$$inlined$debounced$1);
            Object u2 = g2.u();
            if (I || u2 == obj) {
                u2 = new CloseIconWidgetKt$CloseIconWidget$1$1(closeIconWidgetKt$CloseIconWidget$$inlined$debounced$1);
                g2.o(u2);
            }
            g2.V(false);
            IconButtonKt.a((a) u2, SizeKt.n(Modifier.Companion.f14687a, 40), false, null, null, ComposableSingletons$CloseIconWidgetKt.INSTANCE.m397getLambda1$gba_v1_0_35_54__09Apr2025_1046_release(), g2, 196656, 28);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new CloseIconWidgetKt$CloseIconWidget$2(aVar, i2);
        }
    }
}
