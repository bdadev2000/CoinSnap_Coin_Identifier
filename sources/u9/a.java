package u9;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes3.dex */
public final class a extends mi.a {

    /* renamed from: d, reason: collision with root package name */
    public int f25743d;

    /* renamed from: e, reason: collision with root package name */
    public int f25744e = -1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f25745f;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f25745f = swipeDismissBehavior;
    }

    @Override // mi.a
    public final int d(View view, int i10) {
        boolean z10;
        int width;
        int width2;
        int width3;
        if (view.getLayoutDirection() == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = this.f25745f.f11562d;
        if (i11 == 0) {
            if (z10) {
                width = this.f25743d - view.getWidth();
                width2 = this.f25743d;
            } else {
                width = this.f25743d;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i11 == 1) {
            if (z10) {
                width = this.f25743d;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f25743d - view.getWidth();
                width2 = this.f25743d;
            }
        } else {
            width = this.f25743d - view.getWidth();
            width2 = view.getWidth() + this.f25743d;
        }
        return Math.min(Math.max(width, i10), width2);
    }

    @Override // mi.a
    public final int e(View view, int i10) {
        return view.getTop();
    }

    @Override // mi.a
    public final int h(View view) {
        return view.getWidth();
    }

    @Override // mi.a
    public final void k(int i10, View view) {
        this.f25744e = i10;
        this.f25743d = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f25745f;
            swipeDismissBehavior.f11561c = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.f11561c = false;
        }
    }

    @Override // mi.a
    public final void l(int i10) {
        this.f25745f.getClass();
    }

    @Override // mi.a
    public final void m(View view, int i10, int i11) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f25745f;
        float f10 = width * swipeDismissBehavior.f11564f;
        float width2 = view.getWidth() * swipeDismissBehavior.f11565g;
        float abs = Math.abs(i10 - this.f25743d);
        if (abs <= f10) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f10) / (width2 - f10))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x004e, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.f25743d) >= java.lang.Math.round(r9.getWidth() * r3.f11563e)) goto L27;
     */
    @Override // mi.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void n(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.f25744e = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 1
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f25745f
            r4 = 0
            if (r1 == 0) goto L37
            int r5 = r9.getLayoutDirection()
            if (r5 != r2) goto L18
            r5 = r2
            goto L19
        L18:
            r5 = r4
        L19:
            int r6 = r3.f11562d
            r7 = 2
            if (r6 != r7) goto L1f
            goto L50
        L1f:
            if (r6 != 0) goto L2b
            if (r5 == 0) goto L28
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L52
            goto L50
        L28:
            if (r1 <= 0) goto L52
            goto L50
        L2b:
            if (r6 != r2) goto L52
            if (r5 == 0) goto L32
            if (r1 <= 0) goto L52
            goto L50
        L32:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L52
            goto L50
        L37:
            int r1 = r9.getLeft()
            int r5 = r8.f25743d
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            float r6 = r3.f11563e
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L52
        L50:
            r1 = r2
            goto L53
        L52:
            r1 = r4
        L53:
            if (r1 == 0) goto L69
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L64
            int r10 = r9.getLeft()
            int r0 = r8.f25743d
            if (r10 >= r0) goto L62
            goto L64
        L62:
            int r0 = r0 + r11
            goto L6c
        L64:
            int r10 = r8.f25743d
            int r0 = r10 - r11
            goto L6c
        L69:
            int r0 = r8.f25743d
            r2 = r4
        L6c:
            x0.d r10 = r3.a
            int r11 = r9.getTop()
            boolean r10 = r10.q(r0, r11)
            if (r10 == 0) goto L80
            androidx.lifecycle.w0 r10 = new androidx.lifecycle.w0
            r10.<init>(r3, r9, r2)
            r9.postOnAnimation(r10)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.a.n(android.view.View, float, float):void");
    }

    @Override // mi.a
    public final boolean p(int i10, View view) {
        int i11 = this.f25744e;
        if ((i11 == -1 || i11 == i10) && this.f25745f.w(view)) {
            return true;
        }
        return false;
    }
}
