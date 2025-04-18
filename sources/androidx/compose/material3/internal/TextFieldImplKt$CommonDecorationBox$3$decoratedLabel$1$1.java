package androidx.compose.material3.internal;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.EmojiSupportMatch;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.ParagraphStyleKt;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.SpanStyleKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.util.MathHelpersKt;
import d0.b0;
import kotlin.jvm.internal.r;
import q0.p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1 extends r implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextStyle f13047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextStyle f13048b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f13049c;
    public final /* synthetic */ State d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f13050f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f13051g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ State f13052h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$decoratedLabel$1$1(TextStyle textStyle, TextStyle textStyle2, float f2, Transition.TransitionAnimationState transitionAnimationState, p pVar, boolean z2, Transition.TransitionAnimationState transitionAnimationState2) {
        super(2);
        this.f13047a = textStyle;
        this.f13048b = textStyle2;
        this.f13049c = f2;
        this.d = transitionAnimationState;
        this.f13050f = pVar;
        this.f13051g = z2;
        this.f13052h = transitionAnimationState2;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        PlatformSpanStyle platformSpanStyle;
        PlatformParagraphStyle platformParagraphStyle;
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && composer.i()) {
            composer.A();
        } else {
            TextStyle textStyle = this.f13047a;
            SpanStyle spanStyle = textStyle.f17059a;
            TextStyle textStyle2 = this.f13048b;
            SpanStyle spanStyle2 = textStyle2.f17059a;
            TextForegroundStyle textForegroundStyle = SpanStyleKt.d;
            TextForegroundStyle textForegroundStyle2 = spanStyle.f17017a;
            TextForegroundStyle textForegroundStyle3 = spanStyle2.f17017a;
            float f2 = this.f13049c;
            TextForegroundStyle a2 = TextDrawStyleKt.a(textForegroundStyle2, textForegroundStyle3, f2);
            FontFamily fontFamily = (FontFamily) SpanStyleKt.b(f2, spanStyle.f17020f, spanStyle2.f17020f);
            long c2 = SpanStyleKt.c(spanStyle.f17018b, spanStyle2.f17018b, f2);
            FontWeight fontWeight = spanStyle.f17019c;
            if (fontWeight == null) {
                fontWeight = FontWeight.f17269i;
            }
            FontWeight fontWeight2 = spanStyle2.f17019c;
            if (fontWeight2 == null) {
                fontWeight2 = FontWeight.f17269i;
            }
            FontWeight fontWeight3 = new FontWeight(p0.a.A(MathHelpersKt.c(fontWeight.f17274a, fontWeight2.f17274a, f2), 1, 1000));
            FontStyle fontStyle = (FontStyle) SpanStyleKt.b(f2, spanStyle.d, spanStyle2.d);
            FontSynthesis fontSynthesis = (FontSynthesis) SpanStyleKt.b(f2, spanStyle.e, spanStyle2.e);
            String str = (String) SpanStyleKt.b(f2, spanStyle.f17021g, spanStyle2.f17021g);
            long c3 = SpanStyleKt.c(spanStyle.f17022h, spanStyle2.f17022h, f2);
            BaselineShift baselineShift = spanStyle.f17023i;
            float f3 = baselineShift != null ? baselineShift.f17447a : 0.0f;
            BaselineShift baselineShift2 = spanStyle2.f17023i;
            float b2 = MathHelpersKt.b(f3, baselineShift2 != null ? baselineShift2.f17447a : 0.0f, f2);
            TextGeometricTransform textGeometricTransform = TextGeometricTransform.f17471c;
            TextGeometricTransform textGeometricTransform2 = spanStyle.f17024j;
            if (textGeometricTransform2 == null) {
                textGeometricTransform2 = textGeometricTransform;
            }
            TextGeometricTransform textGeometricTransform3 = spanStyle2.f17024j;
            if (textGeometricTransform3 != null) {
                textGeometricTransform = textGeometricTransform3;
            }
            TextGeometricTransform textGeometricTransform4 = new TextGeometricTransform(MathHelpersKt.b(textGeometricTransform2.f17472a, textGeometricTransform.f17472a, f2), MathHelpersKt.b(textGeometricTransform2.f17473b, textGeometricTransform.f17473b, f2));
            LocaleList localeList = (LocaleList) SpanStyleKt.b(f2, spanStyle.f17025k, spanStyle2.f17025k);
            long h2 = ColorKt.h(spanStyle.f17026l, spanStyle2.f17026l, f2);
            TextDecoration textDecoration = (TextDecoration) SpanStyleKt.b(f2, spanStyle.f17027m, spanStyle2.f17027m);
            Shadow shadow = spanStyle.f17028n;
            if (shadow == null) {
                shadow = new Shadow();
            }
            Shadow shadow2 = spanStyle2.f17028n;
            if (shadow2 == null) {
                shadow2 = new Shadow();
            }
            Shadow shadow3 = new Shadow(ColorKt.h(shadow.f15039a, shadow2.f15039a, f2), OffsetKt.e(shadow.f15040b, shadow2.f15040b, f2), MathHelpersKt.b(shadow.f15041c, shadow2.f15041c, f2));
            PlatformSpanStyle platformSpanStyle2 = spanStyle.f17029o;
            if (platformSpanStyle2 == null && spanStyle2.f17029o == null) {
                platformSpanStyle = null;
            } else {
                if (platformSpanStyle2 == null) {
                    platformSpanStyle2 = PlatformSpanStyle.f16948a;
                }
                platformSpanStyle = platformSpanStyle2;
            }
            SpanStyle spanStyle3 = new SpanStyle(a2, c2, fontWeight3, fontStyle, fontSynthesis, fontFamily, str, c3, new BaselineShift(b2), textGeometricTransform4, localeList, h2, textDecoration, shadow3, platformSpanStyle, (DrawStyle) SpanStyleKt.b(f2, spanStyle.f17030p, spanStyle2.f17030p));
            int i2 = ParagraphStyleKt.f16944b;
            ParagraphStyle paragraphStyle = textStyle.f17060b;
            TextAlign textAlign = new TextAlign(paragraphStyle.f16936a);
            ParagraphStyle paragraphStyle2 = textStyle2.f17060b;
            int i3 = ((TextAlign) SpanStyleKt.b(f2, textAlign, new TextAlign(paragraphStyle2.f16936a))).f17463a;
            int i4 = ((TextDirection) SpanStyleKt.b(f2, new TextDirection(paragraphStyle.f16937b), new TextDirection(paragraphStyle2.f16937b))).f17467a;
            long c4 = SpanStyleKt.c(paragraphStyle.f16938c, paragraphStyle2.f16938c, f2);
            TextIndent textIndent = paragraphStyle.d;
            if (textIndent == null) {
                textIndent = TextIndent.f17474c;
            }
            TextIndent textIndent2 = paragraphStyle2.d;
            if (textIndent2 == null) {
                textIndent2 = TextIndent.f17474c;
            }
            TextIndent textIndent3 = new TextIndent(SpanStyleKt.c(textIndent.f17475a, textIndent2.f17475a, f2), SpanStyleKt.c(textIndent.f17476b, textIndent2.f17476b, f2));
            PlatformParagraphStyle platformParagraphStyle2 = paragraphStyle.e;
            PlatformParagraphStyle platformParagraphStyle3 = paragraphStyle2.e;
            if (platformParagraphStyle2 == null && platformParagraphStyle3 == null) {
                platformParagraphStyle = null;
            } else {
                PlatformParagraphStyle platformParagraphStyle4 = PlatformParagraphStyle.f16945c;
                if (platformParagraphStyle2 == null) {
                    platformParagraphStyle2 = platformParagraphStyle4;
                }
                if (platformParagraphStyle3 == null) {
                    platformParagraphStyle3 = platformParagraphStyle4;
                }
                boolean z2 = platformParagraphStyle2.f16946a;
                boolean z3 = platformParagraphStyle3.f16946a;
                if (z2 != z3) {
                    platformParagraphStyle2 = new PlatformParagraphStyle(((Boolean) SpanStyleKt.b(f2, Boolean.valueOf(z2), Boolean.valueOf(z3))).booleanValue(), ((EmojiSupportMatch) SpanStyleKt.b(f2, new EmojiSupportMatch(platformParagraphStyle2.f16947b), new EmojiSupportMatch(platformParagraphStyle3.f16947b))).f16904a);
                }
                platformParagraphStyle = platformParagraphStyle2;
            }
            TextStyle textStyle3 = new TextStyle(spanStyle3, new ParagraphStyle(i3, i4, c4, textIndent3, platformParagraphStyle, (LineHeightStyle) SpanStyleKt.b(f2, paragraphStyle.f16939f, paragraphStyle2.f16939f), ((LineBreak) SpanStyleKt.b(f2, new LineBreak(paragraphStyle.f16940g), new LineBreak(paragraphStyle2.f16940g))).f17453a, ((Hyphens) SpanStyleKt.b(f2, new Hyphens(paragraphStyle.f16941h), new Hyphens(paragraphStyle2.f16941h))).f17451a, (TextMotion) SpanStyleKt.b(f2, paragraphStyle.f16942i, paragraphStyle2.f16942i)));
            if (this.f13051g) {
                textStyle3 = TextStyle.a(0, 16777214, ((Color) this.f13052h.getValue()).f14964a, 0L, 0L, 0L, null, textStyle3, null, null, null);
            }
            TextFieldImplKt.c(((Color) this.d.getValue()).f14964a, textStyle3, this.f13050f, composer, 0);
        }
        return b0.f30125a;
    }
}
