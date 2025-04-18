package e1;

import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class i extends ac.e {

    /* renamed from: d, reason: collision with root package name */
    public final h f17081d;

    public i(TextView textView) {
        this.f17081d = new h(textView);
    }

    @Override // ac.e
    public final InputFilter[] h(InputFilter[] inputFilterArr) {
        boolean z10;
        if (androidx.emoji2.text.l.f1504j != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            return inputFilterArr;
        }
        return this.f17081d.h(inputFilterArr);
    }

    @Override // ac.e
    public final boolean p() {
        return this.f17081d.f17080g;
    }

    @Override // ac.e
    public final void r(boolean z10) {
        boolean z11;
        if (androidx.emoji2.text.l.f1504j != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            return;
        }
        this.f17081d.r(z10);
    }

    @Override // ac.e
    public final void s(boolean z10) {
        boolean z11;
        if (androidx.emoji2.text.l.f1504j != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z12 = !z11;
        h hVar = this.f17081d;
        if (z12) {
            hVar.f17080g = z10;
        } else {
            hVar.s(z10);
        }
    }
}
