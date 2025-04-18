package androidx.compose.ui.text.android.style;

import android.graphics.Paint;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred
/* loaded from: classes4.dex */
public final class LineHeightStyleSpan implements android.text.style.LineHeightSpan {

    /* renamed from: a, reason: collision with root package name */
    public final float f17148a;

    /* renamed from: c, reason: collision with root package name */
    public final int f17150c;
    public final boolean d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public final float f17151f;

    /* renamed from: k, reason: collision with root package name */
    public int f17156k;

    /* renamed from: l, reason: collision with root package name */
    public int f17157l;

    /* renamed from: b, reason: collision with root package name */
    public final int f17149b = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f17152g = Integer.MIN_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public int f17153h = Integer.MIN_VALUE;

    /* renamed from: i, reason: collision with root package name */
    public int f17154i = Integer.MIN_VALUE;

    /* renamed from: j, reason: collision with root package name */
    public int f17155j = Integer.MIN_VALUE;

    public LineHeightStyleSpan(float f2, int i2, boolean z2, boolean z3, float f3) {
        this.f17148a = f2;
        this.f17150c = i2;
        this.d = z2;
        this.e = z3;
        this.f17151f = f3;
        if ((0.0f > f3 || f3 > 1.0f) && f3 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1".toString());
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i2, int i3, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
        int i6 = fontMetricsInt.descent;
        int i7 = fontMetricsInt.ascent;
        if (i6 - i7 <= 0) {
            return;
        }
        boolean z2 = i2 == this.f17149b;
        boolean z3 = i3 == this.f17150c;
        boolean z4 = this.e;
        boolean z5 = this.d;
        if (z2 && z3 && z5 && z4) {
            return;
        }
        if (this.f17152g == Integer.MIN_VALUE) {
            int i8 = i6 - i7;
            int ceil = (int) Math.ceil(this.f17148a);
            int i9 = ceil - i8;
            float f2 = this.f17151f;
            if (f2 == -1.0f) {
                f2 = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
            }
            int ceil2 = (int) (i9 <= 0 ? Math.ceil(i9 * f2) : Math.ceil((1.0f - f2) * i9));
            int i10 = fontMetricsInt.descent;
            int i11 = ceil2 + i10;
            this.f17154i = i11;
            int i12 = i11 - ceil;
            this.f17153h = i12;
            if (z5) {
                i12 = fontMetricsInt.ascent;
            }
            this.f17152g = i12;
            if (z4) {
                i11 = i10;
            }
            this.f17155j = i11;
            this.f17156k = fontMetricsInt.ascent - i12;
            this.f17157l = i11 - i10;
        }
        fontMetricsInt.ascent = z2 ? this.f17152g : this.f17153h;
        fontMetricsInt.descent = z3 ? this.f17155j : this.f17154i;
    }
}
