package L3;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f1785a;
    public final TextPaint b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1786c;

    /* renamed from: d, reason: collision with root package name */
    public int f1787d;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1794k;

    /* renamed from: e, reason: collision with root package name */
    public Layout.Alignment f1788e = Layout.Alignment.ALIGN_NORMAL;

    /* renamed from: f, reason: collision with root package name */
    public int f1789f = Integer.MAX_VALUE;

    /* renamed from: g, reason: collision with root package name */
    public float f1790g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    public float f1791h = 1.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f1792i = 1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1793j = true;
    public TextUtils.TruncateAt l = null;

    public g(CharSequence charSequence, TextPaint textPaint, int i9) {
        this.f1785a = charSequence;
        this.b = textPaint;
        this.f1786c = i9;
        this.f1787d = charSequence.length();
    }

    public final StaticLayout a() {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.f1785a == null) {
            this.f1785a = "";
        }
        int max = Math.max(0, this.f1786c);
        CharSequence charSequence = this.f1785a;
        int i9 = this.f1789f;
        TextPaint textPaint = this.b;
        if (i9 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.l);
        }
        int min = Math.min(charSequence.length(), this.f1787d);
        this.f1787d = min;
        if (this.f1794k && this.f1789f == 1) {
            this.f1788e = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.f1788e);
        obtain.setIncludePad(this.f1793j);
        if (this.f1794k) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.l;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.f1789f);
        float f9 = this.f1790g;
        if (f9 != 0.0f || this.f1791h != 1.0f) {
            obtain.setLineSpacing(f9, this.f1791h);
        }
        if (this.f1789f > 1) {
            obtain.setHyphenationFrequency(this.f1792i);
        }
        return obtain.build();
    }
}
