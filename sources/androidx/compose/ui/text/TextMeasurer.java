package androidx.compose.ui.text;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.common.api.Api;
import e0.w;
import p0.a;

@Immutable
/* loaded from: classes3.dex */
public final class TextMeasurer {

    /* renamed from: a, reason: collision with root package name */
    public final FontFamily.Resolver f17053a;

    /* renamed from: b, reason: collision with root package name */
    public final Density f17054b;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutDirection f17055c;
    public final TextLayoutCache d;

    /* loaded from: classes3.dex */
    public static final class Companion {
    }

    public TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i2) {
        this.f17053a = resolver;
        this.f17054b = density;
        this.f17055c = layoutDirection;
        this.d = i2 > 0 ? new TextLayoutCache(i2) : null;
    }

    public static TextLayoutResult a(TextMeasurer textMeasurer, AnnotatedString annotatedString, TextStyle textStyle, int i2, boolean z2, int i3, long j2, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, int i4) {
        TextStyle textStyle2 = (i4 & 2) != 0 ? TextStyle.d : textStyle;
        int i5 = (i4 & 4) != 0 ? 1 : i2;
        boolean z3 = (i4 & 8) != 0 ? true : z2;
        int i6 = i4 & 16;
        int i7 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        int i8 = i6 != 0 ? Integer.MAX_VALUE : i3;
        TextLayoutResult textLayoutResult = null;
        w wVar = (i4 & 32) != 0 ? w.f30218a : null;
        long b2 = (i4 & 64) != 0 ? ConstraintsKt.b(0, 0, 15) : j2;
        LayoutDirection layoutDirection2 = (i4 & 128) != 0 ? textMeasurer.f17055c : layoutDirection;
        Density density2 = (i4 & 256) != 0 ? textMeasurer.f17054b : density;
        FontFamily.Resolver resolver2 = (i4 & 512) != 0 ? textMeasurer.f17053a : resolver;
        textMeasurer.getClass();
        LayoutDirection layoutDirection3 = layoutDirection2;
        long j3 = b2;
        int i9 = i5;
        TextLayoutInput textLayoutInput = new TextLayoutInput(annotatedString, textStyle2, wVar, i8, z3, i5, density2, layoutDirection3, resolver2, j3);
        TextLayoutCache textLayoutCache = textMeasurer.d;
        if (textLayoutCache != null) {
            TextLayoutResult textLayoutResult2 = (TextLayoutResult) textLayoutCache.f17037a.a(new CacheTextLayoutInput(textLayoutInput));
            if (textLayoutResult2 != null && !textLayoutResult2.f17047b.f16911a.a()) {
                textLayoutResult = textLayoutResult2;
            }
        }
        TextLayoutResult textLayoutResult3 = textLayoutResult;
        if (textLayoutResult3 != null) {
            return new TextLayoutResult(textLayoutInput, textLayoutResult3.f17047b, ConstraintsKt.e(j3, IntSizeKt.a((int) Math.ceil(r0.d), (int) Math.ceil(r0.e))));
        }
        MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, TextStyleKt.a(textStyle2, layoutDirection3), wVar, density2, resolver2);
        int k2 = Constraints.k(j3);
        if ((z3 || TextOverflow.a(i9, 2)) && Constraints.e(j3)) {
            i7 = Constraints.i(j3);
        }
        int i10 = i7;
        int i11 = (z3 || !TextOverflow.a(i9, 2)) ? i8 : 1;
        if (k2 != i10) {
            i10 = a.A((int) Math.ceil(multiParagraphIntrinsics.b()), k2, i10);
        }
        TextLayoutResult textLayoutResult4 = new TextLayoutResult(textLayoutInput, new MultiParagraph(multiParagraphIntrinsics, Constraints.Companion.b(0, i10, 0, Constraints.h(j3)), i11, TextOverflow.a(i9, 2)), ConstraintsKt.e(j3, IntSizeKt.a((int) Math.ceil(r1.d), (int) Math.ceil(r1.e))));
        if (textLayoutCache != null) {
        }
        return textLayoutResult4;
    }
}
