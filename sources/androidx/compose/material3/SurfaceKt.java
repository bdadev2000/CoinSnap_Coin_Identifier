package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderModifierNodeElement;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import q0.l;
import q0.p;

/* loaded from: classes3.dex */
public final class SurfaceKt {

    /* renamed from: a, reason: collision with root package name */
    public static final DynamicProvidableCompositionLocal f11615a = CompositionLocalKt.c(SurfaceKt$LocalAbsoluteTonalElevation$1.f11616a);

    public static final void a(Modifier modifier, Shape shape, long j2, long j3, float f2, float f3, BorderStroke borderStroke, p pVar, Composer composer, int i2, int i3) {
        Modifier modifier2 = (i3 & 1) != 0 ? Modifier.Companion.f14687a : modifier;
        Shape shape2 = (i3 & 2) != 0 ? RectangleShapeKt.f15014a : shape;
        long j4 = (i3 & 4) != 0 ? MaterialTheme.a(composer).f8534p : j2;
        long c2 = (i3 & 8) != 0 ? ColorSchemeKt.c(j4, composer) : j3;
        float f4 = (i3 & 16) != 0 ? 0 : f2;
        float f5 = (i3 & 32) != 0 ? 0 : f3;
        BorderStroke borderStroke2 = (i3 & 64) != 0 ? null : borderStroke;
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = f11615a;
        float f6 = f4 + ((Dp) composer.K(dynamicProvidableCompositionLocal)).f17486a;
        CompositionLocalKt.b(new ProvidedValue[]{androidx.compose.foundation.text.input.a.d(c2, ContentColorKt.f8654a), dynamicProvidableCompositionLocal.c(new Dp(f6))}, ComposableLambdaKt.c(-70914509, new SurfaceKt$Surface$1(modifier2, shape2, j4, f6, borderStroke2, f5, pVar), composer), composer, 56);
    }

    public static final void b(boolean z2, q0.a aVar, Modifier modifier, boolean z3, Shape shape, long j2, long j3, float f2, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i2, int i3) {
        Modifier modifier2 = (i3 & 4) != 0 ? Modifier.Companion.f14687a : modifier;
        boolean z4 = (i3 & 8) != 0 ? true : z3;
        Shape shape2 = (i3 & 16) != 0 ? RectangleShapeKt.f15014a : shape;
        long j4 = (i3 & 32) != 0 ? MaterialTheme.a(composer).f8534p : j2;
        long c2 = (i3 & 64) != 0 ? ColorSchemeKt.c(j4, composer) : j3;
        float f3 = (i3 & 128) != 0 ? 0 : 0.0f;
        float f4 = (i3 & 256) != 0 ? 0 : f2;
        BorderStroke borderStroke2 = (i3 & 512) != 0 ? null : borderStroke;
        MutableInteractionSource mutableInteractionSource2 = (i3 & 1024) != 0 ? null : mutableInteractionSource;
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = f11615a;
        float f5 = f3 + ((Dp) composer.K(dynamicProvidableCompositionLocal)).f17486a;
        CompositionLocalKt.b(new ProvidedValue[]{androidx.compose.foundation.text.input.a.d(c2, ContentColorKt.f8654a), dynamicProvidableCompositionLocal.c(new Dp(f5))}, ComposableLambdaKt.c(-1164547968, new SurfaceKt$Surface$3(modifier2, shape2, j4, f5, borderStroke2, z2, mutableInteractionSource2, z4, aVar, f4, composableLambdaImpl), composer), composer, 56);
    }

    public static final void c(boolean z2, l lVar, Modifier modifier, boolean z3, Shape shape, long j2, long j3, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i2, int i3) {
        Modifier modifier2 = (i3 & 4) != 0 ? Modifier.Companion.f14687a : modifier;
        boolean z4 = (i3 & 8) != 0 ? true : z3;
        Shape shape2 = (i3 & 16) != 0 ? RectangleShapeKt.f15014a : shape;
        long j4 = (i3 & 32) != 0 ? MaterialTheme.a(composer).f8534p : j2;
        long c2 = (i3 & 64) != 0 ? ColorSchemeKt.c(j4, composer) : j3;
        float f2 = (i3 & 128) != 0 ? 0 : 0.0f;
        float f3 = (i3 & 256) != 0 ? 0 : 0.0f;
        BorderStroke borderStroke2 = (i3 & 512) != 0 ? null : borderStroke;
        MutableInteractionSource mutableInteractionSource2 = (i3 & 1024) != 0 ? null : mutableInteractionSource;
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = f11615a;
        float f4 = f2 + ((Dp) composer.K(dynamicProvidableCompositionLocal)).f17486a;
        CompositionLocalKt.b(new ProvidedValue[]{androidx.compose.foundation.text.input.a.d(c2, ContentColorKt.f8654a), dynamicProvidableCompositionLocal.c(new Dp(f4))}, ComposableLambdaKt.c(712720927, new SurfaceKt$Surface$4(modifier2, shape2, j4, f4, borderStroke2, z2, mutableInteractionSource2, z4, lVar, f3, composableLambdaImpl), composer), composer, 56);
    }

    public static final void d(q0.a aVar, Modifier modifier, boolean z2, Shape shape, long j2, long j3, float f2, float f3, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i2, int i3) {
        Modifier modifier2 = (i3 & 2) != 0 ? Modifier.Companion.f14687a : modifier;
        boolean z3 = (i3 & 4) != 0 ? true : z2;
        Shape shape2 = (i3 & 8) != 0 ? RectangleShapeKt.f15014a : shape;
        long j4 = (i3 & 16) != 0 ? MaterialTheme.a(composer).f8534p : j2;
        long c2 = (i3 & 32) != 0 ? ColorSchemeKt.c(j4, composer) : j3;
        float f4 = (i3 & 64) != 0 ? 0 : f2;
        float f5 = (i3 & 128) != 0 ? 0 : f3;
        BorderStroke borderStroke2 = (i3 & 256) != 0 ? null : borderStroke;
        MutableInteractionSource mutableInteractionSource2 = (i3 & 512) == 0 ? mutableInteractionSource : null;
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = f11615a;
        float f6 = f4 + ((Dp) composer.K(dynamicProvidableCompositionLocal)).f17486a;
        CompositionLocalKt.b(new ProvidedValue[]{androidx.compose.foundation.text.input.a.d(c2, ContentColorKt.f8654a), dynamicProvidableCompositionLocal.c(new Dp(f6))}, ComposableLambdaKt.c(1279702876, new SurfaceKt$Surface$2(modifier2, shape2, j4, f6, borderStroke2, mutableInteractionSource2, z3, aVar, f5, composableLambdaImpl), composer), composer, 56);
    }

    public static final Modifier e(Modifier modifier, Shape shape, long j2, BorderStroke borderStroke, float f2) {
        Modifier modifier2 = Modifier.Companion.f14687a;
        Modifier T0 = modifier.T0(f2 > 0.0f ? GraphicsLayerModifierKt.b(modifier2, 0.0f, 0.0f, 0.0f, f2, 0.0f, shape, false, 124895) : modifier2);
        if (borderStroke != null) {
            modifier2 = new BorderModifierNodeElement(borderStroke.f2608a, borderStroke.f2609b, shape);
        }
        return ClipKt.a(BackgroundKt.a(T0.T0(modifier2), j2, shape), shape);
    }

    public static final long f(long j2, float f2, Composer composer) {
        return ColorSchemeKt.a(MaterialTheme.a(composer), j2, f2, composer);
    }
}
