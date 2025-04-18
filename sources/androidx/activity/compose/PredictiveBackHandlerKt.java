package androidx.activity.compose;

import android.support.v4.media.d;
import androidx.activity.BackEventCompat;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composer$Companion$Empty$1;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import b1.d0;
import q0.p;

/* loaded from: classes3.dex */
public final class PredictiveBackHandlerKt {
    public static final void a(final boolean z2, p pVar, Composer composer, int i2, int i3) {
        ComposerImpl g2 = composer.g(-642000585);
        if ((i3 & 1) != 0) {
            z2 = true;
        }
        final MutableState k2 = SnapshotStateKt.k(pVar, g2);
        g2.t(-723524056);
        g2.t(-3687241);
        Object u2 = g2.u();
        Composer$Companion$Empty$1 composer$Companion$Empty$1 = Composer.Companion.f13690a;
        if (u2 == composer$Companion$Empty$1) {
            u2 = d.h(EffectsKt.g(g2), g2);
        }
        g2.V(false);
        final d0 d0Var = ((CompositionScopedCoroutineScopeCanceller) u2).f13774a;
        g2.V(false);
        g2.t(-3687241);
        Object u3 = g2.u();
        if (u3 == composer$Companion$Empty$1) {
            u3 = new OnBackPressedCallback(z2) { // from class: androidx.activity.compose.PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1
                public OnBackInstance d;

                @Override // androidx.activity.OnBackPressedCallback
                public final void a() {
                    OnBackInstance onBackInstance = this.d;
                    if (onBackInstance != null) {
                        onBackInstance.a();
                    }
                }

                @Override // androidx.activity.OnBackPressedCallback
                public final void b() {
                    OnBackInstance onBackInstance = this.d;
                    if (onBackInstance != null && !onBackInstance.f228a) {
                        onBackInstance.a();
                        this.d = null;
                    }
                    if (this.d == null) {
                        this.d = new OnBackInstance(d0Var, false, (p) k2.getValue());
                    }
                    OnBackInstance onBackInstance2 = this.d;
                    if (onBackInstance2 != null) {
                        onBackInstance2.f229b.f(null);
                    }
                }

                @Override // androidx.activity.OnBackPressedCallback
                public final void c(BackEventCompat backEventCompat) {
                    p0.a.s(backEventCompat, "backEvent");
                    OnBackInstance onBackInstance = this.d;
                    if (onBackInstance != null) {
                        onBackInstance.f229b.b(backEventCompat);
                    }
                }

                @Override // androidx.activity.OnBackPressedCallback
                public final void d(BackEventCompat backEventCompat) {
                    p0.a.s(backEventCompat, "backEvent");
                    OnBackInstance onBackInstance = this.d;
                    if (onBackInstance != null) {
                        onBackInstance.a();
                    }
                    this.d = new OnBackInstance(d0Var, true, (p) k2.getValue());
                }
            };
            g2.o(u3);
        }
        g2.V(false);
        PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1 = (PredictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1) u3;
        EffectsKt.f(Boolean.valueOf(z2), new PredictiveBackHandlerKt$PredictiveBackHandler$1(predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1, z2, null), g2);
        OnBackPressedDispatcherOwner a2 = LocalOnBackPressedDispatcherOwner.a(g2);
        if (a2 == null) {
            throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner".toString());
        }
        OnBackPressedDispatcher onBackPressedDispatcher = a2.getOnBackPressedDispatcher();
        LifecycleOwner lifecycleOwner = (LifecycleOwner) g2.K(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        EffectsKt.b(lifecycleOwner, onBackPressedDispatcher, new PredictiveBackHandlerKt$PredictiveBackHandler$2(onBackPressedDispatcher, lifecycleOwner, predictiveBackHandlerKt$PredictiveBackHandler$backCallBack$1$1), g2);
        RecomposeScopeImpl Z = g2.Z();
        if (Z == null) {
            return;
        }
        Z.d = new PredictiveBackHandlerKt$PredictiveBackHandler$3(z2, pVar, i2, i3);
    }
}
