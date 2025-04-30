package q;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* renamed from: q.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2624t {
    public static final PorterDuff.Mode b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C2624t f22725c;

    /* renamed from: a, reason: collision with root package name */
    public J0 f22726a;

    public static synchronized C2624t a() {
        C2624t c2624t;
        synchronized (C2624t.class) {
            try {
                if (f22725c == null) {
                    c();
                }
                c2624t = f22725c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2624t;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [q.t, java.lang.Object] */
    public static synchronized void c() {
        synchronized (C2624t.class) {
            if (f22725c == null) {
                ?? obj = new Object();
                f22725c = obj;
                obj.f22726a = J0.c();
                J0 j02 = f22725c.f22726a;
                U4.p pVar = new U4.p();
                synchronized (j02) {
                    j02.f22559e = pVar;
                }
            }
        }
    }

    public static void d(Drawable drawable, com.facebook.A a6, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = J0.f22553f;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z8 = a6.b;
            if (!z8 && !a6.f13376a) {
                drawable.clearColorFilter();
                return;
            }
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (z8) {
                colorStateList = (ColorStateList) a6.f13377c;
            } else {
                colorStateList = null;
            }
            if (a6.f13376a) {
                mode = (PorterDuff.Mode) a6.f13378d;
            } else {
                mode = J0.f22553f;
            }
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = J0.g(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public final synchronized Drawable b(Context context, int i9) {
        return this.f22726a.e(context, i9);
    }
}
