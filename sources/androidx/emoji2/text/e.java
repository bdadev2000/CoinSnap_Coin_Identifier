package androidx.emoji2.text;

import android.text.TextPaint;

/* loaded from: classes.dex */
public final class e implements i {

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f1497b = new ThreadLocal();
    public final TextPaint a;

    public e() {
        TextPaint textPaint = new TextPaint();
        this.a = textPaint;
        textPaint.setTextSize(10.0f);
    }
}
