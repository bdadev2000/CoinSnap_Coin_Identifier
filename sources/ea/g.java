package ea;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class g {
    public CharSequence a;

    /* renamed from: b, reason: collision with root package name */
    public final TextPaint f17240b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17241c;

    /* renamed from: d, reason: collision with root package name */
    public int f17242d;

    /* renamed from: k, reason: collision with root package name */
    public boolean f17249k;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f17243e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f17244f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f17245g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f17246h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f17247i = 1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f17248j = true;

    /* renamed from: l, reason: collision with root package name */
    public TextUtils.TruncateAt f17250l = null;

    public g(CharSequence charSequence, TextPaint textPaint, int i10) {
        this.a = charSequence;
        this.f17240b = textPaint;
        this.f17241c = i10;
        this.f17242d = charSequence.length();
    }

    public final StaticLayout a() {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.a == null) {
            this.a = "";
        }
        int max = Math.max(0, this.f17241c);
        CharSequence charSequence = this.a;
        int i10 = this.f17244f;
        TextPaint textPaint = this.f17240b;
        if (i10 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.f17250l);
        }
        int min = Math.min(charSequence.length(), this.f17242d);
        this.f17242d = min;
        if (this.f17249k && this.f17244f == 1) {
            this.f17243e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f17243e);
        obtain.setIncludePad(this.f17248j);
        if (this.f17249k) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.f17250l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f17244f);
        float f10 = this.f17245g;
        if (f10 != 0.0f || this.f17246h != 1.0f) {
            obtain.setLineSpacing(f10, this.f17246h);
        }
        if (this.f17244f > 1) {
            obtain.setHyphenationFrequency(this.f17247i);
        }
        return obtain.build();
    }
}
