package l0;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class d implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f21544a;
    public c b;

    public d(TextView textView) {
        this.f21544a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i9, int i10, Spanned spanned, int i11, int i12) {
        TextView textView = this.f21544a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int b = j0.j.a().b();
        if (b != 0) {
            if (b != 1) {
                if (b != 3) {
                    return charSequence;
                }
            } else {
                if ((i12 != 0 || i11 != 0 || spanned.length() != 0 || charSequence != textView.getText()) && charSequence != null) {
                    if (i9 != 0 || i10 != charSequence.length()) {
                        charSequence = charSequence.subSequence(i9, i10);
                    }
                    return j0.j.a().f(charSequence, 0, charSequence.length());
                }
                return charSequence;
            }
        }
        j0.j a6 = j0.j.a();
        if (this.b == null) {
            this.b = new c(textView, this);
        }
        a6.g(this.b);
        return charSequence;
    }
}
