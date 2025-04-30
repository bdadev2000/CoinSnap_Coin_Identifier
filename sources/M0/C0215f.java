package M0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import q4.C2645d;

/* renamed from: M0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0215f extends w {

    /* renamed from: G, reason: collision with root package name */
    public static final String[] f1874G = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: H, reason: collision with root package name */
    public static final C0211b f1875H = new C0211b("topLeft", 0, PointF.class);

    /* renamed from: I, reason: collision with root package name */
    public static final C0211b f1876I = new C0211b("bottomRight", 1, PointF.class);

    /* renamed from: J, reason: collision with root package name */
    public static final C0211b f1877J = new C0211b("bottomRight", 2, PointF.class);

    /* renamed from: K, reason: collision with root package name */
    public static final C0211b f1878K = new C0211b("topLeft", 3, PointF.class);

    /* renamed from: L, reason: collision with root package name */
    public static final C0211b f1879L = new C0211b("position", 4, PointF.class);

    public static void N(F f9) {
        View view = f9.b;
        if (view.isLaidOut() || view.getWidth() != 0 || view.getHeight() != 0) {
            HashMap hashMap = f9.f1845a;
            hashMap.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            hashMap.put("android:changeBounds:parent", f9.b.getParent());
        }
    }

    @Override // M0.w
    public final void d(F f9) {
        N(f9);
    }

    @Override // M0.w
    public final void g(F f9) {
        N(f9);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // M0.w
    public final Animator k(ViewGroup viewGroup, F f9, F f10) {
        int i9;
        ObjectAnimator a6;
        if (f9 == null || f10 == null) {
            return null;
        }
        HashMap hashMap = f9.f1845a;
        HashMap hashMap2 = f10.f1845a;
        ViewGroup viewGroup2 = (ViewGroup) hashMap.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) hashMap2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        Rect rect = (Rect) hashMap.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) hashMap2.get("android:changeBounds:bounds");
        int i10 = rect.left;
        int i11 = rect2.left;
        int i12 = rect.top;
        int i13 = rect2.top;
        int i14 = rect.right;
        int i15 = rect2.right;
        int i16 = rect.bottom;
        int i17 = rect2.bottom;
        int i18 = i14 - i10;
        int i19 = i16 - i12;
        int i20 = i15 - i11;
        int i21 = i17 - i13;
        Rect rect3 = (Rect) hashMap.get("android:changeBounds:clip");
        Rect rect4 = (Rect) hashMap2.get("android:changeBounds:clip");
        if ((i18 != 0 && i19 != 0) || (i20 != 0 && i21 != 0)) {
            if (i10 == i11 && i12 == i13) {
                i9 = 0;
            } else {
                i9 = 1;
            }
            if (i14 != i15 || i16 != i17) {
                i9++;
            }
        } else {
            i9 = 0;
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i9++;
        }
        if (i9 > 0) {
            View view = f10.b;
            H.a(view, i10, i12, i14, i16);
            if (i9 == 2) {
                if (i18 == i20 && i19 == i21) {
                    this.f1938y.getClass();
                    a6 = AbstractC0224o.a(view, f1879L, C2645d.v(i10, i12, i11, i13));
                } else {
                    C0214e c0214e = new C0214e(view);
                    this.f1938y.getClass();
                    ObjectAnimator a9 = AbstractC0224o.a(c0214e, f1875H, C2645d.v(i10, i12, i11, i13));
                    this.f1938y.getClass();
                    ObjectAnimator a10 = AbstractC0224o.a(c0214e, f1876I, C2645d.v(i14, i16, i15, i17));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(a9, a10);
                    animatorSet.addListener(new C0212c(c0214e));
                    a6 = animatorSet;
                }
            } else if (i10 == i11 && i12 == i13) {
                this.f1938y.getClass();
                a6 = AbstractC0224o.a(view, f1877J, C2645d.v(i14, i16, i15, i17));
            } else {
                this.f1938y.getClass();
                a6 = AbstractC0224o.a(view, f1878K, C2645d.v(i10, i12, i11, i13));
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                r8.k.A(viewGroup4, true);
                o().a(new C0213d(viewGroup4));
            }
            return a6;
        }
        return null;
    }

    @Override // M0.w
    public final String[] q() {
        return f1874G;
    }

    @Override // M0.w
    public final boolean t() {
        return true;
    }
}
