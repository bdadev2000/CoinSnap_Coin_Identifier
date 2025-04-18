package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

/* loaded from: classes.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f1066b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static w f1067c;
    public s2 a;

    public static synchronized w a() {
        w wVar;
        synchronized (w.class) {
            if (f1067c == null) {
                c();
            }
            wVar = f1067c;
        }
        return wVar;
    }

    public static synchronized void c() {
        synchronized (w.class) {
            if (f1067c == null) {
                w wVar = new w();
                f1067c = wVar;
                wVar.a = s2.c();
                s2 s2Var = f1067c.a;
                v vVar = new v();
                synchronized (s2Var) {
                    s2Var.f1025e = vVar;
                }
            }
        }
    }

    public static void d(Drawable drawable, r3 r3Var, int[] iArr) {
        boolean z10;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = s2.f1019f;
        int[] state = drawable.getState();
        int[] iArr2 = s1.a;
        if (drawable.mutate() == drawable) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z11 = r3Var.f1011c;
        if (!z11 && !r3Var.f1010b) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (z11) {
            colorStateList = (ColorStateList) r3Var.f1012d;
        } else {
            colorStateList = null;
        }
        if (r3Var.f1010b) {
            mode = (PorterDuff.Mode) r3Var.f1013e;
        } else {
            mode = s2.f1019f;
        }
        if (colorStateList != null && mode != null) {
            porterDuffColorFilter = s2.g(colorStateList.getColorForState(iArr, 0), mode);
        }
        drawable.setColorFilter(porterDuffColorFilter);
    }

    public final synchronized Drawable b(Context context, int i10) {
        return this.a.e(context, i10);
    }
}
