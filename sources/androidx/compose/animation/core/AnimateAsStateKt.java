package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.unit.Dp;
import d1.f;
import org.objectweb.asm.Opcodes;
import q0.l;
import q0.p;

/* loaded from: classes4.dex */
public final class AnimateAsStateKt {

    /* renamed from: a, reason: collision with root package name */
    public static final SpringSpec f2009a = AnimationSpecKt.c(0.0f, 0.0f, null, 7);

    static {
        Rect rect = VisibilityThresholdsKt.f2404a;
        SizeKt.a(0.5f, 0.5f);
        OffsetKt.a(0.5f, 0.5f);
    }

    public static final State a(float f2, TweenSpec tweenSpec, Composer composer, int i2) {
        int i3 = (i2 & 14) | ((i2 << 3) & 896);
        int i4 = i2 << 6;
        return c(new Dp(f2), VectorConvertersKt.f2342c, tweenSpec, null, "DpAnimation", null, composer, i3 | (57344 & i4) | (i4 & Opcodes.ASM7), 8);
    }

    public static final State b(float f2, TweenSpec tweenSpec, Composer composer) {
        FiniteAnimationSpec finiteAnimationSpec;
        if (tweenSpec == f2009a) {
            composer.J(1125598679);
            boolean b2 = composer.b(0.01f);
            Object u2 = composer.u();
            if (b2 || u2 == Composer.Companion.f13690a) {
                u2 = AnimationSpecKt.c(0.0f, 0.0f, Float.valueOf(0.01f), 3);
                composer.o(u2);
            }
            composer.D();
            finiteAnimationSpec = (SpringSpec) u2;
        } else {
            composer.J(1125708605);
            composer.D();
            finiteAnimationSpec = tweenSpec;
        }
        return c(Float.valueOf(f2), VectorConvertersKt.f2340a, finiteAnimationSpec, Float.valueOf(0.01f), "FloatAnimation", null, composer, 0, 0);
    }

    public static final State c(Object obj, TwoWayConverter twoWayConverter, AnimationSpec animationSpec, Float f2, String str, l lVar, Composer composer, int i2, int i3) {
        int i4 = i3 & 4;
        Object obj2 = Composer.Companion.f13690a;
        if (i4 != 0) {
            Object u2 = composer.u();
            if (u2 == obj2) {
                u2 = AnimationSpecKt.c(0.0f, 0.0f, null, 7);
                composer.o(u2);
            }
            animationSpec = (SpringSpec) u2;
        }
        if ((i3 & 8) != 0) {
            f2 = null;
        }
        if ((i3 & 32) != 0) {
            lVar = null;
        }
        Object u3 = composer.u();
        if (u3 == obj2) {
            u3 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
            composer.o(u3);
        }
        MutableState mutableState = (MutableState) u3;
        Object u4 = composer.u();
        if (u4 == obj2) {
            u4 = new Animatable(obj, twoWayConverter, f2);
            composer.o(u4);
        }
        Animatable animatable = (Animatable) u4;
        MutableState k2 = SnapshotStateKt.k(lVar, composer);
        if (f2 != null && (animationSpec instanceof SpringSpec)) {
            SpringSpec springSpec = (SpringSpec) animationSpec;
            if (!p0.a.g(springSpec.f2233c, f2)) {
                animationSpec = new SpringSpec(springSpec.f2231a, springSpec.f2232b, f2);
            }
        }
        MutableState k3 = SnapshotStateKt.k(animationSpec, composer);
        Object u5 = composer.u();
        if (u5 == obj2) {
            u5 = p0.a.a(-1, 0, 6);
            composer.o(u5);
        }
        f fVar = (f) u5;
        boolean w = ((((i2 & 14) ^ 6) > 4 && composer.w(obj)) || (6 & i2) == 4) | composer.w(fVar);
        Object u6 = composer.u();
        if (w || u6 == obj2) {
            u6 = new AnimateAsStateKt$animateValueAsState$2$1(fVar, obj);
            composer.o(u6);
        }
        composer.L((q0.a) u6);
        boolean w2 = composer.w(fVar) | composer.w(animatable) | composer.I(k3) | composer.I(k2);
        Object u7 = composer.u();
        if (w2 || u7 == obj2) {
            u7 = new AnimateAsStateKt$animateValueAsState$3$1(fVar, animatable, k3, k2, null);
            composer.o(u7);
        }
        EffectsKt.f(fVar, (p) u7, composer);
        State state = (State) mutableState.getValue();
        return state == null ? animatable.f1983c : state;
    }
}
