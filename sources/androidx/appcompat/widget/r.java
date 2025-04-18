package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public final class r {
    public final View a;

    /* renamed from: d, reason: collision with root package name */
    public r3 f1006d;

    /* renamed from: e, reason: collision with root package name */
    public r3 f1007e;

    /* renamed from: f, reason: collision with root package name */
    public r3 f1008f;

    /* renamed from: c, reason: collision with root package name */
    public int f1005c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final w f1004b = w.a();

    public r(View view) {
        this.a = view;
    }

    public final void a() {
        boolean z10;
        View view = this.a;
        Drawable background = view.getBackground();
        if (background != null) {
            boolean z11 = false;
            if (this.f1006d != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (this.f1008f == null) {
                    this.f1008f = new r3();
                }
                r3 r3Var = this.f1008f;
                r3Var.f1012d = null;
                r3Var.f1011c = false;
                r3Var.f1013e = null;
                r3Var.f1010b = false;
                ColorStateList backgroundTintList = ViewCompat.getBackgroundTintList(view);
                if (backgroundTintList != null) {
                    r3Var.f1011c = true;
                    r3Var.f1012d = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = ViewCompat.getBackgroundTintMode(view);
                if (backgroundTintMode != null) {
                    r3Var.f1010b = true;
                    r3Var.f1013e = backgroundTintMode;
                }
                if (r3Var.f1011c || r3Var.f1010b) {
                    w.d(background, r3Var, view.getDrawableState());
                    z11 = true;
                }
                if (z11) {
                    return;
                }
            }
            r3 r3Var2 = this.f1007e;
            if (r3Var2 != null) {
                w.d(background, r3Var2, view.getDrawableState());
                return;
            }
            r3 r3Var3 = this.f1006d;
            if (r3Var3 != null) {
                w.d(background, r3Var3, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        r3 r3Var = this.f1007e;
        if (r3Var != null) {
            return (ColorStateList) r3Var.f1012d;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        r3 r3Var = this.f1007e;
        if (r3Var != null) {
            return (PorterDuff.Mode) r3Var.f1013e;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i10) {
        ColorStateList h10;
        View view = this.a;
        Context context = view.getContext();
        int[] iArr = g.a.f17902z;
        i3 m10 = i3.m(context, attributeSet, iArr, i10);
        View view2 = this.a;
        ViewCompat.saveAttributeDataForStyleable(view2, view2.getContext(), iArr, attributeSet, (TypedArray) m10.f874b, i10, 0);
        try {
            if (m10.l(0)) {
                this.f1005c = m10.i(0, -1);
                w wVar = this.f1004b;
                Context context2 = view.getContext();
                int i11 = this.f1005c;
                synchronized (wVar) {
                    h10 = wVar.a.h(context2, i11);
                }
                if (h10 != null) {
                    g(h10);
                }
            }
            if (m10.l(1)) {
                ViewCompat.setBackgroundTintList(view, m10.b(1));
            }
            if (m10.l(2)) {
                ViewCompat.setBackgroundTintMode(view, s1.b(m10.h(2, -1), null));
            }
        } finally {
            m10.o();
        }
    }

    public final void e() {
        this.f1005c = -1;
        g(null);
        a();
    }

    public final void f(int i10) {
        ColorStateList colorStateList;
        this.f1005c = i10;
        w wVar = this.f1004b;
        if (wVar != null) {
            Context context = this.a.getContext();
            synchronized (wVar) {
                colorStateList = wVar.a.h(context, i10);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1006d == null) {
                this.f1006d = new r3();
            }
            r3 r3Var = this.f1006d;
            r3Var.f1012d = colorStateList;
            r3Var.f1011c = true;
        } else {
            this.f1006d = null;
        }
        a();
    }

    public final void h(ColorStateList colorStateList) {
        if (this.f1007e == null) {
            this.f1007e = new r3();
        }
        r3 r3Var = this.f1007e;
        r3Var.f1012d = colorStateList;
        r3Var.f1011c = true;
        a();
    }

    public final void i(PorterDuff.Mode mode) {
        if (this.f1007e == null) {
            this.f1007e = new r3();
        }
        r3 r3Var = this.f1007e;
        r3Var.f1013e = mode;
        r3Var.f1010b = true;
        a();
    }
}
