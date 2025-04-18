package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.common.api.Api;
import e0.w;
import java.util.List;
import p0.a;

@StabilityInferred
/* loaded from: classes4.dex */
public final class MultiParagraphLayoutCache {

    /* renamed from: a, reason: collision with root package name */
    public AnnotatedString f6896a;

    /* renamed from: b, reason: collision with root package name */
    public TextStyle f6897b;

    /* renamed from: c, reason: collision with root package name */
    public FontFamily.Resolver f6898c;
    public int d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public int f6899f;

    /* renamed from: g, reason: collision with root package name */
    public int f6900g;

    /* renamed from: h, reason: collision with root package name */
    public List f6901h;

    /* renamed from: i, reason: collision with root package name */
    public MinLinesConstrainer f6902i;

    /* renamed from: k, reason: collision with root package name */
    public Density f6904k;

    /* renamed from: l, reason: collision with root package name */
    public MultiParagraphIntrinsics f6905l;

    /* renamed from: m, reason: collision with root package name */
    public LayoutDirection f6906m;

    /* renamed from: n, reason: collision with root package name */
    public TextLayoutResult f6907n;

    /* renamed from: j, reason: collision with root package name */
    public long f6903j = InlineDensity.f6886a;

    /* renamed from: o, reason: collision with root package name */
    public int f6908o = -1;

    /* renamed from: p, reason: collision with root package name */
    public int f6909p = -1;

    public MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i4, List list) {
        this.f6896a = annotatedString;
        this.f6897b = textStyle;
        this.f6898c = resolver;
        this.d = i2;
        this.e = z2;
        this.f6899f = i3;
        this.f6900g = i4;
        this.f6901h = list;
    }

    public final int a(int i2, LayoutDirection layoutDirection) {
        int i3 = this.f6908o;
        int i4 = this.f6909p;
        if (i2 == i3 && i3 != -1) {
            return i4;
        }
        int a2 = TextDelegateKt.a(b(ConstraintsKt.a(0, i2, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER), layoutDirection).e);
        this.f6908o = i2;
        this.f6909p = a2;
        return a2;
    }

    public final MultiParagraph b(long j2, LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics d = d(layoutDirection);
        long a2 = LayoutUtilsKt.a(j2, this.e, this.d, d.b());
        boolean z2 = this.e;
        int i2 = this.d;
        int i3 = this.f6899f;
        int i4 = 1;
        if (z2 || !TextOverflow.a(i2, 2)) {
            if (i3 < 1) {
                i3 = 1;
            }
            i4 = i3;
        }
        return new MultiParagraph(d, a2, i4, TextOverflow.a(this.d, 2));
    }

    public final void c(Density density) {
        long j2;
        Density density2 = this.f6904k;
        if (density != null) {
            int i2 = InlineDensity.f6887b;
            j2 = InlineDensity.a(density.getDensity(), density.x1());
        } else {
            j2 = InlineDensity.f6886a;
        }
        if (density2 == null) {
            this.f6904k = density;
            this.f6903j = j2;
        } else if (density == null || this.f6903j != j2) {
            this.f6904k = density;
            this.f6903j = j2;
            this.f6905l = null;
            this.f6907n = null;
            this.f6909p = -1;
            this.f6908o = -1;
        }
    }

    public final MultiParagraphIntrinsics d(LayoutDirection layoutDirection) {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.f6905l;
        if (multiParagraphIntrinsics == null || layoutDirection != this.f6906m || multiParagraphIntrinsics.a()) {
            this.f6906m = layoutDirection;
            AnnotatedString annotatedString = this.f6896a;
            TextStyle a2 = TextStyleKt.a(this.f6897b, layoutDirection);
            Density density = this.f6904k;
            a.p(density);
            FontFamily.Resolver resolver = this.f6898c;
            List list = this.f6901h;
            if (list == null) {
                list = w.f30218a;
            }
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(annotatedString, a2, list, density, resolver);
        }
        this.f6905l = multiParagraphIntrinsics;
        return multiParagraphIntrinsics;
    }

    public final TextLayoutResult e(LayoutDirection layoutDirection, long j2, MultiParagraph multiParagraph) {
        float min = Math.min(multiParagraph.f16911a.b(), multiParagraph.d);
        AnnotatedString annotatedString = this.f6896a;
        TextStyle textStyle = this.f6897b;
        List list = this.f6901h;
        if (list == null) {
            list = w.f30218a;
        }
        int i2 = this.f6899f;
        boolean z2 = this.e;
        int i3 = this.d;
        Density density = this.f6904k;
        a.p(density);
        return new TextLayoutResult(new TextLayoutInput(annotatedString, textStyle, list, i2, z2, i3, density, layoutDirection, this.f6898c, j2), multiParagraph, ConstraintsKt.e(j2, IntSizeKt.a(TextDelegateKt.a(min), TextDelegateKt.a(multiParagraph.e))));
    }
}
