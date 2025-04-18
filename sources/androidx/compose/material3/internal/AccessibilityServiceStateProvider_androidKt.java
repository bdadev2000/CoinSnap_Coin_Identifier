package androidx.compose.material3.internal;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import org.objectweb.asm.Opcodes;
import q0.l;

/* loaded from: classes3.dex */
public final class AccessibilityServiceStateProvider_androidKt {
    public static final void a(LifecycleOwner lifecycleOwner, l lVar, q0.a aVar, Composer composer, int i2, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(-1868327245);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (g2.w(lifecycleOwner) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= g2.w(lVar) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= g2.w(aVar) ? 256 : 128;
        }
        if ((i4 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            if (i5 != 0) {
                lVar = AccessibilityServiceStateProvider_androidKt$ObserveState$1.f12763a;
            }
            if (i6 != 0) {
                aVar = AccessibilityServiceStateProvider_androidKt$ObserveState$2.f12764a;
            }
            boolean w = ((i4 & 112) == 32) | g2.w(lifecycleOwner) | ((i4 & 896) == 256);
            Object u2 = g2.u();
            if (w || u2 == Composer.Companion.f13690a) {
                u2 = new AccessibilityServiceStateProvider_androidKt$ObserveState$3$1(lifecycleOwner, lVar, aVar);
                g2.o(u2);
            }
            EffectsKt.c(lifecycleOwner, (l) u2, g2);
        }
        l lVar2 = lVar;
        q0.a aVar2 = aVar;
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new AccessibilityServiceStateProvider_androidKt$ObserveState$4(lifecycleOwner, lVar2, aVar2, i2, i3);
        }
    }

    public static final State b(Composer composer) {
        Object systemService = ((Context) composer.K(AndroidCompositionLocals_androidKt.f16325b)).getSystemService("accessibility");
        p0.a.q(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
        boolean a2 = composer.a(true) | composer.a(true);
        Object u2 = composer.u();
        Object obj = Composer.Companion.f13690a;
        if (a2 || u2 == obj) {
            u2 = new Listener(true, true);
            composer.o(u2);
        }
        Listener listener = (Listener) u2;
        LifecycleOwner lifecycleOwner = (LifecycleOwner) composer.K(LocalLifecycleOwnerKt.f20226a);
        boolean I = composer.I(listener) | composer.w(accessibilityManager);
        Object u3 = composer.u();
        if (I || u3 == obj) {
            u3 = new AccessibilityServiceStateProvider_androidKt$rememberAccessibilityServiceState$1$1(listener, accessibilityManager);
            composer.o(u3);
        }
        l lVar = (l) u3;
        boolean I2 = composer.I(listener) | composer.w(accessibilityManager);
        Object u4 = composer.u();
        if (I2 || u4 == obj) {
            u4 = new AccessibilityServiceStateProvider_androidKt$rememberAccessibilityServiceState$2$1(listener, accessibilityManager);
            composer.o(u4);
        }
        a(lifecycleOwner, lVar, (q0.a) u4, composer, 0, 0);
        return listener;
    }
}
