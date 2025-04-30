package z3;

import android.view.View;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: z3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2971a extends y8.a {
    public int b;

    /* renamed from: c, reason: collision with root package name */
    public int f24534c = -1;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f24535d;

    public C2971a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f24535d = swipeDismissBehavior;
    }

    @Override // y8.a
    public final int d(View view, int i9) {
        boolean z8;
        int width;
        int width2;
        int width3;
        if (ViewCompat.getLayoutDirection(view) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        int i10 = this.f24535d.f13909d;
        if (i10 == 0) {
            if (z8) {
                width = this.b - view.getWidth();
                width2 = this.b;
            } else {
                width = this.b;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i10 == 1) {
            if (z8) {
                width = this.b;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.b - view.getWidth();
                width2 = this.b;
            }
        } else {
            width = this.b - view.getWidth();
            width2 = view.getWidth() + this.b;
        }
        return Math.min(Math.max(width, i9), width2);
    }

    @Override // y8.a
    public final int e(View view, int i9) {
        return view.getTop();
    }

    @Override // y8.a
    public final int o(View view) {
        return view.getWidth();
    }

    @Override // y8.a
    public final void r(View view, int i9) {
        this.f24534c = i9;
        this.b = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f24535d;
            swipeDismissBehavior.f13908c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f13908c = false;
        }
    }

    @Override // y8.a
    public final void s(int i9) {
        this.f24535d.getClass();
    }

    @Override // y8.a
    public final void t(View view, int i9, int i10) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f24535d;
        float f9 = width * swipeDismissBehavior.f13911f;
        float width2 = view.getWidth() * swipeDismissBehavior.f13912g;
        float abs = Math.abs(i9 - this.b);
        if (abs <= f9) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f9) / (width2 - f9))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004e, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.b) >= java.lang.Math.round(r9.getWidth() * r3.f13910e)) goto L27;
     */
    @Override // y8.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f24534c = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f24535d
            r4 = 0
            if (r1 == 0) goto L37
            int r5 = androidx.core.view.ViewCompat.getLayoutDirection(r9)
            if (r5 != r2) goto L18
            r5 = r2
            goto L19
        L18:
            r5 = r4
        L19:
            int r6 = r3.f13909d
            r7 = 2
            if (r6 != r7) goto L1f
            goto L50
        L1f:
            if (r6 != 0) goto L2b
            if (r5 == 0) goto L28
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L64
            goto L50
        L28:
            if (r1 <= 0) goto L64
            goto L50
        L2b:
            if (r6 != r2) goto L64
            if (r5 == 0) goto L32
            if (r1 <= 0) goto L64
            goto L50
        L32:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L64
            goto L50
        L37:
            int r1 = r9.getLeft()
            int r5 = r8.b
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            float r6 = r3.f13910e
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L64
        L50:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L5f
            int r10 = r9.getLeft()
            int r0 = r8.b
            if (r10 >= r0) goto L5d
            goto L5f
        L5d:
            int r0 = r0 + r11
            goto L67
        L5f:
            int r10 = r8.b
            int r0 = r10 - r11
            goto L67
        L64:
            int r0 = r8.b
            r2 = r4
        L67:
            c0.d r10 = r3.f13907a
            int r11 = r9.getTop()
            boolean r10 = r10.o(r0, r11)
            if (r10 == 0) goto L7b
            f4.b r10 = new f4.b
            r10.<init>(r3, r9, r2)
            androidx.core.view.ViewCompat.postOnAnimation(r9, r10)
        L7b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.C2971a.u(android.view.View, float, float):void");
    }

    @Override // y8.a
    public final boolean y(View view, int i9) {
        int i10 = this.f24534c;
        if ((i10 == -1 || i10 == i9) && this.f24535d.v(view)) {
            return true;
        }
        return false;
    }
}
