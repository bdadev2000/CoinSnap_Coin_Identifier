package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.TextDelegateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.gms.common.api.Api;
import e0.w;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class ParagraphLayoutCache {

    /* renamed from: a, reason: collision with root package name */
    public String f6910a;

    /* renamed from: b, reason: collision with root package name */
    public TextStyle f6911b;

    /* renamed from: c, reason: collision with root package name */
    public FontFamily.Resolver f6912c;
    public int d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public int f6913f;

    /* renamed from: g, reason: collision with root package name */
    public int f6914g;

    /* renamed from: i, reason: collision with root package name */
    public Density f6916i;

    /* renamed from: j, reason: collision with root package name */
    public AndroidParagraph f6917j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6918k;

    /* renamed from: m, reason: collision with root package name */
    public MinLinesConstrainer f6920m;

    /* renamed from: n, reason: collision with root package name */
    public ParagraphIntrinsics f6921n;

    /* renamed from: o, reason: collision with root package name */
    public LayoutDirection f6922o;

    /* renamed from: h, reason: collision with root package name */
    public long f6915h = InlineDensity.f6886a;

    /* renamed from: l, reason: collision with root package name */
    public long f6919l = IntSizeKt.a(0, 0);

    /* renamed from: p, reason: collision with root package name */
    public long f6923p = Constraints.Companion.c(0, 0);

    /* renamed from: q, reason: collision with root package name */
    public int f6924q = -1;

    /* renamed from: r, reason: collision with root package name */
    public int f6925r = -1;

    public ParagraphLayoutCache(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i2, boolean z2, int i3, int i4) {
        this.f6910a = str;
        this.f6911b = textStyle;
        this.f6912c = resolver;
        this.d = i2;
        this.e = z2;
        this.f6913f = i3;
        this.f6914g = i4;
    }

    public final int a(int i2, LayoutDirection layoutDirection) {
        int i3 = this.f6924q;
        int i4 = this.f6925r;
        if (i2 == i3 && i3 != -1) {
            return i4;
        }
        int a2 = TextDelegateKt.a(b(ConstraintsKt.a(0, i2, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER), layoutDirection).getHeight());
        this.f6924q = i2;
        this.f6925r = a2;
        return a2;
    }

    public final AndroidParagraph b(long j2, LayoutDirection layoutDirection) {
        int i2;
        ParagraphIntrinsics d = d(layoutDirection);
        long a2 = LayoutUtilsKt.a(j2, this.e, this.d, d.b());
        boolean z2 = this.e;
        int i3 = this.d;
        int i4 = this.f6913f;
        if (z2 || !TextOverflow.a(i3, 2)) {
            if (i4 < 1) {
                i4 = 1;
            }
            i2 = i4;
        } else {
            i2 = 1;
        }
        return new AndroidParagraph((AndroidParagraphIntrinsics) d, i2, TextOverflow.a(this.d, 2), a2);
    }

    public final void c(Density density) {
        long j2;
        Density density2 = this.f6916i;
        if (density != null) {
            int i2 = InlineDensity.f6887b;
            j2 = InlineDensity.a(density.getDensity(), density.x1());
        } else {
            j2 = InlineDensity.f6886a;
        }
        if (density2 == null) {
            this.f6916i = density;
            this.f6915h = j2;
            return;
        }
        if (density == null || this.f6915h != j2) {
            this.f6916i = density;
            this.f6915h = j2;
            this.f6917j = null;
            this.f6921n = null;
            this.f6922o = null;
            this.f6924q = -1;
            this.f6925r = -1;
            this.f6923p = Constraints.Companion.c(0, 0);
            this.f6919l = IntSizeKt.a(0, 0);
            this.f6918k = false;
        }
    }

    public final ParagraphIntrinsics d(LayoutDirection layoutDirection) {
        ParagraphIntrinsics paragraphIntrinsics = this.f6921n;
        if (paragraphIntrinsics == null || layoutDirection != this.f6922o || paragraphIntrinsics.a()) {
            this.f6922o = layoutDirection;
            String str = this.f6910a;
            TextStyle a2 = TextStyleKt.a(this.f6911b, layoutDirection);
            Density density = this.f6916i;
            a.p(density);
            FontFamily.Resolver resolver = this.f6912c;
            w wVar = w.f30218a;
            paragraphIntrinsics = new AndroidParagraphIntrinsics(a2, resolver, density, str, wVar, wVar);
        }
        this.f6921n = paragraphIntrinsics;
        return paragraphIntrinsics;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.f6917j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) InlineDensity.b(this.f6915h));
        sb.append(')');
        return sb.toString();
    }
}
