package androidx.activity.compose;

import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes3.dex */
public final class BackHandlerKt {
    public static final void a(final boolean z2, q0.a aVar, Composer composer, int i2, int i3) {
        int i4;
        ComposerImpl g2 = composer.g(-361453782);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = (g2.a(z2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= g2.I(aVar) ? 32 : 16;
        }
        if ((i4 & 91) == 18 && g2.i()) {
            g2.A();
        } else {
            if (i5 != 0) {
                z2 = true;
            }
            final MutableState k2 = SnapshotStateKt.k(aVar, g2);
            g2.t(-3687241);
            Object u2 = g2.u();
            Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
            if (u2 == composer$Companion$Empty$1) {
                u2 = new OnBackPressedCallback(z2) { // from class: androidx.activity.compose.BackHandlerKt$BackHandler$backCallback$1$1
                    @Override // androidx.activity.OnBackPressedCallback
                    public final void b() {
                        ((q0.a) k2.getValue()).invoke();
                    }
                };
                g2.o(u2);
            }
            g2.V(false);
            BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1 = (BackHandlerKt$BackHandler$backCallback$1$1) u2;
            Boolean valueOf = Boolean.valueOf(z2);
            g2.t(-3686552);
            boolean I = g2.I(valueOf) | g2.I(backHandlerKt$BackHandler$backCallback$1$1);
            Object u3 = g2.u();
            if (I || u3 == composer$Companion$Empty$1) {
                u3 = new BackHandlerKt$BackHandler$1$1(backHandlerKt$BackHandler$backCallback$1$1, z2);
                g2.o(u3);
            }
            g2.V(false);
            g2.L((q0.a) u3);
            OnBackPressedDispatcherOwner a2 = LocalOnBackPressedDispatcherOwner.a(g2);
            if (a2 == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
            }
            OnBackPressedDispatcher onBackPressedDispatcher = a2.getOnBackPressedDispatcher();
            LifecycleOwner lifecycleOwner = (LifecycleOwner) g2.K(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            EffectsKt.b(lifecycleOwner, onBackPressedDispatcher, new BackHandlerKt$BackHandler$2(onBackPressedDispatcher, lifecycleOwner, backHandlerKt$BackHandler$backCallback$1$1), g2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z == null) {
            return;
        }
        Z.d = new BackHandlerKt$BackHandler$3(z2, aVar, i2, i3);
    }
}
