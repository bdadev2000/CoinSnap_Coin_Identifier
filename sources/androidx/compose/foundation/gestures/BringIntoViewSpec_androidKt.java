package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.runtime.ComputedProvidableCompositionLocal;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public final class BringIntoViewSpec_androidKt {

    /* renamed from: a, reason: collision with root package name */
    public static final ComputedProvidableCompositionLocal f3104a = new ComputedProvidableCompositionLocal(BringIntoViewSpec_androidKt$LocalBringIntoViewSpec$1.f3106a);

    /* renamed from: b, reason: collision with root package name */
    public static final BringIntoViewSpec_androidKt$PivotBringIntoViewSpec$1 f3105b = new BringIntoViewSpec() { // from class: androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt$PivotBringIntoViewSpec$1

        /* renamed from: b, reason: collision with root package name */
        public final TweenSpec f3107b = AnimationSpecKt.d(Opcodes.LUSHR, 0, new CubicBezierEasing(0.25f, 0.1f, 0.25f, 1.0f), 2);

        @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
        public final float a(float f2, float f3, float f4) {
            float abs = Math.abs((f3 + f2) - f2);
            float f5 = (0.3f * f4) - (0.0f * abs);
            float f6 = f4 - f5;
            if ((abs <= f4) && f6 < abs) {
                f5 = f4 - abs;
            }
            return f2 - f5;
        }

        @Override // androidx.compose.foundation.gestures.BringIntoViewSpec
        public final AnimationSpec b() {
            return this.f3107b;
        }
    };
}
