package androidx.emoji2.text;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class d0 implements Spannable {

    /* renamed from: b, reason: collision with root package name */
    public boolean f1495b = false;

    /* renamed from: c, reason: collision with root package name */
    public Spannable f1496c;

    public d0(Spannable spannable) {
        this.f1496c = spannable;
    }

    public final void a() {
        ka.e c0Var;
        Spannable spannable = this.f1496c;
        if (!this.f1495b) {
            if (Build.VERSION.SDK_INT < 28) {
                c0Var = new ka.e();
            } else {
                c0Var = new c0();
            }
            if (c0Var.p(spannable)) {
                this.f1496c = new SpannableString(spannable);
            }
        }
        this.f1495b = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f1496c.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f1496c.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f1496c.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f1496c.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f1496c.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f1496c.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i10, int i11, Class cls) {
        return this.f1496c.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f1496c.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f1496c.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f1496c.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f1496c.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return this.f1496c.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f1496c.toString();
    }

    public d0(CharSequence charSequence) {
        this.f1496c = new SpannableString(charSequence);
    }
}
