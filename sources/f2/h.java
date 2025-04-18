package f2;

import android.animation.ObjectAnimator;
import android.view.View;
import com.plantcare.ai.identifier.plantid.R;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class h extends t {
    public static final String[] E = {"android:visibility:visibility", "android:visibility:parent"};
    public int D;

    public h() {
        this.D = 3;
    }

    public static float N(c0 c0Var, float f10) {
        Float f11;
        if (c0Var != null && (f11 = (Float) c0Var.a.get("android:fade:transitionAlpha")) != null) {
            return f11.floatValue();
        }
        return f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static f2.p0 O(f2.c0 r8, f2.c0 r9) {
        /*
            f2.p0 r0 = new f2.p0
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.f17622b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.f17623c = r7
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.f17625e = r6
            goto L33
        L2f:
            r0.f17623c = r4
            r0.f17625e = r3
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r3 = r6.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.f17624d = r3
            java.lang.Object r2 = r6.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f17626f = r2
            goto L56
        L52:
            r0.f17624d = r4
            r0.f17626f = r3
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.f17623c
            int r9 = r0.f17624d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.f17625e
            android.view.ViewGroup r4 = r0.f17626f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f17622b = r1
            r0.a = r2
            goto L9f
        L71:
            if (r9 != 0) goto L9f
            r0.f17622b = r2
            r0.a = r2
            goto L9f
        L78:
            android.view.ViewGroup r8 = r0.f17626f
            if (r8 != 0) goto L81
            r0.f17622b = r1
            r0.a = r2
            goto L9f
        L81:
            android.view.ViewGroup r8 = r0.f17625e
            if (r8 != 0) goto L9f
            r0.f17622b = r2
            r0.a = r2
            goto L9f
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.f17624d
            if (r8 != 0) goto L95
            r0.f17622b = r2
            r0.a = r2
            goto L9f
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.f17623c
            if (r8 != 0) goto L9f
            r0.f17622b = r1
            r0.a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.h.O(f2.c0, f2.c0):f2.p0");
    }

    public final void L(c0 c0Var) {
        View view = c0Var.f17585b;
        int visibility = view.getVisibility();
        HashMap hashMap = c0Var.a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public final ObjectAnimator M(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        e0.a.w(view, f10);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, e0.f17594b, f11);
        g gVar = new g(view);
        ofFloat.addListener(gVar);
        o().a(gVar);
        return ofFloat;
    }

    @Override // f2.t
    public final void d(c0 c0Var) {
        L(c0Var);
    }

    @Override // f2.t
    public final void g(c0 c0Var) {
        L(c0Var);
        View view = c0Var.f17585b;
        Float f10 = (Float) view.getTag(R.id.transition_pause_alpha);
        if (f10 == null) {
            if (view.getVisibility() == 0) {
                f10 = Float.valueOf(e0.a.m(view));
            } else {
                f10 = Float.valueOf(0.0f);
            }
        }
        c0Var.a.put("android:fade:transitionAlpha", f10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (O(n(r3, false), r(r3, false)).a != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c8  */
    @Override // f2.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator k(android.view.ViewGroup r20, f2.c0 r21, f2.c0 r22) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f2.h.k(android.view.ViewGroup, f2.c0, f2.c0):android.animation.Animator");
    }

    @Override // f2.t
    public final /* bridge */ /* synthetic */ String[] q() {
        return E;
    }

    @Override // f2.t
    public final boolean t(c0 c0Var, c0 c0Var2) {
        if ((c0Var != null || c0Var2 != null) && (c0Var == null || c0Var2 == null || c0Var2.a.containsKey("android:visibility:visibility") == c0Var.a.containsKey("android:visibility:visibility"))) {
            p0 O = O(c0Var, c0Var2);
            if (O.a && (O.f17623c == 0 || O.f17624d == 0)) {
                return true;
            }
        }
        return false;
    }

    public h(int i10) {
        this.D = 3;
        if ((i10 & (-4)) == 0) {
            this.D = i10;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
}
