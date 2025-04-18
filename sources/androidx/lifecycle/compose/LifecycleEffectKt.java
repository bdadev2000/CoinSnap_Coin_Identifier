package androidx.lifecycle.compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.lifecycle.LifecycleOwner;
import org.objectweb.asm.Opcodes;
import q0.l;

/* loaded from: classes2.dex */
public final class LifecycleEffectKt {
    public static final void a(LifecycleOwner lifecycleOwner, LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, l lVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(912823238);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(lifecycleOwner) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(lifecycleResumePauseEffectScope) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.w(lVar) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            boolean w = ((i3 & 896) == 256) | g2.w(lifecycleResumePauseEffectScope) | g2.w(lifecycleOwner);
            Object u2 = g2.u();
            if (w || u2 == Composer.Companion.f13690a) {
                u2 = new LifecycleEffectKt$LifecycleResumeEffectImpl$1$1(lifecycleOwner, lifecycleResumePauseEffectScope, lVar);
                g2.o(u2);
            }
            EffectsKt.b(lifecycleOwner, lifecycleResumePauseEffectScope, (l) u2, g2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new LifecycleEffectKt$LifecycleResumeEffectImpl$2(lifecycleOwner, lifecycleResumePauseEffectScope, lVar, i2);
        }
    }

    public static final void b(LifecycleOwner lifecycleOwner, LifecycleStartStopEffectScope lifecycleStartStopEffectScope, l lVar, Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(228371534);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(lifecycleOwner) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= g2.w(lifecycleStartStopEffectScope) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= g2.w(lVar) ? 256 : 128;
        }
        if ((i3 & Opcodes.I2S) == 146 && g2.i()) {
            g2.A();
        } else {
            boolean w = ((i3 & 896) == 256) | g2.w(lifecycleStartStopEffectScope) | g2.w(lifecycleOwner);
            Object u2 = g2.u();
            if (w || u2 == Composer.Companion.f13690a) {
                u2 = new LifecycleEffectKt$LifecycleStartEffectImpl$1$1(lifecycleOwner, lifecycleStartStopEffectScope, lVar);
                g2.o(u2);
            }
            EffectsKt.b(lifecycleOwner, lifecycleStartStopEffectScope, (l) u2, g2);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new LifecycleEffectKt$LifecycleStartEffectImpl$2(lifecycleOwner, lifecycleStartStopEffectScope, lVar, i2);
        }
    }
}
