package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes4.dex */
final class StaticLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f17091a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17092b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17093c;
    public final TextPaint d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final TextDirectionHeuristic f17094f;

    /* renamed from: g, reason: collision with root package name */
    public final Layout.Alignment f17095g;

    /* renamed from: h, reason: collision with root package name */
    public final int f17096h;

    /* renamed from: i, reason: collision with root package name */
    public final TextUtils.TruncateAt f17097i;

    /* renamed from: j, reason: collision with root package name */
    public final int f17098j;

    /* renamed from: k, reason: collision with root package name */
    public final float f17099k;

    /* renamed from: l, reason: collision with root package name */
    public final float f17100l;

    /* renamed from: m, reason: collision with root package name */
    public final int f17101m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f17102n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f17103o;

    /* renamed from: p, reason: collision with root package name */
    public final int f17104p;

    /* renamed from: q, reason: collision with root package name */
    public final int f17105q;

    /* renamed from: r, reason: collision with root package name */
    public final int f17106r;

    /* renamed from: s, reason: collision with root package name */
    public final int f17107s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f17108t;

    /* renamed from: u, reason: collision with root package name */
    public final int[] f17109u;

    public StaticLayoutParams(float f2, float f3, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, Layout.Alignment alignment, TextDirectionHeuristic textDirectionHeuristic, TextPaint textPaint, TextUtils.TruncateAt truncateAt, CharSequence charSequence, boolean z2, boolean z3, int[] iArr, int[] iArr2) {
        this.f17091a = charSequence;
        this.f17092b = i2;
        this.f17093c = i3;
        this.d = textPaint;
        this.e = i4;
        this.f17094f = textDirectionHeuristic;
        this.f17095g = alignment;
        this.f17096h = i5;
        this.f17097i = truncateAt;
        this.f17098j = i6;
        this.f17099k = f2;
        this.f17100l = f3;
        this.f17101m = i7;
        this.f17102n = z2;
        this.f17103o = z3;
        this.f17104p = i8;
        this.f17105q = i9;
        this.f17106r = i10;
        this.f17107s = i11;
        this.f17108t = iArr;
        this.f17109u = iArr2;
        if (i2 < 0 || i2 > i3) {
            throw new IllegalArgumentException("invalid start value".toString());
        }
        int length = charSequence.length();
        if (i3 < 0 || i3 > length) {
            throw new IllegalArgumentException("invalid end value".toString());
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("invalid maxLines value".toString());
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("invalid width value".toString());
        }
        if (i6 < 0) {
            throw new IllegalArgumentException("invalid ellipsizedWidth value".toString());
        }
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("invalid lineSpacingMultiplier value".toString());
        }
    }
}
