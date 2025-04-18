package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import q0.l;

/* loaded from: classes3.dex */
public final class EnterExitTransitionKt {

    /* renamed from: a, reason: collision with root package name */
    public static final TwoWayConverter f1816a = VectorConvertersKt.a(EnterExitTransitionKt$TransformOriginVectorConverter$1.f1819a, EnterExitTransitionKt$TransformOriginVectorConverter$2.f1820a);

    /* renamed from: b, reason: collision with root package name */
    public static final SpringSpec f1817b = AnimationSpecKt.c(0.0f, 400.0f, null, 5);

    /* renamed from: c, reason: collision with root package name */
    public static final SpringSpec f1818c;
    public static final SpringSpec d;

    static {
        Rect rect = VisibilityThresholdsKt.f2404a;
        f1818c = AnimationSpecKt.c(0.0f, 400.0f, new IntOffset(IntOffsetKt.a(1, 1)), 1);
        d = AnimationSpecKt.c(0.0f, 400.0f, new IntSize(IntSizeKt.a(1, 1)), 1);
    }

    public static EnterTransition a(TweenSpec tweenSpec, BiasAlignment.Horizontal horizontal, int i2) {
        FiniteAnimationSpec finiteAnimationSpec = tweenSpec;
        if ((i2 & 1) != 0) {
            Rect rect = VisibilityThresholdsKt.f2404a;
            finiteAnimationSpec = AnimationSpecKt.c(0.0f, 400.0f, new IntSize(IntSizeKt.a(1, 1)), 1);
        }
        int i3 = i2 & 2;
        BiasAlignment.Horizontal horizontal2 = Alignment.Companion.f14671o;
        if (i3 != 0) {
            horizontal = horizontal2;
        }
        return b(finiteAnimationSpec, p0.a.g(horizontal, Alignment.Companion.f14669m) ? Alignment.Companion.d : p0.a.g(horizontal, horizontal2) ? Alignment.Companion.f14662f : Alignment.Companion.e, new EnterExitTransitionKt$expandHorizontally$2((i2 & 8) != 0 ? EnterExitTransitionKt$expandHorizontally$1.f1839a : null), (i2 & 4) != 0);
    }

    public static final EnterTransition b(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, l lVar, boolean z2) {
        return new EnterTransitionImpl(new TransitionData(null, null, new ChangeSize(finiteAnimationSpec, alignment, lVar, z2), null, false, null, 59));
    }

    public static EnterTransition c() {
        Rect rect = VisibilityThresholdsKt.f2404a;
        return b(AnimationSpecKt.c(0.0f, 400.0f, new IntSize(IntSizeKt.a(1, 1)), 1), Alignment.Companion.f14665i, EnterExitTransitionKt$expandIn$1.f1841a, true);
    }

    public static EnterTransition d(TweenSpec tweenSpec, int i2) {
        FiniteAnimationSpec finiteAnimationSpec = tweenSpec;
        if ((i2 & 1) != 0) {
            Rect rect = VisibilityThresholdsKt.f2404a;
            finiteAnimationSpec = AnimationSpecKt.c(0.0f, 400.0f, new IntSize(IntSizeKt.a(1, 1)), 1);
        }
        int i3 = i2 & 2;
        BiasAlignment.Vertical vertical = Alignment.Companion.f14668l;
        BiasAlignment.Vertical vertical2 = i3 != 0 ? vertical : null;
        return b(finiteAnimationSpec, p0.a.g(vertical2, Alignment.Companion.f14666j) ? Alignment.Companion.f14660b : p0.a.g(vertical2, vertical) ? Alignment.Companion.f14664h : Alignment.Companion.e, new EnterExitTransitionKt$expandVertically$2((i2 & 8) != 0 ? EnterExitTransitionKt$expandVertically$1.f1842a : null), (i2 & 4) != 0);
    }

    public static EnterTransition e(TweenSpec tweenSpec, float f2, int i2) {
        FiniteAnimationSpec finiteAnimationSpec = tweenSpec;
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.c(0.0f, 400.0f, null, 5);
        }
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        return new EnterTransitionImpl(new TransitionData(new Fade(f2, finiteAnimationSpec), null, null, null, false, null, 62));
    }

    public static ExitTransition f(TweenSpec tweenSpec, int i2) {
        FiniteAnimationSpec finiteAnimationSpec = tweenSpec;
        if ((i2 & 1) != 0) {
            finiteAnimationSpec = AnimationSpecKt.c(0.0f, 400.0f, null, 5);
        }
        return new ExitTransitionImpl(new TransitionData(new Fade(0.0f, finiteAnimationSpec), null, null, null, false, null, 62));
    }

    public static final EnterTransition g(float f2, long j2, FiniteAnimationSpec finiteAnimationSpec) {
        return new EnterTransitionImpl(new TransitionData(null, null, null, new Scale(f2, j2, finiteAnimationSpec), false, null, 55));
    }

    public static EnterTransition h(TweenSpec tweenSpec) {
        return g(0.92f, TransformOrigin.f15059b, tweenSpec);
    }

    public static ExitTransition i(TweenSpec tweenSpec, BiasAlignment.Horizontal horizontal, int i2) {
        FiniteAnimationSpec finiteAnimationSpec = tweenSpec;
        if ((i2 & 1) != 0) {
            Rect rect = VisibilityThresholdsKt.f2404a;
            finiteAnimationSpec = AnimationSpecKt.c(0.0f, 400.0f, new IntSize(IntSizeKt.a(1, 1)), 1);
        }
        int i3 = i2 & 2;
        BiasAlignment.Horizontal horizontal2 = Alignment.Companion.f14671o;
        if (i3 != 0) {
            horizontal = horizontal2;
        }
        return j(finiteAnimationSpec, p0.a.g(horizontal, Alignment.Companion.f14669m) ? Alignment.Companion.d : p0.a.g(horizontal, horizontal2) ? Alignment.Companion.f14662f : Alignment.Companion.e, new EnterExitTransitionKt$shrinkHorizontally$2((i2 & 8) != 0 ? EnterExitTransitionKt$shrinkHorizontally$1.f1844a : null), (i2 & 4) != 0);
    }

    public static final ExitTransition j(FiniteAnimationSpec finiteAnimationSpec, Alignment alignment, l lVar, boolean z2) {
        return new ExitTransitionImpl(new TransitionData(null, null, new ChangeSize(finiteAnimationSpec, alignment, lVar, z2), null, false, null, 59));
    }

    public static ExitTransition k() {
        Rect rect = VisibilityThresholdsKt.f2404a;
        return j(AnimationSpecKt.c(0.0f, 400.0f, new IntSize(IntSizeKt.a(1, 1)), 1), Alignment.Companion.f14665i, EnterExitTransitionKt$shrinkOut$1.f1846a, true);
    }

    public static ExitTransition l(TweenSpec tweenSpec, int i2) {
        FiniteAnimationSpec finiteAnimationSpec = tweenSpec;
        if ((i2 & 1) != 0) {
            Rect rect = VisibilityThresholdsKt.f2404a;
            finiteAnimationSpec = AnimationSpecKt.c(0.0f, 400.0f, new IntSize(IntSizeKt.a(1, 1)), 1);
        }
        int i3 = i2 & 2;
        BiasAlignment.Vertical vertical = Alignment.Companion.f14668l;
        BiasAlignment.Vertical vertical2 = i3 != 0 ? vertical : null;
        return j(finiteAnimationSpec, p0.a.g(vertical2, Alignment.Companion.f14666j) ? Alignment.Companion.f14660b : p0.a.g(vertical2, vertical) ? Alignment.Companion.f14664h : Alignment.Companion.e, new EnterExitTransitionKt$shrinkVertically$2((i2 & 8) != 0 ? EnterExitTransitionKt$shrinkVertically$1.f1847a : null), (i2 & 4) != 0);
    }

    public static final EnterTransition m(FiniteAnimationSpec finiteAnimationSpec, l lVar) {
        return new EnterTransitionImpl(new TransitionData(null, new Slide(finiteAnimationSpec, new EnterExitTransitionKt$slideInVertically$2(lVar)), null, null, false, null, 61));
    }

    public static EnterTransition n(l lVar) {
        Rect rect = VisibilityThresholdsKt.f2404a;
        return m(AnimationSpecKt.c(0.0f, 400.0f, new IntOffset(IntOffsetKt.a(1, 1)), 1), lVar);
    }

    public static ExitTransition o(l lVar) {
        Rect rect = VisibilityThresholdsKt.f2404a;
        return new ExitTransitionImpl(new TransitionData(null, new Slide(AnimationSpecKt.c(0.0f, 400.0f, new IntOffset(IntOffsetKt.a(1, 1)), 1), new EnterExitTransitionKt$slideOutVertically$2(lVar)), null, null, false, null, 61));
    }
}
