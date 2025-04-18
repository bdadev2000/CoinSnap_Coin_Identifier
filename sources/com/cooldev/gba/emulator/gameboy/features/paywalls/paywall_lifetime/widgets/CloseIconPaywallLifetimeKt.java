package com.cooldev.gba.emulator.gameboy.features.paywalls.paywall_lifetime.widgets;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableLongState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotLongStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.Modifier;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.a;
import q0.p;

/* loaded from: classes2.dex */
public final class CloseIconPaywallLifetimeKt {
    @ComposableTarget
    @Composable
    public static final void CloseIconPaywallLifetime(@NotNull Modifier modifier, @NotNull a aVar, @Nullable Composer composer, int i2) {
        int i3;
        p0.a.s(modifier, "modifier");
        p0.a.s(aVar, "block");
        ComposerImpl g2 = composer.g(-700880232);
        if ((i2 & 14) == 0) {
            i3 = (g2.I(modifier) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= g2.w(aVar) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && g2.i()) {
            g2.A();
        } else {
            g2.J(1974537713);
            Object u2 = g2.u();
            Object obj = Composer.Companion.f13690a;
            if (u2 == obj) {
                u2 = SnapshotStateKt.f(Boolean.FALSE, StructuralEqualityPolicy.f14078a);
                g2.o(u2);
            }
            MutableState mutableState = (MutableState) u2;
            g2.V(false);
            g2.J(1598786116);
            g2.J(757210042);
            Object u3 = g2.u();
            if (u3 == obj) {
                u3 = SnapshotLongStateKt.a(0L);
                g2.o(u3);
            }
            g2.V(false);
            CloseIconPaywallLifetimeKt$CloseIconPaywallLifetime$$inlined$debounced$1 closeIconPaywallLifetimeKt$CloseIconPaywallLifetime$$inlined$debounced$1 = new CloseIconPaywallLifetimeKt$CloseIconPaywallLifetime$$inlined$debounced$1(2000L, (MutableLongState) u3, aVar);
            g2.V(false);
            Boolean bool = Boolean.TRUE;
            g2.J(1974542857);
            Object u4 = g2.u();
            if (u4 == obj) {
                u4 = new CloseIconPaywallLifetimeKt$CloseIconPaywallLifetime$1$1(mutableState, null);
                g2.o(u4);
            }
            g2.V(false);
            EffectsKt.f(bool, (p) u4, g2);
            g2.J(1974544939);
            if (!CloseIconPaywallLifetime$lambda$1(mutableState)) {
                BoxKt.a(SizeKt.n(Modifier.Companion.f14687a, 40), g2, 6);
                g2.V(false);
                RecomposeScopeImpl Z = g2.Z();
                if (Z != null) {
                    Z.d = new CloseIconPaywallLifetimeKt$CloseIconPaywallLifetime$2(modifier, aVar, i2);
                    return;
                }
                return;
            }
            g2.V(false);
            g2.J(1974548985);
            boolean I = g2.I(closeIconPaywallLifetimeKt$CloseIconPaywallLifetime$$inlined$debounced$1);
            Object u5 = g2.u();
            if (I || u5 == obj) {
                u5 = new CloseIconPaywallLifetimeKt$CloseIconPaywallLifetime$3$1(closeIconPaywallLifetimeKt$CloseIconPaywallLifetime$$inlined$debounced$1);
                g2.o(u5);
            }
            g2.V(false);
            IconButtonKt.a((a) u5, PaddingKt.j(SizeKt.n(modifier, 40), 16, 12, 0.0f, 0.0f, 12), false, null, null, ComposableSingletons$CloseIconPaywallLifetimeKt.INSTANCE.m314getLambda1$gba_v1_0_35_54__09Apr2025_1046_release(), g2, 196608, 28);
        }
        RecomposeScopeImpl Z2 = g2.Z();
        if (Z2 != null) {
            Z2.d = new CloseIconPaywallLifetimeKt$CloseIconPaywallLifetime$4(modifier, aVar, i2);
        }
    }

    private static final boolean CloseIconPaywallLifetime$lambda$1(MutableState<Boolean> mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CloseIconPaywallLifetime$lambda$2(MutableState<Boolean> mutableState, boolean z2) {
        mutableState.setValue(Boolean.valueOf(z2));
    }
}
