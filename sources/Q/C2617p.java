package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import j.AbstractC2379a;

/* renamed from: q.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2617p {

    /* renamed from: a, reason: collision with root package name */
    public final View f22698a;

    /* renamed from: d, reason: collision with root package name */
    public com.facebook.A f22700d;

    /* renamed from: e, reason: collision with root package name */
    public com.facebook.A f22701e;

    /* renamed from: f, reason: collision with root package name */
    public com.facebook.A f22702f;

    /* renamed from: c, reason: collision with root package name */
    public int f22699c = -1;
    public final C2624t b = C2624t.a();

    public C2617p(View view) {
        this.f22698a = view;
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [com.facebook.A, java.lang.Object] */
    public final void a() {
        View view = this.f22698a;
        Drawable background = view.getBackground();
        if (background != null) {
            if (this.f22700d != null) {
                if (this.f22702f == null) {
                    this.f22702f = new Object();
                }
                com.facebook.A a6 = this.f22702f;
                a6.f13377c = null;
                a6.b = false;
                a6.f13378d = null;
                a6.f13376a = false;
                ColorStateList backgroundTintList = ViewCompat.getBackgroundTintList(view);
                if (backgroundTintList != null) {
                    a6.b = true;
                    a6.f13377c = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = ViewCompat.getBackgroundTintMode(view);
                if (backgroundTintMode != null) {
                    a6.f13376a = true;
                    a6.f13378d = backgroundTintMode;
                }
                if (a6.b || a6.f13376a) {
                    C2624t.d(background, a6, view.getDrawableState());
                    return;
                }
            }
            com.facebook.A a9 = this.f22701e;
            if (a9 != null) {
                C2624t.d(background, a9, view.getDrawableState());
                return;
            }
            com.facebook.A a10 = this.f22700d;
            if (a10 != null) {
                C2624t.d(background, a10, view.getDrawableState());
            }
        }
    }

    public final ColorStateList b() {
        com.facebook.A a6 = this.f22701e;
        if (a6 != null) {
            return (ColorStateList) a6.f13377c;
        }
        return null;
    }

    public final PorterDuff.Mode c() {
        com.facebook.A a6 = this.f22701e;
        if (a6 != null) {
            return (PorterDuff.Mode) a6.f13378d;
        }
        return null;
    }

    public final void d(AttributeSet attributeSet, int i9) {
        ColorStateList h6;
        View view = this.f22698a;
        Context context = view.getContext();
        int[] iArr = AbstractC2379a.f20964z;
        l5.k i10 = l5.k.i(context, attributeSet, iArr, i9, 0);
        TypedArray typedArray = (TypedArray) i10.b;
        View view2 = this.f22698a;
        ViewCompat.saveAttributeDataForStyleable(view2, view2.getContext(), iArr, attributeSet, (TypedArray) i10.b, i9, 0);
        try {
            if (typedArray.hasValue(0)) {
                this.f22699c = typedArray.getResourceId(0, -1);
                C2624t c2624t = this.b;
                Context context2 = view.getContext();
                int i11 = this.f22699c;
                synchronized (c2624t) {
                    h6 = c2624t.f22726a.h(context2, i11);
                }
                if (h6 != null) {
                    g(h6);
                }
            }
            if (typedArray.hasValue(1)) {
                ViewCompat.setBackgroundTintList(view, i10.d(1));
            }
            if (typedArray.hasValue(2)) {
                ViewCompat.setBackgroundTintMode(view, AbstractC2610l0.c(typedArray.getInt(2, -1), null));
            }
            i10.j();
        } catch (Throwable th) {
            i10.j();
            throw th;
        }
    }

    public final void e() {
        this.f22699c = -1;
        g(null);
        a();
    }

    public final void f(int i9) {
        ColorStateList colorStateList;
        this.f22699c = i9;
        C2624t c2624t = this.b;
        if (c2624t != null) {
            Context context = this.f22698a.getContext();
            synchronized (c2624t) {
                colorStateList = c2624t.f22726a.h(context, i9);
            }
        } else {
            colorStateList = null;
        }
        g(colorStateList);
        a();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.A, java.lang.Object] */
    public final void g(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f22700d == null) {
                this.f22700d = new Object();
            }
            com.facebook.A a6 = this.f22700d;
            a6.f13377c = colorStateList;
            a6.b = true;
        } else {
            this.f22700d = null;
        }
        a();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.A, java.lang.Object] */
    public final void h(ColorStateList colorStateList) {
        if (this.f22701e == null) {
            this.f22701e = new Object();
        }
        com.facebook.A a6 = this.f22701e;
        a6.f13377c = colorStateList;
        a6.b = true;
        a();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.facebook.A, java.lang.Object] */
    public final void i(PorterDuff.Mode mode) {
        if (this.f22701e == null) {
            this.f22701e = new Object();
        }
        com.facebook.A a6 = this.f22701e;
        a6.f13378d = mode;
        a6.f13376a = true;
        a();
    }
}
