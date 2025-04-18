package androidx.emoji2.text;

import android.text.TextPaint;
import androidx.annotation.AnyThread;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.PaintCompat;
import androidx.emoji2.text.EmojiCompat;

/* JADX INFO: Access modifiers changed from: package-private */
@AnyThread
@RestrictTo
/* loaded from: classes3.dex */
public class DefaultGlyphChecker implements EmojiCompat.GlyphChecker {

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f19501b = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f19502a;

    public DefaultGlyphChecker() {
        TextPaint textPaint = new TextPaint();
        this.f19502a = textPaint;
        textPaint.setTextSize(10.0f);
    }

    @Override // androidx.emoji2.text.EmojiCompat.GlyphChecker
    public final boolean a(CharSequence charSequence, int i2, int i3) {
        ThreadLocal threadLocal = f19501b;
        if (threadLocal.get() == null) {
            threadLocal.set(new StringBuilder());
        }
        StringBuilder sb = (StringBuilder) threadLocal.get();
        sb.setLength(0);
        while (i2 < i3) {
            sb.append(charSequence.charAt(i2));
            i2++;
        }
        return PaintCompat.a(this.f19502a, sb.toString());
    }
}
