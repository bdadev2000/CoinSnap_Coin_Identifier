package androidx.appcompat.widget;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class z {
    public final TextView a;

    /* renamed from: b, reason: collision with root package name */
    public final f.a f1101b;

    public z(TextView textView) {
        this.a = textView;
        this.f1101b = new f.a(textView);
    }

    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        return ((ac.e) this.f1101b.f17509c).h(inputFilterArr);
    }

    public final void b(AttributeSet attributeSet, int i10) {
        TypedArray obtainStyledAttributes = this.a.getContext().obtainStyledAttributes(attributeSet, g.a.f17886i, i10, 0);
        try {
            boolean z10 = true;
            if (obtainStyledAttributes.hasValue(14)) {
                z10 = obtainStyledAttributes.getBoolean(14, true);
            }
            obtainStyledAttributes.recycle();
            d(z10);
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    public final void c(boolean z10) {
        ((ac.e) this.f1101b.f17509c).r(z10);
    }

    public final void d(boolean z10) {
        ((ac.e) this.f1101b.f17509c).s(z10);
    }
}
