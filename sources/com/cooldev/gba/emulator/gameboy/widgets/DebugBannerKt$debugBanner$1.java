package com.cooldev.gba.emulator.gameboy.widgets;

import android.support.v4.media.d;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope$drawContext$1;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextMeasurer;
import androidx.compose.ui.text.TextPainterKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import d0.b0;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;
import q0.l;
import q0.q;

/* loaded from: classes2.dex */
public final class DebugBannerKt$debugBanner$1 extends r implements q {
    final /* synthetic */ long $color;
    final /* synthetic */ float $labelTextRatio;
    final /* synthetic */ TextStyle $style;
    final /* synthetic */ String $text;

    /* renamed from: com.cooldev.gba.emulator.gameboy.widgets.DebugBannerKt$debugBanner$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends r implements l {
        final /* synthetic */ long $color;
        final /* synthetic */ float $labelTextRatio;
        final /* synthetic */ TextStyle $style;
        final /* synthetic */ String $text;
        final /* synthetic */ TextLayoutResult $textLayoutResult;
        final /* synthetic */ TextMeasurer $textMeasurer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(TextLayoutResult textLayoutResult, float f2, long j2, TextMeasurer textMeasurer, String str, TextStyle textStyle) {
            super(1);
            this.$textLayoutResult = textLayoutResult;
            this.$labelTextRatio = f2;
            this.$color = j2;
            this.$textMeasurer = textMeasurer;
            this.$text = str;
            this.$style = textStyle;
        }

        @Override // q0.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((ContentDrawScope) obj);
            return b0.f30125a;
        }

        public final void invoke(@NotNull ContentDrawScope contentDrawScope) {
            long j2;
            CanvasDrawScope$drawContext$1 canvasDrawScope$drawContext$1;
            a.s(contentDrawScope, "$this$drawWithContent");
            float d = Size.d(contentDrawScope.b());
            long j3 = this.$textLayoutResult.f17048c;
            float f2 = (int) (j3 >> 32);
            float f3 = f2 * this.$labelTextRatio;
            float f4 = (int) (j3 & 4294967295L);
            Rect a2 = RectKt.a(OffsetKt.a(d - f3, 0.0f), SizeKt.a(f3, 1.1f * f4));
            float sqrt = (float) Math.sqrt(f3 / 2.0f);
            float f5 = sqrt * sqrt;
            contentDrawScope.P1();
            long j4 = this.$color;
            TextMeasurer textMeasurer = this.$textMeasurer;
            String str = this.$text;
            TextStyle textStyle = this.$style;
            CanvasDrawScope$drawContext$1 A1 = contentDrawScope.A1();
            long b2 = A1.b();
            A1.a().p();
            try {
                try {
                    A1.f15139a.d(OffsetKt.a(d - (f3 / 2), f5), 45.0f);
                } catch (Throwable th) {
                    th = th;
                    canvasDrawScope$drawContext$1 = A1;
                    j2 = b2;
                }
                try {
                    DrawScope.R0(contentDrawScope, j4, a2.g(), a2.f(), 0.0f, null, 120);
                    TextPainterKt.a(contentDrawScope, textMeasurer, str, OffsetKt.a(((f3 - f2) / 2.0f) + a2.f14914a, ((a2.d - f4) / 2.0f) + a2.f14915b), textStyle);
                    d.A(A1, b2);
                } catch (Throwable th2) {
                    th = th2;
                    j2 = b2;
                    canvasDrawScope$drawContext$1 = A1;
                    d.A(canvasDrawScope$drawContext$1, j2);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                j2 = b2;
                canvasDrawScope$drawContext$1 = A1;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebugBannerKt$debugBanner$1(String str, TextStyle textStyle, float f2, long j2) {
        super(3);
        this.$text = str;
        this.$style = textStyle;
        this.$labelTextRatio = f2;
        this.$color = j2;
    }

    @Override // q0.q
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier modifier, @Nullable Composer composer, int i2) {
        a.s(modifier, "$this$composed");
        composer.J(1758419741);
        FontFamily.Resolver resolver = (FontFamily.Resolver) composer.K(CompositionLocalsKt.f16437i);
        Density density = (Density) composer.K(CompositionLocalsKt.f16434f);
        LayoutDirection layoutDirection = (LayoutDirection) composer.K(CompositionLocalsKt.f16440l);
        boolean I = composer.I(resolver) | composer.I(density) | composer.I(layoutDirection) | composer.c(8);
        Object u2 = composer.u();
        Object obj = Composer.Companion.f13690a;
        if (I || u2 == obj) {
            u2 = new TextMeasurer(resolver, density, layoutDirection, 8);
            composer.o(u2);
        }
        TextMeasurer textMeasurer = (TextMeasurer) u2;
        composer.J(393849419);
        String str = this.$text;
        TextStyle textStyle = this.$style;
        Object u3 = composer.u();
        if (u3 == obj) {
            u3 = TextMeasurer.a(textMeasurer, new AnnotatedString(str, null, 6), textStyle, 0, false, 0, 0L, null, null, null, 2044);
            composer.o(u3);
        }
        composer.D();
        Modifier d = DrawModifierKt.d(ClipKt.b(Modifier.Companion.f14687a), new AnonymousClass1((TextLayoutResult) u3, this.$labelTextRatio, this.$color, textMeasurer, this.$text, this.$style));
        composer.D();
        return d;
    }
}
