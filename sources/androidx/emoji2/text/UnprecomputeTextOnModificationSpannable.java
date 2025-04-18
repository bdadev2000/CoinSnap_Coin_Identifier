package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import androidx.annotation.RequiresApi;
import androidx.core.text.PrecomputedTextCompat;
import java.util.stream.IntStream;

/* loaded from: classes2.dex */
class UnprecomputeTextOnModificationSpannable implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f19564a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f19565b;

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class CharSequenceHelper_API24 {
    }

    /* loaded from: classes2.dex */
    public static class PrecomputedTextDetector {
        public boolean a(Spannable spannable) {
            return spannable instanceof PrecomputedTextCompat;
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class PrecomputedTextDetector_28 extends PrecomputedTextDetector {
        @Override // androidx.emoji2.text.UnprecomputeTextOnModificationSpannable.PrecomputedTextDetector
        public final boolean a(Spannable spannable) {
            return androidx.compose.ui.graphics.layer.b.x(spannable) || (spannable instanceof PrecomputedTextCompat);
        }
    }

    public UnprecomputeTextOnModificationSpannable(Spannable spannable) {
        this.f19565b = spannable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.emoji2.text.UnprecomputeTextOnModificationSpannable$PrecomputedTextDetector] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final void a() {
        Spannable spannable = this.f19565b;
        if (!this.f19564a) {
            if ((Build.VERSION.SDK_INT < 28 ? new Object() : new Object()).a(spannable)) {
                this.f19565b = new SpannableString(spannable);
            }
        }
        this.f19564a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        return this.f19565b.charAt(i2);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f19565b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f19565b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f19565b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f19565b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f19565b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i2, int i3, Class cls) {
        return this.f19565b.getSpans(i2, i3, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f19565b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f19565b.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f19565b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        a();
        this.f19565b.setSpan(obj, i2, i3, i4);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i3) {
        return this.f19565b.subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f19565b.toString();
    }
}
