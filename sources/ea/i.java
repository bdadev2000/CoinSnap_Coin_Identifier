package ea;

import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public float f17252c;

    /* renamed from: e, reason: collision with root package name */
    public WeakReference f17254e;

    /* renamed from: f, reason: collision with root package name */
    public ha.d f17255f;
    public final TextPaint a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final z9.b f17251b = new z9.b(this, 1);

    /* renamed from: d, reason: collision with root package name */
    public boolean f17253d = true;

    public i(h hVar) {
        this.f17254e = new WeakReference(null);
        this.f17254e = new WeakReference(hVar);
    }

    public final float a(String str) {
        float measureText;
        if (!this.f17253d) {
            return this.f17252c;
        }
        TextPaint textPaint = this.a;
        if (str == null) {
            measureText = 0.0f;
        } else {
            measureText = textPaint.measureText((CharSequence) str, 0, str.length());
        }
        this.f17252c = measureText;
        if (str != null) {
            Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.f17253d = false;
        return this.f17252c;
    }
}
