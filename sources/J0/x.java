package j0;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class x implements Spannable {
    public boolean b = false;

    /* renamed from: c, reason: collision with root package name */
    public Spannable f21010c;

    public x(Spannable spannable) {
        this.f21010c = spannable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [a5.b] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    public final void a() {
        ?? r12;
        Spannable spannable = this.f21010c;
        if (!this.b) {
            if (Build.VERSION.SDK_INT < 28) {
                r12 = new Object();
            } else {
                r12 = new Object();
            }
            if (r12.A(spannable)) {
                this.f21010c = new SpannableString(spannable);
            }
        }
        this.b = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i9) {
        return this.f21010c.charAt(i9);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f21010c.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f21010c.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f21010c.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f21010c.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f21010c.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i9, int i10, Class cls) {
        return this.f21010c.getSpans(i9, i10, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f21010c.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i9, int i10, Class cls) {
        return this.f21010c.nextSpanTransition(i9, i10, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f21010c.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i9, int i10, int i11) {
        a();
        this.f21010c.setSpan(obj, i9, i10, i11);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i9, int i10) {
        return this.f21010c.subSequence(i9, i10);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f21010c.toString();
    }
}
