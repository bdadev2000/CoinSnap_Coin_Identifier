package L3;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public float f1796c;

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f1798e;

    /* renamed from: f, reason: collision with root package name */
    public O3.d f1799f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f1795a = new TextPaint(1);
    public final F3.a b = new F3.a(this, 1);

    /* renamed from: d, reason: collision with root package name */
    public boolean f1797d = true;

    public i(h hVar) {
        this.f1798e = new WeakReference(null);
        this.f1798e = new WeakReference(hVar);
    }

    public final float a(String str) {
        float measureText;
        if (!this.f1797d) {
            return this.f1796c;
        }
        TextPaint textPaint = this.f1795a;
        if (str == null) {
            measureText = 0.0f;
        } else {
            measureText = textPaint.measureText((CharSequence) str, 0, str.length());
        }
        this.f1796c = measureText;
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f1797d = false;
        return this.f1796c;
    }
}
