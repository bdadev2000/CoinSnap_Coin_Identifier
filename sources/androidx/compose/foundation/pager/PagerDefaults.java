package androidx.compose.foundation.pager;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.VisibilityThresholdsKt;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.pager.PageInfo;
import androidx.compose.foundation.pager.PagerLayoutInfo;
import androidx.compose.foundation.pager.PagerMeasureResult;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class PagerDefaults {
    public static TargetedFlingBehavior a(final PagerState pagerState, final PagerSnapDistanceMaxPages pagerSnapDistanceMaxPages, AnimationSpec animationSpec, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            pagerSnapDistanceMaxPages = new PagerSnapDistanceMaxPages();
        }
        DecayAnimationSpec a2 = (i3 & 4) != 0 ? SplineBasedFloatDecayAnimationSpec_androidKt.a(composer) : null;
        boolean z2 = true;
        if ((i3 & 8) != 0) {
            Rect rect = VisibilityThresholdsKt.f2404a;
            animationSpec = AnimationSpecKt.c(0.0f, 400.0f, Float.valueOf(1), 1);
        }
        float f2 = (i3 & 16) != 0 ? 0.5f : 0.0f;
        if (0.0f > f2 || f2 > 1.0f) {
            throw new IllegalArgumentException(("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f2).toString());
        }
        Object obj = (Density) composer.K(CompositionLocalsKt.f16434f);
        LayoutDirection layoutDirection = (LayoutDirection) composer.K(CompositionLocalsKt.f16440l);
        boolean I = ((((i2 & 14) ^ 6) > 4 && composer.I(pagerState)) || (i2 & 6) == 4) | composer.I(a2) | composer.I(animationSpec);
        if ((((i2 & 112) ^ 48) <= 32 || !composer.I(pagerSnapDistanceMaxPages)) && (i2 & 48) != 32) {
            z2 = false;
        }
        boolean I2 = I | z2 | composer.I(obj) | composer.I(layoutDirection);
        Object u2 = composer.u();
        if (I2 || u2 == Composer.Companion.f13690a) {
            final PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1 pagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1 = new PagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1(pagerState, layoutDirection, f2);
            SnapLayoutInfoProvider snapLayoutInfoProvider = new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt$SnapLayoutInfoProvider$1
                @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                public final float a(float f3) {
                    PagerState pagerState2 = pagerState;
                    SnapPosition k2 = pagerState2.l().k();
                    List h2 = pagerState2.l().h();
                    int size = h2.size();
                    float f4 = Float.POSITIVE_INFINITY;
                    float f5 = Float.NEGATIVE_INFINITY;
                    for (int i4 = 0; i4 < size; i4++) {
                        PageInfo pageInfo = (PageInfo) h2.get(i4);
                        PagerLayoutInfo l2 = pagerState2.l();
                        int a3 = (int) (l2.c() == Orientation.f3394a ? l2.a() & 4294967295L : l2.a() >> 32);
                        int d = pagerState2.l().d();
                        int b2 = pagerState2.l().b();
                        int pageSize = pagerState2.l().getPageSize();
                        float a4 = pageInfo.a() - k2.a(a3, pageSize, d, b2, pageInfo.getIndex(), pagerState2.m());
                        if (a4 <= 0.0f && a4 > f5) {
                            f5 = a4;
                        }
                        if (a4 >= 0.0f && a4 < f4) {
                            f4 = a4;
                        }
                    }
                    if (f5 == Float.NEGATIVE_INFINITY) {
                        f5 = f4;
                    }
                    if (f4 == Float.POSITIVE_INFINITY) {
                        f4 = f5;
                    }
                    boolean z3 = !(PagerSnapLayoutInfoProviderKt.a(pagerState2) == 0.0f);
                    if (!pagerState2.d()) {
                        if (z3 && PagerSnapLayoutInfoProviderKt.b(pagerState2)) {
                            f5 = 0.0f;
                            f4 = 0.0f;
                        } else {
                            f4 = 0.0f;
                        }
                    }
                    if (!pagerState2.c()) {
                        if (!z3 || PagerSnapLayoutInfoProviderKt.b(pagerState2)) {
                            f5 = 0.0f;
                        } else {
                            f5 = 0.0f;
                            f4 = 0.0f;
                        }
                    }
                    Float valueOf = Float.valueOf(f5);
                    Float valueOf2 = Float.valueOf(f4);
                    float floatValue = valueOf.floatValue();
                    float floatValue2 = valueOf2.floatValue();
                    float floatValue3 = ((Number) pagerDefaults$flingBehavior$2$snapLayoutInfoProvider$1.invoke(Float.valueOf(f3), Float.valueOf(floatValue), Float.valueOf(floatValue2))).floatValue();
                    if (floatValue3 == floatValue || floatValue3 == floatValue2 || floatValue3 == 0.0f) {
                        if (floatValue3 == Float.POSITIVE_INFINITY || floatValue3 == Float.NEGATIVE_INFINITY) {
                            return 0.0f;
                        }
                        return floatValue3;
                    }
                    throw new IllegalStateException(("Final Snapping Offset Should Be one of " + floatValue + ", " + floatValue2 + " or 0.0").toString());
                }

                @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
                public final float b(float f3, float f4) {
                    PagerState pagerState2 = pagerState;
                    int n2 = ((PagerMeasureResult) pagerState2.f5275o.getValue()).f5241c + pagerState2.n();
                    if (n2 == 0) {
                        return 0.0f;
                    }
                    int i4 = f3 < 0.0f ? pagerState2.d + 1 : pagerState2.d;
                    int A = a.A(((int) (f4 / n2)) + i4, 0, pagerState2.m());
                    pagerState2.n();
                    int i5 = ((PagerMeasureResult) pagerState2.f5275o.getValue()).f5241c;
                    int abs = Math.abs((a.A(pagerSnapDistanceMaxPages.a(i4, A), 0, pagerState2.m()) - i4) * n2) - n2;
                    int i6 = abs >= 0 ? abs : 0;
                    if (i6 == 0) {
                        return i6;
                    }
                    return Math.signum(f3) * i6;
                }
            };
            float f3 = SnapFlingBehaviorKt.f3701a;
            u2 = new SnapFlingBehavior(snapLayoutInfoProvider, a2, animationSpec);
            composer.o(u2);
        }
        return (TargetedFlingBehavior) u2;
    }

    public static NestedScrollConnection b(PagerState pagerState, Orientation orientation, Composer composer, int i2) {
        boolean z2 = ((((i2 & 14) ^ 6) > 4 && composer.I(pagerState)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.I(orientation)) || (i2 & 48) == 32);
        Object u2 = composer.u();
        if (z2 || u2 == Composer.Companion.f13690a) {
            u2 = new DefaultPagerNestedScrollConnection(pagerState, orientation);
            composer.o(u2);
        }
        return (DefaultPagerNestedScrollConnection) u2;
    }
}
