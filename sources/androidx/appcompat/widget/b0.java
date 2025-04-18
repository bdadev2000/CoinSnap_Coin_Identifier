package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public final class b0 {
    public final ImageView a;

    /* renamed from: b, reason: collision with root package name */
    public r3 f807b;

    /* renamed from: c, reason: collision with root package name */
    public int f808c = 0;

    public b0(ImageView imageView) {
        this.a = imageView;
    }

    public final void a() {
        r3 r3Var;
        ImageView imageView = this.a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            s1.a(drawable);
        }
        if (drawable != null && (r3Var = this.f807b) != null) {
            w.d(drawable, r3Var, imageView.getDrawableState());
        }
    }

    public final void b(AttributeSet attributeSet, int i10) {
        int i11;
        ImageView imageView = this.a;
        Context context = imageView.getContext();
        int[] iArr = g.a.f17883f;
        i3 m10 = i3.m(context, attributeSet, iArr, i10);
        ViewCompat.saveAttributeDataForStyleable(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) m10.f874b, i10, 0);
        try {
            Drawable drawable = imageView.getDrawable();
            if (drawable == null && (i11 = m10.i(1, -1)) != -1 && (drawable = com.bumptech.glide.c.t(imageView.getContext(), i11)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                s1.a(drawable);
            }
            if (m10.l(2)) {
                t0.f.c(imageView, m10.b(2));
            }
            if (m10.l(3)) {
                t0.f.d(imageView, s1.b(m10.h(3, -1), null));
            }
        } finally {
            m10.o();
        }
    }

    public final void c(int i10) {
        ImageView imageView = this.a;
        if (i10 != 0) {
            Drawable t5 = com.bumptech.glide.c.t(imageView.getContext(), i10);
            if (t5 != null) {
                s1.a(t5);
            }
            imageView.setImageDrawable(t5);
        } else {
            imageView.setImageDrawable(null);
        }
        a();
    }
}
