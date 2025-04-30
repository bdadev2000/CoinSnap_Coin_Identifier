package M0;

import android.animation.ObjectAnimator;
import android.view.View;
import com.tools.arruler.photomeasure.camera.ruler.R;
import java.util.HashMap;

/* renamed from: M0.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0217h extends w {

    /* renamed from: H, reason: collision with root package name */
    public static final String[] f1881H = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: G, reason: collision with root package name */
    public final int f1882G;

    public C0217h(int i9) {
        this();
        this.f1882G = i9;
    }

    public static void N(F f9) {
        int visibility = f9.b.getVisibility();
        HashMap hashMap = f9.f1845a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        View view = f9.b;
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public static float P(F f9, float f10) {
        Float f11;
        if (f9 != null && (f11 = (Float) f9.f1845a.get("android:fade:transitionAlpha")) != null) {
            return f11.floatValue();
        }
        return f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /* JADX WARN: Type inference failed for: r0v0, types: [M0.Q, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static M0.Q Q(M0.F r8, M0.F r9) {
        /*
            M0.Q r0 = new M0.Q
            r0.<init>()
            r1 = 0
            r0.f1861a = r1
            r0.b = r1
            r2 = 0
            r3 = -1
            java.lang.String r4 = "android:visibility:parent"
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f1845a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f1862c = r7
            java.lang.Object r6 = r6.get(r4)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f1864e = r6
            goto L33
        L2f:
            r0.f1862c = r3
            r0.f1864e = r2
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f1845a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r2 = r6.get(r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r0.f1863d = r2
            java.lang.Object r2 = r6.get(r4)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f1865f = r2
            goto L56
        L52:
            r0.f1863d = r3
            r0.f1865f = r2
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f1862c
            int r9 = r0.f1863d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f1864e
            android.view.ViewGroup r4 = r0.f1865f
            if (r3 != r4) goto L68
            return r0
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.b = r1
            r0.f1861a = r2
            goto L9f
        L71:
            if (r9 != 0) goto L9f
            r0.b = r2
            r0.f1861a = r2
            goto L9f
        L78:
            android.view.ViewGroup r8 = r0.f1865f
            if (r8 != 0) goto L81
            r0.b = r1
            r0.f1861a = r2
            goto L9f
        L81:
            android.view.ViewGroup r8 = r0.f1864e
            if (r8 != 0) goto L9f
            r0.b = r2
            r0.f1861a = r2
            goto L9f
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f1863d
            if (r8 != 0) goto L95
            r0.b = r2
            r0.f1861a = r2
            goto L9f
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f1862c
            if (r8 != 0) goto L9f
            r0.b = r1
            r0.f1861a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.C0217h.Q(M0.F, M0.F):M0.Q");
    }

    public final ObjectAnimator O(View view, float f9, float f10) {
        if (f9 == f10) {
            return null;
        }
        H.f1847a.A(view, f9);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, H.b, f10);
        C0216g c0216g = new C0216g(view);
        ofFloat.addListener(c0216g);
        o().a(c0216g);
        return ofFloat;
    }

    @Override // M0.w
    public final void d(F f9) {
        N(f9);
    }

    @Override // M0.w
    public final void g(F f9) {
        N(f9);
        View view = f9.b;
        Float f10 = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f10 == null) {
            if (view.getVisibility() == 0) {
                f10 = Float.valueOf(H.f1847a.n(view));
            } else {
                f10 = Float.valueOf(0.0f);
            }
        }
        f9.f1845a.put("android:fade:transitionAlpha", f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (Q(n(r3, false), r(r3, false)).f1861a != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d2  */
    @Override // M0.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator k(android.view.ViewGroup r21, M0.F r22, M0.F r23) {
        /*
            Method dump skipped, instructions count: 711
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.C0217h.k(android.view.ViewGroup, M0.F, M0.F):android.animation.Animator");
    }

    @Override // M0.w
    public final String[] q() {
        return f1881H;
    }

    @Override // M0.w
    public final boolean t() {
        return true;
    }

    @Override // M0.w
    public final boolean u(F f9, F f10) {
        if (f9 == null && f10 == null) {
            return false;
        }
        if (f9 != null && f10 != null && f10.f1845a.containsKey("android:visibility:visibility") != f9.f1845a.containsKey("android:visibility:visibility")) {
            return false;
        }
        Q Q8 = Q(f9, f10);
        if (!Q8.f1861a) {
            return false;
        }
        if (Q8.f1862c != 0 && Q8.f1863d != 0) {
            return false;
        }
        return true;
    }

    public C0217h() {
        this.f1882G = 3;
    }
}
