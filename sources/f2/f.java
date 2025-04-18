package f2;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class f extends t {
    public static final String[] D = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final b E;
    public static final b F;
    public static final b G;
    public static final b H;
    public static final b I;

    static {
        String str = "topLeft";
        Class<PointF> cls = PointF.class;
        E = new b(0, str, cls);
        String str2 = "bottomRight";
        F = new b(1, str2, cls);
        G = new b(2, str2, cls);
        H = new b(3, str, cls);
        I = new b(4, "position", cls);
    }

    public final void L(c0 c0Var) {
        View view = c0Var.f17585b;
        if (view.isLaidOut() || view.getWidth() != 0 || view.getHeight() != 0) {
            HashMap hashMap = c0Var.a;
            hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            hashMap.put("android:changeBounds:parent", view.getParent());
        }
    }

    @Override // f2.t
    public final void d(c0 c0Var) {
        L(c0Var);
    }

    @Override // f2.t
    public final void g(c0 c0Var) {
        L(c0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.t
    public final Animator k(ViewGroup viewGroup, c0 c0Var, c0 c0Var2) {
        int i10;
        ObjectAnimator a;
        if (c0Var != null && c0Var2 != null) {
            HashMap hashMap = c0Var.a;
            HashMap hashMap2 = c0Var2.a;
            ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
            ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
            if (viewGroup2 != null && viewGroup3 != null) {
                Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
                Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
                int i11 = rect.left;
                int i12 = rect2.left;
                int i13 = rect.top;
                int i14 = rect2.top;
                int i15 = rect.right;
                int i16 = rect2.right;
                int i17 = rect.bottom;
                int i18 = rect2.bottom;
                int i19 = i15 - i11;
                int i20 = i17 - i13;
                int i21 = i16 - i12;
                int i22 = i18 - i14;
                Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
                Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
                if ((i19 != 0 && i20 != 0) || (i21 != 0 && i22 != 0)) {
                    if (i11 == i12 && i13 == i14) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                    if (i15 != i16 || i17 != i18) {
                        i10++;
                    }
                } else {
                    i10 = 0;
                }
                if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                    i10++;
                }
                int i23 = i10;
                if (i23 > 0) {
                    View view = c0Var2.f17585b;
                    e0.a(view, i11, i13, i15, i17);
                    if (i23 == 2) {
                        if (i19 == i21 && i20 == i22) {
                            this.f17659y.getClass();
                            a = o.a(view, I, com.facebook.b.H(i11, i13, i12, i14));
                        } else {
                            e eVar = new e(view);
                            this.f17659y.getClass();
                            ObjectAnimator a10 = o.a(eVar, E, com.facebook.b.H(i11, i13, i12, i14));
                            this.f17659y.getClass();
                            ObjectAnimator a11 = o.a(eVar, F, com.facebook.b.H(i15, i17, i16, i18));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(a10, a11);
                            animatorSet.addListener(new c(eVar));
                            a = animatorSet;
                        }
                    } else if (i11 == i12 && i13 == i14) {
                        this.f17659y.getClass();
                        a = o.a(view, G, com.facebook.b.H(i15, i17, i16, i18));
                    } else {
                        this.f17659y.getClass();
                        a = o.a(view, H, com.facebook.b.H(i11, i13, i12, i14));
                    }
                    if (view.getParent() instanceof ViewGroup) {
                        ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                        com.facebook.appevents.i.g(viewGroup4, true);
                        o().a(new d(viewGroup4));
                    }
                    return a;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // f2.t
    public final String[] q() {
        return D;
    }
}
