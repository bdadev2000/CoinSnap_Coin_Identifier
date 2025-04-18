package e1;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class f implements InputFilter {
    public final TextView a;

    /* renamed from: b, reason: collision with root package name */
    public e f17076b;

    public f(TextView textView) {
        this.a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        TextView textView = this.a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b3 = androidx.emoji2.text.l.a().b();
        if (b3 != 0) {
            boolean z10 = true;
            if (b3 != 1) {
                if (b3 != 3) {
                    return charSequence;
                }
            } else {
                if (i13 == 0 && i12 == 0 && spanned.length() == 0 && charSequence == textView.getText()) {
                    z10 = false;
                }
                if (z10 && charSequence != null) {
                    if (i10 != 0 || i11 != charSequence.length()) {
                        charSequence = charSequence.subSequence(i10, i11);
                    }
                    return androidx.emoji2.text.l.a().f(0, charSequence.length(), charSequence);
                }
                return charSequence;
            }
        }
        androidx.emoji2.text.l a = androidx.emoji2.text.l.a();
        if (this.f17076b == null) {
            this.f17076b = new e(textView, this);
        }
        a.g(this.f17076b);
        return charSequence;
    }
}
